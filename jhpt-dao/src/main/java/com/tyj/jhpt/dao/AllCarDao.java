/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.dao;

import com.github.fartherp.framework.core.dao.SqlMapDao;
import com.tyj.jhpt.bo.AllCar;

/**
 * This class corresponds to the database table `tb_all_car`
 */
public interface AllCarDao extends SqlMapDao<AllCar, Long> {
}