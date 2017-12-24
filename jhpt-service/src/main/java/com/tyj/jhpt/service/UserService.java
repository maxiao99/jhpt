/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.service;

import com.github.fartherp.framework.core.service.GenericService;
import com.tyj.jhpt.bo.User;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `tb_user`
 */
public interface UserService extends GenericService<User, Long> {

    User findUserByMap(Map<String, Object> map);

    List<User> findPageUser(Map<String, Object> params);

    User findByUserName(String userName);
}