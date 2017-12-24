/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.service;

import com.github.fartherp.framework.core.service.GenericService;
import com.tyj.jhpt.bo.QudongDianji;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `tb_qudong_dianji`
 */
public interface QudongDianjiService extends GenericService<QudongDianji, Long> {

    List<QudongDianji> findPageQudongDianji(Map<String, Object> map);
}