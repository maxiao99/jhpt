/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.service;

import com.github.fartherp.framework.core.service.GenericService;
import com.tyj.jhpt.bo.Supers;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `tb_supers`
 */
public interface SupersService extends GenericService<Supers, Long> {

    List<Supers> findPageSupers(Map<String, Object> map);
}