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
 * This class corresponds to the database table `tb_device_gps_info`
 */
public abstract class DeviceGpsInfoBase extends FieldAccessVo implements TableDataConvertable {
    /**
     * This field corresponds to the database column `tb_device_gps_info`.id
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field corresponds to the database column `tb_device_gps_info`.id
     */
    private static final String PROPERTY_REMARK_ID = "自增ID";

    /**
     * This field corresponds to the database column `tb_device_gps_info`.id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Long id;

    /**
     * This field corresponds to the database column `tb_device_gps_info`.car_vin
     */
    private static final String PROPERTY_CARVIN = "carVin";

    /**
     * This field corresponds to the database column `tb_device_gps_info`.car_vin
     */
    private static final String PROPERTY_REMARK_CARVIN = "车辆vin";

    /**
     * This field corresponds to the database column `tb_device_gps_info`.car_vin
     */
    @ColumnDescription(desc = PROPERTY_REMARK_CARVIN)
    private String carVin;

    /**
     * This field corresponds to the database column `tb_device_gps_info`.msg_id
     */
    private static final String PROPERTY_MSGID = "msgId";

    /**
     * This field corresponds to the database column `tb_device_gps_info`.msg_id
     */
    private static final String PROPERTY_REMARK_MSGID = "告警消息ID";

    /**
     * This field corresponds to the database column `tb_device_gps_info`.msg_id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_MSGID)
    private Integer msgId;

    /**
     * This field corresponds to the database column `tb_device_gps_info`.event_time
     */
    private static final String PROPERTY_EVENTTIME = "eventTime";

    /**
     * This field corresponds to the database column `tb_device_gps_info`.event_time
     */
    private static final String PROPERTY_REMARK_EVENTTIME = "数据采集时间";

    /**
     * This field corresponds to the database column `tb_device_gps_info`.event_time
     */
    @ColumnDescription(desc = PROPERTY_REMARK_EVENTTIME)
    private Date eventTime;

    /**
     * This field corresponds to the database column `tb_device_gps_info`.driver_person_id
     */
    private static final String PROPERTY_DRIVERPERSONID = "driverPersonId";

    /**
     * This field corresponds to the database column `tb_device_gps_info`.driver_person_id
     */
    private static final String PROPERTY_REMARK_DRIVERPERSONID = "驾驶员ID";

    /**
     * This field corresponds to the database column `tb_device_gps_info`.driver_person_id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_DRIVERPERSONID)
    private Integer driverPersonId;

    /**
     * This field corresponds to the database column `tb_device_gps_info`.location_status
     */
    private static final String PROPERTY_LOCATIONSTATUS = "locationStatus";

    /**
     * This field corresponds to the database column `tb_device_gps_info`.location_status
     */
    private static final String PROPERTY_REMARK_LOCATIONSTATUS = "定位状态";

    /**
     * This field corresponds to the database column `tb_device_gps_info`.location_status
     */
    @ColumnDescription(desc = PROPERTY_REMARK_LOCATIONSTATUS)
    private Integer locationStatus;

    /**
     * This field corresponds to the database column `tb_device_gps_info`.longitude
     */
    private static final String PROPERTY_LONGITUDE = "longitude";

    /**
     * This field corresponds to the database column `tb_device_gps_info`.longitude
     */
    private static final String PROPERTY_REMARK_LONGITUDE = "经度";

    /**
     * This field corresponds to the database column `tb_device_gps_info`.longitude
     */
    @ColumnDescription(desc = PROPERTY_REMARK_LONGITUDE)
    private Double longitude;

    /**
     * This field corresponds to the database column `tb_device_gps_info`.latitude
     */
    private static final String PROPERTY_LATITUDE = "latitude";

    /**
     * This field corresponds to the database column `tb_device_gps_info`.latitude
     */
    private static final String PROPERTY_REMARK_LATITUDE = "纬度";

    /**
     * This field corresponds to the database column `tb_device_gps_info`.latitude
     */
    @ColumnDescription(desc = PROPERTY_REMARK_LATITUDE)
    private Double latitude;

    /**
     * This field corresponds to the database column `tb_device_gps_info`.speed
     */
    private static final String PROPERTY_SPEED = "speed";

    /**
     * This field corresponds to the database column `tb_device_gps_info`.speed
     */
    private static final String PROPERTY_REMARK_SPEED = "车速";

    /**
     * This field corresponds to the database column `tb_device_gps_info`.speed
     */
    @ColumnDescription(desc = PROPERTY_REMARK_SPEED)
    private Integer speed;

