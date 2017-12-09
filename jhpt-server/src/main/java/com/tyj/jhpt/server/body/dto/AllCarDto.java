/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.body.dto;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: CK
 * @date: 2017/12/8
 */
public class AllCarDto {
    // 车辆状态
    private byte carStatus;
    // 充电状态
    private byte changeStatus;
    // 运行模式
    private byte runMode;
    // 车速
    private int speed;
    // 累计里程
    private int totalKm;
    // 总电压
    private int totalVoltage;
    // 总电流
    private int totalElectricity;
    // SOC
    private byte soc;
    // DC-DC状态
    private byte dcStatus;
    // 挡位
    private byte dangwei;
    // 绝缘电阻
    private int insulationResistance;
    // 加速踏板行程值
    private byte upFootplateKm;
    // 制动踏板状态
    private byte footplateStatus;

    public byte getCarStatus() {
        return carStatus;
    }

    public void setCarStatus(byte carStatus) {
        this.carStatus = carStatus;
    }

    public byte getChangeStatus() {
        return changeStatus;
    }

    public void setChangeStatus(byte changeStatus) {
        this.changeStatus = changeStatus;
    }

    public byte getRunMode() {
        return runMode;
    }

    public void setRunMode(byte runMode) {
        this.runMode = runMode;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getTotalKm() {
        return totalKm;
    }

    public void setTotalKm(int totalKm) {
        this.totalKm = totalKm;
    }

    public int getTotalVoltage() {
        return totalVoltage;
    }

    public void setTotalVoltage(int totalVoltage) {
        this.totalVoltage = totalVoltage;
    }

    public int getTotalElectricity() {
        return totalElectricity;
    }

    public void setTotalElectricity(int totalElectricity) {
        this.totalElectricity = totalElectricity;
    }

    public byte getSoc() {
        return soc;
    }

    public void setSoc(byte soc) {
        this.soc = soc;
    }

    public byte getDcStatus() {
        return dcStatus;
    }

    public void setDcStatus(byte dcStatus) {
        this.dcStatus = dcStatus;
    }

    public byte getDangwei() {
        return dangwei;
    }

    public void setDangwei(byte dangwei) {
        this.dangwei = dangwei;
    }

    public int getInsulationResistance() {
        return insulationResistance;
    }

    public void setInsulationResistance(int insulationResistance) {
        this.insulationResistance = insulationResistance;
    }

    public byte getUpFootplateKm() {
        return upFootplateKm;
    }

    public void setUpFootplateKm(byte upFootplateKm) {
        this.upFootplateKm = upFootplateKm;
    }

    public byte getFootplateStatus() {
        return footplateStatus;
    }

    public void setFootplateStatus(byte footplateStatus) {
        this.footplateStatus = footplateStatus;
    }
}
