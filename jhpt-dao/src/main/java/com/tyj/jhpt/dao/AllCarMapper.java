/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.dao;

import com.github.fartherp.framework.core.dao.DaoMapper;
import com.github.fartherp.framework.core.orm.mybatis.annotation.SqlMapper;
import com.tyj.jhpt.bo.AllCar;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `tb_all_car`
 */
@SqlMapper
public interface AllCarMapper extends DaoMapper<AllCar, Long> {

    List<AllCar> findPageAllCar(Map<String, Object> map);
}