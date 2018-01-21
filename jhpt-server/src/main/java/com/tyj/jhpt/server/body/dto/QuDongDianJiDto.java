/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.body.dto;

/**
 * 驱动电机数据
 *
 * @author: CK
 * @date: 2017/12/8
 */
public class QuDongDianJiDto {
    // 驱动电机序号
    private int seq;
    // 驱动电机状态
    private int status;
    // 驱动电机控制器温度
    private int controlTemperature;
    // 驱动电机转速
    private int speed;
    // 驱动电机转矩
    private int zhuanju;
    // 驱动电机温度
    private int temperature;
    // 电机控制器输入电压
    private int dianya;
    // 电机控制器直流母线母线电流
    private int dianliu;

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getControlTemperature() {
        return controlTemperature;
    }

    public void setControlTemperature(int controlTemperature) {
        this.controlTemperature = controlTemperature;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getZhuanju() {
        return zhuanju;
    }

    public void setZhuanju(int zhuanju) {
        this.zhuanju = zhuanju;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

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
}
