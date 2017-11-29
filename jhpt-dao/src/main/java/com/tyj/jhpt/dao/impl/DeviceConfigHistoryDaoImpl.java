/*
 * Copyright (c) 2017. juzhen.io. All rights reserved.
 */

package com.tyj.jhpt.dao.impl;

import javax.annotation.Resource;

import com.github.fartherp.framework.core.dao.ConfigurableBaseSqlMapDao;
import com.github.fartherp.framework.core.dao.DaoMapper;
import com.tyj.jhpt.bo.DeviceConfigHistory;
import com.tyj.jhpt.dao.DeviceConfigHistoryDao;
import com.tyj.jhpt.dao.DeviceConfigHistoryMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * This class corresponds to the database table `device_config_history`
 */
@Repository("deviceConfigHistoryDao")
public class DeviceConfigHistoryDaoImpl extends ConfigurableBaseSqlMapDao<DeviceConfigHistory, Integer> implements DeviceConfigHistoryDao {
    @Autowired
    private DeviceConfigHistoryMapper deviceConfigHistoryMapper;

    public DaoMapper<DeviceConfigHistory, Integer> getDaoMapper() {
        return deviceConfigHistoryMapper;
    }

    @Resource(name = "sqlSessionFactory")
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }
}