/*
 * Copyright (c) 2017. juzhen.io. All rights reserved.
 */

package com.tyj.jhpt.dao;

import com.github.fartherp.framework.core.dao.DaoMapper;
import com.github.fartherp.framework.core.orm.mybatis.annotation.SqlMapper;
import com.tyj.jhpt.bo.TradeInfos;
import com.tyj.jhpt.dto.PayRecordDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `trade_infos`
 */
@SqlMapper
public interface TradeInfosMapper extends DaoMapper<TradeInfos, Integer> {

    List<PayRecordDto> findPagePayRecord(Map<String, Object> map);

    List<PayRecordDto> findPageHisRecord(Map<String, Object> map);

    void updateDeviceSuccess(@Param("deviceId") Integer deviceId);
}