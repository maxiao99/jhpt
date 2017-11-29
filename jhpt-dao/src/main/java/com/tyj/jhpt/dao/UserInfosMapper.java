/*
 * Copyright (c) 2017. juzhen.io. All rights reserved.
 */

package com.tyj.jhpt.dao;

import com.github.fartherp.framework.core.dao.DaoMapper;
import com.github.fartherp.framework.core.orm.mybatis.annotation.SqlMapper;
import com.tyj.jhpt.bo.UserInfos;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `user_infos`
 */
@SqlMapper
public interface UserInfosMapper extends DaoMapper<UserInfos, Integer> {
    UserInfos findUserByMap(Map<String, Object> map);

    List<UserInfos> findPageUser(Map<String, Object> params);
}