/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.dao.impl;

import com.github.fartherp.framework.core.dao.ConfigurableBaseSqlMapDao;
import com.github.fartherp.framework.core.dao.DaoMapper;
import javax.annotation.Resource;

import com.tyj.jhpt.bo.User;
import com.tyj.jhpt.dao.UserDao;
import com.tyj.jhpt.dao.UserMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `tb_user`
 */
@Repository("userDao")
public class UserDaoImpl extends ConfigurableBaseSqlMapDao<User, Long> implements UserDao {
    @Autowired
    private UserMapper userMapper;

    public DaoMapper<User, Long> getDaoMapper() {
        return userMapper;
    }

    @Resource(name = "sqlSessionFactory")
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }

    public User findUserByMap(Map<String, Object> map) {
        return userMapper.findUserByMap(map);
    }

    public List<User> findPageUser(Map<String, Object> params) {
        return userMapper.findPageUser(params);
    }

    public User findByUserName(String userName) {
        return userMapper.findByUserName(userName);
    }
}