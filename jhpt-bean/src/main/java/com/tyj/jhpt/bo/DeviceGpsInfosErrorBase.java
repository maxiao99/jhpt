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
 * This class corresponds to the database table `device_gps_infos_error`
 */
public abstract class DeviceGpsInfosErrorBase extends FieldAccessVo implements TableDataConvertable {
    /**
     * This field corresponds to the database column `device_gps_infos_error`.id
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field corresponds to the database column `device_gps_infos_error`.id
     */
    private static final String PROPERTY_REMARK_ID = "";

    /**
     * This field corresponds to the database column `device_gps_infos_error`.id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Integer id;

    /**
     * This field corresponds to the database column `device_gps_infos_error`.device_id
     */
    private static final String PROPERTY_DEVICEID = "deviceId";

    /**
     * This field corresponds to the database column `device_gps_infos_error`.device_id
     */
    private static final String PROPERTY_REMARK_DEVICEID = "设备ID";

    /**
     * This field corresponds to the database column `device_gps_infos_error`.device_id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_DEVICEID)
    private Integer deviceId;

    /**
     * This field corresponds to the database column `device_gps_infos_error`.msg_id
     */
    private static final String PROPERTY_MSGID = "msgId";

    /**
     * This field corresponds to the database column `device_gps_infos_error`.msg_id
     */
    private static final String PROPERTY_REMARK_MSGID = "终端带的消息ID";

    /**
     * This field corresponds to the database column `device_gps_infos_error`.msg_id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_MSGID)
    private Integer msgId;

    /**
     * This field corresponds to the database column `device_gps_infos_error`.event_time
     */
    private static final String PROPERTY_EVENTTIME = "eventTime";

    /**
     * This field corresponds to the database column `device_gps_infos_error`.event_time
     */
    private static final String PROPERTY_REMARK_EVENTTIME = "数据采集时间";

    /**
     * This field corresponds to the database column `device_gps_infos_error`.event_time
     */
    @ColumnDescription(desc = PROPERTY_REMARK_EVENTTIME)
    private Date eventTime;

    /**
     * This field corresponds to the database column `device_gps_infos_error`.longitude
     */
    private static final String PROPERTY_LONGITUDE = "longitude";

    /**
     * This field corresponds to the database column `device_gps_infos_error`.longitude
     */
    private static final String PROPERTY_REMARK_LONGITUDE = "经度";

    /**
     * This field corresponds to the database column `device_gps_infos_error`.longitude
     */
    @ColumnDescription(desc = PROPERTY_REMARK_LONGITUDE)
    private Double longitude;

    /**
     * This field corresponds to the database column `device_gps_infos_error`.latitude
     */
    private static final String PROPERTY_LATITUDE = "latitude";

    /**
     * This field corresponds to the database column `device_gps_infos_error`.latitude
     */
    private static final String PROPERTY_REMARK_LATITUDE = "纬度";

    /**
     * This field corresponds to the database column `device_gps_infos_error`.latitude
     */
    @ColumnDescription(desc = PROPERTY_REMARK_LATITUDE)
    private Double latitude;

    /**
     * This field corresponds to the database column `device_gps_infos_error`.speed
     */
    private static final String PROPERTY_SPEED = "speed";

    /**
     * This field corresponds to the database column `device_gps_infos_error`.speed
     */
    private static final String PROPERTY_REMARK_SPEED = "车速";

    /**
     * This field corresponds to the database column `device_gps_infos_error`.speed
     */
    @ColumnDescription(desc = PROPERTY_REMARK_SPEED)
    private Byte speed;

    /**
     * This field corresponds to the database column `device_gps_infos_error`.msg_type
     */
    private static final String PROPERTY_MSGTYPE = "msgType";

    /**
     * This field corresponds to the database column `device_gps_infos_error`.msg_type
     */
    private static final String PROPERTY_REMARK_MSGTYPE = "告警类型";

    /**
     * This field corresponds to the database column `device_gps_infos_error`.msg_type
     */
    @ColumnDescription(desc = PROPERTY_REMARK_MSGTYPE)
    private Byte msgType;

    /**
     * This field corresponds to the database column `device_gps_infos_error`.flash_state
     */
    private static final String PROPERTY_FLASHSTATE = "flashState";

    /**
     * This field corresponds to the database column `device_gps_infos_error`.flash_state
     */
    private static final String PROPERTY_REMARK_FLASHSTATE = "设备flash状态（正常为00，当FLASH存储空间饱和为FF）";

    /**
     * This field corresponds to the database column `device_gps_infos_error`.flash_state
     */
    @ColumnDescription(desc = PROPERTY_REMARK_FLASHSTATE)
    private Byte flashState;

    /**
     * This field corresponds to the database column `device_gps_infos_error`.upload_time
     */
    private static final String PROPERTY_UPLOADTIME = "uploadTime";

    /**
     * This field corresponds to the database column `device_gps_infos_error`.upload_time
     */
    private static final String PROPERTY_REMARK_UPLOADTIME = "上传时间";

