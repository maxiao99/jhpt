/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.dao;

import com.github.fartherp.framework.core.dao.DaoMapper;
import com.github.fartherp.framework.core.orm.mybatis.annotation.SqlMapper;
import com.tyj.jhpt.bo.Dianya;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `tb_dianya`
 */
@SqlMapper
public interface DianyaMapper extends DaoMapper<Dianya, Long> {

    List<Dianya> findPageDianya(Map<String, Object> map);
}