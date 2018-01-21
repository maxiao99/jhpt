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
 * This class corresponds to the database table `tb_device_info`
 */
public abstract class DeviceInfoBase extends FieldAccessVo implements TableDataConvertable {
    /**
     * This field corresponds to the database column `tb_device_info`.id
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field corresponds to the database column `tb_device_info`.id
     */
    private static final String PROPERTY_REMARK_ID = "自增ID";

    /**
     * This field corresponds to the database column `tb_device_info`.id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Long id;

    /**
     * This field corresponds to the database column `tb_device_info`.iccid
     */
    private static final String PROPERTY_ICCID = "iccid";

    /**
     * This field corresponds to the database column `tb_device_info`.iccid
     */
    private static final String PROPERTY_REMARK_ICCID = "SIM卡ICCID号";

    /**
     * This field corresponds to the database column `tb_device_info`.iccid
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ICCID)
    private String iccid;

    /**
     * This field corresponds to the database column `tb_device_info`.terminal_seq
     */
    private static final String PROPERTY_TERMINALSEQ = "terminalSeq";

    /**
     * This field corresponds to the database column `tb_device_info`.terminal_seq
     */
    private static final String PROPERTY_REMARK_TERMINALSEQ = "终端序列号";

    /**
     * This field corresponds to the database column `tb_device_info`.terminal_seq
     */
    @ColumnDescription(desc = PROPERTY_REMARK_TERMINALSEQ)
    private String terminalSeq;

    /**
     * This field corresponds to the database column `tb_device_info`.car_vin
     */
    private static final String PROPERTY_CARVIN = "carVin";

    /**
     * This field corresponds to the database column `tb_device_info`.car_vin
     */
    private static final String PROPERTY_REMARK_CARVIN = "车辆vin";

    /**
     * This field corresponds to the database column `tb_device_info`.car_vin
     */
    @ColumnDescription(desc = PROPERTY_REMARK_CARVIN)
    private String carVin;

    /**
     * This field corresponds to the database column `tb_device_info`.terminal_no
     */
    private static final String PROPERTY_TERMINALNO = "terminalNo";

    /**
     * This field corresponds to the database column `tb_device_info`.terminal_no
     */
    private static final String PROPERTY_REMARK_TERMINALNO = "车载终端编号";

    /**
     * This field corresponds to the database column `tb_device_info`.terminal_no
     */
    @ColumnDescription(desc = PROPERTY_REMARK_TERMINALNO)
    private String terminalNo;

    /**
     * This field corresponds to the database column `tb_device_info`.dianji_no
     */
    private static final String PROPERTY_DIANJINO = "dianjiNo";

    /**
     * This field corresponds to the database column `tb_device_info`.dianji_no
     */
    private static final String PROPERTY_REMARK_DIANJINO = "驱动电机型号";

    /**
     * This field corresponds to the database column `tb_device_info`.dianji_no
     */
    @ColumnDescription(desc = PROPERTY_REMARK_DIANJINO)
    private String dianjiNo;

    /**
     * This field corresponds to the database column `tb_device_info`.fadongji_no
     */
    private static final String PROPERTY_FADONGJINO = "fadongjiNo";

    /**
     * This field corresponds to the database column `tb_device_info`.fadongji_no
     */
    private static final String PROPERTY_REMARK_FADONGJINO = "发动机编号";

    /**
     * This field corresponds to the database column `tb_device_info`.fadongji_no
     */
    @ColumnDescription(desc = PROPERTY_REMARK_FADONGJINO)
    private String fadongjiNo;

    /**
     * This field corresponds to the database column `tb_device_info`.name
     */
    private static final String PROPERTY_NAME = "name";

    /**
     * This field corresponds to the database column `tb_device_info`.name
     */
    private static final String PROPERTY_REMARK_NAME = "车主姓名";

    /**
     * This field corresponds to the database column `tb_device_info`.name
     */
    @ColumnDescription(desc = PROPERTY_REMARK_NAME)
    private String name;

    /**
     * This field corresponds to the database column `tb_device_info`.age
     */
    private static final String PROPERTY_AGE = "age";

    /**
     * This field corresponds to the database column `tb_device_info`.age
     */
    private static final String PROPERTY_REMARK_AGE = "年龄";

    /**
     * This field corresponds to the database column `tb_device_info`.age
     */
    @ColumnDescription(desc = PROPERTY_REMARK_AGE)
    private Integer age;

    /**
     * This field corresponds to the database column `tb_device_info`.driving_license
     */
    private static final String PROPERTY_DRIVINGLICENSE = "drivingLicense";

