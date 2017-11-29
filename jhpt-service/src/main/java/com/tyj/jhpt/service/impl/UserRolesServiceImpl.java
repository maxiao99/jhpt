/*
 * Copyright (c) 2017. juzhen.io. All rights reserved.
 */

package com.tyj.jhpt.service.impl;

import javax.annotation.Resource;

import com.github.fartherp.framework.core.dao.SqlMapDao;
import com.github.fartherp.framework.core.service.GenericSqlMapServiceImpl;
import com.tyj.jhpt.bo.UserRoles;
import com.tyj.jhpt.dao.UserRolesDao;
import com.tyj.jhpt.service.UserRolesService;
import org.springframework.stereotype.Service;

/**
 * This class corresponds to the database table `user_roles`
 */
@Service("userRolesService")
public class UserRolesServiceImpl extends GenericSqlMapServiceImpl<UserRoles, Integer> implements UserRolesService {
    @Resource(name = "userRolesDao")
    private UserRolesDao userRolesDao;

    public SqlMapDao<UserRoles, Integer> getDao() {
        return userRolesDao;
    }
}