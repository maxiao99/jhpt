/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.message.body;

/**
 * 通电状态
 *
 * @author: CK
 * @date: 2017/12/8
 */
public enum TongDianStatus {
    DISABLE(0, "断电"),
    USABLE(1, "通电"),
    ;
    private int code;
    private String name;
    TongDianStatus(int code, String name) {
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
