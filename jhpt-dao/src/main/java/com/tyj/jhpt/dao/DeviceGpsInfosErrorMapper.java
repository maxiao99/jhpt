/*
 * Copyright (c) 2017. juzhen.io. All rights reserved.
 */

package com.tyj.jhpt.dao;

import com.github.fartherp.framework.core.dao.DaoMapper;
import com.github.fartherp.framework.core.orm.mybatis.annotation.SqlMapper;
import com.tyj.jhpt.bo.DeviceGpsInfosError;

/**
 * This class corresponds to the database table `device_gps_infos_error`
 */
@SqlMapper
public interface DeviceGpsInfosErrorMapper extends DaoMapper<DeviceGpsInfosError, Integer> {
}