/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.bo;

import com.github.fartherp.framework.core.dao.FieldAccessVo;
import com.github.fartherp.framework.core.dao.TableDataConvertable;
import com.github.fartherp.framework.core.dao.annotation.ColumnDescription;
import com.github.fartherp.framework.core.dao.annotation.Id;
import java.util.Date;

/**
 * This class corresponds to the database table `tb_qudong_dianji`
 */
public abstract class QudongDianjiBase extends FieldAccessVo implements TableDataConvertable {
    /**
     * This field corresponds to the database column `tb_qudong_dianji`.id
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field corresponds to the database column `tb_qudong_dianji`.id
     */
    private static final String PROPERTY_REMARK_ID = "自增ID";

    /**
     * This field corresponds to the database column `tb_qudong_dianji`.id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Long id;

    /**
     * This field corresponds to the database column `tb_qudong_dianji`.car_vin
     */
    private static final String PROPERTY_CARVIN = "carVin";

    /**
     * This field corresponds to the database column `tb_qudong_dianji`.car_vin
     */
    private static final String PROPERTY_REMARK_CARVIN = "车辆vin";

    /**
     * This field corresponds to the database column `tb_qudong_dianji`.car_vin
     */
    @ColumnDescription(desc = PROPERTY_REMARK_CARVIN)
    private String carVin;

    /**
     * This field corresponds to the database column `tb_qudong_dianji`.event_time
     */
    private static final String PROPERTY_EVENTTIME = "eventTime";

    /**
     * This field corresponds to the database column `tb_qudong_dianji`.event_time
     */
    private static final String PROPERTY_REMARK_EVENTTIME = "数据采集时间";

    /**
     * This field corresponds to the database column `tb_qudong_dianji`.event_time
     */
    @ColumnDescription(desc = PROPERTY_REMARK_EVENTTIME)
    private Date eventTime;

    /**
     * This field corresponds to the database column `tb_qudong_dianji`.seq
     */
    private static final String PROPERTY_SEQ = "seq";

    /**
     * This field corresponds to the database column `tb_qudong_dianji`.seq
     */
    private static final String PROPERTY_REMARK_SEQ = "驱动电机序号";

    /**
     * This field corresponds to the database column `tb_qudong_dianji`.seq
     */
    @ColumnDescription(desc = PROPERTY_REMARK_SEQ)
    private Byte seq;

    /**
     * This field corresponds to the database column `tb_qudong_dianji`.status
     */
    private static final String PROPERTY_STATUS = "status";

    /**
     * This field corresponds to the database column `tb_qudong_dianji`.status
     */
    private static final String PROPERTY_REMARK_STATUS = "驱动电机状态";

    /**
     * This field corresponds to the database column `tb_qudong_dianji`.status
     */
    @ColumnDescription(desc = PROPERTY_REMARK_STATUS)
    private Byte status;

    /**
     * This field corresponds to the database column `tb_qudong_dianji`.control_temperature
     */
    private static final String PROPERTY_CONTROLTEMPERATURE = "controlTemperature";

    /**
     * This field corresponds to the database column `tb_qudong_dianji`.control_temperature
     */
    private static final String PROPERTY_REMARK_CONTROLTEMPERATURE = "驱动电机控制器温度";

    /**
     * This field corresponds to the database column `tb_qudong_dianji`.control_temperature
     */
    @ColumnDescription(desc = PROPERTY_REMARK_CONTROLTEMPERATURE)
    private Byte controlTemperature;

    /**
     * This field corresponds to the database column `tb_qudong_dianji`.speed
     */
    private static final String PROPERTY_SPEED = "speed";

    /**
     * This field corresponds to the database column `tb_qudong_dianji`.speed
     */
    private static final String PROPERTY_REMARK_SPEED = "驱动电机转速";

    /**
     * This field corresponds to the database column `tb_qudong_dianji`.speed
     */
    @ColumnDescription(desc = PROPERTY_REMARK_SPEED)
    private Integer speed;

    /**
     * This field corresponds to the database column `tb_qudong_dianji`.zhuanju
     */
    private static final String PROPERTY_ZHUANJU = "zhuanju";

    /**
     * This field corresponds to the database column `tb_qudong_dianji`.zhuanju
     */
    private static final String PROPERTY_REMARK_ZHUANJU = "驱动电机转矩";

    /**
     * This field corresponds to the database column `tb_qudong_dianji`.zhuanju
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ZHUANJU)
    private Integer zhuanju;

    /**
     * This field corresponds to the database column `tb_qudong_dianji`.temperature
     */
    private static final String PROPERTY_TEMPERATURE = "temperature";

    /**
     * This field corresponds to the database column `tb_qudong_dianji`.temperature
     */
    private static final String PROPERTY_REMARK_TEMPERATURE = "驱动电机温度";

    /**
     * This field corresponds to the database column `tb_qudong_dianji`.temperature
     */
    @ColumnDescription(desc = PROPERTY_REMARK_TEMPERATURE)
    private Byte temperature;

    /**
     * This field corresponds to the database column `tb_qudong_dianji`.dianya
     */
    private static final String PROPERTY_DIANYA = "dianya";

    /**
     * This field corresponds to the database column `tb_qudong_dianji`.dianya
     */
    private static final String PROPERTY_REMARK_DIANYA = "电机控制器输入电压";

