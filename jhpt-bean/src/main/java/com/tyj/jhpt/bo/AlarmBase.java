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
 * This class corresponds to the database table `tb_alarm`
 */
public abstract class AlarmBase extends FieldAccessVo implements TableDataConvertable {
    /**
     * This field corresponds to the database column `tb_alarm`.id
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field corresponds to the database column `tb_alarm`.id
     */
    private static final String PROPERTY_REMARK_ID = "自增ID";

    /**
     * This field corresponds to the database column `tb_alarm`.id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Long id;

    /**
     * This field corresponds to the database column `tb_alarm`.car_vin
     */
    private static final String PROPERTY_CARVIN = "carVin";

    /**
     * This field corresponds to the database column `tb_alarm`.car_vin
     */
    private static final String PROPERTY_REMARK_CARVIN = "车辆vin";

    /**
     * This field corresponds to the database column `tb_alarm`.car_vin
     */
    @ColumnDescription(desc = PROPERTY_REMARK_CARVIN)
    private String carVin;

    /**
     * This field corresponds to the database column `tb_alarm`.event_time
     */
    private static final String PROPERTY_EVENTTIME = "eventTime";

    /**
     * This field corresponds to the database column `tb_alarm`.event_time
     */
    private static final String PROPERTY_REMARK_EVENTTIME = "数据采集时间";

    /**
     * This field corresponds to the database column `tb_alarm`.event_time
     */
    @ColumnDescription(desc = PROPERTY_REMARK_EVENTTIME)
    private Date eventTime;

    /**
     * This field corresponds to the database column `tb_alarm`.max_alarm_level
     */
    private static final String PROPERTY_MAXALARMLEVEL = "maxAlarmLevel";

    /**
     * This field corresponds to the database column `tb_alarm`.max_alarm_level
     */
    private static final String PROPERTY_REMARK_MAXALARMLEVEL = "最高报警等级";

    /**
     * This field corresponds to the database column `tb_alarm`.max_alarm_level
     */
    @ColumnDescription(desc = PROPERTY_REMARK_MAXALARMLEVEL)
    private Integer maxAlarmLevel;

    /**
     * This field corresponds to the database column `tb_alarm`.general_alarm
     */
    private static final String PROPERTY_GENERALALARM = "generalAlarm";

    /**
     * This field corresponds to the database column `tb_alarm`.general_alarm
     */
    private static final String PROPERTY_REMARK_GENERALALARM = "通用报警标志";

    /**
     * This field corresponds to the database column `tb_alarm`.general_alarm
     */
    @ColumnDescription(desc = PROPERTY_REMARK_GENERALALARM)
    private Double generalAlarm;

    /**
     * This field corresponds to the database column `tb_alarm`.bytes1
     */
    private static final String PROPERTY_BYTES1 = "bytes1";

    /**
     * This field corresponds to the database column `tb_alarm`.bytes1
     */
    private static final String PROPERTY_REMARK_BYTES1 = "可充电储能装置故障代码列表";

    /**
     * This field corresponds to the database column `tb_alarm`.bytes1
     */
    @ColumnDescription(desc = PROPERTY_REMARK_BYTES1)
    private byte[] bytes1;

    /**
     * This field corresponds to the database column `tb_alarm`.bytes2
     */
    private static final String PROPERTY_BYTES2 = "bytes2";

    /**
     * This field corresponds to the database column `tb_alarm`.bytes2
     */
    private static final String PROPERTY_REMARK_BYTES2 = "驱动电机故障代码列表";

    /**
     * This field corresponds to the database column `tb_alarm`.bytes2
     */
    @ColumnDescription(desc = PROPERTY_REMARK_BYTES2)
    private byte[] bytes2;

    /**
     * This field corresponds to the database column `tb_alarm`.bytes3
     */
    private static final String PROPERTY_BYTES3 = "bytes3";

    /**
     * This field corresponds to the database column `tb_alarm`.bytes3
     */
    private static final String PROPERTY_REMARK_BYTES3 = "发动机故障列表";

    /**
     * This field corresponds to the database column `tb_alarm`.bytes3
     */
    @ColumnDescription(desc = PROPERTY_REMARK_BYTES3)
    private byte[] bytes3;

    /**
     * This field corresponds to the database column `tb_alarm`.bytes4
     */
    private static final String PROPERTY_BYTES4 = "bytes4";

