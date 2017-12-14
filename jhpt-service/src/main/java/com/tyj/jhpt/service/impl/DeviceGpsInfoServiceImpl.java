/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.service.impl;

import com.github.fartherp.framework.core.dao.SqlMapDao;
import com.github.fartherp.framework.core.service.GenericSqlMapServiceImpl;
import javax.annotation.Resource;

import com.tyj.jhpt.bo.DeviceGpsInfo;
import com.tyj.jhpt.dao.DeviceGpsInfoDao;
import com.tyj.jhpt.service.DeviceGpsInfoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `tb_device_gps_info`
 */
@Service("deviceGpsInfoService")
public class DeviceGpsInfoServiceImpl extends GenericSqlMapServiceImpl<DeviceGpsInfo, Long> implements DeviceGpsInfoService {
    @Resource(name = "deviceGpsInfoDao")
    private DeviceGpsInfoDao deviceGpsInfoDao;

    public SqlMapDao<DeviceGpsInfo, Long> getDao() {
        return deviceGpsInfoDao;
    }

    public List<DeviceGpsInfo> findPageMsg(Map<String, Object> params) {
        return deviceGpsInfoDao.findPageMsg(params);
    }

    public List<DeviceGpsInfo> findMsg(Map<String, Object> params) {
        return deviceGpsInfoDao.findMsg(params);
    }
}