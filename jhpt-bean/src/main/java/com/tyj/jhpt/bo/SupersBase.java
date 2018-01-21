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
 * This class corresponds to the database table `tb_supers`
 */
public abstract class SupersBase extends FieldAccessVo implements TableDataConvertable {
    /**
     * This field corresponds to the database column `tb_supers`.id
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field corresponds to the database column `tb_supers`.id
     */
    private static final String PROPERTY_REMARK_ID = "自增ID";

    /**
     * This field corresponds to the database column `tb_supers`.id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Long id;

    /**
     * This field corresponds to the database column `tb_supers`.car_vin
     */
    private static final String PROPERTY_CARVIN = "carVin";

    /**
     * This field corresponds to the database column `tb_supers`.car_vin
     */
    private static final String PROPERTY_REMARK_CARVIN = "车辆vin";

    /**
     * This field corresponds to the database column `tb_supers`.car_vin
     */
    @ColumnDescription(desc = PROPERTY_REMARK_CARVIN)
    private String carVin;

    /**
     * This field corresponds to the database column `tb_supers`.event_time
     */
    private static final String PROPERTY_EVENTTIME = "eventTime";

    /**
     * This field corresponds to the database column `tb_supers`.event_time
     */
    private static final String PROPERTY_REMARK_EVENTTIME = "数据采集时间";

    /**
     * This field corresponds to the database column `tb_supers`.event_time
     */
    @ColumnDescription(desc = PROPERTY_REMARK_EVENTTIME)
    private Date eventTime;

    /**
     * This field corresponds to the database column `tb_supers`.max_system_no
     */
    private static final String PROPERTY_MAXSYSTEMNO = "maxSystemNo";

    /**
     * This field corresponds to the database column `tb_supers`.max_system_no
     */
    private static final String PROPERTY_REMARK_MAXSYSTEMNO = "最高电压电池系统号";

    /**
     * This field corresponds to the database column `tb_supers`.max_system_no
     */
    @ColumnDescription(desc = PROPERTY_REMARK_MAXSYSTEMNO)
    private Integer maxSystemNo;

    /**
     * This field corresponds to the database column `tb_supers`.max_simple_no
     */
    private static final String PROPERTY_MAXSIMPLENO = "maxSimpleNo";

    /**
     * This field corresponds to the database column `tb_supers`.max_simple_no
     */
    private static final String PROPERTY_REMARK_MAXSIMPLENO = "最高电压电池单体代号";

    /**
     * This field corresponds to the database column `tb_supers`.max_simple_no
     */
    @ColumnDescription(desc = PROPERTY_REMARK_MAXSIMPLENO)
    private Integer maxSimpleNo;

    /**
     * This field corresponds to the database column `tb_supers`.max
     */
    private static final String PROPERTY_MAX = "max";

    /**
     * This field corresponds to the database column `tb_supers`.max
     */
    private static final String PROPERTY_REMARK_MAX = "电池单体电压最高值";

    /**
     * This field corresponds to the database column `tb_supers`.max
     */
    @ColumnDescription(desc = PROPERTY_REMARK_MAX)
    private Integer max;

    /**
     * This field corresponds to the database column `tb_supers`.mix_system_no
     */
    private static final String PROPERTY_MIXSYSTEMNO = "mixSystemNo";

    /**
     * This field corresponds to the database column `tb_supers`.mix_system_no
     */
    private static final String PROPERTY_REMARK_MIXSYSTEMNO = "最低电压电池系统号";

    /**
     * This field corresponds to the database column `tb_supers`.mix_system_no
     */
    @ColumnDescription(desc = PROPERTY_REMARK_MIXSYSTEMNO)
    private Integer mixSystemNo;

    /**
     * This field corresponds to the database column `tb_supers`.mix_simple_no
     */
    private static final String PROPERTY_MIXSIMPLENO = "mixSimpleNo";

    /**
     * This field corresponds to the database column `tb_supers`.mix_simple_no
     */
    private static final String PROPERTY_REMARK_MIXSIMPLENO = "最低电压电池单体代号";

    /**
     * This field corresponds to the database column `tb_supers`.mix_simple_no
     */
    @ColumnDescription(desc = PROPERTY_REMARK_MIXSIMPLENO)
    private Integer mixSimpleNo;

    /**
     * This field corresponds to the database column `tb_supers`.min
     */
    private static final String PROPERTY_MIN = "min";

    /**
     * This field corresponds to the database column `tb_supers`.min
     */
    private static final String PROPERTY_REMARK_MIN = "电池单体电压最低值";

    /**
     * This field corresponds to the database column `tb_supers`.min
     */
    @ColumnDescription(desc = PROPERTY_REMARK_MIN)
    private Integer min;

    /**
     * This field corresponds to the database column `tb_supers`.max_temperature_system_no
     */
    private static final String PROPERTY_MAXTEMPERATURESYSTEMNO = "maxTemperatureSystemNo";