    /**
     * This field corresponds to the database column `tb_device_info`.driving_license
     */
    private static final String PROPERTY_REMARK_DRIVINGLICENSE = "驾照类型(1:A,2:B,3:C)";

    /**
     * This field corresponds to the database column `tb_device_info`.driving_license
     */
    @ColumnDescription(desc = PROPERTY_REMARK_DRIVINGLICENSE)
    private Integer drivingLicense;

    /**
     * This field corresponds to the database column `tb_device_info`.identity_no
     */
    private static final String PROPERTY_IDENTITYNO = "identityNo";

    /**
     * This field corresponds to the database column `tb_device_info`.identity_no
     */
    private static final String PROPERTY_REMARK_IDENTITYNO = "身份证号";

    /**
     * This field corresponds to the database column `tb_device_info`.identity_no
     */
    @ColumnDescription(desc = PROPERTY_REMARK_IDENTITYNO)
    private String identityNo;

    /**
     * This field corresponds to the database column `tb_device_info`.telephone
     */
    private static final String PROPERTY_TELEPHONE = "telephone";

    /**
     * This field corresponds to the database column `tb_device_info`.telephone
     */
    private static final String PROPERTY_REMARK_TELEPHONE = "手机号";

    /**
     * This field corresponds to the database column `tb_device_info`.telephone
     */
    @ColumnDescription(desc = PROPERTY_REMARK_TELEPHONE)
    private String telephone;

    /**
     * This field corresponds to the database column `tb_device_info`.plate_no
     */
    private static final String PROPERTY_PLATENO = "plateNo";

    /**
     * This field corresponds to the database column `tb_device_info`.plate_no
     */
    private static final String PROPERTY_REMARK_PLATENO = "车牌号";

    /**
     * This field corresponds to the database column `tb_device_info`.plate_no
     */
    @ColumnDescription(desc = PROPERTY_REMARK_PLATENO)
    private String plateNo;

    /**
     * This field corresponds to the database column `tb_device_info`.car_type
     */
    private static final String PROPERTY_CARTYPE = "carType";

    /**
     * This field corresponds to the database column `tb_device_info`.car_type
     */
    private static final String PROPERTY_REMARK_CARTYPE = "车型(1:私家车,2:集团车)";

    /**
     * This field corresponds to the database column `tb_device_info`.car_type
     */
    @ColumnDescription(desc = PROPERTY_REMARK_CARTYPE)
    private Integer carType;

    /**
     * This field corresponds to the database column `tb_device_info`.weixin_account
     */
    private static final String PROPERTY_WEIXINACCOUNT = "weixinAccount";

    /**
     * This field corresponds to the database column `tb_device_info`.weixin_account
     */
    private static final String PROPERTY_REMARK_WEIXINACCOUNT = "微信账号";

    /**
     * This field corresponds to the database column `tb_device_info`.weixin_account
     */
    @ColumnDescription(desc = PROPERTY_REMARK_WEIXINACCOUNT)
    private String weixinAccount;

    /**
     * This field corresponds to the database column `tb_device_info`.create_time
     */
    private static final String PROPERTY_CREATETIME = "createTime";

    /**
     * This field corresponds to the database column `tb_device_info`.create_time
     */
    private static final String PROPERTY_REMARK_CREATETIME = "录入时间";

    /**
     * This field corresponds to the database column `tb_device_info`.create_time
     */
    @ColumnDescription(desc = PROPERTY_REMARK_CREATETIME)
    private Date createTime;

    /**
     * This field corresponds to the database column `tb_device_info`.recorder_id
     */
    private static final String PROPERTY_RECORDERID = "recorderId";

    /**
     * This field corresponds to the database column `tb_device_info`.recorder_id
     */
    private static final String PROPERTY_REMARK_RECORDERID = "录入人ID";

    /**
     * This field corresponds to the database column `tb_device_info`.recorder_id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_RECORDERID)
    private Integer recorderId;

    /**
     * This field corresponds to the database column `tb_device_info`.outofdate_time
     */
    private static final String PROPERTY_OUTOFDATETIME = "outofdateTime";

    /**
     * This field corresponds to the database column `tb_device_info`.outofdate_time
     */
    private static final String PROPERTY_REMARK_OUTOFDATETIME = "设备过期时间";

    /**
     * This field corresponds to the database column `tb_device_info`.outofdate_time
     */
    @ColumnDescription(desc = PROPERTY_REMARK_OUTOFDATETIME)
    private Date outofdateTime;

