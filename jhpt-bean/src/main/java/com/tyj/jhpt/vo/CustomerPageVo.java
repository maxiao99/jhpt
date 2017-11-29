/*
 * Copyright (c) 2017. juzhen.io. All rights reserved.
 */

package com.tyj.jhpt.vo;

import com.github.fartherp.framework.core.vo.BaseVo;
import com.tyj.jhpt.dto.CustomerDto;
import com.tyj.jhpt.dto.PayRecordDto;

/**
 * Created by IntelliJ IDEA .
 * Auth: CK
 * Date: 2016/5/4
 */
public class CustomerPageVo extends BaseVo<CustomerDto> {
    private String keyword;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}