    /**
     * This field corresponds to the database column `tb_qudong_dianji`.dianya
     */
    @ColumnDescription(desc = PROPERTY_REMARK_DIANYA)
    private Integer dianya;

    /**
     * This field corresponds to the database column `tb_qudong_dianji`.dianliu
     */
    private static final String PROPERTY_DIANLIU = "dianliu";

    /**
     * This field corresponds to the database column `tb_qudong_dianji`.dianliu
     */
    private static final String PROPERTY_REMARK_DIANLIU = "电机控制器直流母线母线电流";

    /**
     * This field corresponds to the database column `tb_qudong_dianji`.dianliu
     */
    @ColumnDescription(desc = PROPERTY_REMARK_DIANLIU)
    private Integer dianliu;

    /**
     * This method returns the value of the database column `tb_qudong_dianji`.id
     *
     * @return the value of `tb_qudong_dianji`.id
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column `tb_qudong_dianji`.id
     *
     * @param id the value for `tb_qudong_dianji`.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column `tb_qudong_dianji`.car_vin
     *
     * @return the value of `tb_qudong_dianji`.car_vin
     */
    public String getCarVin() {
        return carVin;
    }

    /**
     * This method sets the value of the database column `tb_qudong_dianji`.car_vin
     *
     * @param carVin the value for `tb_qudong_dianji`.car_vin
     */
    public void setCarVin(String carVin) {
        this.carVin = carVin;
    }

    /**
     * This method returns the value of the database column `tb_qudong_dianji`.event_time
     *
     * @return the value of `tb_qudong_dianji`.event_time
     */
    public Date getEventTime() {
        return eventTime;
    }

    /**
     * This method sets the value of the database column `tb_qudong_dianji`.event_time
     *
     * @param eventTime the value for `tb_qudong_dianji`.event_time
     */
    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
    }

    /**
     * This method returns the value of the database column `tb_qudong_dianji`.seq
     *
     * @return the value of `tb_qudong_dianji`.seq
     */
    public Byte getSeq() {
        return seq;
    }

    /**
     * This method sets the value of the database column `tb_qudong_dianji`.seq
     *
     * @param seq the value for `tb_qudong_dianji`.seq
     */
    public void setSeq(Byte seq) {
        this.seq = seq;
    }

    /**
     * This method returns the value of the database column `tb_qudong_dianji`.status
     *
     * @return the value of `tb_qudong_dianji`.status
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method sets the value of the database column `tb_qudong_dianji`.status
     *
     * @param status the value for `tb_qudong_dianji`.status
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method returns the value of the database column `tb_qudong_dianji`.control_temperature
     *
     * @return the value of `tb_qudong_dianji`.control_temperature
     */
    public Byte getControlTemperature() {
        return controlTemperature;
    }

    /**
     * This method sets the value of the database column `tb_qudong_dianji`.control_temperature
     *
     * @param controlTemperature the value for `tb_qudong_dianji`.control_temperature
     */
    public void setControlTemperature(Byte controlTemperature) {
        this.controlTemperature = controlTemperature;
    }

    /**
     * This method returns the value of the database column `tb_qudong_dianji`.speed
     *
     * @return the value of `tb_qudong_dianji`.speed
     */
    public Integer getSpeed() {
        return speed;
    }

    /**
     * This method sets the value of the database column `tb_qudong_dianji`.speed
     *
     * @param speed the value for `tb_qudong_dianji`.speed
     */
    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    /**
     * This method returns the value of the database column `tb_qudong_dianji`.zhuanju
     *
     * @return the value of `tb_qudong_dianji`.zhuanju
     */
    public Integer getZhuanju() {
        return zhuanju;
    }

    /**
     * This method sets the value of the database column `tb_qudong_dianji`.zhuanju
     *
     * @param zhuanju the value for `tb_qudong_dianji`.zhuanju
     */
    public void setZhuanju(Integer zhuanju) {
        this.zhuanju = zhuanju;
    }

    /**
     * This method returns the value of the database column `tb_qudong_dianji`.temperature
     *
     * @return the value of `tb_qudong_dianji`.temperature
     */
    public Byte getTemperature() {
        return temperature;
    }

    /**
     * This method sets the value of the database column `tb_qudong_dianji`.temperature
     *
     * @param temperature the value for `tb_qudong_dianji`.temperature
     */
    public void setTemperature(Byte temperature) {
        this.temperature = temperature;
    }

    /**
     * This method returns the value of the database column `tb_qudong_dianji`.dianya
     *
     * @return the value of `tb_qudong_dianji`.dianya
     */
    public Integer getDianya() {
        return dianya;
    }

    /**
     * This method sets the value of the database column `tb_qudong_dianji`.dianya
     *
     * @param dianya the value for `tb_qudong_dianji`.dianya
     */
    public void setDianya(Integer dianya) {
        this.dianya = dianya;
    }

    /**
     * This method returns the value of the database column `tb_qudong_dianji`.dianliu
     *
     * @return the value of `tb_qudong_dianji`.dianliu
     */
    public Integer getDianliu() {
        return dianliu;
    }

    /**
     * This method sets the value of the database column `tb_qudong_dianji`.dianliu
     *
     * @param dianliu the value for `tb_qudong_dianji`.dianliu
     */
    public void setDianliu(Integer dianliu) {
        this.dianliu = dianliu;
    }
}