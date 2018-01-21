/*
 * Copyright (c) 2018. CK. All rights reserved.
 */

package com.tyj.jhpt.service.impl;

import com.github.fartherp.framework.core.dao.SqlMapDao;
import com.github.fartherp.framework.core.service.GenericSqlMapServiceImpl;
import javax.annotation.Resource;

import com.tyj.jhpt.bo.CarAlarm;
import com.tyj.jhpt.dao.CarAlarmDao;
import com.tyj.jhpt.service.CarAlarmService;
import org.springframework.stereotype.Service;

/**
 * This class corresponds to the database table `tb_car_alarm`
 */
@Service("carAlarmService")
public class CarAlarmServiceImpl extends GenericSqlMapServiceImpl<CarAlarm, Long> implements CarAlarmService {
    @Resource(name = "carAlarmDao")
    private CarAlarmDao carAlarmDao;

    public SqlMapDao<CarAlarm, Long> getDao() {
        return carAlarmDao;
    }
}