    /**
     * This field corresponds to the database column `tb_supers`.max_temperature_system_no
     */
    private static final String PROPERTY_REMARK_MAXTEMPERATURESYSTEMNO = "最高温度子系统号";

    /**
     * This field corresponds to the database column `tb_supers`.max_temperature_system_no
     */
    @ColumnDescription(desc = PROPERTY_REMARK_MAXTEMPERATURESYSTEMNO)
    private Integer maxTemperatureSystemNo;

    /**
     * This field corresponds to the database column `tb_supers`.max_seq
     */
    private static final String PROPERTY_MAXSEQ = "maxSeq";

    /**
     * This field corresponds to the database column `tb_supers`.max_seq
     */
    private static final String PROPERTY_REMARK_MAXSEQ = "最高温度探针序号";

    /**
     * This field corresponds to the database column `tb_supers`.max_seq
     */
    @ColumnDescription(desc = PROPERTY_REMARK_MAXSEQ)
    private Integer maxSeq;

    /**
     * This field corresponds to the database column `tb_supers`.max_temperature
     */
    private static final String PROPERTY_MAXTEMPERATURE = "maxTemperature";

    /**
     * This field corresponds to the database column `tb_supers`.max_temperature
     */
    private static final String PROPERTY_REMARK_MAXTEMPERATURE = "最高温度值";

    /**
     * This field corresponds to the database column `tb_supers`.max_temperature
     */
    @ColumnDescription(desc = PROPERTY_REMARK_MAXTEMPERATURE)
    private Integer maxTemperature;

    /**
     * This field corresponds to the database column `tb_supers`.min_temperature_system_no
     */
    private static final String PROPERTY_MINTEMPERATURESYSTEMNO = "minTemperatureSystemNo";

    /**
     * This field corresponds to the database column `tb_supers`.min_temperature_system_no
     */
    private static final String PROPERTY_REMARK_MINTEMPERATURESYSTEMNO = "最低温度子系统号";

    /**
     * This field corresponds to the database column `tb_supers`.min_temperature_system_no
     */
    @ColumnDescription(desc = PROPERTY_REMARK_MINTEMPERATURESYSTEMNO)
    private Integer minTemperatureSystemNo;

    /**
     * This field corresponds to the database column `tb_supers`.min_seq
     */
    private static final String PROPERTY_MINSEQ = "minSeq";

    /**
     * This field corresponds to the database column `tb_supers`.min_seq
     */
    private static final String PROPERTY_REMARK_MINSEQ = "最低温度探针序号";

    /**
     * This field corresponds to the database column `tb_supers`.min_seq
     */
    @ColumnDescription(desc = PROPERTY_REMARK_MINSEQ)
    private Integer minSeq;

    /**
     * This field corresponds to the database column `tb_supers`.min_temperature
     */
    private static final String PROPERTY_MINTEMPERATURE = "minTemperature";

    /**
     * This field corresponds to the database column `tb_supers`.min_temperature
     */
    private static final String PROPERTY_REMARK_MINTEMPERATURE = "最低温度值";

    /**
     * This field corresponds to the database column `tb_supers`.min_temperature
     */
    @ColumnDescription(desc = PROPERTY_REMARK_MINTEMPERATURE)
    private Integer minTemperature;

    /**
     * This method returns the value of the database column `tb_supers`.id
     *
     * @return the value of `tb_supers`.id
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column `tb_supers`.id
     *
     * @param id the value for `tb_supers`.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column `tb_supers`.car_vin
     *
     * @return the value of `tb_supers`.car_vin
     */
    public String getCarVin() {
        return carVin;
    }

    /**
     * This method sets the value of the database column `tb_supers`.car_vin
     *
     * @param carVin the value for `tb_supers`.car_vin
     */
    public void setCarVin(String carVin) {
        this.carVin = carVin;
    }

    /**
     * This method returns the value of the database column `tb_supers`.event_time
     *
     * @return the value of `tb_supers`.event_time
     */
    public Date getEventTime() {
        return eventTime;
    }

