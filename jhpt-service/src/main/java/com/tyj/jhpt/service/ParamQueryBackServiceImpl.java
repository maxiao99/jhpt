/*
 * Copyright (c) 2018. CK. All rights reserved.
 */

package com.tyj.jhpt.service;

import com.github.fartherp.framework.core.dao.SqlMapDao;
import com.github.fartherp.framework.core.service.GenericSqlMapServiceImpl;
import javax.annotation.Resource;

import com.tyj.jhpt.bo.ParamQueryBack;
import com.tyj.jhpt.dao.ParamQueryBackDao;
import org.springframework.stereotype.Service;

/**
 * This class corresponds to the database table `tb_param_query_back`
 */
@Service("paramQueryBackService")
public class ParamQueryBackServiceImpl extends GenericSqlMapServiceImpl<ParamQueryBack, Long> implements ParamQueryBackService {
    @Resource(name = "paramQueryBackDao")
    private ParamQueryBackDao paramQueryBackDao;

    public SqlMapDao<ParamQueryBack, Long> getDao() {
        return paramQueryBackDao;
    }
}