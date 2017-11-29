/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.tyj.jhpt.web.controller.device;

import com.github.fartherp.framework.common.util.CsvUtil;
import com.github.fartherp.framework.common.util.DateUtil;
import com.github.fartherp.framework.common.util.MapUtils;
import com.github.fartherp.framework.core.util.JsonResp;
import com.tyj.jhpt.bo.DeviceConfigHistory;
import com.tyj.jhpt.bo.DeviceGpsInfos;
import com.tyj.jhpt.bo.DeviceInfo;
import com.tyj.jhpt.bo.MsgType;
import com.tyj.jhpt.dto.PayRecordDto;
import com.tyj.jhpt.service.DeviceConfigHistoryService;
import com.tyj.jhpt.service.DeviceGpsInfosService;
import com.tyj.jhpt.service.CompositeDictionaryService;
import com.tyj.jhpt.service.IShortMsgSender;
import com.tyj.jhpt.service.DeviceInfoService;
import com.tyj.jhpt.service.TradeInfosService;
import com.tyj.jhpt.util.DeviceMsgUtils;
import com.tyj.jhpt.vo.ActivateDevicePageVo;
import com.tyj.jhpt.vo.AllDevicePageVo;
import com.tyj.jhpt.vo.ConfigDevicePageVo;
import com.tyj.jhpt.vo.DeviceInfoPageVo;
import com.tyj.jhpt.vo.HisRecordPageVo;
import com.tyj.jhpt.vo.MsgPageVo;
import com.tyj.jhpt.web.controller.AbstractController;
import com.tyj.jhpt.web.controller.general.KvVoExt;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * Author: CK
 * Date: 2016/5/1
 */
@Controller
@RequestMapping(value = "device_info")
public class DeviceInfoController extends AbstractController {
    @Resource(name = "deviceInfoService")
    DeviceInfoService deviceInfoService;

    @Resource(name = "tradeInfosService")
    TradeInfosService tradeInfosService;

    @Resource(name = "yunpianShortMessageSender")
    IShortMsgSender shortMessageSender;

    @Resource(name = "deviceConfigHistoryService")
    DeviceConfigHistoryService deviceConfigHistoryService;

    @Resource(name = "deviceGpsInfosService")
    DeviceGpsInfosService deviceGpsInfosService;

    @Resource(name = "compositeDictionaryService")
    CompositeDictionaryService compositeDictionaryService;

    /**
     * 录入用户列表
     * @param vo 分页对象
     * @return json
     */
    @ResponseBody
    @RequestMapping(value = "/page/list")
    public String list(DeviceInfoPageVo vo) {
        List<DeviceInfo> l = deviceInfoService.findPageDeviceInfo(vo.convertPageMap());
        for (DeviceInfo d : l) {
            d.setType(vo.getType());
        }
        vo.setRows(l);
        return JsonResp.asData(vo).setDatePattern(DateUtil.yyyy_MM_dd).toJson();
    }

