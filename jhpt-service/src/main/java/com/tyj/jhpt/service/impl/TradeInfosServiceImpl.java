/*
 * Copyright (c) 2017. juzhen.io. All rights reserved.
 */

package com.tyj.jhpt.service.impl;

import javax.annotation.Resource;

import com.github.fartherp.framework.core.dao.SqlMapDao;
import com.github.fartherp.framework.core.service.GenericSqlMapServiceImpl;
import com.tyj.jhpt.bo.TradeInfos;
import com.tyj.jhpt.dao.TradeInfosDao;
import com.tyj.jhpt.dto.PayRecordDto;
import com.tyj.jhpt.service.TradeInfosService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `trade_infos`
 */
@Service("tradeInfosService")
public class TradeInfosServiceImpl extends GenericSqlMapServiceImpl<TradeInfos, Integer> implements TradeInfosService {
    @Resource(name = "tradeInfosDao")
    private TradeInfosDao tradeInfosDao;

    public SqlMapDao<TradeInfos, Integer> getDao() {
        return tradeInfosDao;
    }

    public List<PayRecordDto> findPagePayRecord(Map<String, Object> map) {
        return tradeInfosDao.findPagePayRecord(map);
    }

    public List<PayRecordDto> findPageHisRecord(Map<String, Object> map) {
        return tradeInfosDao.findPageHisRecord(map);
    }

    public void updateDeviceSuccess(Integer deviceId) {
        tradeInfosDao.updateDeviceSuccess(deviceId);
    }
}