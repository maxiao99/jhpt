/*
 * Copyright (c) 2017. juzhen.io. All rights reserved.
 */

package com.tyj.jhpt.bo;

/**
 * This class corresponds to the database table `device_gps_infos`
 */
public class DeviceGpsInfos extends DeviceGpsInfosBase {

    private String accelerationStr;
    private String kmStr;

    public String getAccelerationStr() {
        return accelerationStr;
    }

    public void setAccelerationStr(String accelerationStr) {
        this.accelerationStr = accelerationStr;
    }

    public String getKmStr() {
        return kmStr;
    }

    public void setKmStr(String kmStr) {
        this.kmStr = kmStr;
    }
}