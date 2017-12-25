/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.dao;

import com.github.fartherp.framework.core.dao.DaoMapper;
import com.github.fartherp.framework.core.orm.mybatis.annotation.SqlMapper;
import com.tyj.jhpt.bo.QudongDianjiDetail;

import java.util.List;

/**
 * This class corresponds to the database table `tb_qudong_dianji_detail`
 */
@SqlMapper
public interface QudongDianjiDetailMapper extends DaoMapper<QudongDianjiDetail, Long> {
    List<QudongDianjiDetail> findByIds(List<Long> list);
}