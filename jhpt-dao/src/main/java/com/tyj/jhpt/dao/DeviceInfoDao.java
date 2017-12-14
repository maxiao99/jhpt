/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.dao;

import com.github.fartherp.framework.core.dao.SqlMapDao;
import com.tyj.jhpt.bo.DeviceInfo;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `tb_device_info`
 */
public interface DeviceInfoDao extends SqlMapDao<DeviceInfo, Long> {

    List<DeviceInfo> findPageDeviceInfo(Map<String, Object> map);

    DeviceInfo findByVin(String vin);
}