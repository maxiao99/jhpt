/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.service.impl;

import com.github.fartherp.framework.core.dao.SqlMapDao;
import com.github.fartherp.framework.core.service.GenericSqlMapServiceImpl;
import javax.annotation.Resource;

import com.tyj.jhpt.bo.CarLocation;
import com.tyj.jhpt.dao.CarLocationDao;
import com.tyj.jhpt.service.CarLocationService;
import org.springframework.stereotype.Service;

/**
 * This class corresponds to the database table `tb_car_location`
 */
@Service("carLocationService")
public class CarLocationServiceImpl extends GenericSqlMapServiceImpl<CarLocation, Long> implements CarLocationService {
    @Resource(name = "carLocationDao")
    private CarLocationDao carLocationDao;

    public SqlMapDao<CarLocation, Long> getDao() {
        return carLocationDao;
    }
}