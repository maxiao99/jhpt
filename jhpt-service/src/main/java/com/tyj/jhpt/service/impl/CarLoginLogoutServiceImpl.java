/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.service.impl;

import com.github.fartherp.framework.core.dao.SqlMapDao;
import com.github.fartherp.framework.core.service.GenericSqlMapServiceImpl;
import javax.annotation.Resource;

import com.tyj.jhpt.bo.CarLoginLogout;
import com.tyj.jhpt.dao.CarLoginLogoutDao;
import com.tyj.jhpt.service.CarLoginLogoutService;
import org.springframework.stereotype.Service;

/**
 * This class corresponds to the database table `tb_car_login_logout`
 */
@Service("carLoginLogoutService")
public class CarLoginLogoutServiceImpl extends GenericSqlMapServiceImpl<CarLoginLogout, Long> implements CarLoginLogoutService {
    @Resource(name = "carLoginLogoutDao")
    private CarLoginLogoutDao carLoginLogoutDao;

    public SqlMapDao<CarLoginLogout, Long> getDao() {
        return carLoginLogoutDao;
    }

    public CarLoginLogout findByVinAndTraceNo(String vin, int traceNo, String date) {
        return carLoginLogoutDao.findByVinAndTraceNo(vin, traceNo, date);
    }
}