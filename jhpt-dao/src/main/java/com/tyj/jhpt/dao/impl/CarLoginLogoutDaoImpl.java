/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.dao.impl;

import com.github.fartherp.framework.core.dao.ConfigurableBaseSqlMapDao;
import com.github.fartherp.framework.core.dao.DaoMapper;
import javax.annotation.Resource;

import com.tyj.jhpt.bo.CarLoginLogout;
import com.tyj.jhpt.dao.CarLoginLogoutDao;
import com.tyj.jhpt.dao.CarLoginLogoutMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * This class corresponds to the database table `tb_car_login_logout`
 */
@Repository("carLoginLogoutDao")
public class CarLoginLogoutDaoImpl extends ConfigurableBaseSqlMapDao<CarLoginLogout, Long> implements CarLoginLogoutDao {
    @Autowired
    private CarLoginLogoutMapper carLoginLogoutMapper;

    public DaoMapper<CarLoginLogout, Long> getDaoMapper() {
        return carLoginLogoutMapper;
    }

    @Resource(name = "sqlSessionFactory")
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }

    public CarLoginLogout findByVinAndTraceNo(String vin, int traceNo, String date) {
        return carLoginLogoutMapper.findByVinAndTraceNo(vin, traceNo, date);
    }
}