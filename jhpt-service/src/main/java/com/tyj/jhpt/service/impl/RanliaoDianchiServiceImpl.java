/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.service.impl;

import com.github.fartherp.framework.core.dao.SqlMapDao;
import com.github.fartherp.framework.core.service.GenericSqlMapServiceImpl;
import javax.annotation.Resource;

import com.tyj.jhpt.bo.RanliaoDianchi;
import com.tyj.jhpt.dao.RanliaoDianchiDao;
import com.tyj.jhpt.service.RanliaoDianchiService;
import org.springframework.stereotype.Service;

/**
 * This class corresponds to the database table `tb_ranliao_dianchi`
 */
@Service("ranliaoDianchiService")
public class RanliaoDianchiServiceImpl extends GenericSqlMapServiceImpl<RanliaoDianchi, Long> implements RanliaoDianchiService {
    @Resource(name = "ranliaoDianchiDao")
    private RanliaoDianchiDao ranliaoDianchiDao;

    public SqlMapDao<RanliaoDianchi, Long> getDao() {
        return ranliaoDianchiDao;
    }
}