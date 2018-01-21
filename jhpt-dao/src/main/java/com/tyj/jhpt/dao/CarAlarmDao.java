/*
 * Copyright (c) 2018. CK. All rights reserved.
 */

package com.tyj.jhpt.dao;

import com.github.fartherp.framework.core.dao.SqlMapDao;
import com.tyj.jhpt.bo.CarAlarm;

/**
 * This class corresponds to the database table `tb_car_alarm`
 */
public interface CarAlarmDao extends SqlMapDao<CarAlarm, Long> {
}