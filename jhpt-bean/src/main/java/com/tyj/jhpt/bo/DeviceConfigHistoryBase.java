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
 * This class corresponds to the database table `device_config_history`
 */
public abstract class DeviceConfigHistoryBase extends FieldAccessVo implements TableDataConvertable {
    /**
     * This field corresponds to the database column `device_config_history`.id
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field corresponds to the database column `device_config_history`.id
     */
    private static final String PROPERTY_REMARK_ID = "";

    /**
     * This field corresponds to the database column `device_config_history`.id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Integer id;

    /**
     * This field corresponds to the database column `device_config_history`.device_id
     */
    private static final String PROPERTY_DEVICEID = "deviceId";

    /**
     * This field corresponds to the database column `device_config_history`.device_id
     */
    private static final String PROPERTY_REMARK_DEVICEID = "设备ID";

    /**
     * This field corresponds to the database column `device_config_history`.device_id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_DEVICEID)
    private Integer deviceId;

    /**
     * This field corresponds to the database column `device_config_history`.override_video
     */
    private static final String PROPERTY_OVERRIDEVIDEO = "overrideVideo";

    /**
     * This field corresponds to the database column `device_config_history`.override_video
     */
    private static final String PROPERTY_REMARK_OVERRIDEVIDEO = "VD中的事故视频是否需要覆盖";

    /**
     * This field corresponds to the database column `device_config_history`.override_video
     */
    @ColumnDescription(desc = PROPERTY_REMARK_OVERRIDEVIDEO)
    private Byte overrideVideo;

    /**
     * This field corresponds to the database column `device_config_history`.car_type
     */
    private static final String PROPERTY_CARTYPE = "carType";

    /**
     * This field corresponds to the database column `device_config_history`.car_type
     */
    private static final String PROPERTY_REMARK_CARTYPE = "车辆类型";

    /**
     * This field corresponds to the database column `device_config_history`.car_type
     */
    @ColumnDescription(desc = PROPERTY_REMARK_CARTYPE)
    private Byte carType;

    /**
     * This field corresponds to the database column `device_config_history`.video_length_before_interrupt
     */
    private static final String PROPERTY_VIDEOLENGTHBEFOREINTERRUPT = "videoLengthBeforeInterrupt";

    /**
     * This field corresponds to the database column `device_config_history`.video_length_before_interrupt
     */
    private static final String PROPERTY_REMARK_VIDEOLENGTHBEFOREINTERRUPT = "中断信号前的视频时间长度";

    /**
     * This field corresponds to the database column `device_config_history`.video_length_before_interrupt
     */
    @ColumnDescription(desc = PROPERTY_REMARK_VIDEOLENGTHBEFOREINTERRUPT)
    private Byte videoLengthBeforeInterrupt;

    /**
     * This field corresponds to the database column `device_config_history`.video_length_after_interrupt
     */
    private static final String PROPERTY_VIDEOLENGTHAFTERINTERRUPT = "videoLengthAfterInterrupt";

    /**
     * This field corresponds to the database column `device_config_history`.video_length_after_interrupt
     */
    private static final String PROPERTY_REMARK_VIDEOLENGTHAFTERINTERRUPT = "中断信号后的视频时间长度";

    /**
     * This field corresponds to the database column `device_config_history`.video_length_after_interrupt
     */
    @ColumnDescription(desc = PROPERTY_REMARK_VIDEOLENGTHAFTERINTERRUPT)
    private Byte videoLengthAfterInterrupt;

    /**
     * This field corresponds to the database column `device_config_history`.gps_msg_send_interval
     */
    private static final String PROPERTY_GPSMSGSENDINTERVAL = "gpsMsgSendInterval";

    /**
     * This field corresponds to the database column `device_config_history`.gps_msg_send_interval
     */
    private static final String PROPERTY_REMARK_GPSMSGSENDINTERVAL = "3G激活设备GPS信息发送间隔";

    /**
     * This field corresponds to the database column `device_config_history`.gps_msg_send_interval
     */
    @ColumnDescription(desc = PROPERTY_REMARK_GPSMSGSENDINTERVAL)
    private Byte gpsMsgSendInterval;

    /**
     * This field corresponds to the database column `device_config_history`.create_time
     */
    private static final String PROPERTY_CREATETIME = "createTime";

    /**
     * This field corresponds to the database column `device_config_history`.create_time
     */
    private static final String PROPERTY_REMARK_CREATETIME = "消息创建时间";

    /**
     * This field corresponds to the database column `device_config_history`.create_time
     */
    @ColumnDescription(desc = PROPERTY_REMARK_CREATETIME)
    private Date createTime;

    /**
     * This field corresponds to the database column `device_config_history`.device_confirm_time
     */
    private static final String PROPERTY_DEVICECONFIRMTIME = "deviceConfirmTime";

    /**
     * This field corresponds to the database column `device_config_history`.device_confirm_time
     */
    private static final String PROPERTY_REMARK_DEVICECONFIRMTIME = "设备回复时间";

    /**
     * This field corresponds to the database column `device_config_history`.device_confirm_time
     */
    @ColumnDescription(desc = PROPERTY_REMARK_DEVICECONFIRMTIME)
    private Date deviceConfirmTime;

