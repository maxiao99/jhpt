/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.dao;

import com.github.fartherp.framework.core.dao.DaoMapper;
import com.github.fartherp.framework.core.orm.mybatis.annotation.SqlMapper;
import com.tyj.jhpt.bo.DeviceInfo;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `tb_device_info`
 */
@SqlMapper
public interface DeviceInfoMapper extends DaoMapper<DeviceInfo, Long> {

    List<DeviceInfo> findPageDeviceInfo(Map<String, Object> map);

    DeviceInfo findByVin(String vin);
}