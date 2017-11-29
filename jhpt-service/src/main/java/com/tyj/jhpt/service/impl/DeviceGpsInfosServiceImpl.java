/*
 * Copyright (c) 2017. juzhen.io. All rights reserved.
 */

package com.tyj.jhpt.service.impl;

import javax.annotation.Resource;

import com.github.fartherp.framework.core.dao.SqlMapDao;
import com.github.fartherp.framework.core.service.GenericSqlMapServiceImpl;
import com.tyj.jhpt.bo.DeviceGpsInfos;
import com.tyj.jhpt.dao.DeviceGpsInfosDao;
import com.tyj.jhpt.service.DeviceGpsInfosService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `device_gps_infos`
 */
@Service("deviceGpsInfosService")
public class DeviceGpsInfosServiceImpl extends GenericSqlMapServiceImpl<DeviceGpsInfos, Integer> implements DeviceGpsInfosService {
    @Resource(name = "deviceGpsInfosDao")
    private DeviceGpsInfosDao deviceGpsInfosDao;

    public SqlMapDao<DeviceGpsInfos, Integer> getDao() {
        return deviceGpsInfosDao;
    }

    public List<DeviceGpsInfos> findPageMsg(Map<String, Object> params) {
        return deviceGpsInfosDao.findPageMsg(params);
    }

    public List<DeviceGpsInfos> findMsg(Map<String, Object> params) {
        return deviceGpsInfosDao.findMsg(params);
    }
}