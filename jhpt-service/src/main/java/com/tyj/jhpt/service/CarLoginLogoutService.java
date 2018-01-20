/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.service;

import com.github.fartherp.framework.core.service.GenericService;
import com.tyj.jhpt.bo.CarLoginLogout;

/**
 * This class corresponds to the database table `tb_car_login_logout`
 */
public interface CarLoginLogoutService extends GenericService<CarLoginLogout, Long> {

    CarLoginLogout findByVinAndTraceNo(String vin, int traceNo, String date);
}