/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.service.impl;

import com.github.fartherp.framework.core.dao.SqlMapDao;
import com.github.fartherp.framework.core.service.GenericSqlMapServiceImpl;
import javax.annotation.Resource;

import com.tyj.jhpt.bo.DeviceInfo;
import com.tyj.jhpt.dao.DeviceInfoDao;
import com.tyj.jhpt.service.DeviceInfoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `tb_device_info`
 */
@Service("deviceInfoService")
public class DeviceInfoServiceImpl extends GenericSqlMapServiceImpl<DeviceInfo, Long> implements DeviceInfoService {
    @Resource(name = "deviceInfoDao")
    private DeviceInfoDao deviceInfoDao;

    public SqlMapDao<DeviceInfo, Long> getDao() {
        return deviceInfoDao;
    }

    public List<DeviceInfo> findPageDeviceInfo(Map<String, Object> map) {
        return deviceInfoDao.findPageDeviceInfo(map);
    }

    public DeviceInfo findByVin(String vin) {
        return deviceInfoDao.findByVin(vin);
    }

    public DeviceInfo findByIdentityNo(String identityNo) {
        return deviceInfoDao.findByIdentityNo(identityNo);
    }

    public List<DeviceInfo> findByIds(List<Long> ids) {
        return deviceInfoDao.findByIds(ids);
    }
}