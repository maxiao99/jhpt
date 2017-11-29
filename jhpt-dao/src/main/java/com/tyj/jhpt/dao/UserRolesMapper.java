/*
 * Copyright (c) 2017. juzhen.io. All rights reserved.
 */

package com.tyj.jhpt.dao;

import com.github.fartherp.framework.core.dao.DaoMapper;
import com.github.fartherp.framework.core.orm.mybatis.annotation.SqlMapper;
import com.tyj.jhpt.bo.UserRoles;

/**
 * This class corresponds to the database table `user_roles`
 */
@SqlMapper
public interface UserRolesMapper extends DaoMapper<UserRoles, Integer> {
}