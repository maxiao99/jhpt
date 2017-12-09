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
public class FaDongJiDto {
    // 发动机状态
    private byte status;
    // 曲轴转速
    private int speed;
    // 燃料消耗率
    private int xiaohaolv;

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getXiaohaolv() {
        return xiaohaolv;
    }

    public void setXiaohaolv(int xiaohaolv) {
        this.xiaohaolv = xiaohaolv;
    }
}
