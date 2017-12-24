/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.dao;

import com.github.fartherp.framework.core.dao.DaoMapper;
import com.github.fartherp.framework.core.orm.mybatis.annotation.SqlMapper;
import com.tyj.jhpt.bo.RanliaoDianchi;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `tb_ranliao_dianchi`
 */
@SqlMapper
public interface RanliaoDianchiMapper extends DaoMapper<RanliaoDianchi, Long> {
    List<RanliaoDianchi> findPageRanliaoDianchi(Map<String, Object> map);
}