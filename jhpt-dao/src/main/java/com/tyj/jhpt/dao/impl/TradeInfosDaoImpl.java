/*
 * Copyright (c) 2017. juzhen.io. All rights reserved.
 */

package com.tyj.jhpt.dao.impl;

import javax.annotation.Resource;

import com.github.fartherp.framework.core.dao.ConfigurableBaseSqlMapDao;
import com.github.fartherp.framework.core.dao.DaoMapper;
import com.tyj.jhpt.bo.TradeInfos;
import com.tyj.jhpt.dao.TradeInfosDao;
import com.tyj.jhpt.dao.TradeInfosMapper;
import com.tyj.jhpt.dto.PayRecordDto;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `trade_infos`
 */
@Repository("tradeInfosDao")
public class TradeInfosDaoImpl extends ConfigurableBaseSqlMapDao<TradeInfos, Integer> implements TradeInfosDao {
    @Autowired
    private TradeInfosMapper tradeInfosMapper;

    public DaoMapper<TradeInfos, Integer> getDaoMapper() {
        return tradeInfosMapper;
    }

    @Resource(name = "sqlSessionFactory")
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }

    public List<PayRecordDto> findPagePayRecord(Map<String, Object> map) {
        return tradeInfosMapper.findPagePayRecord(map);
    }

    public List<PayRecordDto> findPageHisRecord(Map<String, Object> map) {
        return tradeInfosMapper.findPageHisRecord(map);
    }

    public void updateDeviceSuccess(Integer deviceId) {
        tradeInfosMapper.updateDeviceSuccess(deviceId);
    }
}