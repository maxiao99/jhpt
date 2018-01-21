/*
 * Copyright (c) 2018. CK. All rights reserved.
 */

package com.tyj.jhpt.dao.impl;

import com.github.fartherp.framework.core.dao.ConfigurableBaseSqlMapDao;
import com.github.fartherp.framework.core.dao.DaoMapper;
import javax.annotation.Resource;

import com.tyj.jhpt.bo.ParamQueryBack;
import com.tyj.jhpt.dao.ParamQueryBackDao;
import com.tyj.jhpt.dao.ParamQueryBackMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * This class corresponds to the database table `tb_param_query_back`
 */
@Repository("paramQueryBackDao")
public class ParamQueryBackDaoImpl extends ConfigurableBaseSqlMapDao<ParamQueryBack, Long> implements ParamQueryBackDao {
    @Autowired
    private ParamQueryBackMapper paramQueryBackMapper;

    public DaoMapper<ParamQueryBack, Long> getDaoMapper() {
        return paramQueryBackMapper;
    }

    @Resource(name = "sqlSessionFactory")
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }
}