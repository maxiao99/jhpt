/*
 * Copyright (c) 2017. juzhen.io. All rights reserved.
 */

package com.tyj.jhpt.dao;

import com.github.fartherp.framework.core.dao.SqlMapDao;
import com.tyj.jhpt.bo.DeviceInfo;
import com.tyj.jhpt.dto.CustomerDto;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `device_info`
 */
public interface DeviceInfoDao extends SqlMapDao<DeviceInfo, Integer> {

    List<DeviceInfo> findPageDeviceInfo(Map<String, Object> map);

    List<CustomerDto> findPageCustomerList(Map<String, Object> map);
}