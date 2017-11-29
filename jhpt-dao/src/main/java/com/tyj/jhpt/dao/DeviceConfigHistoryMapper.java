/*
 * Copyright (c) 2017. juzhen.io. All rights reserved.
 */

package com.tyj.jhpt.dao;

import com.github.fartherp.framework.core.dao.DaoMapper;
import com.github.fartherp.framework.core.orm.mybatis.annotation.SqlMapper;
import com.tyj.jhpt.bo.DeviceConfigHistory;

/**
 * This class corresponds to the database table `device_config_history`
 */
@SqlMapper
public interface DeviceConfigHistoryMapper extends DaoMapper<DeviceConfigHistory, Integer> {
}