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
 * This class corresponds to the database table `tb_car_login_logout`
 */
public abstract class CarLoginLogoutBase extends FieldAccessVo implements TableDataConvertable {
    /**
     * This field corresponds to the database column `tb_car_login_logout`.id
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field corresponds to the database column `tb_car_login_logout`.id
     */
    private static final String PROPERTY_REMARK_ID = "自增ID";

    /**
     * This field corresponds to the database column `tb_car_login_logout`.id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Long id;

    /**
     * This field corresponds to the database column `tb_car_login_logout`.car_vin
     */
    private static final String PROPERTY_CARVIN = "carVin";

    /**
     * This field corresponds to the database column `tb_car_login_logout`.car_vin
     */
    private static final String PROPERTY_REMARK_CARVIN = "车辆vin";

    /**
     * This field corresponds to the database column `tb_car_login_logout`.car_vin
     */
    @ColumnDescription(desc = PROPERTY_REMARK_CARVIN)
    private String carVin;

    /**
     * This field corresponds to the database column `tb_car_login_logout`.login_time
     */
    private static final String PROPERTY_LOGINTIME = "loginTime";

    /**
     * This field corresponds to the database column `tb_car_login_logout`.login_time
     */
    private static final String PROPERTY_REMARK_LOGINTIME = "登入时间";

    /**
     * This field corresponds to the database column `tb_car_login_logout`.login_time
     */
    @ColumnDescription(desc = PROPERTY_REMARK_LOGINTIME)
    private Date loginTime;

    /**
     * This field corresponds to the database column `tb_car_login_logout`.logout_time
     */
    private static final String PROPERTY_LOGOUTTIME = "logoutTime";

    /**
     * This field corresponds to the database column `tb_car_login_logout`.logout_time
     */
    private static final String PROPERTY_REMARK_LOGOUTTIME = "登出时间";

    /**
     * This field corresponds to the database column `tb_car_login_logout`.logout_time
     */
    @ColumnDescription(desc = PROPERTY_REMARK_LOGOUTTIME)
    private Date logoutTime;

    /**
     * This field corresponds to the database column `tb_car_login_logout`.trace_no
     */
    private static final String PROPERTY_TRACENO = "traceNo";

    /**
     * This field corresponds to the database column `tb_car_login_logout`.trace_no
     */
    private static final String PROPERTY_REMARK_TRACENO = "登入流水号";

    /**
     * This field corresponds to the database column `tb_car_login_logout`.trace_no
     */
    @ColumnDescription(desc = PROPERTY_REMARK_TRACENO)
    private Integer traceNo;

    /**
     * This field corresponds to the database column `tb_car_login_logout`.iccid
     */
    private static final String PROPERTY_ICCID = "iccid";

    /**
     * This field corresponds to the database column `tb_car_login_logout`.iccid
     */
    private static final String PROPERTY_REMARK_ICCID = "ICCID";

    /**
     * This field corresponds to the database column `tb_car_login_logout`.iccid
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ICCID)
    private String iccid;

    /**
     * This field corresponds to the database column `tb_car_login_logout`.system_num
     */
    private static final String PROPERTY_SYSTEMNUM = "systemNum";

    /**
     * This field corresponds to the database column `tb_car_login_logout`.system_num
     */
    private static final String PROPERTY_REMARK_SYSTEMNUM = "可充电储能子系统数";

    /**
     * This field corresponds to the database column `tb_car_login_logout`.system_num
     */
    @ColumnDescription(desc = PROPERTY_REMARK_SYSTEMNUM)
    private Integer systemNum;

    /**
     * This field corresponds to the database column `tb_car_login_logout`.system_code_length
     */
    private static final String PROPERTY_SYSTEMCODELENGTH = "systemCodeLength";

    /**
     * This field corresponds to the database column `tb_car_login_logout`.system_code_length
     */
    private static final String PROPERTY_REMARK_SYSTEMCODELENGTH = "可充电储能系统编码长度";

    /**
     * This field corresponds to the database column `tb_car_login_logout`.system_code_length
     */
    @ColumnDescription(desc = PROPERTY_REMARK_SYSTEMCODELENGTH)
    private Integer systemCodeLength;

    /**
     * This field corresponds to the database column `tb_car_login_logout`.system_code
     */
    private static final String PROPERTY_SYSTEMCODE = "systemCode";

