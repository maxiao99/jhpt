/*
 * Copyright (c) 2018. CK. All rights reserved.
 */

package com.tyj.jhpt.bo;

import com.github.fartherp.framework.core.dao.FieldAccessVo;
import com.github.fartherp.framework.core.dao.TableDataConvertable;
import com.github.fartherp.framework.core.dao.annotation.ColumnDescription;
import com.github.fartherp.framework.core.dao.annotation.Id;
import java.util.Date;

/**
 * This class corresponds to the database table `tb_param_query_back`
 */
public abstract class ParamQueryBackBase extends FieldAccessVo implements TableDataConvertable {
    /**
     * This field corresponds to the database column `tb_param_query_back`.id
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field corresponds to the database column `tb_param_query_back`.id
     */
    private static final String PROPERTY_REMARK_ID = "参数查询反馈的ID";

    /**
     * This field corresponds to the database column `tb_param_query_back`.id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Long id;

    /**
     * This field corresponds to the database column `tb_param_query_back`.car_vin
     */
    private static final String PROPERTY_CARVIN = "carVin";

    /**
     * This field corresponds to the database column `tb_param_query_back`.car_vin
     */
    private static final String PROPERTY_REMARK_CARVIN = "车辆vin";

    /**
     * This field corresponds to the database column `tb_param_query_back`.car_vin
     */
    @ColumnDescription(desc = PROPERTY_REMARK_CARVIN)
    private String carVin;

    /**
     * This field corresponds to the database column `tb_param_query_back`.event_time
     */
    private static final String PROPERTY_EVENTTIME = "eventTime";

    /**
     * This field corresponds to the database column `tb_param_query_back`.event_time
     */
    private static final String PROPERTY_REMARK_EVENTTIME = "数据采集时间";

    /**
     * This field corresponds to the database column `tb_param_query_back`.event_time
     */
    @ColumnDescription(desc = PROPERTY_REMARK_EVENTTIME)
    private Date eventTime;

    /**
     * This field corresponds to the database column `tb_param_query_back`.param_num
     */
    private static final String PROPERTY_PARAMNUM = "paramNum";

    /**
     * This field corresponds to the database column `tb_param_query_back`.param_num
     */
    private static final String PROPERTY_REMARK_PARAMNUM = "参数总数";

    /**
     * This field corresponds to the database column `tb_param_query_back`.param_num
     */
    @ColumnDescription(desc = PROPERTY_REMARK_PARAMNUM)
    private Integer paramNum;

    /**
     * This field corresponds to the database column `tb_param_query_back`.local_store_cycle
     */
    private static final String PROPERTY_LOCALSTORECYCLE = "localStoreCycle";

    /**
     * This field corresponds to the database column `tb_param_query_back`.local_store_cycle
     */
    private static final String PROPERTY_REMARK_LOCALSTORECYCLE = "车载终端本地存储时间周期";

    /**
     * This field corresponds to the database column `tb_param_query_back`.local_store_cycle
     */
    @ColumnDescription(desc = PROPERTY_REMARK_LOCALSTORECYCLE)
    private Integer localStoreCycle;

    /**
     * This field corresponds to the database column `tb_param_query_back`.normal_upload_cycle
     */
    private static final String PROPERTY_NORMALUPLOADCYCLE = "normalUploadCycle";

    /**
     * This field corresponds to the database column `tb_param_query_back`.normal_upload_cycle
     */
    private static final String PROPERTY_REMARK_NORMALUPLOADCYCLE = "正常时，信息上报时间周期";

    /**
     * This field corresponds to the database column `tb_param_query_back`.normal_upload_cycle
     */
    @ColumnDescription(desc = PROPERTY_REMARK_NORMALUPLOADCYCLE)
    private Integer normalUploadCycle;

    /**
     * This field corresponds to the database column `tb_param_query_back`.alarm_upload_cycle
     */
    private static final String PROPERTY_ALARMUPLOADCYCLE = "alarmUploadCycle";

    /**
     * This field corresponds to the database column `tb_param_query_back`.alarm_upload_cycle
     */
    private static final String PROPERTY_REMARK_ALARMUPLOADCYCLE = "出现报警时，信息上报时间周期";

    /**
     * This field corresponds to the database column `tb_param_query_back`.alarm_upload_cycle
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ALARMUPLOADCYCLE)
    private Integer alarmUploadCycle;

    /**
     * This field corresponds to the database column `tb_param_query_back`.manage_domain_length
     */
    private static final String PROPERTY_MANAGEDOMAINLENGTH = "manageDomainLength";

