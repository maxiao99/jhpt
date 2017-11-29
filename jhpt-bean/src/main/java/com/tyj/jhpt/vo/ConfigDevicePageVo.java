/*
 * Copyright (c) 2017. juzhen.io. All rights reserved.
 */

package com.tyj.jhpt.vo;

import com.github.fartherp.framework.core.vo.BaseVo;
import com.tyj.jhpt.dto.PayRecordDto;

import java.util.Date;

/**
 * Created by IntelliJ IDEA .
 * Auth: CK
 * Date: 2016/5/4
 */
public class ConfigDevicePageVo extends BaseVo<PayRecordDto> {
    private String keyword;
    private Byte activate = 1;
    private Date outofdateTime = new Date();

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

    public Date getOutofdateTime() {
        return outofdateTime;
    }

    public void setOutofdateTime(Date outofdateTime) {
        this.outofdateTime = outofdateTime;
    }
}
