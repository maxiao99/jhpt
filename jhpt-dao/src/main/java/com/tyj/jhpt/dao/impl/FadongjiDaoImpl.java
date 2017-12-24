/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.dao.impl;

import com.github.fartherp.framework.core.dao.ConfigurableBaseSqlMapDao;
import com.github.fartherp.framework.core.dao.DaoMapper;
import javax.annotation.Resource;

import com.tyj.jhpt.bo.Fadongji;
import com.tyj.jhpt.dao.FadongjiDao;
import com.tyj.jhpt.dao.FadongjiMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `tb_fadongji`
 */
@Repository("fadongjiDao")
public class FadongjiDaoImpl extends ConfigurableBaseSqlMapDao<Fadongji, Long> implements FadongjiDao {
    @Autowired
    private FadongjiMapper fadongjiMapper;

    public DaoMapper<Fadongji, Long> getDaoMapper() {
        return fadongjiMapper;
    }

    @Resource(name = "sqlSessionFactory")
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }

    public List<Fadongji> findPageFadongji(Map<String, Object> map) {
        return fadongjiMapper.findPageFadongji(map);
    }
}