    /**
     * 添加设备
     * @param d 设备
     * @return json
     */
    @ResponseBody
    @RequestMapping(value = "/add_device_info")
    public String add(DeviceInfo d) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("identity_no", d.getIdentityNo());
        KvVoExt kvVoExt = new KvVoExt(1, "身份证号", params);
        String result = validation(kvVoExt);
        if (result != null) {
            return result;
        }
        d.setCreateTime(new Date());
        deviceInfoService.saveEntitySelective(d);
        return JsonResp.asData().success().toJson();
    }

    /**
     * 编辑设备
     * @param d 设备
     * @return json
     */
    @ResponseBody
    @RequestMapping(value = "/edit_device_info")
    public String edit(DeviceInfo d) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("identity_no", d.getIdentityNo());
        KvVoExt kvVoExt = new KvVoExt(1, "身份证号", d.getDeviceId(), params);
        String result = validation(kvVoExt);
        if (result != null) {
            return result;
        }
        deviceInfoService.updateEntitySelective(d);
        return JsonResp.asData().success().toJson();
    }

    /**
     * 激活分页
     * @param vo 分页对象
     * @return json
     */
    @ResponseBody
    @RequestMapping(value = "/page/to_activate")
    public String toActivate(ActivateDevicePageVo vo) {
        List<PayRecordDto> l = tradeInfosService.findPagePayRecord(vo.convertPageMap());
        vo.setRows(l);
        return JsonResp.asData(vo).setDatePattern(DateUtil.yyyy_MM_dd_HH_mm_ss).toJson();
    }

    /**
     * 激活设备
     * @param deviceId 设备ID
     * @param testTime 测试时间
     * @return json
     */
    @ResponseBody
    @RequestMapping(value = "/activate")
    public String activate(@RequestParam("deviceId") Integer deviceId,
                           @RequestParam(value = "testTime", required = false) String testTime) {
        DeviceInfo dev = deviceInfoService.findById(deviceId);
        if (StringUtils.isNotBlank(testTime)) {
            dev.setOutofdateTime(DateUtil.parse(DateUtil.yyyy_MM_dd_HH_mm_ss, testTime));
        }
        int send = shortMessageSender.send(dev.getPhoneOfDevice(), DeviceMsgUtils.formatActivateMsg(deviceId));
        if (send == 0) {
            return JsonResp.asData().success().toJson();
        }
        return JsonResp.asData().error("激活短信发送失败").toJson();
    }

    /**
     * 设备配置
     * @param vo 分页对象
     * @return json
     */
    @ResponseBody
    @RequestMapping(value = "/page/config_list")
    public String configList(ConfigDevicePageVo vo) {
        List<PayRecordDto> l = tradeInfosService.findPagePayRecord(vo.convertPageMap());
        vo.setRows(l);
        return JsonResp.asData(vo).setDatePattern(DateUtil.yyyy_MM_dd_HH_mm_ss).toJson();
    }

    /**
     * 配置及批量配置
     * @param params 参数
     * @return json
     */
    @ResponseBody
    @RequestMapping(value = "config")
    public String config(@RequestParam Map<String, Object> params) {
        String [] ds = params.get("deviceId").toString().split(",");
        if (ds != null && ds.length > 0) {
            Date now = new Date();
            for (String d : ds) {
                DeviceConfigHistory dcb = new DeviceConfigHistory();
                MapUtils.toObject(params, dcb, "deviceId");
                dcb.setDeviceId(Integer.parseInt(d));
                dcb.setCreateTime(now);
                DeviceInfo dev = deviceInfoService.findById(dcb.getDeviceId());
                Integer id = deviceConfigHistoryService.saveEntitySelective(dcb);
                String msg = DeviceMsgUtils.formatDeviceConfigMsg(id, dcb);
                shortMessageSender.send(dev.getPhoneOfDevice(), msg);
            }
        }
        return JsonResp.asData().success().toJson();
    }

    /**
     * 告警信息分页
     * @param vo 分页对象
     * @return json
     */
    @ResponseBody
    @RequestMapping(value = "/page/msg_list")
    public String msgList(MsgPageVo vo) {
        List<DeviceGpsInfos> l = deviceGpsInfosService.findPageMsg(vo.convertPageMap());
        for (DeviceGpsInfos d : l) {
            if (MsgType.SPEED_UP.getMsgType() == d.getMsgType().intValue()
                    || MsgType.SPEED_DOWN.getMsgType() == d.getMsgType().intValue()) {
                d.setAccelerationStr(d.getAcceleration() + "m/s^2");
            } else if (MsgType.LIMIT_SPEED_ALARM.getMsgType() == d.getMsgType().intValue()
                    || MsgType.OVER_SPEED_FOLLOW.getMsgType() == d.getMsgType().intValue()
                    || MsgType.OVER_SPEED_ALARM.getMsgType() == d.getMsgType().intValue()
                    || MsgType.COLLIDE_FOLLOW.getMsgType() == d.getMsgType().intValue()
                    || MsgType.PERSON_COLLIDE_FOLLOW.getMsgType() == d.getMsgType().intValue()
                    || MsgType.CAR_COLLIDE_FOLLOW.getMsgType() == d.getMsgType().intValue()) {
                d.setAccelerationStr((d.getAcceleration() * 10) + "Km/h");
            } else {
                d.setAccelerationStr("0");
            }
            if (MsgType.LOCATION_MESSAGE.getMsgType() == d.getMsgType().intValue()) {
                d.setKmStr(d.getKm() + "km");
            } else {
                d.setKmStr(d.getKm().toString());
            }
        }
        vo.setRows(l);
        return JsonResp.asData(vo).setDatePattern(DateUtil.yyyy_MM_dd_HH_mm_ss).toJson();
    }

    /**
     * 下载告警信息
     * @param response 响应
     * @param request 请求
     * @param p 参数
     */
    @ResponseBody
    @RequestMapping(value = "/download_msg")
    public void downloadAlarmTeam(HttpServletResponse response, HttpServletRequest request,
                                  @RequestParam Map<String, Object> p) {
        Map<String, Object> map = new HashMap<String, Object>(1);
        map.put("dicType", 6);
        Map<Integer, String> msgType = compositeDictionaryService.findMapByParams(map);
        String[] title = new String [] {"设备号", "消息ID", "采集时间", "上传时间", "经度",
                "纬度", "车速", "特征值", "告警类型", "驾驶员ID", "驾驶员ID", "里程/Km"};
        List<DeviceGpsInfos> ul = deviceGpsInfosService.findMsg(p);
        List<String[]> list = new ArrayList<String[]>(ul.size());
        for (DeviceGpsInfos d : ul) {
            String [] ss = new String [title.length];
            ss[0] = String.valueOf(d.getDeviceId());
            ss[1] = String.valueOf(d.getMsgId());
            ss[2] = DateUtil.format(DateUtil.yyyy_MM_dd_HH_mm_ss,  d.getEventTime());
            ss[3] = DateUtil.format(DateUtil.yyyy_MM_dd_HH_mm_ss, d.getUploadTime());
            ss[4] = String.valueOf(d.getLongitude());
            ss[5] = String.valueOf(d.getLatitude());
            ss[6] = String.valueOf(d.getSpeed());
            if (MsgType.SPEED_UP.getMsgType() == d.getMsgType().intValue()
                    || MsgType.SPEED_DOWN.getMsgType() == d.getMsgType().intValue()) {
                ss[7] = d.getAcceleration() + "m/s^2";
            } else if (MsgType.LIMIT_SPEED_ALARM.getMsgType() == d.getMsgType().intValue()
                    || MsgType.OVER_SPEED_FOLLOW.getMsgType() == d.getMsgType().intValue()
                    || MsgType.PERSON_COLLIDE_FOLLOW.getMsgType() == d.getMsgType().intValue()
                    || MsgType.CAR_COLLIDE_FOLLOW.getMsgType() == d.getMsgType().intValue()) {
                ss[7] = (d.getAcceleration() * 10) + "Km/h";
            } else {
                ss[7] = "0";
            }
            ss[8] = msgType.get(d.getMsgType().intValue());
            ss[9] = String.valueOf(d.getDriverPersonId());
            ss[10] = String.valueOf(d.getKm());
            list.add(ss);
        }
        CsvUtil.writeCsvFile(response, request, "设备数据", title, list);
    }

    /**
     * 所有设备
     * @param vo 分页对象
     * @return json
     */
    @ResponseBody
    @RequestMapping(value = "/page/all_list")
    public String allList(AllDevicePageVo vo) {
        List<PayRecordDto> l = tradeInfosService.findPagePayRecord(vo.convertPageMap());
        for (PayRecordDto dto : l) {
            if (dto.getActivate() != null && dto.getActivate() == 0) {
                dto.setType(1);
            } else if (dto.getOutofdateTime() != null
                    && dto.getOutofdateTime().getTime() > System.currentTimeMillis()) {
                dto.setType(2);
            } else {
                dto.setType(0);
            }
        }
        vo.setRows(l);
        return JsonResp.asData(vo).setDatePattern(DateUtil.yyyy_MM_dd_HH_mm_ss).toJson();
    }

    /**
     * 激活记录
     * @param vo 分页对象
     * @return json
     */
    @ResponseBody
    @RequestMapping(value = "/page/his_list")
    public String hisList(HisRecordPageVo vo) {
        List<PayRecordDto> l = tradeInfosService.findPageHisRecord(vo.convertPageMap());
        vo.setRows(l);
        return JsonResp.asData(vo).setDatePattern(DateUtil.yyyy_MM_dd_HH_mm_ss).toJson();
    }
}
