/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.command.device;

import com.tyj.jhpt.bo.CarAlarm;
import com.tyj.jhpt.bo.DeviceGpsInfo;
import com.tyj.jhpt.server.message.CommandEnum;
import com.tyj.jhpt.server.message.type.CarAlarmMessage;
import com.tyj.jhpt.server.handler.DeviceManagerServerHandler;
import com.tyj.jhpt.server.message.MessageBean;
import com.tyj.jhpt.server.util.DeviceMsgUtils;
import com.tyj.jhpt.service.CarAlarmService;
import com.tyj.jhpt.service.DeviceGpsInfoService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static com.tyj.jhpt.server.command.device.SevenCommand.DataEnum.CURRENT_CAR_DRIVER_SPEED;
import static com.tyj.jhpt.server.command.device.SevenCommand.DataEnum.DRIVER_ID;
import static com.tyj.jhpt.server.command.device.SevenCommand.DataEnum.LATITUDE;
import static com.tyj.jhpt.server.command.device.SevenCommand.DataEnum.LONGITUDE;
import static com.tyj.jhpt.server.command.device.SevenCommand.DataEnum.LOCATION_STATUS;
import static com.tyj.jhpt.server.command.device.SevenCommand.DataEnum.MESSAGE_BODY;
import static com.tyj.jhpt.server.command.device.SevenCommand.DataEnum.MESSAGE_TYPE;
import static com.tyj.jhpt.server.command.device.SevenCommand.DataEnum.TIME;
import static com.tyj.jhpt.server.command.device.SevenCommand.DataEnum.ALARM_ID;

/**
 * 车辆告警信息上报
 *
 * @author: CK
 * @date: 2017/12/8
 */
@Component
public class SevenCommand extends DeviceAbstractCommand {
    public SevenCommand() {
        super(CommandEnum.CAR_ALARM_MESSAGE_UPLOAD.getType());
    }

    @Resource(name = "deviceGpsInfoService")
    DeviceGpsInfoService deviceGpsInfoService;

    @Resource(name = "carAlarmService")
    CarAlarmService carAlarmService;

    public void deal(DeviceManagerServerHandler handler, MessageBean mb) {
        byte[] content = mb.getContent();

        DeviceGpsInfo deviceGpsInfo = new DeviceGpsInfo();
        deviceGpsInfo.setCarVin(mb.getVin());

        // 数据采集时间
        Date time = DeviceMsgUtils.resolveTime(content, 0);
        int offset = TIME.length;
        deviceGpsInfo.setEventTime(time);

        // 告警消息ID
        byte[] bytes = new byte[ALARM_ID.length];
        System.arraycopy(content, offset, bytes, 0, ALARM_ID.length);
        offset += ALARM_ID.length;
        BigInteger bigInteger = new BigInteger(bytes);
        int alarmId = bigInteger.intValue();
        deviceGpsInfo.setMsgId(alarmId);

        // 驾驶员ID
        bytes = new byte[DRIVER_ID.length];
        System.arraycopy(content, offset, bytes, 0, DRIVER_ID.length);
        offset += DRIVER_ID.length;
        bigInteger = new BigInteger(bytes);
        int driverId = bigInteger.intValue();
        deviceGpsInfo.setDriverPersonId(driverId);

        // 定位状态
        deviceGpsInfo.setLocationStatus((int) content[offset]);
        offset += LOCATION_STATUS.length;

        // 经度
        double longitude = DeviceMsgUtils.readLatLongInfo(content, offset);
        offset += LONGITUDE.length;
        deviceGpsInfo.setLongitude(longitude);

        // 纬度
        double latitude = DeviceMsgUtils.readLatLongInfo(content, offset);
        offset += LATITUDE.length;
        deviceGpsInfo.setLatitude(latitude);

        // 当前车辆行驶速度
        bytes = new byte[CURRENT_CAR_DRIVER_SPEED.length];
        System.arraycopy(content, offset, bytes, 0, CURRENT_CAR_DRIVER_SPEED.length);
        offset += CURRENT_CAR_DRIVER_SPEED.length;
        bigInteger = new BigInteger(bytes);
        int speed = bigInteger.intValue();
        deviceGpsInfo.setSpeed(speed);

        deviceGpsInfo.setUploadTime(new Date());
        Long id = deviceGpsInfoService.saveEntitySelective(deviceGpsInfo);

        List<CarAlarm> list = new ArrayList<CarAlarm>();

        deal(list, mb, offset, id);

        if (CollectionUtils.isNotEmpty(list)) {
            carAlarmService.saveBatch(list);
        }
    }

    private void deal(List<CarAlarm> list, MessageBean mb, int offset, Long id) {
        if (mb.getLength() <= offset) {
            return;
        }
        CarAlarm carAlarm = new CarAlarm();
        carAlarm.setDeviceGpsInfoId(id);
        byte[] content = mb.getContent();
        // 信息类型标志
        byte alarmType = content[offset];
        offset += MESSAGE_TYPE.length;
        carAlarm.setAlarmType((int) alarmType);

        // 信息体
        if (CarAlarmMessage.LIMIT_SPEED_ALARM.getCode() == alarmType
                || CarAlarmMessage.SPEED_UP.getCode() == alarmType
                || CarAlarmMessage.SPEED_DOWN.getCode() == alarmType
                || CarAlarmMessage.LEFT_UP.getCode() == alarmType
                || CarAlarmMessage.RIGHT_UP.getCode() == alarmType) {
            byte alarmBody = content[offset];
            offset += MESSAGE_BODY.length;
            carAlarm.setAlarmBody((int) alarmBody);
        }
        list.add(carAlarm);

        deal(list, mb, offset, id);
    }

    public static enum DataEnum {
        TIME(6, "数据采集时间"),
        ALARM_ID(4, "告警消息ID"),
        DRIVER_ID(3, "驾驶员ID"),
        LOCATION_STATUS(1, "定位状态"),
        LONGITUDE(4, "经度"),
        LATITUDE(4, "纬度"),
        CURRENT_CAR_DRIVER_SPEED(2, "当前车辆行驶速度"),
        MESSAGE_TYPE(1, "信息类型标志"),
        MESSAGE_BODY(1, "信息体"),
        ;
        private int length;
        private String desc;
        DataEnum(int length, String desc) {
            this.length = length;
            this.desc = desc;
        }
    }
}