    /**
     * This field corresponds to the database column `tb_param_query_back`.manage_domain_length
     */
    private static final String PROPERTY_REMARK_MANAGEDOMAINLENGTH = "远程服务与管理平台域名长度";

    /**
     * This field corresponds to the database column `tb_param_query_back`.manage_domain_length
     */
    @ColumnDescription(desc = PROPERTY_REMARK_MANAGEDOMAINLENGTH)
    private Integer manageDomainLength;

    /**
     * This field corresponds to the database column `tb_param_query_back`.manage_domain
     */
    private static final String PROPERTY_MANAGEDOMAIN = "manageDomain";

    /**
     * This field corresponds to the database column `tb_param_query_back`.manage_domain
     */
    private static final String PROPERTY_REMARK_MANAGEDOMAIN = "远程服务与管理平台域名";

    /**
     * This field corresponds to the database column `tb_param_query_back`.manage_domain
     */
    @ColumnDescription(desc = PROPERTY_REMARK_MANAGEDOMAIN)
    private byte[] manageDomain;

    /**
     * This field corresponds to the database column `tb_param_query_back`.manage_port
     */
    private static final String PROPERTY_MANAGEPORT = "managePort";

    /**
     * This field corresponds to the database column `tb_param_query_back`.manage_port
     */
    private static final String PROPERTY_REMARK_MANAGEPORT = "远程服务与管理平台端口";

    /**
     * This field corresponds to the database column `tb_param_query_back`.manage_port
     */
    @ColumnDescription(desc = PROPERTY_REMARK_MANAGEPORT)
    private Integer managePort;

    /**
     * This field corresponds to the database column `tb_param_query_back`.hardware_version
     */
    private static final String PROPERTY_HARDWAREVERSION = "hardwareVersion";

    /**
     * This field corresponds to the database column `tb_param_query_back`.hardware_version
     */
    private static final String PROPERTY_REMARK_HARDWAREVERSION = "硬件版本";

    /**
     * This field corresponds to the database column `tb_param_query_back`.hardware_version
     */
    @ColumnDescription(desc = PROPERTY_REMARK_HARDWAREVERSION)
    private String hardwareVersion;

    /**
     * This field corresponds to the database column `tb_param_query_back`.firmware_version
     */
    private static final String PROPERTY_FIRMWAREVERSION = "firmwareVersion";

    /**
     * This field corresponds to the database column `tb_param_query_back`.firmware_version
     */
    private static final String PROPERTY_REMARK_FIRMWAREVERSION = "固件版本";

    /**
     * This field corresponds to the database column `tb_param_query_back`.firmware_version
     */
    @ColumnDescription(desc = PROPERTY_REMARK_FIRMWAREVERSION)
    private String firmwareVersion;

    /**
     * This field corresponds to the database column `tb_param_query_back`.terminal_heart_send_cycle
     */
    private static final String PROPERTY_TERMINALHEARTSENDCYCLE = "terminalHeartSendCycle";

    /**
     * This field corresponds to the database column `tb_param_query_back`.terminal_heart_send_cycle
     */
    private static final String PROPERTY_REMARK_TERMINALHEARTSENDCYCLE = "车载终端心跳发送周期";

    /**
     * This field corresponds to the database column `tb_param_query_back`.terminal_heart_send_cycle
     */
    @ColumnDescription(desc = PROPERTY_REMARK_TERMINALHEARTSENDCYCLE)
    private Integer terminalHeartSendCycle;

    /**
     * This field corresponds to the database column `tb_param_query_back`.terminal_resp_over_time
     */
    private static final String PROPERTY_TERMINALRESPOVERTIME = "terminalRespOverTime";

    /**
     * This field corresponds to the database column `tb_param_query_back`.terminal_resp_over_time
     */
    private static final String PROPERTY_REMARK_TERMINALRESPOVERTIME = "终端应答超时时间";

    /**
     * This field corresponds to the database column `tb_param_query_back`.terminal_resp_over_time
     */
    @ColumnDescription(desc = PROPERTY_REMARK_TERMINALRESPOVERTIME)
    private Integer terminalRespOverTime;

    /**
     * This field corresponds to the database column `tb_param_query_back`.platform_resp_over_time
     */
    private static final String PROPERTY_PLATFORMRESPOVERTIME = "platformRespOverTime";

    /**
     * This field corresponds to the database column `tb_param_query_back`.platform_resp_over_time
     */
    private static final String PROPERTY_REMARK_PLATFORMRESPOVERTIME = "平台应答超时时间";

