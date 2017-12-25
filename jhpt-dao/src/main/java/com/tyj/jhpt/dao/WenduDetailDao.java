/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.dao;

import com.github.fartherp.framework.core.dao.SqlMapDao;
import com.tyj.jhpt.bo.WenduDetail;

import java.util.List;

/**
 * This class corresponds to the database table `tb_wendu_detail`
 */
public interface WenduDetailDao extends SqlMapDao<WenduDetail, Long> {
    List<WenduDetail> findByIds(List<Long> list);
}