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
 * This class corresponds to the database table `tb_ranliao_dianchi`
 */
public abstract class RanliaoDianchiBase extends FieldAccessVo implements TableDataConvertable {
    /**
     * This field corresponds to the database column `tb_ranliao_dianchi`.id
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field corresponds to the database column `tb_ranliao_dianchi`.id
     */
    private static final String PROPERTY_REMARK_ID = "自增ID";

    /**
     * This field corresponds to the database column `tb_ranliao_dianchi`.id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Long id;

    /**
     * This field corresponds to the database column `tb_ranliao_dianchi`.car_vin
     */
    private static final String PROPERTY_CARVIN = "carVin";

    /**
     * This field corresponds to the database column `tb_ranliao_dianchi`.car_vin
     */
    private static final String PROPERTY_REMARK_CARVIN = "车辆vin";

    /**
     * This field corresponds to the database column `tb_ranliao_dianchi`.car_vin
     */
    @ColumnDescription(desc = PROPERTY_REMARK_CARVIN)
    private String carVin;

    /**
     * This field corresponds to the database column `tb_ranliao_dianchi`.event_time
     */
    private static final String PROPERTY_EVENTTIME = "eventTime";

    /**
     * This field corresponds to the database column `tb_ranliao_dianchi`.event_time
     */
    private static final String PROPERTY_REMARK_EVENTTIME = "数据采集时间";

    /**
     * This field corresponds to the database column `tb_ranliao_dianchi`.event_time
     */
    @ColumnDescription(desc = PROPERTY_REMARK_EVENTTIME)
    private Date eventTime;

    /**
     * This field corresponds to the database column `tb_ranliao_dianchi`.dianya
     */
    private static final String PROPERTY_DIANYA = "dianya";

    /**
     * This field corresponds to the database column `tb_ranliao_dianchi`.dianya
     */
    private static final String PROPERTY_REMARK_DIANYA = "燃料电池电压";

    /**
     * This field corresponds to the database column `tb_ranliao_dianchi`.dianya
     */
    @ColumnDescription(desc = PROPERTY_REMARK_DIANYA)
    private Integer dianya;

    /**
     * This field corresponds to the database column `tb_ranliao_dianchi`.dianliu
     */
    private static final String PROPERTY_DIANLIU = "dianliu";

    /**
     * This field corresponds to the database column `tb_ranliao_dianchi`.dianliu
     */
    private static final String PROPERTY_REMARK_DIANLIU = "燃料电池电流";

    /**
     * This field corresponds to the database column `tb_ranliao_dianchi`.dianliu
     */
    @ColumnDescription(desc = PROPERTY_REMARK_DIANLIU)
    private Integer dianliu;

    /**
     * This field corresponds to the database column `tb_ranliao_dianchi`.xiaohaolv
     */
    private static final String PROPERTY_XIAOHAOLV = "xiaohaolv";

    /**
     * This field corresponds to the database column `tb_ranliao_dianchi`.xiaohaolv
     */
    private static final String PROPERTY_REMARK_XIAOHAOLV = "燃料消耗率";

    /**
     * This field corresponds to the database column `tb_ranliao_dianchi`.xiaohaolv
     */
    @ColumnDescription(desc = PROPERTY_REMARK_XIAOHAOLV)
    private Integer xiaohaolv;

    /**
     * This field corresponds to the database column `tb_ranliao_dianchi`.tanzhen_total
     */
    private static final String PROPERTY_TANZHENTOTAL = "tanzhenTotal";

    /**
     * This field corresponds to the database column `tb_ranliao_dianchi`.tanzhen_total
     */
    private static final String PROPERTY_REMARK_TANZHENTOTAL = "燃料电池温度探针总数";

    /**
     * This field corresponds to the database column `tb_ranliao_dianchi`.tanzhen_total
     */
    @ColumnDescription(desc = PROPERTY_REMARK_TANZHENTOTAL)
    private Integer tanzhenTotal;

    /**
     * This field corresponds to the database column `tb_ranliao_dianchi`.temperature
     */
    private static final String PROPERTY_TEMPERATURE = "temperature";

