/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.bo;

/**
 * This class corresponds to the database table `tb_dianya`
 */
public class Dianya extends DianyaBase {
    private Byte systemNo;
    private Integer dianya;
    private Integer dianliu;
    private Integer simpleTotal;
    private Integer seq;
    private Byte ownSimpleTotal;
    private byte[] simpleTotals;
    private String plateNo;

    public Byte getSystemNo() {
        return systemNo;
    }

    public void setSystemNo(Byte systemNo) {
        this.systemNo = systemNo;
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

    public Integer getSimpleTotal() {
        return simpleTotal;
    }

    public void setSimpleTotal(Integer simpleTotal) {
        this.simpleTotal = simpleTotal;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public Byte getOwnSimpleTotal() {
        return ownSimpleTotal;
    }

    public void setOwnSimpleTotal(Byte ownSimpleTotal) {
        this.ownSimpleTotal = ownSimpleTotal;
    }

    public byte[] getSimpleTotals() {
        return simpleTotals;
    }

    public void setSimpleTotals(byte[] simpleTotals) {
        this.simpleTotals = simpleTotals;
    }

    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }
}