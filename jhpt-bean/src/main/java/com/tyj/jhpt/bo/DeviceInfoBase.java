/*
 * Copyright (c) 2017. juzhen.io. All rights reserved.
 */

package com.tyj.jhpt.bo;

import com.github.fartherp.framework.core.dao.FieldAccessVo;
import com.github.fartherp.framework.core.dao.TableDataConvertable;
import com.github.fartherp.framework.core.dao.annotation.ColumnDescription;
import com.github.fartherp.framework.core.dao.annotation.Id;

import java.util.Date;

/**
 * This class corresponds to the database table `device_info`
 */
public abstract class DeviceInfoBase extends FieldAccessVo implements TableDataConvertable {
    /**
     * This field corresponds to the database column `device_info`.device_id
     */
    private static final String PROPERTY_DEVICEID = "deviceId";

    /**
     * This field corresponds to the database column `device_info`.device_id
     */
    private static final String PROPERTY_REMARK_DEVICEID = "设备ID";

    /**
     * This field corresponds to the database column `device_info`.device_id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_DEVICEID)
    @Id
    private Integer deviceId;

    /**
     * This field corresponds to the database column `device_info`.name
     */
    private static final String PROPERTY_NAME = "name";

    /**
     * This field corresponds to the database column `device_info`.name
     */
    private static final String PROPERTY_REMARK_NAME = "车主姓名";

    /**
     * This field corresponds to the database column `device_info`.name
     */
    @ColumnDescription(desc = PROPERTY_REMARK_NAME)
    private String name;

    /**
     * This field corresponds to the database column `device_info`.age
     */
    private static final String PROPERTY_AGE = "age";

    /**
     * This field corresponds to the database column `device_info`.age
     */
    private static final String PROPERTY_REMARK_AGE = "年龄";

    /**
     * This field corresponds to the database column `device_info`.age
     */
    @ColumnDescription(desc = PROPERTY_REMARK_AGE)
    private Byte age;

    /**
     * This field corresponds to the database column `device_info`.driving_license
     */
    private static final String PROPERTY_DRIVINGLICENSE = "drivingLicense";

    /**
     * This field corresponds to the database column `device_info`.driving_license
     */
    private static final String PROPERTY_REMARK_DRIVINGLICENSE = "驾照类型(1:A,2:B,3:C)";

    /**
     * This field corresponds to the database column `device_info`.driving_license
     */
    @ColumnDescription(desc = PROPERTY_REMARK_DRIVINGLICENSE)
    private Byte drivingLicense;

    /**
     * This field corresponds to the database column `device_info`.identity_no
     */
    private static final String PROPERTY_IDENTITYNO = "identityNo";

    /**
     * This field corresponds to the database column `device_info`.identity_no
     */
    private static final String PROPERTY_REMARK_IDENTITYNO = "身份证号";

    /**
     * This field corresponds to the database column `device_info`.identity_no
     */
    @ColumnDescription(desc = PROPERTY_REMARK_IDENTITYNO)
    private String identityNo;

    /**
     * This field corresponds to the database column `device_info`.telephone
     */
    private static final String PROPERTY_TELEPHONE = "telephone";

    /**
     * This field corresponds to the database column `device_info`.telephone
     */
    private static final String PROPERTY_REMARK_TELEPHONE = "手机号";

    /**
     * This field corresponds to the database column `device_info`.telephone
     */
    @ColumnDescription(desc = PROPERTY_REMARK_TELEPHONE)
    private String telephone;

    /**
     * This field corresponds to the database column `device_info`.plate_no
     */
    private static final String PROPERTY_PLATENO = "plateNo";

    /**
     * This field corresponds to the database column `device_info`.plate_no
     */
    private static final String PROPERTY_REMARK_PLATENO = "车牌号";

    /**
     * This field corresponds to the database column `device_info`.plate_no
     */
    @ColumnDescription(desc = PROPERTY_REMARK_PLATENO)
    private String plateNo;

    /**
     * This field corresponds to the database column `device_info`.car_type
     */
    private static final String PROPERTY_CARTYPE = "carType";

    /**
     * This field corresponds to the database column `device_info`.car_type
     */
    private static final String PROPERTY_REMARK_CARTYPE = "车型(1:私家车,2:集团车)";

    /**
     * This field corresponds to the database column `device_info`.car_type
     */
    @ColumnDescription(desc = PROPERTY_REMARK_CARTYPE)
    private Byte carType;

    /**
     * This field corresponds to the database column `device_info`.phone_of_device
     */
    private static final String PROPERTY_PHONEOFDEVICE = "phoneOfDevice";

