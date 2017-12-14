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
 * This class corresponds to the database table `tb_all_car`
 */
public abstract class AllCarBase extends FieldAccessVo implements TableDataConvertable {
    /**
     * This field corresponds to the database column `tb_all_car`.id
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field corresponds to the database column `tb_all_car`.id
     */
    private static final String PROPERTY_REMARK_ID = "自增ID";

    /**
     * This field corresponds to the database column `tb_all_car`.id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Long id;

    /**
     * This field corresponds to the database column `tb_all_car`.car_vin
     */
    private static final String PROPERTY_CARVIN = "carVin";

    /**
     * This field corresponds to the database column `tb_all_car`.car_vin
     */
    private static final String PROPERTY_REMARK_CARVIN = "车辆vin";

    /**
     * This field corresponds to the database column `tb_all_car`.car_vin
     */
    @ColumnDescription(desc = PROPERTY_REMARK_CARVIN)
    private String carVin;

    /**
     * This field corresponds to the database column `tb_all_car`.event_time
     */
    private static final String PROPERTY_EVENTTIME = "eventTime";

    /**
     * This field corresponds to the database column `tb_all_car`.event_time
     */
    private static final String PROPERTY_REMARK_EVENTTIME = "数据采集时间";

    /**
     * This field corresponds to the database column `tb_all_car`.event_time
     */
    @ColumnDescription(desc = PROPERTY_REMARK_EVENTTIME)
    private Date eventTime;

    /**
     * This field corresponds to the database column `tb_all_car`.car_status
     */
    private static final String PROPERTY_CARSTATUS = "carStatus";

    /**
     * This field corresponds to the database column `tb_all_car`.car_status
     */
    private static final String PROPERTY_REMARK_CARSTATUS = "车辆状态";

    /**
     * This field corresponds to the database column `tb_all_car`.car_status
     */
    @ColumnDescription(desc = PROPERTY_REMARK_CARSTATUS)
    private Byte carStatus;

    /**
     * This field corresponds to the database column `tb_all_car`.change_status
     */
    private static final String PROPERTY_CHANGESTATUS = "changeStatus";

    /**
     * This field corresponds to the database column `tb_all_car`.change_status
     */
    private static final String PROPERTY_REMARK_CHANGESTATUS = "充电状态";

    /**
     * This field corresponds to the database column `tb_all_car`.change_status
     */
    @ColumnDescription(desc = PROPERTY_REMARK_CHANGESTATUS)
    private Byte changeStatus;

    /**
     * This field corresponds to the database column `tb_all_car`.run_mode
     */
    private static final String PROPERTY_RUNMODE = "runMode";

    /**
     * This field corresponds to the database column `tb_all_car`.run_mode
     */
    private static final String PROPERTY_REMARK_RUNMODE = "运行模式";

    /**
     * This field corresponds to the database column `tb_all_car`.run_mode
     */
    @ColumnDescription(desc = PROPERTY_REMARK_RUNMODE)
    private Byte runMode;

    /**
     * This field corresponds to the database column `tb_all_car`.speed
     */
    private static final String PROPERTY_SPEED = "speed";

    /**
     * This field corresponds to the database column `tb_all_car`.speed
     */
    private static final String PROPERTY_REMARK_SPEED = "车速";

    /**
     * This field corresponds to the database column `tb_all_car`.speed
     */
    @ColumnDescription(desc = PROPERTY_REMARK_SPEED)
    private Integer speed;

    /**
     * This field corresponds to the database column `tb_all_car`.total_km
     */
    private static final String PROPERTY_TOTALKM = "totalKm";

    /**
     * This field corresponds to the database column `tb_all_car`.total_km
     */
    private static final String PROPERTY_REMARK_TOTALKM = "累计里程";

    /**
     * This field corresponds to the database column `tb_all_car`.total_km
     */
    @ColumnDescription(desc = PROPERTY_REMARK_TOTALKM)
    private Integer totalKm;

    /**
     * This field corresponds to the database column `tb_all_car`.total_voltage
     */
    private static final String PROPERTY_TOTALVOLTAGE = "totalVoltage";

    /**
     * This field corresponds to the database column `tb_all_car`.total_voltage
     */
    private static final String PROPERTY_REMARK_TOTALVOLTAGE = "总电压";

    /**
     * This field corresponds to the database column `tb_all_car`.total_voltage
     */
    @ColumnDescription(desc = PROPERTY_REMARK_TOTALVOLTAGE)
    private Integer totalVoltage;

    /**
     * This field corresponds to the database column `tb_all_car`.total_electricity
     */
    private static final String PROPERTY_TOTALELECTRICITY = "totalElectricity";

    /**
     * This field corresponds to the database column `tb_all_car`.total_electricity
     */
    private static final String PROPERTY_REMARK_TOTALELECTRICITY = "总电流";

    /**
     * This field corresponds to the database column `tb_all_car`.total_electricity
     */
    @ColumnDescription(desc = PROPERTY_REMARK_TOTALELECTRICITY)
    private Integer totalElectricity;

