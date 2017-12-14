/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.dao;

import com.github.fartherp.framework.core.dao.DaoMapper;
import com.github.fartherp.framework.core.orm.mybatis.annotation.SqlMapper;
import com.tyj.jhpt.bo.Wendu;

/**
 * This class corresponds to the database table `tb_wendu`
 */
@SqlMapper
public interface WenduMapper extends DaoMapper<Wendu, Long> {
}