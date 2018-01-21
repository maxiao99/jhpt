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
public enum CommandEnum {
    CAR_LOGIN("01", "车辆登入"),
    REAL_TIME_MESSAGE_UPLOAD("02", "实时信息上报"),
    RELOAD_SEND("03", "补发"),
    CAR_LOGOUT("04", "车辆登出"),
    HEART_BEAT("07", "心跳"),
    TERMINAL_VERIFY_TIME("08", "终端校时"),
    CAR_ALARM_MESSAGE_UPLOAD("09", "车辆告警信息上报"),
    CAR_TERMINAL_STATUS_MESSAGE_UPLOAD("0A", "车载终端状态信息上报"),
    DRIVER_IDENTITY_MESSAGE_COLLECTION_UPLOAD("0B", "驾驶员身份信息采集上报"),
    PARAM_QUERY_FEEDBACK("80", "参数查询反馈"),
    PARAM_SET("81", "参数设置"),
    CAR_TERMINAL_CONTROL("82", "车载终端控制"),
    ;
    private byte type;
    private String name;
    CommandEnum(String type, String name) {
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
