/*
 * Copyright (c) 2017. juzhen.io. All rights reserved.
 */

package com.tyj.jhpt.service.impl;

import javax.annotation.Resource;

import com.github.fartherp.framework.core.dao.SqlMapDao;
import com.github.fartherp.framework.core.service.GenericSqlMapServiceImpl;
import com.tyj.jhpt.bo.DeviceInfo;
import com.tyj.jhpt.dao.DeviceInfoDao;
import com.tyj.jhpt.dto.CustomerDto;
import com.tyj.jhpt.service.DeviceInfoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `device_info`
 */
@Service("deviceInfoService")
public class DeviceInfoServiceImpl extends GenericSqlMapServiceImpl<DeviceInfo, Integer> implements DeviceInfoService {
    @Resource(name = "deviceInfoDao")
    private DeviceInfoDao deviceInfoDao;

    public SqlMapDao<DeviceInfo, Integer> getDao() {
        return deviceInfoDao;
    }

    public List<DeviceInfo> findPageDeviceInfo(Map<String, Object> map) {
        return deviceInfoDao.findPageDeviceInfo(map);
    }

    public List<CustomerDto> findPageCustomerList(Map<String, Object> map) {
        return deviceInfoDao.findPageCustomerList(map);
    }
}