    /**
     * This field corresponds to the database column `tb_ranliao_dianchi`.temperature
     */
    private static final String PROPERTY_REMARK_TEMPERATURE = "探针温度值";

    /**
     * This field corresponds to the database column `tb_ranliao_dianchi`.temperature
     */
    @ColumnDescription(desc = PROPERTY_REMARK_TEMPERATURE)
    private byte[] temperature;

    /**
     * This field corresponds to the database column `tb_ranliao_dianchi`.max_temperature
     */
    private static final String PROPERTY_MAXTEMPERATURE = "maxTemperature";

    /**
     * This field corresponds to the database column `tb_ranliao_dianchi`.max_temperature
     */
    private static final String PROPERTY_REMARK_MAXTEMPERATURE = "氢系统中最高温度";

    /**
     * This field corresponds to the database column `tb_ranliao_dianchi`.max_temperature
     */
    @ColumnDescription(desc = PROPERTY_REMARK_MAXTEMPERATURE)
    private Integer maxTemperature;

    /**
     * This field corresponds to the database column `tb_ranliao_dianchi`.max_tanzhen_no
     */
    private static final String PROPERTY_MAXTANZHENNO = "maxTanzhenNo";

    /**
     * This field corresponds to the database column `tb_ranliao_dianchi`.max_tanzhen_no
     */
    private static final String PROPERTY_REMARK_MAXTANZHENNO = "氢系统中最高温度探针代号";

    /**
     * This field corresponds to the database column `tb_ranliao_dianchi`.max_tanzhen_no
     */
    @ColumnDescription(desc = PROPERTY_REMARK_MAXTANZHENNO)
    private Integer maxTanzhenNo;

    /**
     * This field corresponds to the database column `tb_ranliao_dianchi`.max_concentration
     */
    private static final String PROPERTY_MAXCONCENTRATION = "maxConcentration";

    /**
     * This field corresponds to the database column `tb_ranliao_dianchi`.max_concentration
     */
    private static final String PROPERTY_REMARK_MAXCONCENTRATION = "氢气最高浓度";

    /**
     * This field corresponds to the database column `tb_ranliao_dianchi`.max_concentration
     */
    @ColumnDescription(desc = PROPERTY_REMARK_MAXCONCENTRATION)
    private Integer maxConcentration;

    /**
     * This field corresponds to the database column `tb_ranliao_dianchi`.max_concentration_no
     */
    private static final String PROPERTY_MAXCONCENTRATIONNO = "maxConcentrationNo";

    /**
     * This field corresponds to the database column `tb_ranliao_dianchi`.max_concentration_no
     */
    private static final String PROPERTY_REMARK_MAXCONCENTRATIONNO = "氢气最高浓度传感器代号";

    /**
     * This field corresponds to the database column `tb_ranliao_dianchi`.max_concentration_no
     */
    @ColumnDescription(desc = PROPERTY_REMARK_MAXCONCENTRATIONNO)
    private Integer maxConcentrationNo;

    /**
     * This field corresponds to the database column `tb_ranliao_dianchi`.max_pressure
     */
    private static final String PROPERTY_MAXPRESSURE = "maxPressure";

    /**
     * This field corresponds to the database column `tb_ranliao_dianchi`.max_pressure
     */
    private static final String PROPERTY_REMARK_MAXPRESSURE = "氢气最高压力";

    /**
     * This field corresponds to the database column `tb_ranliao_dianchi`.max_pressure
     */
    @ColumnDescription(desc = PROPERTY_REMARK_MAXPRESSURE)
    private Integer maxPressure;

    /**
     * This field corresponds to the database column `tb_ranliao_dianchi`.max_pressure_no
     */
    private static final String PROPERTY_MAXPRESSURENO = "maxPressureNo";

    /**
     * This field corresponds to the database column `tb_ranliao_dianchi`.max_pressure_no
     */
    private static final String PROPERTY_REMARK_MAXPRESSURENO = "氢气最高压力传感器代号";

    /**
     * This field corresponds to the database column `tb_ranliao_dianchi`.max_pressure_no
     */
    @ColumnDescription(desc = PROPERTY_REMARK_MAXPRESSURENO)
    private Integer maxPressureNo;

