/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.body.dto;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: CK
 * @date: 2017/12/9
 */
public class CarLocationDto {
    // 定位状态
    private byte locationStatus;
    // 经度
    private double longitude;
    // 纬度
    private double latitude;

    public byte getLocationStatus() {
        return locationStatus;
    }

    public void setLocationStatus(byte locationStatus) {
        this.locationStatus = locationStatus;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
}
