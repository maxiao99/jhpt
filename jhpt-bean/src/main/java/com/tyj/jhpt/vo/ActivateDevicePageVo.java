/*
 * Copyright (c) 2017. juzhen.io. All rights reserved.
 */

package com.tyj.jhpt.vo;

import com.github.fartherp.framework.core.vo.BaseVo;
import com.tyj.jhpt.dto.PayRecordDto;

/**
 * Created by IntelliJ IDEA .
 * Auth: CK
 * Date: 2016/5/4
 */
public class ActivateDevicePageVo extends BaseVo<PayRecordDto> {
    private String keyword;
    private Byte activate = 0;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Byte getActivate() {
        return activate;
    }

    public void setActivate(Byte activate) {
        this.activate = activate;
    }
}
