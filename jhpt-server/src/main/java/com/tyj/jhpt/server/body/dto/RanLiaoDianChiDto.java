/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.body.dto;

/**
 * 燃料电池数据
 *
 * @author: CK
 * @date: 2017/12/8
 */
public class RanLiaoDianChiDto {
    // 燃料电池电压
    private int dianya;
    // 燃料电池电流
    private int dianliu;
    // 燃料消耗率
    private int xiaohaolv;
    // 燃料电池温度探针总数
    private int tanzhenTotal;
    // 探针温度值
    private byte[] temperature;
    // 氢系统中最高温度
    private int maxTemperature;
    // 氢系统中最高温度探针代号
    private int maxTanzhenNo;
    // 氢气最高浓度
    private int maxConcentration;
    // 氢气最高浓度传感器代号
    private int maxConcentrationNo;
    // 氢气最高压力
    private int maxPressure;
    // 氢气最高压力传感器代号
    private int maxPressureNo;
    // 高压DC/DC状态
    private int dcStatus;

    public int getDianya() {
        return dianya;
    }

    public void setDianya(int dianya) {
        this.dianya = dianya;
    }

    public int getDianliu() {
        return dianliu;
    }

    public void setDianliu(int dianliu) {
        this.dianliu = dianliu;
    }

    public int getXiaohaolv() {
        return xiaohaolv;
    }

    public void setXiaohaolv(int xiaohaolv) {
        this.xiaohaolv = xiaohaolv;
    }

    public int getTanzhenTotal() {
        return tanzhenTotal;
    }

    public void setTanzhenTotal(int tanzhenTotal) {
        this.tanzhenTotal = tanzhenTotal;
    }

    public byte[] getTemperature() {
        return temperature;
    }

    public void setTemperature(byte[] temperature) {
        this.temperature = temperature;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public int getMaxTanzhenNo() {
        return maxTanzhenNo;
    }

    public void setMaxTanzhenNo(int maxTanzhenNo) {
        this.maxTanzhenNo = maxTanzhenNo;
    }

    public int getMaxConcentration() {
        return maxConcentration;
    }

    public void setMaxConcentration(int maxConcentration) {
        this.maxConcentration = maxConcentration;
    }

    public int getMaxConcentrationNo() {
        return maxConcentrationNo;
    }

    public void setMaxConcentrationNo(int maxConcentrationNo) {
        this.maxConcentrationNo = maxConcentrationNo;
    }

    public int getMaxPressure() {
        return maxPressure;
    }

    public void setMaxPressure(int maxPressure) {
        this.maxPressure = maxPressure;
    }

    public int getMaxPressureNo() {
        return maxPressureNo;
    }

    public void setMaxPressureNo(int maxPressureNo) {
        this.maxPressureNo = maxPressureNo;
    }

    public int getDcStatus() {
        return dcStatus;
    }

    public void setDcStatus(int dcStatus) {
        this.dcStatus = dcStatus;
    }
}
