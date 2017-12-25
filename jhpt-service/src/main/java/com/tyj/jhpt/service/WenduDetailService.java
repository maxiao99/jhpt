/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.service;

import com.github.fartherp.framework.core.service.GenericService;
import com.tyj.jhpt.bo.WenduDetail;

import java.util.List;

/**
 * This class corresponds to the database table `tb_wendu_detail`
 */
public interface WenduDetailService extends GenericService<WenduDetail, Long> {
    List<WenduDetail> findByIds(List<Long> list);
}