    /**
     * This field corresponds to the database column `tb_device_info`.activate_times
     */
    private static final String PROPERTY_ACTIVATETIMES = "activateTimes";

    /**
     * This field corresponds to the database column `tb_device_info`.activate_times
     */
    private static final String PROPERTY_REMARK_ACTIVATETIMES = "活动时间";

    /**
     * This field corresponds to the database column `tb_device_info`.activate_times
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ACTIVATETIMES)
    private Integer activateTimes;

    /**
     * This field corresponds to the database column `tb_device_info`.if_active
     */
    private static final String PROPERTY_IFACTIVE = "ifActive";

    /**
     * This field corresponds to the database column `tb_device_info`.if_active
     */
    private static final String PROPERTY_REMARK_IFACTIVE = "激活状态(1:第一次激活,2:再次激活)";

    /**
     * This field corresponds to the database column `tb_device_info`.if_active
     */
    @ColumnDescription(desc = PROPERTY_REMARK_IFACTIVE)
    private Integer ifActive;

    /**
     * This method returns the value of the database column `tb_device_info`.id
     *
     * @return the value of `tb_device_info`.id
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column `tb_device_info`.id
     *
     * @param id the value for `tb_device_info`.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column `tb_device_info`.iccid
     *
     * @return the value of `tb_device_info`.iccid
     */
    public String getIccid() {
        return iccid;
    }

    /**
     * This method sets the value of the database column `tb_device_info`.iccid
     *
     * @param iccid the value for `tb_device_info`.iccid
     */
    public void setIccid(String iccid) {
        this.iccid = iccid;
    }

    /**
     * This method returns the value of the database column `tb_device_info`.terminal_seq
     *
     * @return the value of `tb_device_info`.terminal_seq
     */
    public String getTerminalSeq() {
        return terminalSeq;
    }

    /**
     * This method sets the value of the database column `tb_device_info`.terminal_seq
     *
     * @param terminalSeq the value for `tb_device_info`.terminal_seq
     */
    public void setTerminalSeq(String terminalSeq) {
        this.terminalSeq = terminalSeq;
    }

    /**
     * This method returns the value of the database column `tb_device_info`.car_vin
     *
     * @return the value of `tb_device_info`.car_vin
     */
    public String getCarVin() {
        return carVin;
    }

    /**
     * This method sets the value of the database column `tb_device_info`.car_vin
     *
     * @param carVin the value for `tb_device_info`.car_vin
     */
    public void setCarVin(String carVin) {
        this.carVin = carVin;
    }

    /**
     * This method returns the value of the database column `tb_device_info`.terminal_no
     *
     * @return the value of `tb_device_info`.terminal_no
     */
    public String getTerminalNo() {
        return terminalNo;
    }

    /**
     * This method sets the value of the database column `tb_device_info`.terminal_no
     *
     * @param terminalNo the value for `tb_device_info`.terminal_no
     */
    public void setTerminalNo(String terminalNo) {
        this.terminalNo = terminalNo;
    }

    /**
     * This method returns the value of the database column `tb_device_info`.dianji_no
     *
     * @return the value of `tb_device_info`.dianji_no
     */
    public String getDianjiNo() {
        return dianjiNo;
    }

    /**
     * This method sets the value of the database column `tb_device_info`.dianji_no
     *
     * @param dianjiNo the value for `tb_device_info`.dianji_no
     */
    public void setDianjiNo(String dianjiNo) {
        this.dianjiNo = dianjiNo;
    }

    /**
     * This method returns the value of the database column `tb_device_info`.fadongji_no
     *
     * @return the value of `tb_device_info`.fadongji_no
     */
    public String getFadongjiNo() {
        return fadongjiNo;
    }

    /**
     * This method sets the value of the database column `tb_device_info`.fadongji_no
     *
     * @param fadongjiNo the value for `tb_device_info`.fadongji_no
     */
    public void setFadongjiNo(String fadongjiNo) {
        this.fadongjiNo = fadongjiNo;
    }

    /**
     * This method returns the value of the database column `tb_device_info`.name
     *
     * @return the value of `tb_device_info`.name
     */
    public String getName() {
        return name;
    }

    /**
     * This method sets the value of the database column `tb_device_info`.name
     *
     * @param name the value for `tb_device_info`.name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method returns the value of the database column `tb_device_info`.age
     *
     * @return the value of `tb_device_info`.age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method sets the value of the database column `tb_device_info`.age
     *
     * @param age the value for `tb_device_info`.age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * This method returns the value of the database column `tb_device_info`.driving_license
     *
     * @return the value of `tb_device_info`.driving_license
     */
    public Integer getDrivingLicense() {
        return drivingLicense;
    }