    /**
     * This field corresponds to the database column `tb_ranliao_dianchi`.dc_status
     */
    private static final String PROPERTY_DCSTATUS = "dcStatus";

    /**
     * This field corresponds to the database column `tb_ranliao_dianchi`.dc_status
     */
    private static final String PROPERTY_REMARK_DCSTATUS = "高压DC/DC状态";

    /**
     * This field corresponds to the database column `tb_ranliao_dianchi`.dc_status
     */
    @ColumnDescription(desc = PROPERTY_REMARK_DCSTATUS)
    private Integer dcStatus;

    /**
     * This method returns the value of the database column `tb_ranliao_dianchi`.id
     *
     * @return the value of `tb_ranliao_dianchi`.id
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column `tb_ranliao_dianchi`.id
     *
     * @param id the value for `tb_ranliao_dianchi`.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column `tb_ranliao_dianchi`.car_vin
     *
     * @return the value of `tb_ranliao_dianchi`.car_vin
     */
    public String getCarVin() {
        return carVin;
    }

    /**
     * This method sets the value of the database column `tb_ranliao_dianchi`.car_vin
     *
     * @param carVin the value for `tb_ranliao_dianchi`.car_vin
     */
    public void setCarVin(String carVin) {
        this.carVin = carVin;
    }

    /**
     * This method returns the value of the database column `tb_ranliao_dianchi`.event_time
     *
     * @return the value of `tb_ranliao_dianchi`.event_time
     */
    public Date getEventTime() {
        return eventTime;
    }

