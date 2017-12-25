/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.dao.impl;

import com.github.fartherp.framework.core.dao.ConfigurableBaseSqlMapDao;
import com.github.fartherp.framework.core.dao.DaoMapper;
import javax.annotation.Resource;

import com.tyj.jhpt.bo.WenduDetail;
import com.tyj.jhpt.dao.WenduDetailDao;
import com.tyj.jhpt.dao.WenduDetailMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * This class corresponds to the database table `tb_wendu_detail`
 */
@Repository("wenduDetailDao")
public class WenduDetailDaoImpl extends ConfigurableBaseSqlMapDao<WenduDetail, Long> implements WenduDetailDao {
    @Autowired
    private WenduDetailMapper wenduDetailMapper;

    public DaoMapper<WenduDetail, Long> getDaoMapper() {
        return wenduDetailMapper;
    }

    @Resource(name = "sqlSessionFactory")
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }

    public List<WenduDetail> findByIds(List<Long> list) {
        return wenduDetailMapper.findByIds(list);
    }
}