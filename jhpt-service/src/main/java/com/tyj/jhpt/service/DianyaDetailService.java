/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.service;

import com.github.fartherp.framework.core.service.GenericService;
import com.tyj.jhpt.bo.DianyaDetail;

import java.util.List;

/**
 * This class corresponds to the database table `tb_dianya_detail`
 */
public interface DianyaDetailService extends GenericService<DianyaDetail, Long> {

    List<DianyaDetail> findByIds(List<Long> list);
}