/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.message;

import com.github.fartherp.framework.common.util.ISOUtil;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: CK
 * @date: 2017/12/8
 */
public enum PlatformCommandEnum {
    PARAM_QUERY("80", "参数查询"),
    PARAM_SET("81", "参数设置"),
    CAR_TERMINAL_CONTROL("82", "车载终端控制"),
    ;
    private byte type;
    private String name;
    PlatformCommandEnum(String type, String name) {
        this.type = ISOUtil.hex2byte(type)[0];
        this.name = name;
    }

    public byte getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}
