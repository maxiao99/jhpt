/*
 * Copyright (c) 2017. juzhen.io. All rights reserved.
 */

package com.tyj.jhpt.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * Author: CK
 * Date: 2016/5/1
 */
public class CustomerDto implements Serializable {
    private Integer deviceId;
    private String deviceInfoName;
    private Byte drivingLicense;
    private String plateNo;
    private String phoneOfDevice;
    private Date createTime;
    private Date outofdateTime;
    private String roleName;
    private Byte activateType = 1;

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }

    public String getDeviceInfoName() {
        return deviceInfoName;
    }

    public void setDeviceInfoName(String deviceInfoName) {
        this.deviceInfoName = deviceInfoName;
    }

    public Byte getDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(Byte drivingLicense) {
        this.drivingLicense = drivingLicense;
    }

    public String getPhoneOfDevice() {
        return phoneOfDevice;
    }

    public void setPhoneOfDevice(String phoneOfDevice) {
        this.phoneOfDevice = phoneOfDevice;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getOutofdateTime() {
        return outofdateTime;
    }

    public void setOutofdateTime(Date outofdateTime) {
        this.outofdateTime = outofdateTime;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Byte getActivateType() {
        return activateType;
    }

    public void setActivateType(Byte activateType) {
        this.activateType = activateType;
    }
}
