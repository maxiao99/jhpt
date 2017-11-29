/*
 * Copyright (c) 2017. juzhen.io. All rights reserved.
 */

package com.tyj.jhpt.service;

import com.github.fartherp.framework.core.service.GenericService;
import com.tyj.jhpt.bo.TradeInfos;
import com.tyj.jhpt.dto.PayRecordDto;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `trade_infos`
 */
public interface TradeInfosService extends GenericService<TradeInfos, Integer> {

    List<PayRecordDto> findPagePayRecord(Map<String, Object> map);

    List<PayRecordDto> findPageHisRecord(Map<String, Object> map);

    void updateDeviceSuccess(Integer deviceId);
}