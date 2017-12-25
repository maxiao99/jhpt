/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.service.impl;

import com.github.fartherp.framework.core.dao.SqlMapDao;
import com.github.fartherp.framework.core.service.GenericSqlMapServiceImpl;
import javax.annotation.Resource;

import com.tyj.jhpt.bo.WenduDetail;
import com.tyj.jhpt.dao.WenduDetailDao;
import com.tyj.jhpt.service.WenduDetailService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * This class corresponds to the database table `tb_wendu_detail`
 */
@Service("wenduDetailService")
public class WenduDetailServiceImpl extends GenericSqlMapServiceImpl<WenduDetail, Long> implements WenduDetailService {
    @Resource(name = "wenduDetailDao")
    private WenduDetailDao wenduDetailDao;

    public SqlMapDao<WenduDetail, Long> getDao() {
        return wenduDetailDao;
    }

    public List<WenduDetail> findByIds(List<Long> list) {
        return wenduDetailDao.findByIds(list);
    }
}