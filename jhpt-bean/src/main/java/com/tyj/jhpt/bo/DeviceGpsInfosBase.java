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
 * This class corresponds to the database table `device_gps_infos`
 */
public abstract class DeviceGpsInfosBase extends FieldAccessVo implements TableDataConvertable {
    /**
     * This field corresponds to the database column `device_gps_infos`.id
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field corresponds to the database column `device_gps_infos`.id
     */
    private static final String PROPERTY_REMARK_ID = "";

    /**
     * This field corresponds to the database column `device_gps_infos`.id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Integer id;

    /**
     * This field corresponds to the database column `device_gps_infos`.device_id
     */
    private static final String PROPERTY_DEVICEID = "deviceId";

    /**
     * This field corresponds to the database column `device_gps_infos`.device_id
     */
    private static final String PROPERTY_REMARK_DEVICEID = "设备ID";

    /**
     * This field corresponds to the database column `device_gps_infos`.device_id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_DEVICEID)
    private Integer deviceId;

    /**
     * This field corresponds to the database column `device_gps_infos`.msg_id
     */
    private static final String PROPERTY_MSGID = "msgId";

    /**
     * This field corresponds to the database column `device_gps_infos`.msg_id
     */
    private static final String PROPERTY_REMARK_MSGID = "终端带的消息ID";

    /**
     * This field corresponds to the database column `device_gps_infos`.msg_id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_MSGID)
    private Integer msgId;

    /**
     * This field corresponds to the database column `device_gps_infos`.event_time
     */
    private static final String PROPERTY_EVENTTIME = "eventTime";

    /**
     * This field corresponds to the database column `device_gps_infos`.event_time
     */
    private static final String PROPERTY_REMARK_EVENTTIME = "数据采集时间";

    /**
     * This field corresponds to the database column `device_gps_infos`.event_time
     */
    @ColumnDescription(desc = PROPERTY_REMARK_EVENTTIME)
    private Date eventTime;

    /**
     * This field corresponds to the database column `device_gps_infos`.longitude
     */
    private static final String PROPERTY_LONGITUDE = "longitude";

    /**
     * This field corresponds to the database column `device_gps_infos`.longitude
     */
    private static final String PROPERTY_REMARK_LONGITUDE = "经度";

    /**
     * This field corresponds to the database column `device_gps_infos`.longitude
     */
    @ColumnDescription(desc = PROPERTY_REMARK_LONGITUDE)
    private Double longitude;

    /**
     * This field corresponds to the database column `device_gps_infos`.latitude
     */
    private static final String PROPERTY_LATITUDE = "latitude";

    /**
     * This field corresponds to the database column `device_gps_infos`.latitude
     */
    private static final String PROPERTY_REMARK_LATITUDE = "纬度";

    /**
     * This field corresponds to the database column `device_gps_infos`.latitude
     */
    @ColumnDescription(desc = PROPERTY_REMARK_LATITUDE)
    private Double latitude;

    /**
     * This field corresponds to the database column `device_gps_infos`.speed
     */
    private static final String PROPERTY_SPEED = "speed";

    /**
     * This field corresponds to the database column `device_gps_infos`.speed
     */
    private static final String PROPERTY_REMARK_SPEED = "车速";

    /**
     * This field corresponds to the database column `device_gps_infos`.speed
     */
    @ColumnDescription(desc = PROPERTY_REMARK_SPEED)
    private Integer speed;

    /**
     * This field corresponds to the database column `device_gps_infos`.msg_type
     */
    private static final String PROPERTY_MSGTYPE = "msgType";

    /**
     * This field corresponds to the database column `device_gps_infos`.msg_type
     */
    private static final String PROPERTY_REMARK_MSGTYPE = "告警类型";

    /**
     * This field corresponds to the database column `device_gps_infos`.msg_type
     */
    @ColumnDescription(desc = PROPERTY_REMARK_MSGTYPE)
    private Byte msgType;

    /**
     * This field corresponds to the database column `device_gps_infos`.flash_state
     */
    private static final String PROPERTY_FLASHSTATE = "flashState";

    /**
     * This field corresponds to the database column `device_gps_infos`.flash_state
     */
    private static final String PROPERTY_REMARK_FLASHSTATE = "设备flash状态";

    /**
     * This field corresponds to the database column `device_gps_infos`.flash_state
     */
    @ColumnDescription(desc = PROPERTY_REMARK_FLASHSTATE)
    private Byte flashState;

    /**
     * This field corresponds to the database column `device_gps_infos`.upload_time
     */
    private static final String PROPERTY_UPLOADTIME = "uploadTime";

    /**
     * This field corresponds to the database column `device_gps_infos`.upload_time
     */
    private static final String PROPERTY_REMARK_UPLOADTIME = "上传时间";

    /**
     * This field corresponds to the database column `device_gps_infos`.upload_time
     */
    @ColumnDescription(desc = PROPERTY_REMARK_UPLOADTIME)
    private Date uploadTime;

    /**
     * This field corresponds to the database column `device_gps_infos`.acceleration
     */
    private static final String PROPERTY_ACCELERATION = "acceleration";

    /**
     * This field corresponds to the database column `device_gps_infos`.acceleration
     */
    private static final String PROPERTY_REMARK_ACCELERATION = "";

    /**
     * This field corresponds to the database column `device_gps_infos`.acceleration
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ACCELERATION)
    private Float acceleration;

    /**
     * This field corresponds to the database column `device_gps_infos`.driver_person_id
     */
    private static final String PROPERTY_DRIVERPERSONID = "driverPersonId";

