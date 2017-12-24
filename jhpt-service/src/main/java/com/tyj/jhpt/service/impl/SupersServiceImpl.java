/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.service.impl;

import com.github.fartherp.framework.core.dao.SqlMapDao;
import com.github.fartherp.framework.core.service.GenericSqlMapServiceImpl;
import javax.annotation.Resource;

import com.tyj.jhpt.bo.Supers;
import com.tyj.jhpt.dao.SupersDao;
import com.tyj.jhpt.service.SupersService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `tb_supers`
 */
@Service("supersService")
public class SupersServiceImpl extends GenericSqlMapServiceImpl<Supers, Long> implements SupersService {
    @Resource(name = "supersDao")
    private SupersDao supersDao;

    public SqlMapDao<Supers, Long> getDao() {
        return supersDao;
    }

    public List<Supers> findPageSupers(Map<String, Object> map) {
        return supersDao.findPageSupers(map);
    }
}