    /**
     * This method sets the value of the database column `tb_device_info`.driving_license
     *
     * @param drivingLicense the value for `tb_device_info`.driving_license
     */
    public void setDrivingLicense(Integer drivingLicense) {
        this.drivingLicense = drivingLicense;
    }

    /**
     * This method returns the value of the database column `tb_device_info`.identity_no
     *
     * @return the value of `tb_device_info`.identity_no
     */
    public String getIdentityNo() {
        return identityNo;
    }

    /**
     * This method sets the value of the database column `tb_device_info`.identity_no
     *
     * @param identityNo the value for `tb_device_info`.identity_no
     */
    public void setIdentityNo(String identityNo) {
        this.identityNo = identityNo;
    }

    /**
     * This method returns the value of the database column `tb_device_info`.telephone
     *
     * @return the value of `tb_device_info`.telephone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * This method sets the value of the database column `tb_device_info`.telephone
     *
     * @param telephone the value for `tb_device_info`.telephone
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * This method returns the value of the database column `tb_device_info`.plate_no
     *
     * @return the value of `tb_device_info`.plate_no
     */
    public String getPlateNo() {
        return plateNo;
    }

    /**
     * This method sets the value of the database column `tb_device_info`.plate_no
     *
     * @param plateNo the value for `tb_device_info`.plate_no
     */
    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }

    /**
     * This method returns the value of the database column `tb_device_info`.car_type
     *
     * @return the value of `tb_device_info`.car_type
     */
    public Integer getCarType() {
        return carType;
    }

    /**
     * This method sets the value of the database column `tb_device_info`.car_type
     *
     * @param carType the value for `tb_device_info`.car_type
     */
    public void setCarType(Integer carType) {
        this.carType = carType;
    }

    /**
     * This method returns the value of the database column `tb_device_info`.weixin_account
     *
     * @return the value of `tb_device_info`.weixin_account
     */
    public String getWeixinAccount() {
        return weixinAccount;
    }

    /**
     * This method sets the value of the database column `tb_device_info`.weixin_account
     *
     * @param weixinAccount the value for `tb_device_info`.weixin_account
     */
    public void setWeixinAccount(String weixinAccount) {
        this.weixinAccount = weixinAccount;
    }

    /**
     * This method returns the value of the database column `tb_device_info`.create_time
     *
     * @return the value of `tb_device_info`.create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method sets the value of the database column `tb_device_info`.create_time
     *
     * @param createTime the value for `tb_device_info`.create_time
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method returns the value of the database column `tb_device_info`.recorder_id
     *
     * @return the value of `tb_device_info`.recorder_id
     */
    public Integer getRecorderId() {
        return recorderId;
    }

    /**
     * This method sets the value of the database column `tb_device_info`.recorder_id
     *
     * @param recorderId the value for `tb_device_info`.recorder_id
     */
    public void setRecorderId(Integer recorderId) {
        this.recorderId = recorderId;
    }

    /**
     * This method returns the value of the database column `tb_device_info`.outofdate_time
     *
     * @return the value of `tb_device_info`.outofdate_time
     */
    public Date getOutofdateTime() {
        return outofdateTime;
    }

    /**
     * This method sets the value of the database column `tb_device_info`.outofdate_time
     *
     * @param outofdateTime the value for `tb_device_info`.outofdate_time
     */
    public void setOutofdateTime(Date outofdateTime) {
        this.outofdateTime = outofdateTime;
    }

    /**
     * This method returns the value of the database column `tb_device_info`.activate_times
     *
     * @return the value of `tb_device_info`.activate_times
     */
    public Integer getActivateTimes() {
        return activateTimes;
    }

    /**
     * This method sets the value of the database column `tb_device_info`.activate_times
     *
     * @param activateTimes the value for `tb_device_info`.activate_times
     */
    public void setActivateTimes(Integer activateTimes) {
        this.activateTimes = activateTimes;
    }

    /**
     * This method returns the value of the database column `tb_device_info`.if_active
     *
     * @return the value of `tb_device_info`.if_active
     */
    public Integer getIfActive() {
        return ifActive;
    }

    /**
     * This method sets the value of the database column `tb_device_info`.if_active
     *
     * @param ifActive the value for `tb_device_info`.if_active
     */
    public void setIfActive(Integer ifActive) {
        this.ifActive = ifActive;
    }
}