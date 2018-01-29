/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.service;

import com.github.fartherp.framework.core.service.GenericService;
import com.tyj.jhpt.bo.DeviceInfo;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `tb_device_info`
 */
public interface DeviceInfoService extends GenericService<DeviceInfo, Long> {

    List<DeviceInfo> findPageDeviceInfo(Map<String, Object> map);

    DeviceInfo findByVin(String vin);

    DeviceInfo findByIdentityNo(String identityNo);

    List<DeviceInfo> findByIds(List<Long> ids);
}