    /**
     * This field corresponds to the database column `device_info`.phone_of_device
     */
    private static final String PROPERTY_REMARK_PHONEOFDEVICE = "设备SIM卡号";

    /**
     * This field corresponds to the database column `device_info`.phone_of_device
     */
    @ColumnDescription(desc = PROPERTY_REMARK_PHONEOFDEVICE)
    private String phoneOfDevice;

    /**
     * This field corresponds to the database column `device_info`.weixin_account
     */
    private static final String PROPERTY_WEIXINACCOUNT = "weixinAccount";

    /**
     * This field corresponds to the database column `device_info`.weixin_account
     */
    private static final String PROPERTY_REMARK_WEIXINACCOUNT = "微信账号";

    /**
     * This field corresponds to the database column `device_info`.weixin_account
     */
    @ColumnDescription(desc = PROPERTY_REMARK_WEIXINACCOUNT)
    private String weixinAccount;

    /**
     * This field corresponds to the database column `device_info`.create_time
     */
    private static final String PROPERTY_CREATETIME = "createTime";

    /**
     * This field corresponds to the database column `device_info`.create_time
     */
    private static final String PROPERTY_REMARK_CREATETIME = "录入时间";

    /**
     * This field corresponds to the database column `device_info`.create_time
     */
    @ColumnDescription(desc = PROPERTY_REMARK_CREATETIME)
    private Date createTime;

    /**
     * This field corresponds to the database column `device_info`.recorder_id
     */
    private static final String PROPERTY_RECORDERID = "recorderId";

    /**
     * This field corresponds to the database column `device_info`.recorder_id
     */
    private static final String PROPERTY_REMARK_RECORDERID = "录入人ID";

    /**
     * This field corresponds to the database column `device_info`.recorder_id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_RECORDERID)
    private Integer recorderId;

    /**
     * This field corresponds to the database column `device_info`.outofdate_time
     */
    private static final String PROPERTY_OUTOFDATETIME = "outofdateTime";

    /**
     * This field corresponds to the database column `device_info`.outofdate_time
     */
    private static final String PROPERTY_REMARK_OUTOFDATETIME = "设备过期时间";

    /**
     * This field corresponds to the database column `device_info`.outofdate_time
     */
    @ColumnDescription(desc = PROPERTY_REMARK_OUTOFDATETIME)
    private Date outofdateTime;

    /**
     * This field corresponds to the database column `device_info`.activate_times
     */
    private static final String PROPERTY_ACTIVATETIMES = "activateTimes";

    /**
     * This field corresponds to the database column `device_info`.activate_times
     */
    private static final String PROPERTY_REMARK_ACTIVATETIMES = "活动时间";

    /**
     * This field corresponds to the database column `device_info`.activate_times
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ACTIVATETIMES)
    private Integer activateTimes;

    /**
     * This field corresponds to the database column `device_info`.if_active
     */
    private static final String PROPERTY_IFACTIVE = "ifActive";

    /**
     * This field corresponds to the database column `device_info`.if_active
     */
    private static final String PROPERTY_REMARK_IFACTIVE = "激活状态(0:未激活,1:第一次激活,2:再次激活)";

    /**
     * This field corresponds to the database column `device_info`.if_active
     */
    @ColumnDescription(desc = PROPERTY_REMARK_IFACTIVE)
    private Byte ifActive;

    /**
     * This method returns the value of the database column `device_info`.device_id
     *
     * @return the value of `device_info`.device_id
     */
    public Integer getDeviceId() {
        return deviceId;
    }

    /**
     * This method sets the value of the database column `device_info`.device_id
     *
     * @param deviceId the value for `device_info`.device_id
     */
    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * This method returns the value of the database column `device_info`.name
     *
     * @return the value of `device_info`.name
     */
    public String getName() {
        return name;
    }

    /**
     * This method sets the value of the database column `device_info`.name
     *
     * @param name the value for `device_info`.name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method returns the value of the database column `device_info`.age
     *
     * @return the value of `device_info`.age
     */
    public Byte getAge() {
        return age;
    }

    /**
     * This method sets the value of the database column `device_info`.age
     *
     * @param age the value for `device_info`.age
     */
    public void setAge(Byte age) {
        this.age = age;
    }

    /**
     * This method returns the value of the database column `device_info`.driving_license
     *
     * @return the value of `device_info`.driving_license
     */
    public Byte getDrivingLicense() {
        return drivingLicense;
    }