    /**
     * This field corresponds to the database column `device_config_history`.config_state
     */
    private static final String PROPERTY_CONFIGSTATE = "configState";

    /**
     * This field corresponds to the database column `device_config_history`.config_state
     */
    private static final String PROPERTY_REMARK_CONFIGSTATE = "配置状态";

    /**
     * This field corresponds to the database column `device_config_history`.config_state
     */
    @ColumnDescription(desc = PROPERTY_REMARK_CONFIGSTATE)
    private Integer configState;

    /**
     * This method returns the value of the database column `device_config_history`.id
     *
     * @return the value of `device_config_history`.id
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method sets the value of the database column `device_config_history`.id
     *
     * @param id the value for `device_config_history`.id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column `device_config_history`.device_id
     *
     * @return the value of `device_config_history`.device_id
     */
    public Integer getDeviceId() {
        return deviceId;
    }

    /**
     * This method sets the value of the database column `device_config_history`.device_id
     *
     * @param deviceId the value for `device_config_history`.device_id
     */
    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * This method returns the value of the database column `device_config_history`.override_video
     *
     * @return the value of `device_config_history`.override_video
     */
    public Byte getOverrideVideo() {
        return overrideVideo;
    }

    /**
     * This method sets the value of the database column `device_config_history`.override_video
     *
     * @param overrideVideo the value for `device_config_history`.override_video
     */
    public void setOverrideVideo(Byte overrideVideo) {
        this.overrideVideo = overrideVideo;
    }

    /**
     * This method returns the value of the database column `device_config_history`.car_type
     *
     * @return the value of `device_config_history`.car_type
     */
    public Byte getCarType() {
        return carType;
    }

    /**
     * This method sets the value of the database column `device_config_history`.car_type
     *
     * @param carType the value for `device_config_history`.car_type
     */
    public void setCarType(Byte carType) {
        this.carType = carType;
    }

    /**
     * This method returns the value of the database column `device_config_history`.video_length_before_interrupt
     *
     * @return the value of `device_config_history`.video_length_before_interrupt
     */
    public Byte getVideoLengthBeforeInterrupt() {
        return videoLengthBeforeInterrupt;
    }

    /**
     * This method sets the value of the database column `device_config_history`.video_length_before_interrupt
     *
     * @param videoLengthBeforeInterrupt the value for `device_config_history`.video_length_before_interrupt
     */
    public void setVideoLengthBeforeInterrupt(Byte videoLengthBeforeInterrupt) {
        this.videoLengthBeforeInterrupt = videoLengthBeforeInterrupt;
    }

    /**
     * This method returns the value of the database column `device_config_history`.video_length_after_interrupt
     *
     * @return the value of `device_config_history`.video_length_after_interrupt
     */
    public Byte getVideoLengthAfterInterrupt() {
        return videoLengthAfterInterrupt;
    }

    /**
     * This method sets the value of the database column `device_config_history`.video_length_after_interrupt
     *
     * @param videoLengthAfterInterrupt the value for `device_config_history`.video_length_after_interrupt
     */
    public void setVideoLengthAfterInterrupt(Byte videoLengthAfterInterrupt) {
        this.videoLengthAfterInterrupt = videoLengthAfterInterrupt;
    }

    /**
     * This method returns the value of the database column `device_config_history`.gps_msg_send_interval
     *
     * @return the value of `device_config_history`.gps_msg_send_interval
     */
    public Byte getGpsMsgSendInterval() {
        return gpsMsgSendInterval;
    }

    /**
     * This method sets the value of the database column `device_config_history`.gps_msg_send_interval
     *
     * @param gpsMsgSendInterval the value for `device_config_history`.gps_msg_send_interval
     */
    public void setGpsMsgSendInterval(Byte gpsMsgSendInterval) {
        this.gpsMsgSendInterval = gpsMsgSendInterval;
    }

    /**
     * This method returns the value of the database column `device_config_history`.create_time
     *
     * @return the value of `device_config_history`.create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method sets the value of the database column `device_config_history`.create_time
     *
     * @param createTime the value for `device_config_history`.create_time
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method returns the value of the database column `device_config_history`.device_confirm_time
     *
     * @return the value of `device_config_history`.device_confirm_time
     */
    public Date getDeviceConfirmTime() {
        return deviceConfirmTime;
    }

    /**
     * This method sets the value of the database column `device_config_history`.device_confirm_time
     *
     * @param deviceConfirmTime the value for `device_config_history`.device_confirm_time
     */
    public void setDeviceConfirmTime(Date deviceConfirmTime) {
        this.deviceConfirmTime = deviceConfirmTime;
    }

    /**
     * This method returns the value of the database column `device_config_history`.config_state
     *
     * @return the value of `device_config_history`.config_state
     */
    public Integer getConfigState() {
        return configState;
    }

    /**
     * This method sets the value of the database column `device_config_history`.config_state
     *
     * @param configState the value for `device_config_history`.config_state
     */
    public void setConfigState(Integer configState) {
        this.configState = configState;
    }
}