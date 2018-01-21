/*
 * Copyright (c) 2018. CK. All rights reserved.
 */

package com.tyj.jhpt.bo;

import com.github.fartherp.framework.core.dao.FieldAccessVo;
import com.github.fartherp.framework.core.dao.TableDataConvertable;
import com.github.fartherp.framework.core.dao.annotation.ColumnDescription;
import com.github.fartherp.framework.core.dao.annotation.Id;

/**
 * This class corresponds to the database table `tb_car_alarm`
 */
public abstract class CarAlarmBase extends FieldAccessVo implements TableDataConvertable {
    /**
     * This field corresponds to the database column `tb_car_alarm`.id
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field corresponds to the database column `tb_car_alarm`.id
     */
    private static final String PROPERTY_REMARK_ID = "自增ID";

    /**
     * This field corresponds to the database column `tb_car_alarm`.id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Long id;

    /**
     * This field corresponds to the database column `tb_car_alarm`.alarm_type
     */
    private static final String PROPERTY_ALARMTYPE = "alarmType";

    /**
     * This field corresponds to the database column `tb_car_alarm`.alarm_type
     */
    private static final String PROPERTY_REMARK_ALARMTYPE = "车辆告警信息类型";

    /**
     * This field corresponds to the database column `tb_car_alarm`.alarm_type
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ALARMTYPE)
    private Integer alarmType;

    /**
     * This field corresponds to the database column `tb_car_alarm`.alarm_body
     */
    private static final String PROPERTY_ALARMBODY = "alarmBody";

    /**
     * This field corresponds to the database column `tb_car_alarm`.alarm_body
     */
    private static final String PROPERTY_REMARK_ALARMBODY = "车辆告警信息体";

    /**
     * This field corresponds to the database column `tb_car_alarm`.alarm_body
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ALARMBODY)
    private Integer alarmBody;

    /**
     * This field corresponds to the database column `tb_car_alarm`.device_gps_info_id
     */
    private static final String PROPERTY_DEVICEGPSINFOID = "deviceGpsInfoId";

    /**
     * This field corresponds to the database column `tb_car_alarm`.device_gps_info_id
     */
    private static final String PROPERTY_REMARK_DEVICEGPSINFOID = "tb_device_gps_info的ID";

    /**
     * This field corresponds to the database column `tb_car_alarm`.device_gps_info_id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_DEVICEGPSINFOID)
    private Long deviceGpsInfoId;

    /**
     * This method returns the value of the database column `tb_car_alarm`.id
     *
     * @return the value of `tb_car_alarm`.id
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column `tb_car_alarm`.id
     *
     * @param id the value for `tb_car_alarm`.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column `tb_car_alarm`.alarm_type
     *
     * @return the value of `tb_car_alarm`.alarm_type
     */
    public Integer getAlarmType() {
        return alarmType;
    }

    /**
     * This method sets the value of the database column `tb_car_alarm`.alarm_type
     *
     * @param alarmType the value for `tb_car_alarm`.alarm_type
     */
    public void setAlarmType(Integer alarmType) {
        this.alarmType = alarmType;
    }

    /**
     * This method returns the value of the database column `tb_car_alarm`.alarm_body
     *
     * @return the value of `tb_car_alarm`.alarm_body
     */
    public Integer getAlarmBody() {
        return alarmBody;
    }

    /**
     * This method sets the value of the database column `tb_car_alarm`.alarm_body
     *
     * @param alarmBody the value for `tb_car_alarm`.alarm_body
     */
    public void setAlarmBody(Integer alarmBody) {
        this.alarmBody = alarmBody;
    }

    /**
     * This method returns the value of the database column `tb_car_alarm`.device_gps_info_id
     *
     * @return the value of `tb_car_alarm`.device_gps_info_id
     */
    public Long getDeviceGpsInfoId() {
        return deviceGpsInfoId;
    }

    /**
     * This method sets the value of the database column `tb_car_alarm`.device_gps_info_id
     *
     * @param deviceGpsInfoId the value for `tb_car_alarm`.device_gps_info_id
     */
    public void setDeviceGpsInfoId(Long deviceGpsInfoId) {
        this.deviceGpsInfoId = deviceGpsInfoId;
    }
}