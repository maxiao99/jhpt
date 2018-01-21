/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.dao;

import com.github.fartherp.framework.core.dao.SqlMapDao;
import com.tyj.jhpt.bo.CompositeDictionary;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `td_composite_dictionary`
 */
public interface CompositeDictionaryDao extends SqlMapDao<CompositeDictionary, Long> {

    List<CompositeDictionary> findByParams(Map<String, Object> params);
}