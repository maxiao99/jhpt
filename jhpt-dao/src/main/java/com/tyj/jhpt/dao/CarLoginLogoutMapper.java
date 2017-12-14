/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.dao;

import com.github.fartherp.framework.core.dao.DaoMapper;
import com.github.fartherp.framework.core.orm.mybatis.annotation.SqlMapper;
import com.tyj.jhpt.bo.CarLoginLogout;

/**
 * This class corresponds to the database table `tb_car_login_logout`
 */
@SqlMapper
public interface CarLoginLogoutMapper extends DaoMapper<CarLoginLogout, Long> {
    CarLoginLogout findByVinAndTraceNo(String vin, int traceNo);
}