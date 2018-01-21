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
 * This class corresponds to the database table `tb_driver_person`
 */
public abstract class DriverPersonBase extends FieldAccessVo implements TableDataConvertable {
    /**
     * This field corresponds to the database column `tb_driver_person`.id
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field corresponds to the database column `tb_driver_person`.id
     */
    private static final String PROPERTY_REMARK_ID = "自增ID";

    /**
     * This field corresponds to the database column `tb_driver_person`.id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Long id;

    /**
     * This field corresponds to the database column `tb_driver_person`.car_vin
     */
    private static final String PROPERTY_CARVIN = "carVin";

    /**
     * This field corresponds to the database column `tb_driver_person`.car_vin
     */
    private static final String PROPERTY_REMARK_CARVIN = "车辆vin";

    /**
     * This field corresponds to the database column `tb_driver_person`.car_vin
     */
    @ColumnDescription(desc = PROPERTY_REMARK_CARVIN)
    private String carVin;

    /**
     * This field corresponds to the database column `tb_driver_person`.driver_id
     */
    private static final String PROPERTY_DRIVERID = "driverId";

    /**
     * This field corresponds to the database column `tb_driver_person`.driver_id
     */
    private static final String PROPERTY_REMARK_DRIVERID = "驾驶员ID";

    /**
     * This field corresponds to the database column `tb_driver_person`.driver_id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_DRIVERID)
    private Integer driverId;

    /**
     * This field corresponds to the database column `tb_driver_person`.event_time
     */
    private static final String PROPERTY_EVENTTIME = "eventTime";

    /**
     * This field corresponds to the database column `tb_driver_person`.event_time
     */
    private static final String PROPERTY_REMARK_EVENTTIME = "数据采集时间";

    /**
     * This field corresponds to the database column `tb_driver_person`.event_time
     */
    @ColumnDescription(desc = PROPERTY_REMARK_EVENTTIME)
    private Date eventTime;

    /**
     * This field corresponds to the database column `tb_driver_person`.driver_name
     */
    private static final String PROPERTY_DRIVERNAME = "driverName";

    /**
     * This field corresponds to the database column `tb_driver_person`.driver_name
     */
    private static final String PROPERTY_REMARK_DRIVERNAME = "驾驶员姓名";

    /**
     * This field corresponds to the database column `tb_driver_person`.driver_name
     */
    @ColumnDescription(desc = PROPERTY_REMARK_DRIVERNAME)
    private String driverName;

    /**
     * This field corresponds to the database column `tb_driver_person`.driver_identity_no
     */
    private static final String PROPERTY_DRIVERIDENTITYNO = "driverIdentityNo";

    /**
     * This field corresponds to the database column `tb_driver_person`.driver_identity_no
     */
    private static final String PROPERTY_REMARK_DRIVERIDENTITYNO = "驾驶员身份证";

    /**
     * This field corresponds to the database column `tb_driver_person`.driver_identity_no
     */
    @ColumnDescription(desc = PROPERTY_REMARK_DRIVERIDENTITYNO)
    private String driverIdentityNo;

    /**
     * This field corresponds to the database column `tb_driver_person`.work_qualification
     */
    private static final String PROPERTY_WORKQUALIFICATION = "workQualification";

    /**
     * This field corresponds to the database column `tb_driver_person`.work_qualification
     */
    private static final String PROPERTY_REMARK_WORKQUALIFICATION = "从业资格证";

    /**
     * This field corresponds to the database column `tb_driver_person`.work_qualification
     */
    @ColumnDescription(desc = PROPERTY_REMARK_WORKQUALIFICATION)
    private String workQualification;

    /**
     * This field corresponds to the database column `tb_driver_person`.issue_organization_name
     */
    private static final String PROPERTY_ISSUEORGANIZATIONNAME = "issueOrganizationName";

    /**
     * This field corresponds to the database column `tb_driver_person`.issue_organization_name
     */
    private static final String PROPERTY_REMARK_ISSUEORGANIZATIONNAME = "发证机构名称";

    /**
     * This field corresponds to the database column `tb_driver_person`.issue_organization_name
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ISSUEORGANIZATIONNAME)
    private String issueOrganizationName;

    /**
     * This method returns the value of the database column `tb_driver_person`.id
     *
     * @return the value of `tb_driver_person`.id
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column `tb_driver_person`.id
     *
     * @param id the value for `tb_driver_person`.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column `tb_driver_person`.car_vin
     *
     * @return the value of `tb_driver_person`.car_vin
     */
    public String getCarVin() {
        return carVin;
    }

    /**
     * This method sets the value of the database column `tb_driver_person`.car_vin
     *
     * @param carVin the value for `tb_driver_person`.car_vin
     */
    public void setCarVin(String carVin) {
        this.carVin = carVin;
    }

    /**
     * This method returns the value of the database column `tb_driver_person`.driver_id
     *
     * @return the value of `tb_driver_person`.driver_id
     */
    public Integer getDriverId() {
        return driverId;
    }

    /**
     * This method sets the value of the database column `tb_driver_person`.driver_id
     *
     * @param driverId the value for `tb_driver_person`.driver_id
     */
    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    /**
     * This method returns the value of the database column `tb_driver_person`.event_time
     *
     * @return the value of `tb_driver_person`.event_time
     */
    public Date getEventTime() {
        return eventTime;
    }

    /**
     * This method sets the value of the database column `tb_driver_person`.event_time
     *
     * @param eventTime the value for `tb_driver_person`.event_time
     */
    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
    }

    /**
     * This method returns the value of the database column `tb_driver_person`.driver_name
     *
     * @return the value of `tb_driver_person`.driver_name
     */
    public String getDriverName() {
        return driverName;
    }

    /**
     * This method sets the value of the database column `tb_driver_person`.driver_name
     *
     * @param driverName the value for `tb_driver_person`.driver_name
     */
    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    /**
     * This method returns the value of the database column `tb_driver_person`.driver_identity_no
     *
     * @return the value of `tb_driver_person`.driver_identity_no
     */
    public String getDriverIdentityNo() {
        return driverIdentityNo;
    }

    /**
     * This method sets the value of the database column `tb_driver_person`.driver_identity_no
     *
     * @param driverIdentityNo the value for `tb_driver_person`.driver_identity_no
     */
    public void setDriverIdentityNo(String driverIdentityNo) {
        this.driverIdentityNo = driverIdentityNo;
    }

    /**
     * This method returns the value of the database column `tb_driver_person`.work_qualification
     *
     * @return the value of `tb_driver_person`.work_qualification
     */
    public String getWorkQualification() {
        return workQualification;
    }

    /**
     * This method sets the value of the database column `tb_driver_person`.work_qualification
     *
     * @param workQualification the value for `tb_driver_person`.work_qualification
     */
    public void setWorkQualification(String workQualification) {
        this.workQualification = workQualification;
    }

    /**
     * This method returns the value of the database column `tb_driver_person`.issue_organization_name
     *
     * @return the value of `tb_driver_person`.issue_organization_name
     */
    public String getIssueOrganizationName() {
        return issueOrganizationName;
    }

    /**
     * This method sets the value of the database column `tb_driver_person`.issue_organization_name
     *
     * @param issueOrganizationName the value for `tb_driver_person`.issue_organization_name
     */
    public void setIssueOrganizationName(String issueOrganizationName) {
        this.issueOrganizationName = issueOrganizationName;
    }
}