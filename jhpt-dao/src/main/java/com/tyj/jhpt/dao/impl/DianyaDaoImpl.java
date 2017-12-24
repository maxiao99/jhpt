/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.dao.impl;

import com.github.fartherp.framework.core.dao.ConfigurableBaseSqlMapDao;
import com.github.fartherp.framework.core.dao.DaoMapper;
import javax.annotation.Resource;

import com.tyj.jhpt.bo.Dianya;
import com.tyj.jhpt.dao.DianyaDao;
import com.tyj.jhpt.dao.DianyaMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `tb_dianya`
 */
@Repository("dianyaDao")
public class DianyaDaoImpl extends ConfigurableBaseSqlMapDao<Dianya, Long> implements DianyaDao {
    @Autowired
    private DianyaMapper dianyaMapper;

    public DaoMapper<Dianya, Long> getDaoMapper() {
        return dianyaMapper;
    }

    @Resource(name = "sqlSessionFactory")
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }

    public List<Dianya> findPageDianya(Map<String, Object> map) {
        return dianyaMapper.findPageDianya(map);
    }
}