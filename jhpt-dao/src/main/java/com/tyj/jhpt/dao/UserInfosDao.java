/*
 * Copyright (c) 2017. juzhen.io. All rights reserved.
 */

package com.tyj.jhpt.dao;

import com.github.fartherp.framework.core.dao.SqlMapDao;
import com.tyj.jhpt.bo.UserInfos;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `user_infos`
 */
public interface UserInfosDao extends SqlMapDao<UserInfos, Integer> {
    UserInfos findUserByMap(Map<String, Object> map);

    List<UserInfos> findPageUser(Map<String, Object> params);
}