/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.vo;

import com.github.fartherp.framework.core.vo.BaseVo;
import com.tyj.jhpt.bo.DeviceGpsInfo;

/**
 * Created by IntelliJ IDEA .
 * Auth: CK
 * Date: 2016/5/4
 */
public class MsgPageVo extends BaseVo<DeviceGpsInfo> {
    private String plateNo;
    private String startDate;
    private String endDate;

    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
