/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.service;

import com.github.fartherp.framework.core.service.GenericService;
import com.tyj.jhpt.bo.Alarm;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `tb_alarm`
 */
public interface AlarmService extends GenericService<Alarm, Long> {

    List<Alarm> findPageAlarm(Map<String, Object> map);
}