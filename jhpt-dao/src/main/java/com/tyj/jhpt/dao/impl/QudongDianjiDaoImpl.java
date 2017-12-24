/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.dao.impl;

import com.github.fartherp.framework.core.dao.ConfigurableBaseSqlMapDao;
import com.github.fartherp.framework.core.dao.DaoMapper;
import javax.annotation.Resource;

import com.tyj.jhpt.bo.QudongDianji;
import com.tyj.jhpt.dao.QudongDianjiDao;
import com.tyj.jhpt.dao.QudongDianjiMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `tb_qudong_dianji`
 */
@Repository("qudongDianjiDao")
public class QudongDianjiDaoImpl extends ConfigurableBaseSqlMapDao<QudongDianji, Long> implements QudongDianjiDao {
    @Autowired
    private QudongDianjiMapper qudongDianjiMapper;

    public DaoMapper<QudongDianji, Long> getDaoMapper() {
        return qudongDianjiMapper;
    }

    @Resource(name = "sqlSessionFactory")
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }

    public List<QudongDianji> findPageQudongDianji(Map<String, Object> map) {
        return qudongDianjiMapper.findPageQudongDianji(map);
    }
}