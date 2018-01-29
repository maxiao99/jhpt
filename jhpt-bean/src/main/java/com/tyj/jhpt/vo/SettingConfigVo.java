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
public class SettingConfigVo {
    private String ids;
    private Integer localStoreCycle;
    private Integer normalUploadCycle;
    private Integer alarmUploadCycle;
    private Integer manageDomainLength;
    private String manageDomain;
    private Integer managePort;
    private String hardwareVersion;
    private String firmwareVersion;
    private Integer terminalHeartSendCycle;
    private Integer terminalRespOverTime;
    private Integer platformRespOverTime;
    private Integer threeNextLoginTime;
    private Integer govPlatformDomainLength;
    private String govPlatformDomain;
    private Integer govPlatformPort;
    private Integer monitor;

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    public Integer getLocalStoreCycle() {
        return localStoreCycle;
    }

    public void setLocalStoreCycle(Integer localStoreCycle) {
        this.localStoreCycle = localStoreCycle;
    }

    public Integer getNormalUploadCycle() {
        return normalUploadCycle;
    }

    public void setNormalUploadCycle(Integer normalUploadCycle) {
        this.normalUploadCycle = normalUploadCycle;
    }

    public Integer getAlarmUploadCycle() {
        return alarmUploadCycle;
    }

    public void setAlarmUploadCycle(Integer alarmUploadCycle) {
        this.alarmUploadCycle = alarmUploadCycle;
    }

    public Integer getManageDomainLength() {
        return manageDomainLength;
    }

    public void setManageDomainLength(Integer manageDomainLength) {
        this.manageDomainLength = manageDomainLength;
    }

    public String getManageDomain() {
        return manageDomain;
    }

    public void setManageDomain(String manageDomain) {
        this.manageDomain = manageDomain;
    }

    public Integer getManagePort() {
        return managePort;
    }

    public void setManagePort(Integer managePort) {
        this.managePort = managePort;
    }

    public Integer getTerminalHeartSendCycle() {
        return terminalHeartSendCycle;
    }

    public void setTerminalHeartSendCycle(Integer terminalHeartSendCycle) {
        this.terminalHeartSendCycle = terminalHeartSendCycle;
    }

    public Integer getTerminalRespOverTime() {
        return terminalRespOverTime;
    }

    public void setTerminalRespOverTime(Integer terminalRespOverTime) {
        this.terminalRespOverTime = terminalRespOverTime;
    }

    public Integer getPlatformRespOverTime() {
        return platformRespOverTime;
    }

    public void setPlatformRespOverTime(Integer platformRespOverTime) {
        this.platformRespOverTime = platformRespOverTime;
    }

    public Integer getThreeNextLoginTime() {
        return threeNextLoginTime;
    }

    public void setThreeNextLoginTime(Integer threeNextLoginTime) {
        this.threeNextLoginTime = threeNextLoginTime;
    }

    public Integer getGovPlatformDomainLength() {
        return govPlatformDomainLength;
    }

    public void setGovPlatformDomainLength(Integer govPlatformDomainLength) {
        this.govPlatformDomainLength = govPlatformDomainLength;
    }

    public String getGovPlatformDomain() {
        return govPlatformDomain;
    }

    public void setGovPlatformDomain(String govPlatformDomain) {
        this.govPlatformDomain = govPlatformDomain;
    }

    public Integer getGovPlatformPort() {
        return govPlatformPort;
    }

    public void setGovPlatformPort(Integer govPlatformPort) {
        this.govPlatformPort = govPlatformPort;
    }

    public Integer getMonitor() {
        return monitor;
    }

    public void setMonitor(Integer monitor) {
        this.monitor = monitor;
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
}
