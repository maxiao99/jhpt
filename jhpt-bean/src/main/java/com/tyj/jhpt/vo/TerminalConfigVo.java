/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.vo;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: CK
 * @date: 2017/12/24
 */
public class TerminalConfigVo {
    private String ids;
    private Integer deviceControl;
    private String bohaoName;
    private String bohaoAccount;
    private String bohaoPassword;
    private String address;
    private Integer port;
    private String carTerminalProductId;
    private String hardwareVersion;
    private String firmwareVersion;
    private String upgradeUrlAddress;
    private String connectUpgradeServerTime;
    private Integer alarmLevel;

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    public Integer getDeviceControl() {
        return deviceControl;
    }

    public void setDeviceControl(Integer deviceControl) {
        this.deviceControl = deviceControl;
    }

    public String getBohaoName() {
        return bohaoName;
    }

    public void setBohaoName(String bohaoName) {
        this.bohaoName = bohaoName;
    }

    public String getBohaoAccount() {
        return bohaoAccount;
    }

    public void setBohaoAccount(String bohaoAccount) {
        this.bohaoAccount = bohaoAccount;
    }

    public String getBohaoPassword() {
        return bohaoPassword;
    }

    public void setBohaoPassword(String bohaoPassword) {
        this.bohaoPassword = bohaoPassword;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getCarTerminalProductId() {
        return carTerminalProductId;
    }

    public void setCarTerminalProductId(String carTerminalProductId) {
        this.carTerminalProductId = carTerminalProductId;
    }

    public String getHardwareVersion() {
        return hardwareVersion;
    }

    public void setHardwareVersion(String hardwareVersion) {
        this.hardwareVersion = hardwareVersion;
    }

    public String getFirmwareVersion() {
        return firmwareVersion;
    }

    public void setFirmwareVersion(String firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
    }

    public String getUpgradeUrlAddress() {
        return upgradeUrlAddress;
    }

    public void setUpgradeUrlAddress(String upgradeUrlAddress) {
        this.upgradeUrlAddress = upgradeUrlAddress;
    }

    public String getConnectUpgradeServerTime() {
        return connectUpgradeServerTime;
    }

    public void setConnectUpgradeServerTime(String connectUpgradeServerTime) {
        this.connectUpgradeServerTime = connectUpgradeServerTime;
    }

    public Integer getAlarmLevel() {
        return alarmLevel;
    }

    public void setAlarmLevel(Integer alarmLevel) {
        this.alarmLevel = alarmLevel;
    }
}
