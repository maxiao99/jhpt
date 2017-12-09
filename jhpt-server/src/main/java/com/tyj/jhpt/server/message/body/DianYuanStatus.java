/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.message.body;

/**
 * 电源状态
 *
 * @author: CK
 * @date: 2017/12/8
 */
public enum DianYuanStatus {
    DISABLE(0, "电池故障"),
    USABLE(1, "电源正常"),
    ;
    private int code;
    private String name;
    DianYuanStatus(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setName(String name) {
        this.name = name;
    }
}
