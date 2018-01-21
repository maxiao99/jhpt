/*
 * Copyright (c) 2018. CK. All rights reserved.
 */

package com.tyj.jhpt.dao.impl;

import com.github.fartherp.framework.core.dao.ConfigurableBaseSqlMapDao;
import com.github.fartherp.framework.core.dao.DaoMapper;
import javax.annotation.Resource;

import com.tyj.jhpt.bo.CarAlarm;
import com.tyj.jhpt.dao.CarAlarmDao;
import com.tyj.jhpt.dao.CarAlarmMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * This class corresponds to the database table `tb_car_alarm`
 */
@Repository("carAlarmDao")
public class CarAlarmDaoImpl extends ConfigurableBaseSqlMapDao<CarAlarm, Long> implements CarAlarmDao {
    @Autowired
    private CarAlarmMapper carAlarmMapper;

    public DaoMapper<CarAlarm, Long> getDaoMapper() {
        return carAlarmMapper;
    }

    @Resource(name = "sqlSessionFactory")
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }
}