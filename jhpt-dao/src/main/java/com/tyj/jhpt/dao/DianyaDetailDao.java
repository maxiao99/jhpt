/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.dao;

import com.github.fartherp.framework.core.dao.SqlMapDao;
import com.tyj.jhpt.bo.DianyaDetail;

import java.util.List;

/**
 * This class corresponds to the database table `tb_dianya_detail`
 */
public interface DianyaDetailDao extends SqlMapDao<DianyaDetail, Long> {
    List<DianyaDetail> findByIds(List<Long> list);
}