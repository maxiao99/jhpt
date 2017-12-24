/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.service.impl;

import com.github.fartherp.framework.core.dao.SqlMapDao;
import com.github.fartherp.framework.core.service.GenericSqlMapServiceImpl;
import javax.annotation.Resource;

import com.tyj.jhpt.bo.AllCar;
import com.tyj.jhpt.dao.AllCarDao;
import com.tyj.jhpt.service.AllCarService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `tb_all_car`
 */
@Service("allCarService")
public class AllCarServiceImpl extends GenericSqlMapServiceImpl<AllCar, Long> implements AllCarService {
    @Resource(name = "allCarDao")
    private AllCarDao allCarDao;

    public SqlMapDao<AllCar, Long> getDao() {
        return allCarDao;
    }

    public List<AllCar> findPageAllCar(Map<String, Object> map) {
        return allCarDao.findPageAllCar(map);
    }
}