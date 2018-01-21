/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.vo;

import com.github.fartherp.framework.core.vo.BaseVo;
import com.tyj.jhpt.bo.DeviceInfo;

/**
 * Created by IntelliJ IDEA .
 * Auth: CK
 * Date: 2016/5/4
 */
public class DeviceInfoPageVo extends BaseVo<DeviceInfo> {
    private String keyword;
    private Byte type;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }
}
