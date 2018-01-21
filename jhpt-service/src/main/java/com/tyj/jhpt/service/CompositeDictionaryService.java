/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.service;

import com.github.fartherp.framework.core.service.GenericService;
import com.tyj.jhpt.bo.CompositeDictionary;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `td_composite_dictionary`
 */
public interface CompositeDictionaryService extends GenericService<CompositeDictionary, Long> {

    List<CompositeDictionary> findByParams(Map<String, Object> params);

    Map<Integer, String> findMapByParams(Map<String, Object> params);
}