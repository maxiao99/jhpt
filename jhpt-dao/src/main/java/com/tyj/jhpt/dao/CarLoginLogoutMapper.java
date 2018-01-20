/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.dao;

import com.github.fartherp.framework.core.dao.DaoMapper;
import com.github.fartherp.framework.core.orm.mybatis.annotation.SqlMapper;
import com.tyj.jhpt.bo.CarLoginLogout;
import org.apache.ibatis.annotations.Param;

/**
 * This class corresponds to the database table `tb_car_login_logout`
 */
@SqlMapper
public interface CarLoginLogoutMapper extends DaoMapper<CarLoginLogout, Long> {
    CarLoginLogout findByVinAndTraceNo(@Param("vin") String vin, @Param("traceNo") int traceNo, @Param("date") String date);
}