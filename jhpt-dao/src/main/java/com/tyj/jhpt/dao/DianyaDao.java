/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.dao;

import com.github.fartherp.framework.core.dao.SqlMapDao;
import com.tyj.jhpt.bo.Dianya;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `tb_dianya`
 */
public interface DianyaDao extends SqlMapDao<Dianya, Long> {

    List<Dianya> findPageDianya(Map<String, Object> map);
}