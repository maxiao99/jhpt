/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.dao.impl;

import com.github.fartherp.framework.core.dao.ConfigurableBaseSqlMapDao;
import com.github.fartherp.framework.core.dao.DaoMapper;
import javax.annotation.Resource;

import com.tyj.jhpt.bo.CarLocation;
import com.tyj.jhpt.dao.CarLocationDao;
import com.tyj.jhpt.dao.CarLocationMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * This class corresponds to the database table `tb_car_location`
 */
@Repository("carLocationDao")
public class CarLocationDaoImpl extends ConfigurableBaseSqlMapDao<CarLocation, Long> implements CarLocationDao {
    @Autowired
    private CarLocationMapper carLocationMapper;

    public DaoMapper<CarLocation, Long> getDaoMapper() {
        return carLocationMapper;
    }

    @Resource(name = "sqlSessionFactory")
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }
}