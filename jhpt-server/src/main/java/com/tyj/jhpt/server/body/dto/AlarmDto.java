/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.body.dto;

/**
 * 报警数据
 *
 * @author: CK
 * @date: 2017/12/9
 */
public class AlarmDto {
    // 最高报警等级
    private int maxAlarmLevel;
    // 通用报警标志
    private double generalAlarm;
    // 可充电储能装置故障总数N1
    private int totalN1;
    // 可充电储能装置故障代码列表
    private byte[] bytes1;
    // 驱动电机故障总数N2
    private int totalN2;
    // 驱动电机故障代码列表
    private byte[] bytes2;
    // 发动机故障总数N3
    private int totalN3;
    // 发动机故障列表
    private byte[] bytes3;
    // 其他故障总数N4
    private int totalN4;
    // 其他故障代码列表
    private byte[] bytes4;

    public int getMaxAlarmLevel() {
        return maxAlarmLevel;
    }

    public void setMaxAlarmLevel(int maxAlarmLevel) {
        this.maxAlarmLevel = maxAlarmLevel;
    }

    public double getGeneralAlarm() {
        return generalAlarm;
    }

    public void setGeneralAlarm(double generalAlarm) {
        this.generalAlarm = generalAlarm;
    }

    public int getTotalN1() {
        return totalN1;
    }

    public void setTotalN1(int totalN1) {
        this.totalN1 = totalN1;
    }

    public byte[] getBytes1() {
        return bytes1;
    }

    public void setBytes1(byte[] bytes1) {
        this.bytes1 = bytes1;
    }

    public int getTotalN2() {
        return totalN2;
    }

    public void setTotalN2(int totalN2) {
        this.totalN2 = totalN2;
    }

    public byte[] getBytes2() {
        return bytes2;
    }

    public void setBytes2(byte[] bytes2) {
        this.bytes2 = bytes2;
    }

    public int getTotalN3() {
        return totalN3;
    }

    public void setTotalN3(int totalN3) {
        this.totalN3 = totalN3;
    }

    public byte[] getBytes3() {
        return bytes3;
    }

    public void setBytes3(byte[] bytes3) {
        this.bytes3 = bytes3;
    }

    public int getTotalN4() {
        return totalN4;
    }

    public void setTotalN4(int totalN4) {
        this.totalN4 = totalN4;
    }

    public byte[] getBytes4() {
        return bytes4;
    }

    public void setBytes4(byte[] bytes4) {
        this.bytes4 = bytes4;
    }
}
