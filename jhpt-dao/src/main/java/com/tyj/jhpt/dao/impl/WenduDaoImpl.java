/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.dao.impl;

import com.github.fartherp.framework.core.dao.ConfigurableBaseSqlMapDao;
import com.github.fartherp.framework.core.dao.DaoMapper;
import javax.annotation.Resource;

import com.tyj.jhpt.bo.Wendu;
import com.tyj.jhpt.dao.WenduDao;
import com.tyj.jhpt.dao.WenduMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `tb_wendu`
 */
@Repository("wenduDao")
public class WenduDaoImpl extends ConfigurableBaseSqlMapDao<Wendu, Long> implements WenduDao {
    @Autowired
    private WenduMapper wenduMapper;

    public DaoMapper<Wendu, Long> getDaoMapper() {
        return wenduMapper;
    }

    @Resource(name = "sqlSessionFactory")
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }

    public List<Wendu> findPageWendu(Map<String, Object> map) {
        return wenduMapper.findPageWendu(map);
    }
}