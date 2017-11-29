/*
 * Copyright (c) 2017. juzhen.io. All rights reserved.
 */

package com.tyj.jhpt.dao;

import com.github.fartherp.framework.core.dao.SqlMapDao;
import com.tyj.jhpt.bo.DeviceGpsInfos;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `device_gps_infos`
 */
public interface DeviceGpsInfosDao extends SqlMapDao<DeviceGpsInfos, Integer> {

    List<DeviceGpsInfos> findPageMsg(Map<String, Object> params);

    List<DeviceGpsInfos> findMsg(Map<String, Object> params);
}