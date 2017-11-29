/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.tyj.jhpt.web.controller.pay;

import com.github.fartherp.framework.common.util.DateUtil;
import com.github.fartherp.framework.core.util.JsonResp;
import com.tyj.jhpt.bo.DeviceInfo;
import com.tyj.jhpt.bo.CompositeDictionary;
import com.tyj.jhpt.bo.TradeInfos;
import com.tyj.jhpt.dto.CustomerDto;
import com.tyj.jhpt.dto.PayRecordDto;
import com.tyj.jhpt.service.DeviceInfoService;
import com.tyj.jhpt.service.CompositeDictionaryService;
import com.tyj.jhpt.service.TradeInfosService;
import com.tyj.jhpt.vo.CustomerPageVo;
import com.tyj.jhpt.vo.RecordPageVo;
import com.tyj.jhpt.web.controller.AbstractController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * Author: CK
 * Date: 2016/5/1
 */
@Controller
@RequestMapping(value = "pay")
public class PayController extends AbstractController {

    @Resource(name = "tradeInfosService")
    TradeInfosService tradeInfosService;

    @Resource(name = "deviceInfoService")
    DeviceInfoService deviceInfoService;

    @Resource(name = "compositeDictionaryService")
    CompositeDictionaryService compositeDictionaryService;

    /**
     * 用户付费记录
     * @param vo 分页对象
     * @return json
     */
    @ResponseBody
    @RequestMapping(value = "/page/record_list")
    public String recordList(RecordPageVo vo) {
        List<PayRecordDto> l = tradeInfosService.findPagePayRecord(vo.convertPageMap());
        vo.setRows(l);
        return JsonResp.asData(vo).setDatePattern(DateUtil.yyyy_MM_dd).toJson();
    }

    /**
     * 确认付费用户
     * @param vo 分页对象
     * @return json
     */
    @ResponseBody
    @RequestMapping(value = "/page/customer_list")
    public String customerList(CustomerPageVo vo) {
        List<CustomerDto> l = deviceInfoService.findPageCustomerList(vo.convertPageMap());
        vo.setRows(l);
        return JsonResp.asData(vo).setDatePattern(DateUtil.yyyy_MM_dd).toJson();
    }

    /**
     * 确认付费
     * @param deviceId 设备ID
     * @param activateType 激活类型
     * @return json
     */
    @ResponseBody
    @RequestMapping(value = "/confirm/pay")
    public String confirm(@RequestParam("deviceId") Integer deviceId,
                          @RequestParam("activateType") Byte activateType) {
        DeviceInfo deviceInfo = deviceInfoService.findById(deviceId);
        Date outofdateTime = deviceInfo.getOutofdateTime();
        Date now = new Date();
        if (now.compareTo(outofdateTime) < 0) {
            now = outofdateTime;
        }
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("dicType", 3);
        params.put("dicId", activateType);
        List<CompositeDictionary> list = compositeDictionaryService.findByParams(params);
        Date endDate = DateUtil.getDateByCalendar(now, Calendar.MONTH, Integer.parseInt(list.get(0).getDicDesc()));
        deviceInfo.setOutofdateTime(endDate);
        deviceInfoService.updateEntitySelective(deviceInfo);
        TradeInfos tradeInfo = new TradeInfos();
        tradeInfo.setAccountantConfirmTime(now);
        tradeInfo.setOutofdateTime(deviceInfo.getOutofdateTime());
        tradeInfo.setAccountantId(0);
        tradeInfo.setActivate(0);
        tradeInfo.setCreateTime(now);
        tradeInfo.setActivateType(activateType);
        tradeInfo.setDeviceId(deviceInfo.getDeviceId());
        tradeInfosService.saveEntitySelective(tradeInfo);
        return JsonResp.asData().success().toJson();
    }
}
