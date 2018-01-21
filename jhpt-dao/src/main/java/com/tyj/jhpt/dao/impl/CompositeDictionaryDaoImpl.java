/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.dao.impl;

import javax.annotation.Resource;

import com.github.fartherp.framework.core.dao.ConfigurableBaseSqlMapDao;
import com.github.fartherp.framework.core.dao.DaoMapper;
import com.tyj.jhpt.bo.CompositeDictionary;
import com.tyj.jhpt.dao.CompositeDictionaryDao;
import com.tyj.jhpt.dao.CompositeDictionaryMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `td_composite_dictionary`
 */
@Repository("compositeDictionaryDao")
public class CompositeDictionaryDaoImpl extends ConfigurableBaseSqlMapDao<CompositeDictionary, Long> implements CompositeDictionaryDao {
    @Autowired
    private CompositeDictionaryMapper compositeDictionaryMapper;

    public DaoMapper<CompositeDictionary, Long> getDaoMapper() {
        return compositeDictionaryMapper;
    }

    @Resource(name = "sqlSessionFactory")
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }

    public List<CompositeDictionary> findByParams(Map<String, Object> params) {
        return compositeDictionaryMapper.findByParams(params);
    }
}