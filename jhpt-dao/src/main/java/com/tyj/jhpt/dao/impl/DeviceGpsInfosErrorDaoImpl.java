/*
 * Copyright (c) 2017. juzhen.io. All rights reserved.
 */

package com.tyj.jhpt.dao.impl;

import javax.annotation.Resource;

import com.github.fartherp.framework.core.dao.ConfigurableBaseSqlMapDao;
import com.github.fartherp.framework.core.dao.DaoMapper;
import com.tyj.jhpt.bo.DeviceGpsInfosError;
import com.tyj.jhpt.dao.DeviceGpsInfosErrorDao;
import com.tyj.jhpt.dao.DeviceGpsInfosErrorMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * This class corresponds to the database table `device_gps_infos_error`
 */
@Repository("deviceGpsInfosErrorDao")
public class DeviceGpsInfosErrorDaoImpl extends ConfigurableBaseSqlMapDao<DeviceGpsInfosError, Integer> implements DeviceGpsInfosErrorDao {
    @Autowired
    private DeviceGpsInfosErrorMapper deviceGpsInfosErrorMapper;

    public DaoMapper<DeviceGpsInfosError, Integer> getDaoMapper() {
        return deviceGpsInfosErrorMapper;
    }

    @Resource(name = "sqlSessionFactory")
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }
}