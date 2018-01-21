/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.service.impl;

import javax.annotation.Resource;

import com.github.fartherp.framework.core.dao.SqlMapDao;
import com.github.fartherp.framework.core.service.GenericSqlMapServiceImpl;
import com.tyj.jhpt.bo.CompositeDictionary;
import com.tyj.jhpt.dao.CompositeDictionaryDao;
import com.tyj.jhpt.service.CompositeDictionaryService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `td_composite_dictionary`
 */
@Service("compositeDictionaryService")
public class CompositeDictionaryServiceImpl extends GenericSqlMapServiceImpl<CompositeDictionary, Long> implements CompositeDictionaryService {
    @Resource(name = "compositeDictionaryDao")
    private CompositeDictionaryDao compositeDictionaryDao;

    public SqlMapDao<CompositeDictionary, Long> getDao() {
        return compositeDictionaryDao;
    }

    public List<CompositeDictionary> findByParams(Map<String, Object> params) {
        return compositeDictionaryDao.findByParams(params);
    }

    public Map<Integer, String> findMapByParams(Map<String, Object> params) {
        List<CompositeDictionary> list = findByParams(params);
        Map<Integer, String> map = new HashMap<Integer, String>();
        for (CompositeDictionary c : list) {
            map.put(c.getDicId(), c.getDicName());
        }
        return map;
    }
}