/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.dao.impl;

import com.github.fartherp.framework.core.dao.ConfigurableBaseSqlMapDao;
import com.github.fartherp.framework.core.dao.DaoMapper;
import javax.annotation.Resource;

import com.tyj.jhpt.bo.AllCar;
import com.tyj.jhpt.dao.AllCarDao;
import com.tyj.jhpt.dao.AllCarMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `tb_all_car`
 */
@Repository("allCarDao")
public class AllCarDaoImpl extends ConfigurableBaseSqlMapDao<AllCar, Long> implements AllCarDao {
    @Autowired
    private AllCarMapper allCarMapper;

    public DaoMapper<AllCar, Long> getDaoMapper() {
        return allCarMapper;
    }

    @Resource(name = "sqlSessionFactory")
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }

    public List<AllCar> findPageAllCar(Map<String, Object> map) {
        return allCarMapper.findPageAllCar(map);
    }
}