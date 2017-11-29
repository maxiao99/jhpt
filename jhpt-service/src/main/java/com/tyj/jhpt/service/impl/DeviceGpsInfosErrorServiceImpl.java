/*
 * Copyright (c) 2017. juzhen.io. All rights reserved.
 */

package com.tyj.jhpt.service.impl;

import javax.annotation.Resource;

import com.github.fartherp.framework.core.dao.SqlMapDao;
import com.github.fartherp.framework.core.service.GenericSqlMapServiceImpl;
import com.tyj.jhpt.bo.DeviceGpsInfosError;
import com.tyj.jhpt.dao.DeviceGpsInfosErrorDao;
import com.tyj.jhpt.service.DeviceGpsInfosErrorService;
import org.springframework.stereotype.Service;

/**
 * This class corresponds to the database table `device_gps_infos_error`
 */
@Service("deviceGpsInfosErrorService")
public class DeviceGpsInfosErrorServiceImpl extends GenericSqlMapServiceImpl<DeviceGpsInfosError, Integer> implements DeviceGpsInfosErrorService {
    @Resource(name = "deviceGpsInfosErrorDao")
    private DeviceGpsInfosErrorDao deviceGpsInfosErrorDao;

    public SqlMapDao<DeviceGpsInfosError, Integer> getDao() {
        return deviceGpsInfosErrorDao;
    }
}