    /**
     * This field corresponds to the database column `tb_param_query_back`.platform_resp_over_time
     */
    @ColumnDescription(desc = PROPERTY_REMARK_PLATFORMRESPOVERTIME)
    private Integer platformRespOverTime;

    /**
     * This field corresponds to the database column `tb_param_query_back`.three_next_login_time
     */
    private static final String PROPERTY_THREENEXTLOGINTIME = "threeNextLoginTime";

    /**
     * This field corresponds to the database column `tb_param_query_back`.three_next_login_time
     */
    private static final String PROPERTY_REMARK_THREENEXTLOGINTIME = "连续三次登入失败后，到下一次登入的间隔时间";

    /**
     * This field corresponds to the database column `tb_param_query_back`.three_next_login_time
     */
    @ColumnDescription(desc = PROPERTY_REMARK_THREENEXTLOGINTIME)
    private Integer threeNextLoginTime;

    /**
     * This field corresponds to the database column `tb_param_query_back`.gov_platform_domain_length
     */
    private static final String PROPERTY_GOVPLATFORMDOMAINLENGTH = "govPlatformDomainLength";

    /**
     * This field corresponds to the database column `tb_param_query_back`.gov_platform_domain_length
     */
    private static final String PROPERTY_REMARK_GOVPLATFORMDOMAINLENGTH = "政府平台域名长度";

    /**
     * This field corresponds to the database column `tb_param_query_back`.gov_platform_domain_length
     */
    @ColumnDescription(desc = PROPERTY_REMARK_GOVPLATFORMDOMAINLENGTH)
    private Integer govPlatformDomainLength;

    /**
     * This field corresponds to the database column `tb_param_query_back`.gov_platform_domain
     */
    private static final String PROPERTY_GOVPLATFORMDOMAIN = "govPlatformDomain";

    /**
     * This field corresponds to the database column `tb_param_query_back`.gov_platform_domain
     */
    private static final String PROPERTY_REMARK_GOVPLATFORMDOMAIN = "政府平台域名";

    /**
     * This field corresponds to the database column `tb_param_query_back`.gov_platform_domain
     */
    @ColumnDescription(desc = PROPERTY_REMARK_GOVPLATFORMDOMAIN)
    private byte[] govPlatformDomain;

    /**
     * This field corresponds to the database column `tb_param_query_back`.gov_platform_port
     */
    private static final String PROPERTY_GOVPLATFORMPORT = "govPlatformPort";

    /**
     * This field corresponds to the database column `tb_param_query_back`.gov_platform_port
     */
    private static final String PROPERTY_REMARK_GOVPLATFORMPORT = "政府平台端口";

    /**
     * This field corresponds to the database column `tb_param_query_back`.gov_platform_port
     */
    @ColumnDescription(desc = PROPERTY_REMARK_GOVPLATFORMPORT)
    private Integer govPlatformPort;

    /**
     * This field corresponds to the database column `tb_param_query_back`.monitor
     */
    private static final String PROPERTY_MONITOR = "monitor";

    /**
     * This field corresponds to the database column `tb_param_query_back`.monitor
     */
    private static final String PROPERTY_REMARK_MONITOR = "是否处于抽样监测";

    /**
     * This field corresponds to the database column `tb_param_query_back`.monitor
     */
    @ColumnDescription(desc = PROPERTY_REMARK_MONITOR)
    private Integer monitor;

    /**
     * This method returns the value of the database column `tb_param_query_back`.id
     *
     * @return the value of `tb_param_query_back`.id
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column `tb_param_query_back`.id
     *
     * @param id the value for `tb_param_query_back`.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column `tb_param_query_back`.car_vin
     *
     * @return the value of `tb_param_query_back`.car_vin
     */
    public String getCarVin() {
        return carVin;
    }

    /**
     * This method sets the value of the database column `tb_param_query_back`.car_vin
     *
     * @param carVin the value for `tb_param_query_back`.car_vin
     */
    public void setCarVin(String carVin) {
        this.carVin = carVin;
    }

    /**
     * This method returns the value of the database column `tb_param_query_back`.event_time
     *
     * @return the value of `tb_param_query_back`.event_time
     */
    public Date getEventTime() {
        return eventTime;
    }

