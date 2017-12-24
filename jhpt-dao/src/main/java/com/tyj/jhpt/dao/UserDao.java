/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.dao;

import com.github.fartherp.framework.core.dao.SqlMapDao;
import com.tyj.jhpt.bo.User;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `tb_user`
 */
public interface UserDao extends SqlMapDao<User, Long> {
    User findUserByMap(Map<String, Object> map);

    List<User> findPageUser(Map<String, Object> params);

    User findByUserName(String userName);
}