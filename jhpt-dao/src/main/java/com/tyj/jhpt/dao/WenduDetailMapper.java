/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.dao;

import com.github.fartherp.framework.core.dao.DaoMapper;
import com.github.fartherp.framework.core.orm.mybatis.annotation.SqlMapper;
import com.tyj.jhpt.bo.WenduDetail;

import java.util.List;

/**
 * This class corresponds to the database table `tb_wendu_detail`
 */
@SqlMapper
public interface WenduDetailMapper extends DaoMapper<WenduDetail, Long> {
    List<WenduDetail> findByIds(List<Long> list);
}