    /**
     * This method sets the value of the database column `device_info`.driving_license
     *
     * @param drivingLicense the value for `device_info`.driving_license
     */
    public void setDrivingLicense(Byte drivingLicense) {
        this.drivingLicense = drivingLicense;
    }

    /**
     * This method returns the value of the database column `device_info`.identity_no
     *
     * @return the value of `device_info`.identity_no
     */
    public String getIdentityNo() {
        return identityNo;
    }

    /**
     * This method sets the value of the database column `device_info`.identity_no
     *
     * @param identityNo the value for `device_info`.identity_no
     */
    public void setIdentityNo(String identityNo) {
        this.identityNo = identityNo;
    }

    /**
     * This method returns the value of the database column `device_info`.telephone
     *
     * @return the value of `device_info`.telephone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * This method sets the value of the database column `device_info`.telephone
     *
     * @param telephone the value for `device_info`.telephone
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * This method returns the value of the database column `device_info`.plate_no
     *
     * @return the value of `device_info`.plate_no
     */
    public String getPlateNo() {
        return plateNo;
    }

    /**
     * This method sets the value of the database column `device_info`.plate_no
     *
     * @param plateNo the value for `device_info`.plate_no
     */
    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }

    /**
     * This method returns the value of the database column `device_info`.car_type
     *
     * @return the value of `device_info`.car_type
     */
    public Byte getCarType() {
        return carType;
    }

    /**
     * This method sets the value of the database column `device_info`.car_type
     *
     * @param carType the value for `device_info`.car_type
     */
    public void setCarType(Byte carType) {
        this.carType = carType;
    }

    /**
     * This method returns the value of the database column `device_info`.phone_of_device
     *
     * @return the value of `device_info`.phone_of_device
     */
    public String getPhoneOfDevice() {
        return phoneOfDevice;
    }

    /**
     * This method sets the value of the database column `device_info`.phone_of_device
     *
     * @param phoneOfDevice the value for `device_info`.phone_of_device
     */
    public void setPhoneOfDevice(String phoneOfDevice) {
        this.phoneOfDevice = phoneOfDevice;
    }

    /**
     * This method returns the value of the database column `device_info`.weixin_account
     *
     * @return the value of `device_info`.weixin_account
     */
    public String getWeixinAccount() {
        return weixinAccount;
    }

    /**
     * This method sets the value of the database column `device_info`.weixin_account
     *
     * @param weixinAccount the value for `device_info`.weixin_account
     */
    public void setWeixinAccount(String weixinAccount) {
        this.weixinAccount = weixinAccount;
    }

    /**
     * This method returns the value of the database column `device_info`.create_time
     *
     * @return the value of `device_info`.create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method sets the value of the database column `device_info`.create_time
     *
     * @param createTime the value for `device_info`.create_time
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method returns the value of the database column `device_info`.recorder_id
     *
     * @return the value of `device_info`.recorder_id
     */
    public Integer getRecorderId() {
        return recorderId;
    }

    /**
     * This method sets the value of the database column `device_info`.recorder_id
     *
     * @param recorderId the value for `device_info`.recorder_id
     */
    public void setRecorderId(Integer recorderId) {
        this.recorderId = recorderId;
    }

    /**
     * This method returns the value of the database column `device_info`.outofdate_time
     *
     * @return the value of `device_info`.outofdate_time
     */
    public Date getOutofdateTime() {
        return outofdateTime;
    }

    /**
     * This method sets the value of the database column `device_info`.outofdate_time
     *
     * @param outofdateTime the value for `device_info`.outofdate_time
     */
    public void setOutofdateTime(Date outofdateTime) {
        this.outofdateTime = outofdateTime;
    }

    /**
     * This method returns the value of the database column `device_info`.activate_times
     *
     * @return the value of `device_info`.activate_times
     */
    public Integer getActivateTimes() {
        return activateTimes;
    }

    /**
     * This method sets the value of the database column `device_info`.activate_times
     *
     * @param activateTimes the value for `device_info`.activate_times
     */
    public void setActivateTimes(Integer activateTimes) {
        this.activateTimes = activateTimes;
    }

    /**
     * This method returns the value of the database column `device_info`.if_active
     *
     * @return the value of `device_info`.if_active
     */
    public Byte getIfActive() {
        return ifActive;
    }

    /**
     * This method sets the value of the database column `device_info`.if_active
     *
     * @param ifActive the value for `device_info`.if_active
     */
    public void setIfActive(Byte ifActive) {
        this.ifActive = ifActive;
    }
}