    /**
     * This field corresponds to the database column `device_gps_infos_error`.upload_time
     */
    @ColumnDescription(desc = PROPERTY_REMARK_UPLOADTIME)
    private Date uploadTime;

    /**
     * This field corresponds to the database column `device_gps_infos_error`.acceleration
     */
    private static final String PROPERTY_ACCELERATION = "acceleration";

    /**
     * This field corresponds to the database column `device_gps_infos_error`.acceleration
     */
    private static final String PROPERTY_REMARK_ACCELERATION = "加速度";

    /**
     * This field corresponds to the database column `device_gps_infos_error`.acceleration
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ACCELERATION)
    private Float acceleration;

    /**
     * This method returns the value of the database column `device_gps_infos_error`.id
     *
     * @return the value of `device_gps_infos_error`.id
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method sets the value of the database column `device_gps_infos_error`.id
     *
     * @param id the value for `device_gps_infos_error`.id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column `device_gps_infos_error`.device_id
     *
     * @return the value of `device_gps_infos_error`.device_id
     */
    public Integer getDeviceId() {
        return deviceId;
    }

    /**
     * This method sets the value of the database column `device_gps_infos_error`.device_id
     *
     * @param deviceId the value for `device_gps_infos_error`.device_id
     */
    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * This method returns the value of the database column `device_gps_infos_error`.msg_id
     *
     * @return the value of `device_gps_infos_error`.msg_id
     */
    public Integer getMsgId() {
        return msgId;
    }

    /**
     * This method sets the value of the database column `device_gps_infos_error`.msg_id
     *
     * @param msgId the value for `device_gps_infos_error`.msg_id
     */
    public void setMsgId(Integer msgId) {
        this.msgId = msgId;
    }

    /**
     * This method returns the value of the database column `device_gps_infos_error`.event_time
     *
     * @return the value of `device_gps_infos_error`.event_time
     */
    public Date getEventTime() {
        return eventTime;
    }

    /**
     * This method sets the value of the database column `device_gps_infos_error`.event_time
     *
     * @param eventTime the value for `device_gps_infos_error`.event_time
     */
    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
    }

    /**
     * This method returns the value of the database column `device_gps_infos_error`.longitude
     *
     * @return the value of `device_gps_infos_error`.longitude
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * This method sets the value of the database column `device_gps_infos_error`.longitude
     *
     * @param longitude the value for `device_gps_infos_error`.longitude
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * This method returns the value of the database column `device_gps_infos_error`.latitude
     *
     * @return the value of `device_gps_infos_error`.latitude
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * This method sets the value of the database column `device_gps_infos_error`.latitude
     *
     * @param latitude the value for `device_gps_infos_error`.latitude
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * This method returns the value of the database column `device_gps_infos_error`.speed
     *
     * @return the value of `device_gps_infos_error`.speed
     */
    public Byte getSpeed() {
        return speed;
    }

    /**
     * This method sets the value of the database column `device_gps_infos_error`.speed
     *
     * @param speed the value for `device_gps_infos_error`.speed
     */
    public void setSpeed(Byte speed) {
        this.speed = speed;
    }

    /**
     * This method returns the value of the database column `device_gps_infos_error`.msg_type
     *
     * @return the value of `device_gps_infos_error`.msg_type
     */
    public Byte getMsgType() {
        return msgType;
    }

    /**
     * This method sets the value of the database column `device_gps_infos_error`.msg_type
     *
     * @param msgType the value for `device_gps_infos_error`.msg_type
     */
    public void setMsgType(Byte msgType) {
        this.msgType = msgType;
    }

    /**
     * This method returns the value of the database column `device_gps_infos_error`.flash_state
     *
     * @return the value of `device_gps_infos_error`.flash_state
     */
    public Byte getFlashState() {
        return flashState;
    }

    /**
     * This method sets the value of the database column `device_gps_infos_error`.flash_state
     *
     * @param flashState the value for `device_gps_infos_error`.flash_state
     */
    public void setFlashState(Byte flashState) {
        this.flashState = flashState;
    }

    /**
     * This method returns the value of the database column `device_gps_infos_error`.upload_time
     *
     * @return the value of `device_gps_infos_error`.upload_time
     */
    public Date getUploadTime() {
        return uploadTime;
    }

    /**
     * This method sets the value of the database column `device_gps_infos_error`.upload_time
     *
     * @param uploadTime the value for `device_gps_infos_error`.upload_time
     */
    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    /**
     * This method returns the value of the database column `device_gps_infos_error`.acceleration
     *
     * @return the value of `device_gps_infos_error`.acceleration
     */
    public Float getAcceleration() {
        return acceleration;
    }

    /**
     * This method sets the value of the database column `device_gps_infos_error`.acceleration
     *
     * @param acceleration the value for `device_gps_infos_error`.acceleration
     */
    public void setAcceleration(Float acceleration) {
        this.acceleration = acceleration;
    }
}