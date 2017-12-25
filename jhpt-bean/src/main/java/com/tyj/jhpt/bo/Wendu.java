/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.bo;

/**
 * This class corresponds to the database table `tb_wendu`
 */
public class Wendu extends WenduBase {
    private Byte systemNo;
    private Integer count;
    private byte[] values;
    private String plateNo;

    public Byte getSystemNo() {
        return systemNo;
    }

    public void setSystemNo(Byte systemNo) {
        this.systemNo = systemNo;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public byte[] getValues() {
        return values;
    }

    public void setValues(byte[] values) {
        this.values = values;
    }

    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }
}