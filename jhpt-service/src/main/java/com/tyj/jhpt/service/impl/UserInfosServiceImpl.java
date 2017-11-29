/*
 * Copyright (c) 2017. juzhen.io. All rights reserved.
 */

package com.tyj.jhpt.service.impl;

import javax.annotation.Resource;

import com.github.fartherp.framework.core.dao.SqlMapDao;
import com.github.fartherp.framework.core.service.GenericSqlMapServiceImpl;
import com.tyj.jhpt.bo.UserInfos;
import com.tyj.jhpt.dao.UserInfosDao;
import com.tyj.jhpt.service.UserInfosService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `user_infos`
 */
@Service("userInfosService")
public class UserInfosServiceImpl extends GenericSqlMapServiceImpl<UserInfos, Integer> implements UserInfosService {
    @Resource(name = "userInfosDao")
    private UserInfosDao userInfosDao;

    public SqlMapDao<UserInfos, Integer> getDao() {
        return userInfosDao;
    }

    public UserInfos findUserByMap(Map<String, Object> map) {
        return userInfosDao.findUserByMap(map);
    }

    public List<UserInfos> findPageUser(Map<String, Object> params) {
        return userInfosDao.findPageUser(params);
    }
}