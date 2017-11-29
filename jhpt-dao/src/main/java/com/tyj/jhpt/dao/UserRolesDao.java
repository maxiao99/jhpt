/*
 * Copyright (c) 2017. juzhen.io. All rights reserved.
 */

package com.tyj.jhpt.dao;

import com.github.fartherp.framework.core.dao.SqlMapDao;
import com.tyj.jhpt.bo.UserRoles;

/**
 * This class corresponds to the database table `user_roles`
 */
public interface UserRolesDao extends SqlMapDao<UserRoles, Integer> {
}