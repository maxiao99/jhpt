/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.message.type;

import com.github.fartherp.framework.common.util.ISOUtil;

/**
 * 车载终端状态
 *
 * @author: CK
 * @date: 2017/12/8
 */
public enum CarTerminalStatusMessage {
    DIANYUAN("01", "电源状态"),
    TONGDIAN("02", "通电状态"),
    TONGXIN_TRANSFER("03", "通信传输状态"),
    ;
    private byte code;
    private String name;
    CarTerminalStatusMessage(String code, String name) {
        this.code = ISOUtil.hex2byte(code)[0];
        this.name = name;
    }

    public byte getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
