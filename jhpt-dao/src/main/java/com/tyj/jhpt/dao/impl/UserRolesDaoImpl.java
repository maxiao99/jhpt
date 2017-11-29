/*
 * Copyright (c) 2017. juzhen.io. All rights reserved.
 */

package com.tyj.jhpt.dao.impl;

import javax.annotation.Resource;

import com.github.fartherp.framework.core.dao.ConfigurableBaseSqlMapDao;
import com.github.fartherp.framework.core.dao.DaoMapper;
import com.tyj.jhpt.bo.UserRoles;
import com.tyj.jhpt.dao.UserRolesDao;
import com.tyj.jhpt.dao.UserRolesMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * This class corresponds to the database table `user_roles`
 */
@Repository("userRolesDao")
public class UserRolesDaoImpl extends ConfigurableBaseSqlMapDao<UserRoles, Integer> implements UserRolesDao {
    @Autowired
    private UserRolesMapper userRolesMapper;

    public DaoMapper<UserRoles, Integer> getDaoMapper() {
        return userRolesMapper;
    }

    @Resource(name = "sqlSessionFactory")
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }
}