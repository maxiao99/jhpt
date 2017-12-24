/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.service.impl;

import com.github.fartherp.framework.core.dao.SqlMapDao;
import com.github.fartherp.framework.core.service.GenericSqlMapServiceImpl;
import javax.annotation.Resource;

import com.tyj.jhpt.bo.User;
import com.tyj.jhpt.dao.UserDao;
import com.tyj.jhpt.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `tb_user`
 */
@Service("userService")
public class UserServiceImpl extends GenericSqlMapServiceImpl<User, Long> implements UserService {
    @Resource(name = "userDao")
    private UserDao userDao;

    public SqlMapDao<User, Long> getDao() {
        return userDao;
    }

    public User findUserByMap(Map<String, Object> map) {
        return userDao.findUserByMap(map);
    }

    public List<User> findPageUser(Map<String, Object> params) {
        return userDao.findPageUser(params);
    }

    public User findByUserName(String userName) {
        return userDao.findByUserName(userName);
    }
}