    /**
     * This field corresponds to the database column `tb_car_login_logout`.system_code
     */
    private static final String PROPERTY_REMARK_SYSTEMCODE = "可充电储能系统编码";

    /**
     * This field corresponds to the database column `tb_car_login_logout`.system_code
     */
    @ColumnDescription(desc = PROPERTY_REMARK_SYSTEMCODE)
    private String systemCode;

    /**
     * This method returns the value of the database column `tb_car_login_logout`.id
     *
     * @return the value of `tb_car_login_logout`.id
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column `tb_car_login_logout`.id
     *
     * @param id the value for `tb_car_login_logout`.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column `tb_car_login_logout`.car_vin
     *
     * @return the value of `tb_car_login_logout`.car_vin
     */
    public String getCarVin() {
        return carVin;
    }

    /**
     * This method sets the value of the database column `tb_car_login_logout`.car_vin
     *
     * @param carVin the value for `tb_car_login_logout`.car_vin
     */
    public void setCarVin(String carVin) {
        this.carVin = carVin;
    }

    /**
     * This method returns the value of the database column `tb_car_login_logout`.login_time
     *
     * @return the value of `tb_car_login_logout`.login_time
     */
    public Date getLoginTime() {
        return loginTime;
    }

    /**
     * This method sets the value of the database column `tb_car_login_logout`.login_time
     *
     * @param loginTime the value for `tb_car_login_logout`.login_time
     */
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    /**
     * This method returns the value of the database column `tb_car_login_logout`.logout_time
     *
     * @return the value of `tb_car_login_logout`.logout_time
     */
    public Date getLogoutTime() {
        return logoutTime;
    }

    /**
     * This method sets the value of the database column `tb_car_login_logout`.logout_time
     *
     * @param logoutTime the value for `tb_car_login_logout`.logout_time
     */
    public void setLogoutTime(Date logoutTime) {
        this.logoutTime = logoutTime;
    }

    /**
     * This method returns the value of the database column `tb_car_login_logout`.trace_no
     *
     * @return the value of `tb_car_login_logout`.trace_no
     */
    public Integer getTraceNo() {
        return traceNo;
    }

    /**
     * This method sets the value of the database column `tb_car_login_logout`.trace_no
     *
     * @param traceNo the value for `tb_car_login_logout`.trace_no
     */
    public void setTraceNo(Integer traceNo) {
        this.traceNo = traceNo;
    }

    /**
     * This method returns the value of the database column `tb_car_login_logout`.iccid
     *
     * @return the value of `tb_car_login_logout`.iccid
     */
    public String getIccid() {
        return iccid;
    }

    /**
     * This method sets the value of the database column `tb_car_login_logout`.iccid
     *
     * @param iccid the value for `tb_car_login_logout`.iccid
     */
    public void setIccid(String iccid) {
        this.iccid = iccid;
    }

    /**
     * This method returns the value of the database column `tb_car_login_logout`.system_num
     *
     * @return the value of `tb_car_login_logout`.system_num
     */
    public Integer getSystemNum() {
        return systemNum;
    }

    /**
     * This method sets the value of the database column `tb_car_login_logout`.system_num
     *
     * @param systemNum the value for `tb_car_login_logout`.system_num
     */
    public void setSystemNum(Integer systemNum) {
        this.systemNum = systemNum;
    }

    /**
     * This method returns the value of the database column `tb_car_login_logout`.system_code_length
     *
     * @return the value of `tb_car_login_logout`.system_code_length
     */
    public Integer getSystemCodeLength() {
        return systemCodeLength;
    }

    /**
     * This method sets the value of the database column `tb_car_login_logout`.system_code_length
     *
     * @param systemCodeLength the value for `tb_car_login_logout`.system_code_length
     */
    public void setSystemCodeLength(Integer systemCodeLength) {
        this.systemCodeLength = systemCodeLength;
    }

    /**
     * This method returns the value of the database column `tb_car_login_logout`.system_code
     *
     * @return the value of `tb_car_login_logout`.system_code
     */
    public String getSystemCode() {
        return systemCode;
    }

    /**
     * This method sets the value of the database column `tb_car_login_logout`.system_code
     *
     * @param systemCode the value for `tb_car_login_logout`.system_code
     */
    public void setSystemCode(String systemCode) {
        this.systemCode = systemCode;
    }
}