    /**
     * This method sets the value of the database column `tb_supers`.event_time
     *
     * @param eventTime the value for `tb_supers`.event_time
     */
    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
    }

    /**
     * This method returns the value of the database column `tb_supers`.max_system_no
     *
     * @return the value of `tb_supers`.max_system_no
     */
    public Integer getMaxSystemNo() {
        return maxSystemNo;
    }

    /**
     * This method sets the value of the database column `tb_supers`.max_system_no
     *
     * @param maxSystemNo the value for `tb_supers`.max_system_no
     */
    public void setMaxSystemNo(Integer maxSystemNo) {
        this.maxSystemNo = maxSystemNo;
    }

    /**
     * This method returns the value of the database column `tb_supers`.max_simple_no
     *
     * @return the value of `tb_supers`.max_simple_no
     */
    public Integer getMaxSimpleNo() {
        return maxSimpleNo;
    }

    /**
     * This method sets the value of the database column `tb_supers`.max_simple_no
     *
     * @param maxSimpleNo the value for `tb_supers`.max_simple_no
     */
    public void setMaxSimpleNo(Integer maxSimpleNo) {
        this.maxSimpleNo = maxSimpleNo;
    }

    /**
     * This method returns the value of the database column `tb_supers`.max
     *
     * @return the value of `tb_supers`.max
     */
    public Integer getMax() {
        return max;
    }

    /**
     * This method sets the value of the database column `tb_supers`.max
     *
     * @param max the value for `tb_supers`.max
     */
    public void setMax(Integer max) {
        this.max = max;
    }

    /**
     * This method returns the value of the database column `tb_supers`.mix_system_no
     *
     * @return the value of `tb_supers`.mix_system_no
     */
    public Integer getMixSystemNo() {
        return mixSystemNo;
    }

    /**
     * This method sets the value of the database column `tb_supers`.mix_system_no
     *
     * @param mixSystemNo the value for `tb_supers`.mix_system_no
     */
    public void setMixSystemNo(Integer mixSystemNo) {
        this.mixSystemNo = mixSystemNo;
    }

    /**
     * This method returns the value of the database column `tb_supers`.mix_simple_no
     *
     * @return the value of `tb_supers`.mix_simple_no
     */
    public Integer getMixSimpleNo() {
        return mixSimpleNo;
    }

    /**
     * This method sets the value of the database column `tb_supers`.mix_simple_no
     *
     * @param mixSimpleNo the value for `tb_supers`.mix_simple_no
     */
    public void setMixSimpleNo(Integer mixSimpleNo) {
        this.mixSimpleNo = mixSimpleNo;
    }

    /**
     * This method returns the value of the database column `tb_supers`.min
     *
     * @return the value of `tb_supers`.min
     */
    public Integer getMin() {
        return min;
    }

    /**
     * This method sets the value of the database column `tb_supers`.min
     *
     * @param min the value for `tb_supers`.min
     */
    public void setMin(Integer min) {
        this.min = min;
    }

    /**
     * This method returns the value of the database column `tb_supers`.max_temperature_system_no
     *
     * @return the value of `tb_supers`.max_temperature_system_no
     */
    public Integer getMaxTemperatureSystemNo() {
        return maxTemperatureSystemNo;
    }

    /**
     * This method sets the value of the database column `tb_supers`.max_temperature_system_no
     *
     * @param maxTemperatureSystemNo the value for `tb_supers`.max_temperature_system_no
     */
    public void setMaxTemperatureSystemNo(Integer maxTemperatureSystemNo) {
        this.maxTemperatureSystemNo = maxTemperatureSystemNo;
    }

    /**
     * This method returns the value of the database column `tb_supers`.max_seq
     *
     * @return the value of `tb_supers`.max_seq
     */
    public Integer getMaxSeq() {
        return maxSeq;
    }

    /**
     * This method sets the value of the database column `tb_supers`.max_seq
     *
     * @param maxSeq the value for `tb_supers`.max_seq
     */
    public void setMaxSeq(Integer maxSeq) {
        this.maxSeq = maxSeq;
    }

    /**
     * This method returns the value of the database column `tb_supers`.max_temperature
     *
     * @return the value of `tb_supers`.max_temperature
     */
    public Integer getMaxTemperature() {
        return maxTemperature;
    }

    /**
     * This method sets the value of the database column `tb_supers`.max_temperature
     *
     * @param maxTemperature the value for `tb_supers`.max_temperature
     */
    public void setMaxTemperature(Integer maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    /**
     * This method returns the value of the database column `tb_supers`.min_temperature_system_no
     *
     * @return the value of `tb_supers`.min_temperature_system_no
     */
    public Integer getMinTemperatureSystemNo() {
        return minTemperatureSystemNo;
    }

    /**
     * This method sets the value of the database column `tb_supers`.min_temperature_system_no
     *
     * @param minTemperatureSystemNo the value for `tb_supers`.min_temperature_system_no
     */
    public void setMinTemperatureSystemNo(Integer minTemperatureSystemNo) {
        this.minTemperatureSystemNo = minTemperatureSystemNo;
    }

    /**
     * This method returns the value of the database column `tb_supers`.min_seq
     *
     * @return the value of `tb_supers`.min_seq
     */
    public Integer getMinSeq() {
        return minSeq;
    }

    /**
     * This method sets the value of the database column `tb_supers`.min_seq
     *
     * @param minSeq the value for `tb_supers`.min_seq
     */
    public void setMinSeq(Integer minSeq) {
        this.minSeq = minSeq;
    }

    /**
     * This method returns the value of the database column `tb_supers`.min_temperature
     *
     * @return the value of `tb_supers`.min_temperature
     */
    public Integer getMinTemperature() {
        return minTemperature;
    }

    /**
     * This method sets the value of the database column `tb_supers`.min_temperature
     *
     * @param minTemperature the value for `tb_supers`.min_temperature
     */
    public void setMinTemperature(Integer minTemperature) {
        this.minTemperature = minTemperature;
    }
}