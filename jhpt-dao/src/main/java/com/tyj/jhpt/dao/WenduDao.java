/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.dao;

import com.github.fartherp.framework.core.dao.SqlMapDao;
import com.tyj.jhpt.bo.Wendu;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `tb_wendu`
 */
public interface WenduDao extends SqlMapDao<Wendu, Long> {

    List<Wendu> findPageWendu(Map<String, Object> map);
}