    /**
     * This method sets the value of the database column `tb_param_query_back`.event_time
     *
     * @param eventTime the value for `tb_param_query_back`.event_time
     */
    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
    }

    /**
     * This method returns the value of the database column `tb_param_query_back`.param_num
     *
     * @return the value of `tb_param_query_back`.param_num
     */
    public Integer getParamNum() {
        return paramNum;
    }

    /**
     * This method sets the value of the database column `tb_param_query_back`.param_num
     *
     * @param paramNum the value for `tb_param_query_back`.param_num
     */
    public void setParamNum(Integer paramNum) {
        this.paramNum = paramNum;
    }

    /**
     * This method returns the value of the database column `tb_param_query_back`.local_store_cycle
     *
     * @return the value of `tb_param_query_back`.local_store_cycle
     */
    public Integer getLocalStoreCycle() {
        return localStoreCycle;
    }

    /**
     * This method sets the value of the database column `tb_param_query_back`.local_store_cycle
     *
     * @param localStoreCycle the value for `tb_param_query_back`.local_store_cycle
     */
    public void setLocalStoreCycle(Integer localStoreCycle) {
        this.localStoreCycle = localStoreCycle;
    }

    /**
     * This method returns the value of the database column `tb_param_query_back`.normal_upload_cycle
     *
     * @return the value of `tb_param_query_back`.normal_upload_cycle
     */
    public Integer getNormalUploadCycle() {
        return normalUploadCycle;
    }

    /**
     * This method sets the value of the database column `tb_param_query_back`.normal_upload_cycle
     *
     * @param normalUploadCycle the value for `tb_param_query_back`.normal_upload_cycle
     */
    public void setNormalUploadCycle(Integer normalUploadCycle) {
        this.normalUploadCycle = normalUploadCycle;
    }

    /**
     * This method returns the value of the database column `tb_param_query_back`.alarm_upload_cycle
     *
     * @return the value of `tb_param_query_back`.alarm_upload_cycle
     */
    public Integer getAlarmUploadCycle() {
        return alarmUploadCycle;
    }

    /**
     * This method sets the value of the database column `tb_param_query_back`.alarm_upload_cycle
     *
     * @param alarmUploadCycle the value for `tb_param_query_back`.alarm_upload_cycle
     */
    public void setAlarmUploadCycle(Integer alarmUploadCycle) {
        this.alarmUploadCycle = alarmUploadCycle;
    }

    /**
     * This method returns the value of the database column `tb_param_query_back`.manage_domain_length
     *
     * @return the value of `tb_param_query_back`.manage_domain_length
     */
    public Integer getManageDomainLength() {
        return manageDomainLength;
    }

    /**
     * This method sets the value of the database column `tb_param_query_back`.manage_domain_length
     *
     * @param manageDomainLength the value for `tb_param_query_back`.manage_domain_length
     */
    public void setManageDomainLength(Integer manageDomainLength) {
        this.manageDomainLength = manageDomainLength;
    }

    /**
     * This method returns the value of the database column `tb_param_query_back`.manage_domain
     *
     * @return the value of `tb_param_query_back`.manage_domain
     */
    public byte[] getManageDomain() {
        return manageDomain;
    }

    /**
     * This method sets the value of the database column `tb_param_query_back`.manage_domain
     *
     * @param manageDomain the value for `tb_param_query_back`.manage_domain
     */
    public void setManageDomain(byte[] manageDomain) {
        this.manageDomain = manageDomain;
    }

    /**
     * This method returns the value of the database column `tb_param_query_back`.manage_port
     *
     * @return the value of `tb_param_query_back`.manage_port
     */
    public Integer getManagePort() {
        return managePort;
    }

    /**
     * This method sets the value of the database column `tb_param_query_back`.manage_port
     *
     * @param managePort the value for `tb_param_query_back`.manage_port
     */
    public void setManagePort(Integer managePort) {
        this.managePort = managePort;
    }

    /**
     * This method returns the value of the database column `tb_param_query_back`.hardware_version
     *
     * @return the value of `tb_param_query_back`.hardware_version
     */
    public String getHardwareVersion() {
        return hardwareVersion;
    }

    /**
     * This method sets the value of the database column `tb_param_query_back`.hardware_version
     *
     * @param hardwareVersion the value for `tb_param_query_back`.hardware_version
     */
    public void setHardwareVersion(String hardwareVersion) {
        this.hardwareVersion = hardwareVersion;
    }

    /**
     * This method returns the value of the database column `tb_param_query_back`.firmware_version
     *
     * @return the value of `tb_param_query_back`.firmware_version
     */
    public String getFirmwareVersion() {
        return firmwareVersion;
    }

    /**
     * This method sets the value of the database column `tb_param_query_back`.firmware_version
     *
     * @param firmwareVersion the value for `tb_param_query_back`.firmware_version
     */
    public void setFirmwareVersion(String firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
    }

    /**
     * This method returns the value of the database column `tb_param_query_back`.terminal_heart_send_cycle
     *
     * @return the value of `tb_param_query_back`.terminal_heart_send_cycle
     */
    public Integer getTerminalHeartSendCycle() {
        return terminalHeartSendCycle;
    }

    /**
     * This method sets the value of the database column `tb_param_query_back`.terminal_heart_send_cycle
     *
     * @param terminalHeartSendCycle the value for `tb_param_query_back`.terminal_heart_send_cycle
     */
    public void setTerminalHeartSendCycle(Integer terminalHeartSendCycle) {
        this.terminalHeartSendCycle = terminalHeartSendCycle;
    }

    /**
     * This method returns the value of the database column `tb_param_query_back`.terminal_resp_over_time
     *
     * @return the value of `tb_param_query_back`.terminal_resp_over_time
     */
    public Integer getTerminalRespOverTime() {
        return terminalRespOverTime;
    }

    /**
     * This method sets the value of the database column `tb_param_query_back`.terminal_resp_over_time
     *
     * @param terminalRespOverTime the value for `tb_param_query_back`.terminal_resp_over_time
     */
    public void setTerminalRespOverTime(Integer terminalRespOverTime) {
        this.terminalRespOverTime = terminalRespOverTime;
    }

    /**
     * This method returns the value of the database column `tb_param_query_back`.platform_resp_over_time
     *
     * @return the value of `tb_param_query_back`.platform_resp_over_time
     */
    public Integer getPlatformRespOverTime() {
        return platformRespOverTime;
    }

    /**
     * This method sets the value of the database column `tb_param_query_back`.platform_resp_over_time
     *
     * @param platformRespOverTime the value for `tb_param_query_back`.platform_resp_over_time
     */
    public void setPlatformRespOverTime(Integer platformRespOverTime) {
        this.platformRespOverTime = platformRespOverTime;
    }

    /**
     * This method returns the value of the database column `tb_param_query_back`.three_next_login_time
     *
     * @return the value of `tb_param_query_back`.three_next_login_time
     */
    public Integer getThreeNextLoginTime() {
        return threeNextLoginTime;
    }

    /**
     * This method sets the value of the database column `tb_param_query_back`.three_next_login_time
     *
     * @param threeNextLoginTime the value for `tb_param_query_back`.three_next_login_time
     */
    public void setThreeNextLoginTime(Integer threeNextLoginTime) {
        this.threeNextLoginTime = threeNextLoginTime;
    }

    /**
     * This method returns the value of the database column `tb_param_query_back`.gov_platform_domain_length
     *
     * @return the value of `tb_param_query_back`.gov_platform_domain_length
     */
    public Integer getGovPlatformDomainLength() {
        return govPlatformDomainLength;
    }

    /**
     * This method sets the value of the database column `tb_param_query_back`.gov_platform_domain_length
     *
     * @param govPlatformDomainLength the value for `tb_param_query_back`.gov_platform_domain_length
     */
    public void setGovPlatformDomainLength(Integer govPlatformDomainLength) {
        this.govPlatformDomainLength = govPlatformDomainLength;
    }

    /**
     * This method returns the value of the database column `tb_param_query_back`.gov_platform_domain
     *
     * @return the value of `tb_param_query_back`.gov_platform_domain
     */
    public byte[] getGovPlatformDomain() {
        return govPlatformDomain;
    }

    /**
     * This method sets the value of the database column `tb_param_query_back`.gov_platform_domain
     *
     * @param govPlatformDomain the value for `tb_param_query_back`.gov_platform_domain
     */
    public void setGovPlatformDomain(byte[] govPlatformDomain) {
        this.govPlatformDomain = govPlatformDomain;
    }

    /**
     * This method returns the value of the database column `tb_param_query_back`.gov_platform_port
     *
     * @return the value of `tb_param_query_back`.gov_platform_port
     */
    public Integer getGovPlatformPort() {
        return govPlatformPort;
    }

    /**
     * This method sets the value of the database column `tb_param_query_back`.gov_platform_port
     *
     * @param govPlatformPort the value for `tb_param_query_back`.gov_platform_port
     */
    public void setGovPlatformPort(Integer govPlatformPort) {
        this.govPlatformPort = govPlatformPort;
    }

    /**
     * This method returns the value of the database column `tb_param_query_back`.monitor
     *
     * @return the value of `tb_param_query_back`.monitor
     */
    public Integer getMonitor() {
        return monitor;
    }

    /**
     * This method sets the value of the database column `tb_param_query_back`.monitor
     *
     * @param monitor the value for `tb_param_query_back`.monitor
     */
    public void setMonitor(Integer monitor) {
        this.monitor = monitor;
    }
}