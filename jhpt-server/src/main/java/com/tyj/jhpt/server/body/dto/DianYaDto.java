/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.body.dto;

/**
 * 可充电储能装置电压数据
 *
 * @author: CK
 * @date: 2017/12/9
 */
public class DianYaDto {
    // 可充电储能子系统号
    private int systemNo;
    // 可充电储能装置电压
    private int dianya;
    // 可充电储能装置电流
    private int dianliu;
    // 单体电池总数
    private int simpleTotal;
    // 本帧起始电池序号
    private int seq;
    // 本帧单体电池总数
    private int ownSimpleTotal;
    // 单体电池电压
    private byte[] simpleTotals;

    public int getSystemNo() {
        return systemNo;
    }

    public void setSystemNo(int systemNo) {
        this.systemNo = systemNo;
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

    public int getSimpleTotal() {
        return simpleTotal;
    }

    public void setSimpleTotal(int simpleTotal) {
        this.simpleTotal = simpleTotal;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public int getOwnSimpleTotal() {
        return ownSimpleTotal;
    }

    public void setOwnSimpleTotal(int ownSimpleTotal) {
        this.ownSimpleTotal = ownSimpleTotal;
    }

    public byte[] getSimpleTotals() {
        return simpleTotals;
    }

    public void setSimpleTotals(byte[] simpleTotals) {
        this.simpleTotals = simpleTotals;
    }
}
