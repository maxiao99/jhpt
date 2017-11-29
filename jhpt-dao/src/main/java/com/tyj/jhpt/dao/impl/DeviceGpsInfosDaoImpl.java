/*
 * Copyright (c) 2017. juzhen.io. All rights reserved.
 */

package com.tyj.jhpt.dao.impl;

import javax.annotation.Resource;

import com.github.fartherp.framework.core.dao.ConfigurableBaseSqlMapDao;
import com.github.fartherp.framework.core.dao.DaoMapper;
import com.tyj.jhpt.bo.DeviceGpsInfos;
import com.tyj.jhpt.dao.DeviceGpsInfosDao;
import com.tyj.jhpt.dao.DeviceGpsInfosMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `device_gps_infos`
 */
@Repository("deviceGpsInfosDao")
public class DeviceGpsInfosDaoImpl extends ConfigurableBaseSqlMapDao<DeviceGpsInfos, Integer> implements DeviceGpsInfosDao {
    @Autowired
    private DeviceGpsInfosMapper deviceGpsInfosMapper;

    public DaoMapper<DeviceGpsInfos, Integer> getDaoMapper() {
        return deviceGpsInfosMapper;
    }

    @Resource(name = "sqlSessionFactory")
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }

    public List<DeviceGpsInfos> findPageMsg(Map<String, Object> params) {
        return deviceGpsInfosMapper.findPageMsg(params);
    }

    public List<DeviceGpsInfos> findMsg(Map<String, Object> params) {
        return deviceGpsInfosMapper.findMsg(params);
    }
}