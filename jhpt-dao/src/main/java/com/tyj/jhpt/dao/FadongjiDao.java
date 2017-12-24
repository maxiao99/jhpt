/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.dao;

import com.github.fartherp.framework.core.dao.SqlMapDao;
import com.tyj.jhpt.bo.Fadongji;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `tb_fadongji`
 */
public interface FadongjiDao extends SqlMapDao<Fadongji, Long> {
    List<Fadongji> findPageFadongji(Map<String, Object> map);
}