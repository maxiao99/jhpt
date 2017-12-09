/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.message.type;

import com.github.fartherp.framework.common.util.ISOUtil;

/**
 * 实时信息
 *
 * @author: CK
 * @date: 2017/12/8
 */
public enum RealTimeMessage {
    ALL_CAR("01", "整车数据"),
    QUDONG_DIANJI("02", "驱动电机数据"),
    RANLIAO_DIANCHI("03", "燃料电池数据"),
    FADONGJI("04", "发动机数据"),
    CAR_LOCATION("05", "车辆位置"),
    SUPER("06", "极值数据"),
    ALARM("07", "报警数据"),
    DIANYA("08", "可充电储能装置电压数据"),
    WENDU("09", "可充电储能装置温度数据"),
    ;
    private byte code;
    private String name;
    RealTimeMessage(String code, String name) {
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
