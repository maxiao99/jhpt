/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.service.impl;

import com.github.fartherp.framework.core.dao.SqlMapDao;
import com.github.fartherp.framework.core.service.GenericSqlMapServiceImpl;
import javax.annotation.Resource;

import com.tyj.jhpt.bo.Wendu;
import com.tyj.jhpt.dao.WenduDao;
import com.tyj.jhpt.service.WenduService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `tb_wendu`
 */
@Service("wenduService")
public class WenduServiceImpl extends GenericSqlMapServiceImpl<Wendu, Long> implements WenduService {
    @Resource(name = "wenduDao")
    private WenduDao wenduDao;

    public SqlMapDao<Wendu, Long> getDao() {
        return wenduDao;
    }

    public List<Wendu> findPageWendu(Map<String, Object> map) {
        return wenduDao.findPageWendu(map);
    }
}