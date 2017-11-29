/*
 * Copyright (c) 2017. juzhen.io. All rights reserved.
 */

package com.tyj.jhpt.dao;

import com.github.fartherp.framework.core.dao.SqlMapDao;
import com.tyj.jhpt.bo.DeviceConfigHistory;

/**
 * This class corresponds to the database table `device_config_history`
 */
public interface DeviceConfigHistoryDao extends SqlMapDao<DeviceConfigHistory, Integer> {
}