    /**
     * This field corresponds to the database column `tb_device_gps_info`.upload_time
     */
    private static final String PROPERTY_UPLOADTIME = "uploadTime";

    /**
     * This field corresponds to the database column `tb_device_gps_info`.upload_time
     */
    private static final String PROPERTY_REMARK_UPLOADTIME = "上传时间";

    /**
     * This field corresponds to the database column `tb_device_gps_info`.upload_time
     */
    @ColumnDescription(desc = PROPERTY_REMARK_UPLOADTIME)
    private Date uploadTime;

    /**
     * This method returns the value of the database column `tb_device_gps_info`.id
     *
     * @return the value of `tb_device_gps_info`.id
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column `tb_device_gps_info`.id
     *
     * @param id the value for `tb_device_gps_info`.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column `tb_device_gps_info`.car_vin
     *
     * @return the value of `tb_device_gps_info`.car_vin
     */
    public String getCarVin() {
        return carVin;
    }

    /**
     * This method sets the value of the database column `tb_device_gps_info`.car_vin
     *
     * @param carVin the value for `tb_device_gps_info`.car_vin
     */
    public void setCarVin(String carVin) {
        this.carVin = carVin;
    }

    /**
     * This method returns the value of the database column `tb_device_gps_info`.msg_id
     *
     * @return the value of `tb_device_gps_info`.msg_id
     */
    public Integer getMsgId() {
        return msgId;
    }

    /**
     * This method sets the value of the database column `tb_device_gps_info`.msg_id
     *
     * @param msgId the value for `tb_device_gps_info`.msg_id
     */
    public void setMsgId(Integer msgId) {
        this.msgId = msgId;
    }

    /**
     * This method returns the value of the database column `tb_device_gps_info`.event_time
     *
     * @return the value of `tb_device_gps_info`.event_time
     */
    public Date getEventTime() {
        return eventTime;
    }

    /**
     * This method sets the value of the database column `tb_device_gps_info`.event_time
     *
     * @param eventTime the value for `tb_device_gps_info`.event_time
     */
    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
    }

    /**
     * This method returns the value of the database column `tb_device_gps_info`.driver_person_id
     *
     * @return the value of `tb_device_gps_info`.driver_person_id
     */
    public Integer getDriverPersonId() {
        return driverPersonId;
    }

    /**
     * This method sets the value of the database column `tb_device_gps_info`.driver_person_id
     *
     * @param driverPersonId the value for `tb_device_gps_info`.driver_person_id
     */
    public void setDriverPersonId(Integer driverPersonId) {
        this.driverPersonId = driverPersonId;
    }

    /**
     * This method returns the value of the database column `tb_device_gps_info`.location_status
     *
     * @return the value of `tb_device_gps_info`.location_status
     */
    public Integer getLocationStatus() {
        return locationStatus;
    }

    /**
     * This method sets the value of the database column `tb_device_gps_info`.location_status
     *
     * @param locationStatus the value for `tb_device_gps_info`.location_status
     */
    public void setLocationStatus(Integer locationStatus) {
        this.locationStatus = locationStatus;
    }

    /**
     * This method returns the value of the database column `tb_device_gps_info`.longitude
     *
     * @return the value of `tb_device_gps_info`.longitude
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * This method sets the value of the database column `tb_device_gps_info`.longitude
     *
     * @param longitude the value for `tb_device_gps_info`.longitude
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * This method returns the value of the database column `tb_device_gps_info`.latitude
     *
     * @return the value of `tb_device_gps_info`.latitude
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * This method sets the value of the database column `tb_device_gps_info`.latitude
     *
     * @param latitude the value for `tb_device_gps_info`.latitude
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * This method returns the value of the database column `tb_device_gps_info`.speed
     *
     * @return the value of `tb_device_gps_info`.speed
     */
    public Integer getSpeed() {
        return speed;
    }

    /**
     * This method sets the value of the database column `tb_device_gps_info`.speed
     *
     * @param speed the value for `tb_device_gps_info`.speed
     */
    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    /**
     * This method returns the value of the database column `tb_device_gps_info`.upload_time
     *
     * @return the value of `tb_device_gps_info`.upload_time
     */
    public Date getUploadTime() {
        return uploadTime;
    }

    /**
     * This method sets the value of the database column `tb_device_gps_info`.upload_time
     *
     * @param uploadTime the value for `tb_device_gps_info`.upload_time
     */
    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }
}