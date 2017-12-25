/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.bo;

/**
 * This class corresponds to the database table `tb_qudong_dianji`
 */
public class QudongDianji extends QudongDianjiBase {
    private Byte seq;
    private Byte status;
    private Byte controlTemperature;
    private Integer speed;
    private Integer zhuanju;
    private Byte temperature;
    private Integer dianya;
    private Integer dianliu;
    private String plateNo;

    public Byte getSeq() {
        return seq;
    }

    public void setSeq(Byte seq) {
        this.seq = seq;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getControlTemperature() {
        return controlTemperature;
    }

    public void setControlTemperature(Byte controlTemperature) {
        this.controlTemperature = controlTemperature;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Integer getZhuanju() {
        return zhuanju;
    }

    public void setZhuanju(Integer zhuanju) {
        this.zhuanju = zhuanju;
    }

    public Byte getTemperature() {
        return temperature;
    }

    public void setTemperature(Byte temperature) {
        this.temperature = temperature;
    }

    public Integer getDianya() {
        return dianya;
    }

    public void setDianya(Integer dianya) {
        this.dianya = dianya;
    }

    public Integer getDianliu() {
        return dianliu;
    }

    public void setDianliu(Integer dianliu) {
        this.dianliu = dianliu;
    }

    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }
}