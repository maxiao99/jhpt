/*
 * Copyright (c) 2017. juzhen.io. All rights reserved.
 */

package com.tyj.jhpt.vo;

import com.github.fartherp.framework.core.vo.BaseVo;
import com.tyj.jhpt.bo.DeviceGpsInfos;

/**
 * Created by IntelliJ IDEA .
 * Auth: CK
 * Date: 2016/5/4
 */
public class MsgPageVo extends BaseVo<DeviceGpsInfos> {
    private Integer deviceId;
    private String startDate;
    private String endDate;

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
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