    /**
     * This field corresponds to the database column `tb_alarm`.bytes4
     */
    private static final String PROPERTY_REMARK_BYTES4 = "其他故障代码列表";

    /**
     * This field corresponds to the database column `tb_alarm`.bytes4
     */
    @ColumnDescription(desc = PROPERTY_REMARK_BYTES4)
    private byte[] bytes4;

    /**
     * This method returns the value of the database column `tb_alarm`.id
     *
     * @return the value of `tb_alarm`.id
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column `tb_alarm`.id
     *
     * @param id the value for `tb_alarm`.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column `tb_alarm`.car_vin
     *
     * @return the value of `tb_alarm`.car_vin
     */
    public String getCarVin() {
        return carVin;
    }

    /**
     * This method sets the value of the database column `tb_alarm`.car_vin
     *
     * @param carVin the value for `tb_alarm`.car_vin
     */
    public void setCarVin(String carVin) {
        this.carVin = carVin;
    }

    /**
     * This method returns the value of the database column `tb_alarm`.event_time
     *
     * @return the value of `tb_alarm`.event_time
     */
    public Date getEventTime() {
        return eventTime;
    }

    /**
     * This method sets the value of the database column `tb_alarm`.event_time
     *
     * @param eventTime the value for `tb_alarm`.event_time
     */
    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
    }

    /**
     * This method returns the value of the database column `tb_alarm`.max_alarm_level
     *
     * @return the value of `tb_alarm`.max_alarm_level
     */
    public Integer getMaxAlarmLevel() {
        return maxAlarmLevel;
    }

    /**
     * This method sets the value of the database column `tb_alarm`.max_alarm_level
     *
     * @param maxAlarmLevel the value for `tb_alarm`.max_alarm_level
     */
    public void setMaxAlarmLevel(Integer maxAlarmLevel) {
        this.maxAlarmLevel = maxAlarmLevel;
    }

    /**
     * This method returns the value of the database column `tb_alarm`.general_alarm
     *
     * @return the value of `tb_alarm`.general_alarm
     */
    public Double getGeneralAlarm() {
        return generalAlarm;
    }

    /**
     * This method sets the value of the database column `tb_alarm`.general_alarm
     *
     * @param generalAlarm the value for `tb_alarm`.general_alarm
     */
    public void setGeneralAlarm(Double generalAlarm) {
        this.generalAlarm = generalAlarm;
    }

    /**
     * This method returns the value of the database column `tb_alarm`.bytes1
     *
     * @return the value of `tb_alarm`.bytes1
     */
    public byte[] getBytes1() {
        return bytes1;
    }

    /**
     * This method sets the value of the database column `tb_alarm`.bytes1
     *
     * @param bytes1 the value for `tb_alarm`.bytes1
     */
    public void setBytes1(byte[] bytes1) {
        this.bytes1 = bytes1;
    }

    /**
     * This method returns the value of the database column `tb_alarm`.bytes2
     *
     * @return the value of `tb_alarm`.bytes2
     */
    public byte[] getBytes2() {
        return bytes2;
    }

    /**
     * This method sets the value of the database column `tb_alarm`.bytes2
     *
     * @param bytes2 the value for `tb_alarm`.bytes2
     */
    public void setBytes2(byte[] bytes2) {
        this.bytes2 = bytes2;
    }

    /**
     * This method returns the value of the database column `tb_alarm`.bytes3
     *
     * @return the value of `tb_alarm`.bytes3
     */
    public byte[] getBytes3() {
        return bytes3;
    }

    /**
     * This method sets the value of the database column `tb_alarm`.bytes3
     *
     * @param bytes3 the value for `tb_alarm`.bytes3
     */
    public void setBytes3(byte[] bytes3) {
        this.bytes3 = bytes3;
    }

    /**
     * This method returns the value of the database column `tb_alarm`.bytes4
     *
     * @return the value of `tb_alarm`.bytes4
     */
    public byte[] getBytes4() {
        return bytes4;
    }

    /**
     * This method sets the value of the database column `tb_alarm`.bytes4
     *
     * @param bytes4 the value for `tb_alarm`.bytes4
     */
    public void setBytes4(byte[] bytes4) {
        this.bytes4 = bytes4;
    }
}