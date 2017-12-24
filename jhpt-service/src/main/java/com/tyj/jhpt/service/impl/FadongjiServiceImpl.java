/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.service.impl;

import com.github.fartherp.framework.core.dao.SqlMapDao;
import com.github.fartherp.framework.core.service.GenericSqlMapServiceImpl;
import javax.annotation.Resource;

import com.tyj.jhpt.bo.Fadongji;
import com.tyj.jhpt.dao.FadongjiDao;
import com.tyj.jhpt.service.FadongjiService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `tb_fadongji`
 */
@Service("fadongjiService")
public class FadongjiServiceImpl extends GenericSqlMapServiceImpl<Fadongji, Long> implements FadongjiService {
    @Resource(name = "fadongjiDao")
    private FadongjiDao fadongjiDao;

    public SqlMapDao<Fadongji, Long> getDao() {
        return fadongjiDao;
    }

    public List<Fadongji> findPageFadongji(Map<String, Object> map) {
        return fadongjiDao.findPageFadongji(map);
    }
}