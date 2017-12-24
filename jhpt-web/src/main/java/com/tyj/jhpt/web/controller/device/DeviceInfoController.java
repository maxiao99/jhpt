/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.tyj.jhpt.web.controller.device;

import com.github.fartherp.framework.common.util.CsvUtil;
import com.github.fartherp.framework.common.util.DateUtil;
import com.github.fartherp.framework.core.util.JsonResp;
import com.tyj.jhpt.bo.DeviceGpsInfo;
import com.tyj.jhpt.bo.DeviceInfo;
import com.tyj.jhpt.bo.MsgType;
import com.tyj.jhpt.server.command.platform.PlatformThreeCommand;
import com.tyj.jhpt.server.command.platform.PlatformTwoCommand;
import com.tyj.jhpt.server.message.MessageBean;
import com.tyj.jhpt.server.util.DeviceMsgUtils;
import com.tyj.jhpt.service.AlarmService;
import com.tyj.jhpt.service.AllCarService;
import com.tyj.jhpt.service.DeviceGpsInfoService;
import com.tyj.jhpt.service.CompositeDictionaryService;
import com.tyj.jhpt.service.DianyaService;
import com.tyj.jhpt.service.FadongjiService;
import com.tyj.jhpt.service.IShortMsgSender;
import com.tyj.jhpt.service.DeviceInfoService;
import com.tyj.jhpt.service.QudongDianjiService;
import com.tyj.jhpt.service.RanliaoDianchiService;
import com.tyj.jhpt.service.SupersService;
import com.tyj.jhpt.service.WenduService;
import com.tyj.jhpt.vo.DeviceInfoPageVo;
import com.tyj.jhpt.vo.MsgPageVo;
import com.tyj.jhpt.vo.RealTimePageVo;
import com.tyj.jhpt.vo.SettingConfigVo;
import com.tyj.jhpt.vo.TerminalConfigVo;
import com.tyj.jhpt.web.controller.AbstractController;
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

    @Resource(name = "yunpianShortMessageSender")
    IShortMsgSender shortMessageSender;

    @Resource(name = "deviceGpsInfoService")
    DeviceGpsInfoService deviceGpsInfoService;

    @Resource(name = "compositeDictionaryService")
    CompositeDictionaryService compositeDictionaryService;

    @Resource(name = "allCarService")
    AllCarService allCarService;

    @Resource(name = "qudongDianjiService")
    QudongDianjiService qudongDianjiService;

    @Resource(name = "ranliaoDianchiService")
    RanliaoDianchiService ranliaoDianchiService;

    @Resource(name = "fadongjiService")
    FadongjiService fadongjiService;

    @Resource(name = "supersService")
    SupersService supersService;

    @Resource(name = "alarmService")
    AlarmService alarmService;

    @Resource(name = "dianyaService")
    DianyaService dianyaService;

    @Resource(name = "wenduService")
    WenduService wenduService;

    @Resource(name = "platformTwoCommand")
    PlatformTwoCommand platformTwoCommand;

    @Resource(name = "platformThreeCommand")
    PlatformThreeCommand platformThreeCommand;

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
        DeviceInfo deviceInfo = deviceInfoService.findByIdentityNo(d.getIdentityNo());
        if (deviceInfo != null) {
            return JsonResp.asData().error("身份证号已存在,请重新添加").toJson();
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
        DeviceInfo deviceInfo = deviceInfoService.findByIdentityNo(d.getIdentityNo());
        if (deviceInfo != null && !deviceInfo.getId().equals(d.getId())) {
            return JsonResp.asData().error("身份证号已存在,请重新编辑").toJson();
        }
        deviceInfoService.updateEntitySelective(d);
        return JsonResp.asData().success().toJson();
    }

    /**
     * 激活设备
     * @param id 设备id
     * @param testTime 测试时间
     * @return json
     */
    @ResponseBody
    @RequestMapping(value = "/activate")
    public String activate(@RequestParam("carVin") Long id,
                           @RequestParam(value = "testTime", required = false) String testTime) {
        DeviceInfo dev = deviceInfoService.findById(id);
        if (StringUtils.isNotBlank(testTime)) {
            dev.setOutofdateTime(DateUtil.parse(DateUtil.yyyy_MM_dd_HH_mm_ss, testTime));
        }
        int send = shortMessageSender.send(dev.getIccid(), DeviceMsgUtils.formatActivateMsg(id));
        if (send == 0) {
            return JsonResp.asData().success().toJson();
        }
        return JsonResp.asData().error("激活短信发送失败").toJson();
    }

    /**
     * 告警信息分页
     * @param vo 分页对象
     * @return json
     */
    @ResponseBody
    @RequestMapping(value = "/page/msg_list")
    public String msgList(MsgPageVo vo) {
        List<DeviceGpsInfo> l = deviceGpsInfoService.findPageMsg(vo.convertPageMap());
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
                "纬度", "车速", "特征值", "告警类型", "驾驶员ID", "驾驶员ID"};
        List<DeviceGpsInfo> ul = deviceGpsInfoService.findMsg(p);
        List<String[]> list = new ArrayList<String[]>(ul.size());
        for (DeviceGpsInfo d : ul) {
            String [] ss = new String [title.length];
            ss[0] = d.getCarVin();
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
            list.add(ss);
        }
        CsvUtil.writeCsvFile(response, request, "设备数据", title, list);
    }

    /**
     * 整车数据列表
     */
    @ResponseBody
    @RequestMapping(value = "/page/all_car_list")
    public String findPageAllCar(RealTimePageVo vo) {
        List l = allCarService.findPageAllCar(vo.convertPageMap());
        vo.setRows(l);
        return JsonResp.asData(vo).setDatePattern(DateUtil.yyyy_MM_dd).toJson();
    }

    /**
     * 驱动电机数据列表
     */
    @ResponseBody
    @RequestMapping(value = "/page/qudong_dianji_list")
    public String findPageQudongDianji(RealTimePageVo vo) {
        List l = qudongDianjiService.findPageQudongDianji(vo.convertPageMap());
        vo.setRows(l);
        return JsonResp.asData(vo).setDatePattern(DateUtil.yyyy_MM_dd).toJson();
    }

    /**
     * 燃料电池数据列表
     */
    @ResponseBody
    @RequestMapping(value = "/page/ranliao_dianchi_list")
    public String findPageRanliaoDianchi(RealTimePageVo vo) {
        List l = ranliaoDianchiService.findPageRanliaoDianchi(vo.convertPageMap());
        vo.setRows(l);
        return JsonResp.asData(vo).setDatePattern(DateUtil.yyyy_MM_dd).toJson();
    }

    /**
     * 发动机数据列表
     */
    @ResponseBody
    @RequestMapping(value = "/page/fadongji_list")
    public String findPageFadongji(RealTimePageVo vo) {
        List l = fadongjiService.findPageFadongji(vo.convertPageMap());
        vo.setRows(l);
        return JsonResp.asData(vo).setDatePattern(DateUtil.yyyy_MM_dd).toJson();
    }

    /**
     * 极值数据列表
     */
    @ResponseBody
    @RequestMapping(value = "/page/supers_list")
    public String findPageSupers(RealTimePageVo vo) {
        List l = supersService.findPageSupers(vo.convertPageMap());
        vo.setRows(l);
        return JsonResp.asData(vo).setDatePattern(DateUtil.yyyy_MM_dd).toJson();
    }

    /**
     * 报警数据列表
     */
    @ResponseBody
    @RequestMapping(value = "/page/alarm_list")
    public String findPageAlarm(RealTimePageVo vo) {
        List l = alarmService.findPageAlarm(vo.convertPageMap());
        vo.setRows(l);
        return JsonResp.asData(vo).setDatePattern(DateUtil.yyyy_MM_dd).toJson();
    }

    /**
     * 可充电储能装置电压数据列表
     */
    @ResponseBody
    @RequestMapping(value = "/page/dianya_list")
    public String findPageDianya(RealTimePageVo vo) {
        List l = dianyaService.findPageDianya(vo.convertPageMap());
        vo.setRows(l);
        return JsonResp.asData(vo).setDatePattern(DateUtil.yyyy_MM_dd).toJson();
    }

    /**
     * 可充电储能装置温度数据列表
     */
    @ResponseBody
    @RequestMapping(value = "/page/wendu_list")
    public String findPageWendu(RealTimePageVo vo) {
        List l = wenduService.findPageWendu(vo.convertPageMap());
        vo.setRows(l);
        return JsonResp.asData(vo).setDatePattern(DateUtil.yyyy_MM_dd).toJson();
    }

    /**
     * 平台参数设置指令
     */
    @ResponseBody
    @RequestMapping(value = "/setting_config")
    public String settingConfig(SettingConfigVo vo) {
        MessageBean mb = new MessageBean();
        platformTwoCommand.finish(mb);
        return JsonResp.asData().success().toJson();
    }

    /**
     * 平台车载终端控制指令
     */
    @ResponseBody
    @RequestMapping(value = "/terminal_config")
    public String terminalConfig(TerminalConfigVo vo) {
        MessageBean mb = new MessageBean();
        platformThreeCommand.finish(mb);
        return JsonResp.asData().success().toJson();
    }
}
