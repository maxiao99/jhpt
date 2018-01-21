/*
 * Copyright (c) 2018. CK. All rights reserved.
 */

package com.tyj.jhpt.service.impl;

import com.github.fartherp.framework.core.dao.SqlMapDao;
import com.github.fartherp.framework.core.service.GenericSqlMapServiceImpl;
import javax.annotation.Resource;

import com.tyj.jhpt.bo.CarTerminalStatus;
import com.tyj.jhpt.dao.CarTerminalStatusDao;
import com.tyj.jhpt.service.CarTerminalStatusService;
import org.springframework.stereotype.Service;

/**
 * This class corresponds to the database table `tb_car_terminal_status`
 */
@Service("carTerminalStatusService")
public class CarTerminalStatusServiceImpl extends GenericSqlMapServiceImpl<CarTerminalStatus, Long> implements CarTerminalStatusService {
    @Resource(name = "carTerminalStatusDao")
    private CarTerminalStatusDao carTerminalStatusDao;

    public SqlMapDao<CarTerminalStatus, Long> getDao() {
        return carTerminalStatusDao;
    }
}