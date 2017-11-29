/*
 * Copyright (c) 2017. juzhen.io. All rights reserved.
 */

package com.tyj.jhpt.dao.impl;

import javax.annotation.Resource;

import com.github.fartherp.framework.core.dao.ConfigurableBaseSqlMapDao;
import com.github.fartherp.framework.core.dao.DaoMapper;
import com.tyj.jhpt.bo.UserInfos;
import com.tyj.jhpt.dao.UserInfosDao;
import com.tyj.jhpt.dao.UserInfosMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `user_infos`
 */
@Repository("userInfosDao")
public class UserInfosDaoImpl extends ConfigurableBaseSqlMapDao<UserInfos, Integer> implements UserInfosDao {
    @Autowired
    private UserInfosMapper userInfosMapper;

    public DaoMapper<UserInfos, Integer> getDaoMapper() {
        return userInfosMapper;
    }

    @Resource(name = "sqlSessionFactory")
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }

    public UserInfos findUserByMap(Map<String, Object> map) {
        return userInfosMapper.findUserByMap(map);
    }

    public List<UserInfos> findPageUser(Map<String, Object> params) {
        return userInfosMapper.findPageUser(params);
    }
}