    /**
     * This field corresponds to the database column `tb_all_car`.soc
     */
    private static final String PROPERTY_SOC = "soc";

    /**
     * This field corresponds to the database column `tb_all_car`.soc
     */
    private static final String PROPERTY_REMARK_SOC = "SOC";

    /**
     * This field corresponds to the database column `tb_all_car`.soc
     */
    @ColumnDescription(desc = PROPERTY_REMARK_SOC)
    private Byte soc;

    /**
     * This field corresponds to the database column `tb_all_car`.dc_status
     */
    private static final String PROPERTY_DCSTATUS = "dcStatus";

    /**
     * This field corresponds to the database column `tb_all_car`.dc_status
     */
    private static final String PROPERTY_REMARK_DCSTATUS = "DC-DC状态";

    /**
     * This field corresponds to the database column `tb_all_car`.dc_status
     */
    @ColumnDescription(desc = PROPERTY_REMARK_DCSTATUS)
    private Byte dcStatus;

    /**
     * This field corresponds to the database column `tb_all_car`.dangwei
     */
    private static final String PROPERTY_DANGWEI = "dangwei";

    /**
     * This field corresponds to the database column `tb_all_car`.dangwei
     */
    private static final String PROPERTY_REMARK_DANGWEI = "挡位";

    /**
     * This field corresponds to the database column `tb_all_car`.dangwei
     */
    @ColumnDescription(desc = PROPERTY_REMARK_DANGWEI)
    private Byte dangwei;

    /**
     * This field corresponds to the database column `tb_all_car`.insulation_resistance
     */
    private static final String PROPERTY_INSULATIONRESISTANCE = "insulationResistance";

    /**
     * This field corresponds to the database column `tb_all_car`.insulation_resistance
     */
    private static final String PROPERTY_REMARK_INSULATIONRESISTANCE = "绝缘电阻";

    /**
     * This field corresponds to the database column `tb_all_car`.insulation_resistance
     */
    @ColumnDescription(desc = PROPERTY_REMARK_INSULATIONRESISTANCE)
    private Integer insulationResistance;

    /**
     * This field corresponds to the database column `tb_all_car`.up_footplate_km
     */
    private static final String PROPERTY_UPFOOTPLATEKM = "upFootplateKm";

    /**
     * This field corresponds to the database column `tb_all_car`.up_footplate_km
     */
    private static final String PROPERTY_REMARK_UPFOOTPLATEKM = "加速踏板行程值";

    /**
     * This field corresponds to the database column `tb_all_car`.up_footplate_km
     */
    @ColumnDescription(desc = PROPERTY_REMARK_UPFOOTPLATEKM)
    private Byte upFootplateKm;

    /**
     * This field corresponds to the database column `tb_all_car`.footplate_status
     */
    private static final String PROPERTY_FOOTPLATESTATUS = "footplateStatus";

    /**
     * This field corresponds to the database column `tb_all_car`.footplate_status
     */
    private static final String PROPERTY_REMARK_FOOTPLATESTATUS = "制动踏板状态";

    /**
     * This field corresponds to the database column `tb_all_car`.footplate_status
     */
    @ColumnDescription(desc = PROPERTY_REMARK_FOOTPLATESTATUS)
    private Byte footplateStatus;

    /**
     * This method returns the value of the database column `tb_all_car`.id
     *
     * @return the value of `tb_all_car`.id
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column `tb_all_car`.id
     *
     * @param id the value for `tb_all_car`.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column `tb_all_car`.car_vin
     *
     * @return the value of `tb_all_car`.car_vin
     */
    public String getCarVin() {
        return carVin;
    }

    /**
     * This method sets the value of the database column `tb_all_car`.car_vin
     *
     * @param carVin the value for `tb_all_car`.car_vin
     */
    public void setCarVin(String carVin) {
        this.carVin = carVin;
    }

    /**
     * This method returns the value of the database column `tb_all_car`.event_time
     *
     * @return the value of `tb_all_car`.event_time
     */
    public Date getEventTime() {
        return eventTime;
    }

