/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.service.impl;

import com.github.fartherp.framework.core.dao.SqlMapDao;
import com.github.fartherp.framework.core.service.GenericSqlMapServiceImpl;
import javax.annotation.Resource;

import com.tyj.jhpt.bo.QudongDianji;
import com.tyj.jhpt.dao.QudongDianjiDao;
import com.tyj.jhpt.service.QudongDianjiService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `tb_qudong_dianji`
 */
@Service("qudongDianjiService")
public class QudongDianjiServiceImpl extends GenericSqlMapServiceImpl<QudongDianji, Long> implements QudongDianjiService {
    @Resource(name = "qudongDianjiDao")
    private QudongDianjiDao qudongDianjiDao;

    public SqlMapDao<QudongDianji, Long> getDao() {
        return qudongDianjiDao;
    }

    public List<QudongDianji> findPageQudongDianji(Map<String, Object> map) {
        return qudongDianjiDao.findPageQudongDianji(map);
    }
}