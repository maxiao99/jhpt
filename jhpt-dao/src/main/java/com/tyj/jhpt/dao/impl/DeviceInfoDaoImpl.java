/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.dao.impl;

import com.github.fartherp.framework.core.dao.ConfigurableBaseSqlMapDao;
import com.github.fartherp.framework.core.dao.DaoMapper;
import javax.annotation.Resource;

import com.tyj.jhpt.bo.DeviceInfo;
import com.tyj.jhpt.dao.DeviceInfoDao;
import com.tyj.jhpt.dao.DeviceInfoMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `tb_device_info`
 */
@Repository("deviceInfoDao")
public class DeviceInfoDaoImpl extends ConfigurableBaseSqlMapDao<DeviceInfo, Long> implements DeviceInfoDao {
    @Autowired
    private DeviceInfoMapper deviceInfoMapper;

    public DaoMapper<DeviceInfo, Long> getDaoMapper() {
        return deviceInfoMapper;
    }

    @Resource(name = "sqlSessionFactory")
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }

    public List<DeviceInfo> findPageDeviceInfo(Map<String, Object> map) {
        return deviceInfoMapper.findPageDeviceInfo(map);
    }

    public DeviceInfo findByVin(String vin) {
        return deviceInfoMapper.findByVin(vin);
    }

    public DeviceInfo findByIdentityNo(String identityNo) {
        return deviceInfoMapper.findByIdentityNo(identityNo);
    }

    public List<DeviceInfo> findByIds(List<Long> ids) {
        return deviceInfoMapper.findByIds(ids);
    }
}