    /**
     * This method sets the value of the database column `tb_all_car`.event_time
     *
     * @param eventTime the value for `tb_all_car`.event_time
     */
    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
    }

    /**
     * This method returns the value of the database column `tb_all_car`.car_status
     *
     * @return the value of `tb_all_car`.car_status
     */
    public Byte getCarStatus() {
        return carStatus;
    }

    /**
     * This method sets the value of the database column `tb_all_car`.car_status
     *
     * @param carStatus the value for `tb_all_car`.car_status
     */
    public void setCarStatus(Byte carStatus) {
        this.carStatus = carStatus;
    }

    /**
     * This method returns the value of the database column `tb_all_car`.change_status
     *
     * @return the value of `tb_all_car`.change_status
     */
    public Byte getChangeStatus() {
        return changeStatus;
    }

    /**
     * This method sets the value of the database column `tb_all_car`.change_status
     *
     * @param changeStatus the value for `tb_all_car`.change_status
     */
    public void setChangeStatus(Byte changeStatus) {
        this.changeStatus = changeStatus;
    }

    /**
     * This method returns the value of the database column `tb_all_car`.run_mode
     *
     * @return the value of `tb_all_car`.run_mode
     */
    public Byte getRunMode() {
        return runMode;
    }

    /**
     * This method sets the value of the database column `tb_all_car`.run_mode
     *
     * @param runMode the value for `tb_all_car`.run_mode
     */
    public void setRunMode(Byte runMode) {
        this.runMode = runMode;
    }

    /**
     * This method returns the value of the database column `tb_all_car`.speed
     *
     * @return the value of `tb_all_car`.speed
     */
    public Integer getSpeed() {
        return speed;
    }

    /**
     * This method sets the value of the database column `tb_all_car`.speed
     *
     * @param speed the value for `tb_all_car`.speed
     */
    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    /**
     * This method returns the value of the database column `tb_all_car`.total_km
     *
     * @return the value of `tb_all_car`.total_km
     */
    public Integer getTotalKm() {
        return totalKm;
    }

    /**
     * This method sets the value of the database column `tb_all_car`.total_km
     *
     * @param totalKm the value for `tb_all_car`.total_km
     */
    public void setTotalKm(Integer totalKm) {
        this.totalKm = totalKm;
    }

    /**
     * This method returns the value of the database column `tb_all_car`.total_voltage
     *
     * @return the value of `tb_all_car`.total_voltage
     */
    public Integer getTotalVoltage() {
        return totalVoltage;
    }

    /**
     * This method sets the value of the database column `tb_all_car`.total_voltage
     *
     * @param totalVoltage the value for `tb_all_car`.total_voltage
     */
    public void setTotalVoltage(Integer totalVoltage) {
        this.totalVoltage = totalVoltage;
    }

    /**
     * This method returns the value of the database column `tb_all_car`.total_electricity
     *
     * @return the value of `tb_all_car`.total_electricity
     */
    public Integer getTotalElectricity() {
        return totalElectricity;
    }

    /**
     * This method sets the value of the database column `tb_all_car`.total_electricity
     *
     * @param totalElectricity the value for `tb_all_car`.total_electricity
     */
    public void setTotalElectricity(Integer totalElectricity) {
        this.totalElectricity = totalElectricity;
    }

    /**
     * This method returns the value of the database column `tb_all_car`.soc
     *
     * @return the value of `tb_all_car`.soc
     */
    public Byte getSoc() {
        return soc;
    }

    /**
     * This method sets the value of the database column `tb_all_car`.soc
     *
     * @param soc the value for `tb_all_car`.soc
     */
    public void setSoc(Byte soc) {
        this.soc = soc;
    }

    /**
     * This method returns the value of the database column `tb_all_car`.dc_status
     *
     * @return the value of `tb_all_car`.dc_status
     */
    public Byte getDcStatus() {
        return dcStatus;
    }

    /**
     * This method sets the value of the database column `tb_all_car`.dc_status
     *
     * @param dcStatus the value for `tb_all_car`.dc_status
     */
    public void setDcStatus(Byte dcStatus) {
        this.dcStatus = dcStatus;
    }

    /**
     * This method returns the value of the database column `tb_all_car`.dangwei
     *
     * @return the value of `tb_all_car`.dangwei
     */
    public Byte getDangwei() {
        return dangwei;
    }

    /**
     * This method sets the value of the database column `tb_all_car`.dangwei
     *
     * @param dangwei the value for `tb_all_car`.dangwei
     */
    public void setDangwei(Byte dangwei) {
        this.dangwei = dangwei;
    }

    /**
     * This method returns the value of the database column `tb_all_car`.insulation_resistance
     *
     * @return the value of `tb_all_car`.insulation_resistance
     */
    public Integer getInsulationResistance() {
        return insulationResistance;
    }

    /**
     * This method sets the value of the database column `tb_all_car`.insulation_resistance
     *
     * @param insulationResistance the value for `tb_all_car`.insulation_resistance
     */
    public void setInsulationResistance(Integer insulationResistance) {
        this.insulationResistance = insulationResistance;
    }

    /**
     * This method returns the value of the database column `tb_all_car`.up_footplate_km
     *
     * @return the value of `tb_all_car`.up_footplate_km
     */
    public Byte getUpFootplateKm() {
        return upFootplateKm;
    }

    /**
     * This method sets the value of the database column `tb_all_car`.up_footplate_km
     *
     * @param upFootplateKm the value for `tb_all_car`.up_footplate_km
     */
    public void setUpFootplateKm(Byte upFootplateKm) {
        this.upFootplateKm = upFootplateKm;
    }

    /**
     * This method returns the value of the database column `tb_all_car`.footplate_status
     *
     * @return the value of `tb_all_car`.footplate_status
     */
    public Byte getFootplateStatus() {
        return footplateStatus;
    }

    /**
     * This method sets the value of the database column `tb_all_car`.footplate_status
     *
     * @param footplateStatus the value for `tb_all_car`.footplate_status
     */
    public void setFootplateStatus(Byte footplateStatus) {
        this.footplateStatus = footplateStatus;
    }
}