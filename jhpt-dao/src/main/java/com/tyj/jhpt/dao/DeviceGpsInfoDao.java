/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.dao;

import com.github.fartherp.framework.core.dao.SqlMapDao;
import com.tyj.jhpt.bo.DeviceGpsInfo;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `tb_device_gps_info`
 */
public interface DeviceGpsInfoDao extends SqlMapDao<DeviceGpsInfo, Long> {

    List<DeviceGpsInfo> findPageMsg(Map<String, Object> params);

    List<DeviceGpsInfo> findMsg(Map<String, Object> params);
}