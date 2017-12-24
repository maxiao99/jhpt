/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.service;

import com.github.fartherp.framework.core.service.GenericService;
import com.tyj.jhpt.bo.AllCar;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `tb_all_car`
 */
public interface AllCarService extends GenericService<AllCar, Long> {

    List<AllCar> findPageAllCar(Map<String, Object> map);
}