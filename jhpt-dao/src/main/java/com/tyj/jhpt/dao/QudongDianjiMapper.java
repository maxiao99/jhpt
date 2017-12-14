/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.dao;

import com.github.fartherp.framework.core.dao.DaoMapper;
import com.github.fartherp.framework.core.orm.mybatis.annotation.SqlMapper;
import com.tyj.jhpt.bo.QudongDianji;

/**
 * This class corresponds to the database table `tb_qudong_dianji`
 */
@SqlMapper
public interface QudongDianjiMapper extends DaoMapper<QudongDianji, Long> {
}