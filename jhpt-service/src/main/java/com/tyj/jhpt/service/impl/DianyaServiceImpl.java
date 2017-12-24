/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.service.impl;

import com.github.fartherp.framework.core.dao.SqlMapDao;
import com.github.fartherp.framework.core.service.GenericSqlMapServiceImpl;
import javax.annotation.Resource;

import com.tyj.jhpt.bo.Dianya;
import com.tyj.jhpt.dao.DianyaDao;
import com.tyj.jhpt.service.DianyaService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `tb_dianya`
 */
@Service("dianyaService")
public class DianyaServiceImpl extends GenericSqlMapServiceImpl<Dianya, Long> implements DianyaService {
    @Resource(name = "dianyaDao")
    private DianyaDao dianyaDao;

    public SqlMapDao<Dianya, Long> getDao() {
        return dianyaDao;
    }

    public List<Dianya> findPageDianya(Map<String, Object> map) {
        return dianyaDao.findPageDianya(map);
    }
}