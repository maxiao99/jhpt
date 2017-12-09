/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.message.body;

/**
 * 通信传输状态
 *
 * @author: CK
 * @date: 2017/12/8
 */
public enum TongXinTransferStatus {
    DISABLE(0, "通信传输异常"),
    USABLE(1, "通信传输正常"),
    ;
    private int code;
    private String name;
    TongXinTransferStatus(int code, String name) {
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
