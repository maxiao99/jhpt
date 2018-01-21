/*
 * Copyright (c) 2018. CK. All rights reserved.
 */

package com.tyj.jhpt.dao.impl;

import com.github.fartherp.framework.core.dao.ConfigurableBaseSqlMapDao;
import com.github.fartherp.framework.core.dao.DaoMapper;
import javax.annotation.Resource;

import com.tyj.jhpt.bo.CarTerminalStatus;
import com.tyj.jhpt.dao.CarTerminalStatusDao;
import com.tyj.jhpt.dao.CarTerminalStatusMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * This class corresponds to the database table `tb_car_terminal_status`
 */
@Repository("carTerminalStatusDao")
public class CarTerminalStatusDaoImpl extends ConfigurableBaseSqlMapDao<CarTerminalStatus, Long> implements CarTerminalStatusDao {
    @Autowired
    private CarTerminalStatusMapper carTerminalStatusMapper;

    public DaoMapper<CarTerminalStatus, Long> getDaoMapper() {
        return carTerminalStatusMapper;
    }

    @Resource(name = "sqlSessionFactory")
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }
}