/*
 * Copyright (c) 2017. juzhen.io. All rights reserved.
 */

package com.tyj.jhpt.service.impl;

import javax.annotation.Resource;

import com.github.fartherp.framework.core.dao.SqlMapDao;
import com.github.fartherp.framework.core.service.GenericSqlMapServiceImpl;
import com.tyj.jhpt.bo.DeviceConfigHistory;
import com.tyj.jhpt.dao.DeviceConfigHistoryDao;
import com.tyj.jhpt.service.DeviceConfigHistoryService;
import org.springframework.stereotype.Service;

/**
 * This class corresponds to the database table `device_config_history`
 */
@Service("deviceConfigHistoryService")
public class DeviceConfigHistoryServiceImpl extends GenericSqlMapServiceImpl<DeviceConfigHistory, Integer> implements DeviceConfigHistoryService {
    @Resource(name = "deviceConfigHistoryDao")
    private DeviceConfigHistoryDao deviceConfigHistoryDao;

    public SqlMapDao<DeviceConfigHistory, Integer> getDao() {
        return deviceConfigHistoryDao;
    }
}