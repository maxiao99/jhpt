/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.body.dto;

/**
 * 可充电储能装置温度数据
 *
 * @author: CK
 * @date: 2017/12/9
 */
public class WenDuDto {
    // 可充电储能子系统号
    private int systemNo;
    // 可充电储能温度探针个数
    private int count;
    // 可充电储能子系统各温度探针监测到的温度值
    private byte[] values;

    public int getSystemNo() {
        return systemNo;
    }

    public void setSystemNo(int systemNo) {
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
