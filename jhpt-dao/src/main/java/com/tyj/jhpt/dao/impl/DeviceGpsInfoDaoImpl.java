/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.dao.impl;

import com.github.fartherp.framework.core.dao.ConfigurableBaseSqlMapDao;
import com.github.fartherp.framework.core.dao.DaoMapper;
import javax.annotation.Resource;

import com.tyj.jhpt.bo.DeviceGpsInfo;
import com.tyj.jhpt.dao.DeviceGpsInfoDao;
import com.tyj.jhpt.dao.DeviceGpsInfoMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `tb_device_gps_info`
 */
@Repository("deviceGpsInfoDao")
public class DeviceGpsInfoDaoImpl extends ConfigurableBaseSqlMapDao<DeviceGpsInfo, Long> implements DeviceGpsInfoDao {
    @Autowired
    private DeviceGpsInfoMapper deviceGpsInfoMapper;

    public DaoMapper<DeviceGpsInfo, Long> getDaoMapper() {
        return deviceGpsInfoMapper;
    }

    @Resource(name = "sqlSessionFactory")
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }

    public List<DeviceGpsInfo> findPageMsg(Map<String, Object> params) {
        return deviceGpsInfoMapper.findPageMsg(params);
    }

    public List<DeviceGpsInfo> findMsg(Map<String, Object> params) {
        return deviceGpsInfoMapper.findMsg(params);
    }
}