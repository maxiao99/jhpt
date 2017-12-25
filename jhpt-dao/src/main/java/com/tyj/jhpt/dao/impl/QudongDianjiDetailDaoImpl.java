/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.dao.impl;

import com.github.fartherp.framework.core.dao.ConfigurableBaseSqlMapDao;
import com.github.fartherp.framework.core.dao.DaoMapper;
import javax.annotation.Resource;

import com.tyj.jhpt.bo.QudongDianjiDetail;
import com.tyj.jhpt.dao.QudongDianjiDetailDao;
import com.tyj.jhpt.dao.QudongDianjiDetailMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * This class corresponds to the database table `tb_qudong_dianji_detail`
 */
@Repository("qudongDianjiDetailDao")
public class QudongDianjiDetailDaoImpl extends ConfigurableBaseSqlMapDao<QudongDianjiDetail, Long> implements QudongDianjiDetailDao {
    @Autowired
    private QudongDianjiDetailMapper qudongDianjiDetailMapper;

    public DaoMapper<QudongDianjiDetail, Long> getDaoMapper() {
        return qudongDianjiDetailMapper;
    }

    @Resource(name = "sqlSessionFactory")
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }

    public List<QudongDianjiDetail> findByIds(List<Long> list) {
        return qudongDianjiDetailMapper.findByIds(list);
    }
}