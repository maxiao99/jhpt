/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.dao.impl;

import com.github.fartherp.framework.core.dao.ConfigurableBaseSqlMapDao;
import com.github.fartherp.framework.core.dao.DaoMapper;
import javax.annotation.Resource;

import com.tyj.jhpt.bo.DriverPerson;
import com.tyj.jhpt.dao.DriverPersonDao;
import com.tyj.jhpt.dao.DriverPersonMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * This class corresponds to the database table `tb_driver_person`
 */
@Repository("driverPersonDao")
public class DriverPersonDaoImpl extends ConfigurableBaseSqlMapDao<DriverPerson, Long> implements DriverPersonDao {
    @Autowired
    private DriverPersonMapper driverPersonMapper;

    public DaoMapper<DriverPerson, Long> getDaoMapper() {
        return driverPersonMapper;
    }

    @Resource(name = "sqlSessionFactory")
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }
}