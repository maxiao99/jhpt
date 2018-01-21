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
    private int carStatus;
    // 充电状态
    private int changeStatus;
    // 运行模式
    private int runMode;
    // 车速
    private int speed;
    // 累计里程
    private int totalKm;
    // 总电压
    private int totalVoltage;
    // 总电流
    private int totalElectricity;
    // SOC
    private int soc;
    // DC-DC状态
    private int dcStatus;
    // 挡位
    private int dangwei;
    // 绝缘电阻
    private int insulationResistance;
    // 加速踏板行程值
    private int upFootplateKm;
    // 制动踏板状态
    private int footplateStatus;

    public int getCarStatus() {
        return carStatus;
    }

    public void setCarStatus(int carStatus) {
        this.carStatus = carStatus;
    }

    public int getChangeStatus() {
        return changeStatus;
    }

    public void setChangeStatus(int changeStatus) {
        this.changeStatus = changeStatus;
    }

    public int getRunMode() {
        return runMode;
    }

    public void setRunMode(int runMode) {
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

    public int getSoc() {
        return soc;
    }

    public void setSoc(int soc) {
        this.soc = soc;
    }

    public int getDcStatus() {
        return dcStatus;
    }

    public void setDcStatus(int dcStatus) {
        this.dcStatus = dcStatus;
    }

    public int getDangwei() {
        return dangwei;
    }

    public void setDangwei(int dangwei) {
        this.dangwei = dangwei;
    }

    public int getInsulationResistance() {
        return insulationResistance;
    }

    public void setInsulationResistance(int insulationResistance) {
        this.insulationResistance = insulationResistance;
    }

    public int getUpFootplateKm() {
        return upFootplateKm;
    }

    public void setUpFootplateKm(int upFootplateKm) {
        this.upFootplateKm = upFootplateKm;
    }

    public int getFootplateStatus() {
        return footplateStatus;
    }

    public void setFootplateStatus(int footplateStatus) {
        this.footplateStatus = footplateStatus;
    }
}
