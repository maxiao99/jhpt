/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.dao.impl;

import com.github.fartherp.framework.core.dao.ConfigurableBaseSqlMapDao;
import com.github.fartherp.framework.core.dao.DaoMapper;
import javax.annotation.Resource;

import com.tyj.jhpt.bo.RanliaoDianchi;
import com.tyj.jhpt.dao.RanliaoDianchiDao;
import com.tyj.jhpt.dao.RanliaoDianchiMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `tb_ranliao_dianchi`
 */
@Repository("ranliaoDianchiDao")
public class RanliaoDianchiDaoImpl extends ConfigurableBaseSqlMapDao<RanliaoDianchi, Long> implements RanliaoDianchiDao {
    @Autowired
    private RanliaoDianchiMapper ranliaoDianchiMapper;

    public DaoMapper<RanliaoDianchi, Long> getDaoMapper() {
        return ranliaoDianchiMapper;
    }

    @Resource(name = "sqlSessionFactory")
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }

    public List<RanliaoDianchi> findPageRanliaoDianchi(Map<String, Object> map) {
        return ranliaoDianchiMapper.findPageRanliaoDianchi(map);
    }
}