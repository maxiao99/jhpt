package com.tyj.jhpt.server.command;

import com.github.fartherp.framework.common.util.HttpClientUtils;
import com.tyj.jhpt.bo.DeviceConfigHistory;
import com.tyj.jhpt.bo.DeviceGpsInfos;
import com.tyj.jhpt.bo.DeviceGpsInfosError;
import com.tyj.jhpt.bo.DeviceInfo;
import com.tyj.jhpt.bo.CompositeDictionary;
import com.tyj.jhpt.message.DeviceGpsInfoEnum;
import com.tyj.jhpt.message.MessageBean;
import com.tyj.jhpt.server.SystemConfig;
import com.tyj.jhpt.server.handler.DeviceManagerServerHandler;
import com.tyj.jhpt.util.ByteUtils;
import com.tyj.jhpt.util.CheckSumUtils;
import com.tyj.jhpt.util.DeviceMsgUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;

import java.math.BigInteger;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 第八条指令,上传告警信息
 * Auth: CK
 * Date: 2016/7/1
 */
public class EightCommand extends AbstractCommand {

    private static final Logger logger = LoggerFactory.getLogger(EightCommand.class);

    protected EightCommand(DeviceManagerServerHandler handler, MessageBean bean) {
        super(handler, bean);
    }

    public void deal() {
        DeviceGpsInfos dgi = convert();
        handler.getDeviceGpsInfosService().saveEntitySelective(dgi);
        Map<String, Object> params = new HashMap<String, Object>(2);
        params.put("dicType", 7);
        params.put("dicId", dgi.getDeviceId());
        List<CompositeDictionary> l = handler.getCompositeDictionaryService().findByParams(params);
        if (l != null && !l.isEmpty()) {
            try {
                HttpClientUtils.execute(getMap(dgi), SystemConfig.getStr(l.get(0).getDicName()));
            } catch (Exception e) {
                DeviceGpsInfosError deviceGpsInfosError = new DeviceGpsInfosError();
                BeanUtils.copyProperties(dgi, deviceGpsInfosError, "id");
                handler.getDeviceGpsInfosErrorService().saveEntitySelective(deviceGpsInfosError);
            }
        }
        logger.info("receive gps info,deviceId: {} msgId: {}", dgi.getDeviceId(), dgi.getMsgId());
    }

    private Map<String, Object> getMap(DeviceGpsInfos d) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("deviceId", d.getDeviceId());
        params.put("msgId", d.getMsgId());
        params.put("eventTime", d.getEventTime().getTime());
        params.put("msgType", d.getMsgType());
        params.put("uploadTime", d.getUploadTime().getTime());
        params.put("apikey", SystemConfig.getStr("shenzhouapikey"));
        params.put("hashcode", CheckSumUtils.hashcode(d));
        return params;
    }

    private DeviceGpsInfos convert() {
        DeviceGpsInfos dgi = new DeviceGpsInfos();
        dgi.setDeviceId(bean.getDeviceId());
        dgi.setUploadTime(new Date());

        byte[] content = bean.getInstruction(0).getContent();
        byte [] bytes = new byte[] {content[0], content[1], content[2]};
        BigInteger bigInteger = new BigInteger(bytes);
        dgi.setMsgId(bigInteger.intValue());

        int offset = DeviceGpsInfoEnum.getTotalLength(DeviceGpsInfoEnum.EventTime);
        dgi.setEventTime(DeviceMsgUtils.resolveTime(content, offset));

        offset = DeviceGpsInfoEnum.getTotalLength(DeviceGpsInfoEnum.Longitude);
        dgi.setLongitude(DeviceMsgUtils.readLatLongInfo(content, offset));

        offset = DeviceGpsInfoEnum.getTotalLength(DeviceGpsInfoEnum.Latitude);
        dgi.setLatitude(DeviceMsgUtils.readLatLongInfo(content, offset));

        offset = DeviceGpsInfoEnum.getTotalLength(DeviceGpsInfoEnum.Speed);
        dgi.setSpeed((int)content[offset]);

        offset = DeviceGpsInfoEnum.getTotalLength(DeviceGpsInfoEnum.MsgType);
        dgi.setMsgType(content[offset]);

        offset = DeviceGpsInfoEnum.getTotalLength(DeviceGpsInfoEnum.Acceleration);
        Float acceleration = DeviceMsgUtils.parseAcceleration(content, offset);
        if (dgi.getMsgType() == 13) {
            dgi.setAcceleration(acceleration);
        } else if (dgi.getMsgType() == 14) {
            dgi.setAcceleration(-acceleration);
        } else if (dgi.getMsgType() == 19 || dgi.getMsgType() == 20) {
            // 设备配置回复信息
            int configMsgId = ByteUtils.byteToIntLE(content, offset);
            processConfigMsgResponse(configMsgId, dgi.getMsgType() == 19);
        } else {
            dgi.setAcceleration(acceleration);
        }

        if (dgi.getMsgType() != 19 && dgi.getMsgType() != 20) {
            offset = DeviceGpsInfoEnum.getTotalLength(DeviceGpsInfoEnum.DriverPersonId);
            bytes = new byte[] {content[offset], content[offset + 1], content[offset + 2]};
            bigInteger = new BigInteger(bytes);
            dgi.setDriverPersonId(bigInteger.intValue());
        }

        if (content.length > 24) {
            offset = DeviceGpsInfoEnum.getTotalLength(DeviceGpsInfoEnum.KM);
            bytes = new byte[] {content[offset], content[offset + 1], content[offset + 2]};
            bigInteger = new BigInteger(bytes);
            dgi.setKm(bigInteger.intValue());
        }
        return dgi;
    }

    private void processConfigMsgResponse(int configMsgId, boolean success) {
        DeviceConfigHistory config = handler.getDeviceConfigHistoryService().findById(configMsgId);
        if (config != null) {
            config.setConfigState(success ? 1 : 0);
            config.setDeviceConfirmTime(new Date());
            handler.getDeviceConfigHistoryService().updateEntitySelective(config);
            DeviceInfo device = handler.getDeviceInfoService().findById(config.getDeviceId());
            if (device != null && success) {
                // 配置成功
                device.setCarType(config.getCarType());
                handler.getDeviceInfoService().updateEntitySelective(device);
            }
        }
    }
}
