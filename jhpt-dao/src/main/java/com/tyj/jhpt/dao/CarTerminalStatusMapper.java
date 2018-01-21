/*
 * Copyright (c) 2018. CK. All rights reserved.
 */

package com.tyj.jhpt.dao;

import com.github.fartherp.framework.core.dao.DaoMapper;
import com.github.fartherp.framework.core.orm.mybatis.annotation.SqlMapper;
import com.tyj.jhpt.bo.CarTerminalStatus;

/**
 * This class corresponds to the database table `tb_car_terminal_status`
 */
@SqlMapper
public interface CarTerminalStatusMapper extends DaoMapper<CarTerminalStatus, Long> {
}