    /**
     * This field corresponds to the database column `device_gps_infos`.driver_person_id
     */
    private static final String PROPERTY_REMARK_DRIVERPERSONID = "驾驶员ID";

    /**
     * This field corresponds to the database column `device_gps_infos`.driver_person_id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_DRIVERPERSONID)
    private Integer driverPersonId;

    /**
     * This field corresponds to the database column `device_gps_infos`.km
     */
    private static final String PROPERTY_KM = "km";

    /**
     * This field corresponds to the database column `device_gps_infos`.km
     */
    private static final String PROPERTY_REMARK_KM = "公里数: KM";

    /**
     * This field corresponds to the database column `device_gps_infos`.km
     */
    @ColumnDescription(desc = PROPERTY_REMARK_KM)
    private Integer km;

    /**
     * This method returns the value of the database column `device_gps_infos`.id
     *
     * @return the value of `device_gps_infos`.id
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method sets the value of the database column `device_gps_infos`.id
     *
     * @param id the value for `device_gps_infos`.id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column `device_gps_infos`.device_id
     *
     * @return the value of `device_gps_infos`.device_id
     */
    public Integer getDeviceId() {
        return deviceId;
    }

    /**
     * This method sets the value of the database column `device_gps_infos`.device_id
     *
     * @param deviceId the value for `device_gps_infos`.device_id
     */
    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * This method returns the value of the database column `device_gps_infos`.msg_id
     *
     * @return the value of `device_gps_infos`.msg_id
     */
    public Integer getMsgId() {
        return msgId;
    }

    /**
     * This method sets the value of the database column `device_gps_infos`.msg_id
     *
     * @param msgId the value for `device_gps_infos`.msg_id
     */
    public void setMsgId(Integer msgId) {
        this.msgId = msgId;
    }

    /**
     * This method returns the value of the database column `device_gps_infos`.event_time
     *
     * @return the value of `device_gps_infos`.event_time
     */
    public Date getEventTime() {
        return eventTime;
    }

    /**
     * This method sets the value of the database column `device_gps_infos`.event_time
     *
     * @param eventTime the value for `device_gps_infos`.event_time
     */
    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
    }

    /**
     * This method returns the value of the database column `device_gps_infos`.longitude
     *
     * @return the value of `device_gps_infos`.longitude
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * This method sets the value of the database column `device_gps_infos`.longitude
     *
     * @param longitude the value for `device_gps_infos`.longitude
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * This method returns the value of the database column `device_gps_infos`.latitude
     *
     * @return the value of `device_gps_infos`.latitude
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * This method sets the value of the database column `device_gps_infos`.latitude
     *
     * @param latitude the value for `device_gps_infos`.latitude
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * This method returns the value of the database column `device_gps_infos`.speed
     *
     * @return the value of `device_gps_infos`.speed
     */
    public Integer getSpeed() {
        return speed;
    }

    /**
     * This method sets the value of the database column `device_gps_infos`.speed
     *
     * @param speed the value for `device_gps_infos`.speed
     */
    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    /**
     * This method returns the value of the database column `device_gps_infos`.msg_type
     *
     * @return the value of `device_gps_infos`.msg_type
     */
    public Byte getMsgType() {
        return msgType;
    }

    /**
     * This method sets the value of the database column `device_gps_infos`.msg_type
     *
     * @param msgType the value for `device_gps_infos`.msg_type
     */
    public void setMsgType(Byte msgType) {
        this.msgType = msgType;
    }

    /**
     * This method returns the value of the database column `device_gps_infos`.flash_state
     *
     * @return the value of `device_gps_infos`.flash_state
     */
    public Byte getFlashState() {
        return flashState;
    }

    /**
     * This method sets the value of the database column `device_gps_infos`.flash_state
     *
     * @param flashState the value for `device_gps_infos`.flash_state
     */
    public void setFlashState(Byte flashState) {
        this.flashState = flashState;
    }

    /**
     * This method returns the value of the database column `device_gps_infos`.upload_time
     *
     * @return the value of `device_gps_infos`.upload_time
     */
    public Date getUploadTime() {
        return uploadTime;
    }

    /**
     * This method sets the value of the database column `device_gps_infos`.upload_time
     *
     * @param uploadTime the value for `device_gps_infos`.upload_time
     */
    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    /**
     * This method returns the value of the database column `device_gps_infos`.acceleration
     *
     * @return the value of `device_gps_infos`.acceleration
     */
    public Float getAcceleration() {
        return acceleration;
    }

    /**
     * This method sets the value of the database column `device_gps_infos`.acceleration
     *
     * @param acceleration the value for `device_gps_infos`.acceleration
     */
    public void setAcceleration(Float acceleration) {
        this.acceleration = acceleration;
    }

    /**
     * This method returns the value of the database column `device_gps_infos`.driver_person_id
     *
     * @return the value of `device_gps_infos`.driver_person_id
     */
    public Integer getDriverPersonId() {
        return driverPersonId;
    }

    /**
     * This method sets the value of the database column `device_gps_infos`.driver_person_id
     *
     * @param driverPersonId the value for `device_gps_infos`.driver_person_id
     */
    public void setDriverPersonId(Integer driverPersonId) {
        this.driverPersonId = driverPersonId;
    }

    /**
     * This method returns the value of the database column `device_gps_infos`.km
     *
     * @return the value of `device_gps_infos`.km
     */
    public Integer getKm() {
        return km;
    }

    /**
     * This method sets the value of the database column `device_gps_infos`.km
     *
     * @param km the value for `device_gps_infos`.km
     */
    public void setKm(Integer km) {
        this.km = km;
    }
}