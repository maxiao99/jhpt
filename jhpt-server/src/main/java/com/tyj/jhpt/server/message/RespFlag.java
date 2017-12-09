/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.message;

import com.github.fartherp.framework.common.util.ISOUtil;

/**
 * 当服务端发送应答时，只需变更应答标志、应答报文时间，并
 * 重新计算校验位即可，其余报文内容与主动发送报文一致。
 *
 * @author: CK
 * @date: 2017/12/8
 */
public enum RespFlag {
    SUCCESS("01", "成功", "接收到的信息正确"),
    FAIL("02", "修改错", "设置未成功"),
    VIN_REPEAT("03", "vin重复", "VIN重复错误"),
    COMMAND("FE", "命令", "表示数据包为命令包，而非应答"),
    ;
    private byte code;
    private String name;
    private String desc;
    RespFlag(String code, String name, String desc) {
        this.code = ISOUtil.hex2byte(code)[0];
        this.name = name;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }
}
