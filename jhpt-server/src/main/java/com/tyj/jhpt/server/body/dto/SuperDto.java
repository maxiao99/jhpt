/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.body.dto;

/**
 * 极值数据
 *
 * @author: CK
 * @date: 2017/12/9
 */
public class SuperDto {
    // 最高电压电池系统号
    private byte maxSystemNo;
    // 最高电压电池单体代号
    private byte maxSimpleNo;
    // 电池单体电压最高值
    private int max;
    // 最低电压电池系统号
    private byte minSystemNo;
    // 最低电压电池单体代号
    private byte minSimpleNo;
    // 电池单体电压最低值
    private int min;
    // 最高温度子系统号
    private byte maxTemperatureSystemNo;
    // 最高温度探针序号
    private byte maxSeq;
    // 最高温度值
    private byte maxTemperature;
    // 最低温度子系统号
    private byte minTemperatureSystemNo;
    // 最低温度探针序号
    private byte minSeq;
    // 最低温度值
    private byte minTemperature;

    public byte getMaxSystemNo() {
        return maxSystemNo;
    }

    public void setMaxSystemNo(byte maxSystemNo) {
        this.maxSystemNo = maxSystemNo;
    }

    public byte getMaxSimpleNo() {
        return maxSimpleNo;
    }

    public void setMaxSimpleNo(byte maxSimpleNo) {
        this.maxSimpleNo = maxSimpleNo;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public byte getMinSystemNo() {
        return minSystemNo;
    }

    public void setMinSystemNo(byte minSystemNo) {
        this.minSystemNo = minSystemNo;
    }

    public byte getMinSimpleNo() {
        return minSimpleNo;
    }

    public void setMinSimpleNo(byte minSimpleNo) {
        this.minSimpleNo = minSimpleNo;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public byte getMaxTemperatureSystemNo() {
        return maxTemperatureSystemNo;
    }

    public void setMaxTemperatureSystemNo(byte maxTemperatureSystemNo) {
        this.maxTemperatureSystemNo = maxTemperatureSystemNo;
    }

    public byte getMaxSeq() {
        return maxSeq;
    }

    public void setMaxSeq(byte maxSeq) {
        this.maxSeq = maxSeq;
    }

    public byte getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(byte maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public byte getMinTemperatureSystemNo() {
        return minTemperatureSystemNo;
    }

    public void setMinTemperatureSystemNo(byte minTemperatureSystemNo) {
        this.minTemperatureSystemNo = minTemperatureSystemNo;
    }

    public byte getMinSeq() {
        return minSeq;
    }

    public void setMinSeq(byte minSeq) {
        this.minSeq = minSeq;
    }

    public byte getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(byte minTemperature) {
        this.minTemperature = minTemperature;
    }
}
