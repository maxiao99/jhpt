/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.dao.impl;

import com.github.fartherp.framework.core.dao.ConfigurableBaseSqlMapDao;
import com.github.fartherp.framework.core.dao.DaoMapper;
import javax.annotation.Resource;

import com.tyj.jhpt.bo.Supers;
import com.tyj.jhpt.dao.SupersDao;
import com.tyj.jhpt.dao.SupersMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `tb_supers`
 */
@Repository("supersDao")
public class SupersDaoImpl extends ConfigurableBaseSqlMapDao<Supers, Long> implements SupersDao {
    @Autowired
    private SupersMapper supersMapper;

    public DaoMapper<Supers, Long> getDaoMapper() {
        return supersMapper;
    }

    @Resource(name = "sqlSessionFactory")
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }

    public List<Supers> findPageSupers(Map<String, Object> map) {
        return supersMapper.findPageSupers(map);
    }
}