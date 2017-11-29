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
public class PayRecordDto implements Serializable {
    private Integer deviceId;
    private String deviceInfoName;
    private Byte drivingLicense;
    private String plateNo;
    private String phoneOfDevice;
    private String weixinAccount;
    private Byte carType;
    private Date diOutofdateTime;
    private String roleName;
    /**
     * 上一次确认时间
     */
    private Date accountantConfirmTime;
    private Date outofdateTime;
    private Byte activateType;
    private Integer activate;

    private int type;

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

    public String getWeixinAccount() {
        return weixinAccount;
    }

    public void setWeixinAccount(String weixinAccount) {
        this.weixinAccount = weixinAccount;
    }

    public Byte getCarType() {
        return carType;
    }

    public void setCarType(Byte carType) {
        this.carType = carType;
    }

    public Date getDiOutofdateTime() {
        return diOutofdateTime;
    }

    public void setDiOutofdateTime(Date diOutofdateTime) {
        this.diOutofdateTime = diOutofdateTime;
    }

    public Date getAccountantConfirmTime() {
        return accountantConfirmTime;
    }

    public void setAccountantConfirmTime(Date accountantConfirmTime) {
        this.accountantConfirmTime = accountantConfirmTime;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Date getOutofdateTime() {
        return outofdateTime;
    }

    public void setOutofdateTime(Date outofdateTime) {
        this.outofdateTime = outofdateTime;
    }

    public Byte getActivateType() {
        return activateType;
    }

    public void setActivateType(Byte activateType) {
        this.activateType = activateType;
    }

    public Integer getActivate() {
        return activate;
    }

    public void setActivate(Integer activate) {
        this.activate = activate;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
