/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.dao;

import com.github.fartherp.framework.core.dao.SqlMapDao;
import com.tyj.jhpt.bo.CarLoginLogout;

/**
 * This class corresponds to the database table `tb_car_login_logout`
 */
public interface CarLoginLogoutDao extends SqlMapDao<CarLoginLogout, Long> {
    CarLoginLogout findByVinAndTraceNo(String vin, int traceNo);
}