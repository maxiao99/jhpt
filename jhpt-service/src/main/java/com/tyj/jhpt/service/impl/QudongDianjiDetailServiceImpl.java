/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.service.impl;

import com.github.fartherp.framework.core.dao.SqlMapDao;
import com.github.fartherp.framework.core.service.GenericSqlMapServiceImpl;
import javax.annotation.Resource;

import com.tyj.jhpt.bo.QudongDianjiDetail;
import com.tyj.jhpt.dao.QudongDianjiDetailDao;
import com.tyj.jhpt.service.QudongDianjiDetailService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * This class corresponds to the database table `tb_qudong_dianji_detail`
 */
@Service("qudongDianjiDetailService")
public class QudongDianjiDetailServiceImpl extends GenericSqlMapServiceImpl<QudongDianjiDetail, Long> implements QudongDianjiDetailService {
    @Resource(name = "qudongDianjiDetailDao")
    private QudongDianjiDetailDao qudongDianjiDetailDao;

    public SqlMapDao<QudongDianjiDetail, Long> getDao() {
        return qudongDianjiDetailDao;
    }

    public List<QudongDianjiDetail> findByIds(List<Long> list) {
        return qudongDianjiDetailDao.findByIds(list);
    }
}