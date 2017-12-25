/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.dao.impl;

import com.github.fartherp.framework.core.dao.ConfigurableBaseSqlMapDao;
import com.github.fartherp.framework.core.dao.DaoMapper;
import javax.annotation.Resource;

import com.tyj.jhpt.bo.DianyaDetail;
import com.tyj.jhpt.dao.DianyaDetailDao;
import com.tyj.jhpt.dao.DianyaDetailMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * This class corresponds to the database table `tb_dianya_detail`
 */
@Repository("dianyaDetailDao")
public class DianyaDetailDaoImpl extends ConfigurableBaseSqlMapDao<DianyaDetail, Long> implements DianyaDetailDao {
    @Autowired
    private DianyaDetailMapper dianyaDetailMapper;

    public DaoMapper<DianyaDetail, Long> getDaoMapper() {
        return dianyaDetailMapper;
    }

    @Resource(name = "sqlSessionFactory")
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }

    public List<DianyaDetail> findByIds(List<Long> list) {
        return dianyaDetailMapper.findByIds(list);
    }
}