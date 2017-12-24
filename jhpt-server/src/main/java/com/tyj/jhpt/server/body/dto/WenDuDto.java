/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.body.dto;

import java.util.Date;

/**
 * 可充电储能装置温度数据
 *
 * @author: CK
 * @date: 2017/12/9
 */
public class WenDuDto {
    private String carVin;
    private Date eventTime;
    // 可充电储能子系统号
    private byte systemNo;
    // 可充电储能温度探针个数
    private int count;
    // 可充电储能子系统各温度探针监测到的温度值
    private byte[] values;

    public String getCarVin() {
        return carVin;
    }

    public void setCarVin(String carVin) {
        this.carVin = carVin;
    }

    public Date getEventTime() {
        return eventTime;
    }

    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
    }

    public byte getSystemNo() {
        return systemNo;
    }

    public void setSystemNo(byte systemNo) {
        this.systemNo = systemNo;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public byte[] getValues() {
        return values;
    }

    public void setValues(byte[] values) {
        this.values = values;
    }
}
