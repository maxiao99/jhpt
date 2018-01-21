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
    private int maxSystemNo;
    // 最高电压电池单体代号
    private int maxSimpleNo;
    // 电池单体电压最高值
    private int max;
    // 最低电压电池系统号
    private int minSystemNo;
    // 最低电压电池单体代号
    private int minSimpleNo;
    // 电池单体电压最低值
    private int min;
    // 最高温度子系统号
    private int maxTemperatureSystemNo;
    // 最高温度探针序号
    private int maxSeq;
    // 最高温度值
    private int maxTemperature;
    // 最低温度子系统号
    private int minTemperatureSystemNo;
    // 最低温度探针序号
    private int minSeq;
    // 最低温度值
    private int minTemperature;

    public int getMaxSystemNo() {
        return maxSystemNo;
    }

    public void setMaxSystemNo(int maxSystemNo) {
        this.maxSystemNo = maxSystemNo;
    }

    public int getMaxSimpleNo() {
        return maxSimpleNo;
    }

    public void setMaxSimpleNo(int maxSimpleNo) {
        this.maxSimpleNo = maxSimpleNo;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMinSystemNo() {
        return minSystemNo;
    }

    public void setMinSystemNo(int minSystemNo) {
        this.minSystemNo = minSystemNo;
    }

    public int getMinSimpleNo() {
        return minSimpleNo;
    }

    public void setMinSimpleNo(int minSimpleNo) {
        this.minSimpleNo = minSimpleNo;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMaxTemperatureSystemNo() {
        return maxTemperatureSystemNo;
    }

    public void setMaxTemperatureSystemNo(int maxTemperatureSystemNo) {
        this.maxTemperatureSystemNo = maxTemperatureSystemNo;
    }

    public int getMaxSeq() {
        return maxSeq;
    }

    public void setMaxSeq(int maxSeq) {
        this.maxSeq = maxSeq;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public int getMinTemperatureSystemNo() {
        return minTemperatureSystemNo;
    }

    public void setMinTemperatureSystemNo(int minTemperatureSystemNo) {
        this.minTemperatureSystemNo = minTemperatureSystemNo;
    }

    public int getMinSeq() {
        return minSeq;
    }

    public void setMinSeq(int minSeq) {
        this.minSeq = minSeq;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }
}