    /**
     * This method sets the value of the database column `tb_ranliao_dianchi`.event_time
     *
     * @param eventTime the value for `tb_ranliao_dianchi`.event_time
     */
    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
    }

    /**
     * This method returns the value of the database column `tb_ranliao_dianchi`.dianya
     *
     * @return the value of `tb_ranliao_dianchi`.dianya
     */
    public Integer getDianya() {
        return dianya;
    }

    /**
     * This method sets the value of the database column `tb_ranliao_dianchi`.dianya
     *
     * @param dianya the value for `tb_ranliao_dianchi`.dianya
     */
    public void setDianya(Integer dianya) {
        this.dianya = dianya;
    }

    /**
     * This method returns the value of the database column `tb_ranliao_dianchi`.dianliu
     *
     * @return the value of `tb_ranliao_dianchi`.dianliu
     */
    public Integer getDianliu() {
        return dianliu;
    }

    /**
     * This method sets the value of the database column `tb_ranliao_dianchi`.dianliu
     *
     * @param dianliu the value for `tb_ranliao_dianchi`.dianliu
     */
    public void setDianliu(Integer dianliu) {
        this.dianliu = dianliu;
    }

    /**
     * This method returns the value of the database column `tb_ranliao_dianchi`.xiaohaolv
     *
     * @return the value of `tb_ranliao_dianchi`.xiaohaolv
     */
    public Integer getXiaohaolv() {
        return xiaohaolv;
    }

    /**
     * This method sets the value of the database column `tb_ranliao_dianchi`.xiaohaolv
     *
     * @param xiaohaolv the value for `tb_ranliao_dianchi`.xiaohaolv
     */
    public void setXiaohaolv(Integer xiaohaolv) {
        this.xiaohaolv = xiaohaolv;
    }

    /**
     * This method returns the value of the database column `tb_ranliao_dianchi`.tanzhen_total
     *
     * @return the value of `tb_ranliao_dianchi`.tanzhen_total
     */
    public Integer getTanzhenTotal() {
        return tanzhenTotal;
    }

    /**
     * This method sets the value of the database column `tb_ranliao_dianchi`.tanzhen_total
     *
     * @param tanzhenTotal the value for `tb_ranliao_dianchi`.tanzhen_total
     */
    public void setTanzhenTotal(Integer tanzhenTotal) {
        this.tanzhenTotal = tanzhenTotal;
    }

    /**
     * This method returns the value of the database column `tb_ranliao_dianchi`.temperature
     *
     * @return the value of `tb_ranliao_dianchi`.temperature
     */
    public byte[] getTemperature() {
        return temperature;
    }

    /**
     * This method sets the value of the database column `tb_ranliao_dianchi`.temperature
     *
     * @param temperature the value for `tb_ranliao_dianchi`.temperature
     */
    public void setTemperature(byte[] temperature) {
        this.temperature = temperature;
    }

    /**
     * This method returns the value of the database column `tb_ranliao_dianchi`.max_temperature
     *
     * @return the value of `tb_ranliao_dianchi`.max_temperature
     */
    public Integer getMaxTemperature() {
        return maxTemperature;
    }

    /**
     * This method sets the value of the database column `tb_ranliao_dianchi`.max_temperature
     *
     * @param maxTemperature the value for `tb_ranliao_dianchi`.max_temperature
     */
    public void setMaxTemperature(Integer maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    /**
     * This method returns the value of the database column `tb_ranliao_dianchi`.max_tanzhen_no
     *
     * @return the value of `tb_ranliao_dianchi`.max_tanzhen_no
     */
    public Integer getMaxTanzhenNo() {
        return maxTanzhenNo;
    }

    /**
     * This method sets the value of the database column `tb_ranliao_dianchi`.max_tanzhen_no
     *
     * @param maxTanzhenNo the value for `tb_ranliao_dianchi`.max_tanzhen_no
     */
    public void setMaxTanzhenNo(Integer maxTanzhenNo) {
        this.maxTanzhenNo = maxTanzhenNo;
    }

    /**
     * This method returns the value of the database column `tb_ranliao_dianchi`.max_concentration
     *
     * @return the value of `tb_ranliao_dianchi`.max_concentration
     */
    public Integer getMaxConcentration() {
        return maxConcentration;
    }

    /**
     * This method sets the value of the database column `tb_ranliao_dianchi`.max_concentration
     *
     * @param maxConcentration the value for `tb_ranliao_dianchi`.max_concentration
     */
    public void setMaxConcentration(Integer maxConcentration) {
        this.maxConcentration = maxConcentration;
    }

    /**
     * This method returns the value of the database column `tb_ranliao_dianchi`.max_concentration_no
     *
     * @return the value of `tb_ranliao_dianchi`.max_concentration_no
     */
    public Integer getMaxConcentrationNo() {
        return maxConcentrationNo;
    }

    /**
     * This method sets the value of the database column `tb_ranliao_dianchi`.max_concentration_no
     *
     * @param maxConcentrationNo the value for `tb_ranliao_dianchi`.max_concentration_no
     */
    public void setMaxConcentrationNo(Integer maxConcentrationNo) {
        this.maxConcentrationNo = maxConcentrationNo;
    }

    /**
     * This method returns the value of the database column `tb_ranliao_dianchi`.max_pressure
     *
     * @return the value of `tb_ranliao_dianchi`.max_pressure
     */
    public Integer getMaxPressure() {
        return maxPressure;
    }

    /**
     * This method sets the value of the database column `tb_ranliao_dianchi`.max_pressure
     *
     * @param maxPressure the value for `tb_ranliao_dianchi`.max_pressure
     */
    public void setMaxPressure(Integer maxPressure) {
        this.maxPressure = maxPressure;
    }

    /**
     * This method returns the value of the database column `tb_ranliao_dianchi`.max_pressure_no
     *
     * @return the value of `tb_ranliao_dianchi`.max_pressure_no
     */
    public Integer getMaxPressureNo() {
        return maxPressureNo;
    }

    /**
     * This method sets the value of the database column `tb_ranliao_dianchi`.max_pressure_no
     *
     * @param maxPressureNo the value for `tb_ranliao_dianchi`.max_pressure_no
     */
    public void setMaxPressureNo(Integer maxPressureNo) {
        this.maxPressureNo = maxPressureNo;
    }

    /**
     * This method returns the value of the database column `tb_ranliao_dianchi`.dc_status
     *
     * @return the value of `tb_ranliao_dianchi`.dc_status
     */
    public Integer getDcStatus() {
        return dcStatus;
    }

    /**
     * This method sets the value of the database column `tb_ranliao_dianchi`.dc_status
     *
     * @param dcStatus the value for `tb_ranliao_dianchi`.dc_status
     */
    public void setDcStatus(Integer dcStatus) {
        this.dcStatus = dcStatus;
    }
}