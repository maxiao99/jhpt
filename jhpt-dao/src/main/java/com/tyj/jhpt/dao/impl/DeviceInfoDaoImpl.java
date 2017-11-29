/*
 * Copyright (c) 2017. juzhen.io. All rights reserved.
 */

package com.tyj.jhpt.dao.impl;

import javax.annotation.Resource;

import com.github.fartherp.framework.core.dao.ConfigurableBaseSqlMapDao;
import com.github.fartherp.framework.core.dao.DaoMapper;
import com.tyj.jhpt.bo.DeviceInfo;
import com.tyj.jhpt.dao.DeviceInfoDao;
import com.tyj.jhpt.dao.DeviceInfoMapper;
import com.tyj.jhpt.dto.CustomerDto;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `device_info`
 */
@Repository("deviceInfoDao")
public class DeviceInfoDaoImpl extends ConfigurableBaseSqlMapDao<DeviceInfo, Integer> implements DeviceInfoDao {
    @Autowired
    private DeviceInfoMapper deviceInfoMapper;

    public DaoMapper<DeviceInfo, Integer> getDaoMapper() {
        return deviceInfoMapper;
    }

    @Resource(name = "sqlSessionFactory")
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }

    public List<DeviceInfo> findPageDeviceInfo(Map<String, Object> map) {
        return deviceInfoMapper.findPageDeviceInfo(map);
    }

    public List<CustomerDto> findPageCustomerList(Map<String, Object> map) {
        return deviceInfoMapper.findPageCustomerList(map);
    }
}