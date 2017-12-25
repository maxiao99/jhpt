/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.dao;

import com.github.fartherp.framework.core.dao.DaoMapper;
import com.github.fartherp.framework.core.orm.mybatis.annotation.SqlMapper;
import com.tyj.jhpt.bo.DianyaDetail;

import java.util.List;

/**
 * This class corresponds to the database table `tb_dianya_detail`
 */
@SqlMapper
public interface DianyaDetailMapper extends DaoMapper<DianyaDetail, Long> {
    List<DianyaDetail> findByIds(List<Long> list);
}