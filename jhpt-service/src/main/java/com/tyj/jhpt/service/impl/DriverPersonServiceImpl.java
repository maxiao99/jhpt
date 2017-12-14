/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.service.impl;

import com.github.fartherp.framework.core.dao.SqlMapDao;
import com.github.fartherp.framework.core.service.GenericSqlMapServiceImpl;
import javax.annotation.Resource;

import com.tyj.jhpt.bo.DriverPerson;
import com.tyj.jhpt.dao.DriverPersonDao;
import com.tyj.jhpt.service.DriverPersonService;
import org.springframework.stereotype.Service;

/**
 * This class corresponds to the database table `tb_driver_person`
 */
@Service("driverPersonService")
public class DriverPersonServiceImpl extends GenericSqlMapServiceImpl<DriverPerson, Long> implements DriverPersonService {
    @Resource(name = "driverPersonDao")
    private DriverPersonDao driverPersonDao;

    public SqlMapDao<DriverPerson, Long> getDao() {
        return driverPersonDao;
    }
}