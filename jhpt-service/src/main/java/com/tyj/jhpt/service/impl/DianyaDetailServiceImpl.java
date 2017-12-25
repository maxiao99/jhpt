/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.service.impl;

import com.github.fartherp.framework.core.dao.SqlMapDao;
import com.github.fartherp.framework.core.service.GenericSqlMapServiceImpl;
import javax.annotation.Resource;

import com.tyj.jhpt.bo.DianyaDetail;
import com.tyj.jhpt.dao.DianyaDetailDao;
import com.tyj.jhpt.service.DianyaDetailService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * This class corresponds to the database table `tb_dianya_detail`
 */
@Service("dianyaDetailService")
public class DianyaDetailServiceImpl extends GenericSqlMapServiceImpl<DianyaDetail, Long> implements DianyaDetailService {
    @Resource(name = "dianyaDetailDao")
    private DianyaDetailDao dianyaDetailDao;

    public SqlMapDao<DianyaDetail, Long> getDao() {
        return dianyaDetailDao;
    }

    public List<DianyaDetail> findByIds(List<Long> list) {
        return dianyaDetailDao.findByIds(list);
    }
}