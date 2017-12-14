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
 * This class corresponds to the database table `tb_dianya`
 */
public abstract class DianyaBase extends FieldAccessVo implements TableDataConvertable {
    /**
     * This field corresponds to the database column `tb_dianya`.id
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field corresponds to the database column `tb_dianya`.id
     */
    private static final String PROPERTY_REMARK_ID = "自增ID";

    /**
     * This field corresponds to the database column `tb_dianya`.id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Long id;

    /**
     * This field corresponds to the database column `tb_dianya`.car_vin
     */
    private static final String PROPERTY_CARVIN = "carVin";

    /**
     * This field corresponds to the database column `tb_dianya`.car_vin
     */
    private static final String PROPERTY_REMARK_CARVIN = "车辆vin";

    /**
     * This field corresponds to the database column `tb_dianya`.car_vin
     */
    @ColumnDescription(desc = PROPERTY_REMARK_CARVIN)
    private String carVin;

    /**
     * This field corresponds to the database column `tb_dianya`.event_time
     */
    private static final String PROPERTY_EVENTTIME = "eventTime";

    /**
     * This field corresponds to the database column `tb_dianya`.event_time
     */
    private static final String PROPERTY_REMARK_EVENTTIME = "数据采集时间";

    /**
     * This field corresponds to the database column `tb_dianya`.event_time
     */
    @ColumnDescription(desc = PROPERTY_REMARK_EVENTTIME)
    private Date eventTime;

    /**
     * This field corresponds to the database column `tb_dianya`.system_no
     */
    private static final String PROPERTY_SYSTEMNO = "systemNo";

    /**
     * This field corresponds to the database column `tb_dianya`.system_no
     */
    private static final String PROPERTY_REMARK_SYSTEMNO = "可充电储能子系统号";

    /**
     * This field corresponds to the database column `tb_dianya`.system_no
     */
    @ColumnDescription(desc = PROPERTY_REMARK_SYSTEMNO)
    private Byte systemNo;

    /**
     * This field corresponds to the database column `tb_dianya`.dianya
     */
    private static final String PROPERTY_DIANYA = "dianya";

    /**
     * This field corresponds to the database column `tb_dianya`.dianya
     */
    private static final String PROPERTY_REMARK_DIANYA = "可充电储能装置电压";

    /**
     * This field corresponds to the database column `tb_dianya`.dianya
     */
    @ColumnDescription(desc = PROPERTY_REMARK_DIANYA)
    private Integer dianya;

    /**
     * This field corresponds to the database column `tb_dianya`.dianliu
     */
    private static final String PROPERTY_DIANLIU = "dianliu";

    /**
     * This field corresponds to the database column `tb_dianya`.dianliu
     */
    private static final String PROPERTY_REMARK_DIANLIU = "可充电储能装置电流";

    /**
     * This field corresponds to the database column `tb_dianya`.dianliu
     */
    @ColumnDescription(desc = PROPERTY_REMARK_DIANLIU)
    private Integer dianliu;

    /**
     * This field corresponds to the database column `tb_dianya`.simple_total
     */
    private static final String PROPERTY_SIMPLETOTAL = "simpleTotal";

    /**
     * This field corresponds to the database column `tb_dianya`.simple_total
     */
    private static final String PROPERTY_REMARK_SIMPLETOTAL = "单体电池总数";

    /**
     * This field corresponds to the database column `tb_dianya`.simple_total
     */
    @ColumnDescription(desc = PROPERTY_REMARK_SIMPLETOTAL)
    private Integer simpleTotal;

    /**
     * This field corresponds to the database column `tb_dianya`.seq
     */
    private static final String PROPERTY_SEQ = "seq";

    /**
     * This field corresponds to the database column `tb_dianya`.seq
     */
    private static final String PROPERTY_REMARK_SEQ = "本帧起始电池序号";

    /**
     * This field corresponds to the database column `tb_dianya`.seq
     */
    @ColumnDescription(desc = PROPERTY_REMARK_SEQ)
    private Integer seq;

    /**
     * This field corresponds to the database column `tb_dianya`.own_simple_total
     */
    private static final String PROPERTY_OWNSIMPLETOTAL = "ownSimpleTotal";

    /**
     * This field corresponds to the database column `tb_dianya`.own_simple_total
     */
    private static final String PROPERTY_REMARK_OWNSIMPLETOTAL = "本帧单体电池总数";

    /**
     * This field corresponds to the database column `tb_dianya`.own_simple_total
     */
    @ColumnDescription(desc = PROPERTY_REMARK_OWNSIMPLETOTAL)
    private Byte ownSimpleTotal;

    /**
     * This field corresponds to the database column `tb_dianya`.simple_totals
     */
    private static final String PROPERTY_SIMPLETOTALS = "simpleTotals";

    /**
     * This field corresponds to the database column `tb_dianya`.simple_totals
     */
    private static final String PROPERTY_REMARK_SIMPLETOTALS = "单体电池电压";

    /**
     * This field corresponds to the database column `tb_dianya`.simple_totals
     */
    @ColumnDescription(desc = PROPERTY_REMARK_SIMPLETOTALS)
    private byte[] simpleTotals;

    /**
     * This method returns the value of the database column `tb_dianya`.id
     *
     * @return the value of `tb_dianya`.id
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column `tb_dianya`.id
     *
     * @param id the value for `tb_dianya`.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column `tb_dianya`.car_vin
     *
     * @return the value of `tb_dianya`.car_vin
     */
    public String getCarVin() {
        return carVin;
    }

    /**
     * This method sets the value of the database column `tb_dianya`.car_vin
     *
     * @param carVin the value for `tb_dianya`.car_vin
     */
    public void setCarVin(String carVin) {
        this.carVin = carVin;
    }

    /**
     * This method returns the value of the database column `tb_dianya`.event_time
     *
     * @return the value of `tb_dianya`.event_time
     */
    public Date getEventTime() {
        return eventTime;
    }

    /**
     * This method sets the value of the database column `tb_dianya`.event_time
     *
     * @param eventTime the value for `tb_dianya`.event_time
     */
    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
    }

    /**
     * This method returns the value of the database column `tb_dianya`.system_no
     *
     * @return the value of `tb_dianya`.system_no
     */
    public Byte getSystemNo() {
        return systemNo;
    }

    /**
     * This method sets the value of the database column `tb_dianya`.system_no
     *
     * @param systemNo the value for `tb_dianya`.system_no
     */
    public void setSystemNo(Byte systemNo) {
        this.systemNo = systemNo;
    }

    /**
     * This method returns the value of the database column `tb_dianya`.dianya
     *
     * @return the value of `tb_dianya`.dianya
     */
    public Integer getDianya() {
        return dianya;
    }

    /**
     * This method sets the value of the database column `tb_dianya`.dianya
     *
     * @param dianya the value for `tb_dianya`.dianya
     */
    public void setDianya(Integer dianya) {
        this.dianya = dianya;
    }

    /**
     * This method returns the value of the database column `tb_dianya`.dianliu
     *
     * @return the value of `tb_dianya`.dianliu
     */
    public Integer getDianliu() {
        return dianliu;
    }

    /**
     * This method sets the value of the database column `tb_dianya`.dianliu
     *
     * @param dianliu the value for `tb_dianya`.dianliu
     */
    public void setDianliu(Integer dianliu) {
        this.dianliu = dianliu;
    }

    /**
     * This method returns the value of the database column `tb_dianya`.simple_total
     *
     * @return the value of `tb_dianya`.simple_total
     */
    public Integer getSimpleTotal() {
        return simpleTotal;
    }

    /**
     * This method sets the value of the database column `tb_dianya`.simple_total
     *
     * @param simpleTotal the value for `tb_dianya`.simple_total
     */
    public void setSimpleTotal(Integer simpleTotal) {
        this.simpleTotal = simpleTotal;
    }

    /**
     * This method returns the value of the database column `tb_dianya`.seq
     *
     * @return the value of `tb_dianya`.seq
     */
    public Integer getSeq() {
        return seq;
    }

    /**
     * This method sets the value of the database column `tb_dianya`.seq
     *
     * @param seq the value for `tb_dianya`.seq
     */
    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    /**
     * This method returns the value of the database column `tb_dianya`.own_simple_total
     *
     * @return the value of `tb_dianya`.own_simple_total
     */
    public Byte getOwnSimpleTotal() {
        return ownSimpleTotal;
    }

    /**
     * This method sets the value of the database column `tb_dianya`.own_simple_total
     *
     * @param ownSimpleTotal the value for `tb_dianya`.own_simple_total
     */
    public void setOwnSimpleTotal(Byte ownSimpleTotal) {
        this.ownSimpleTotal = ownSimpleTotal;
    }

    /**
     * This method returns the value of the database column `tb_dianya`.simple_totals
     *
     * @return the value of `tb_dianya`.simple_totals
     */
    public byte[] getSimpleTotals() {
        return simpleTotals;
    }

    /**
     * This method sets the value of the database column `tb_dianya`.simple_totals
     *
     * @param simpleTotals the value for `tb_dianya`.simple_totals
     */
    public void setSimpleTotals(byte[] simpleTotals) {
        this.simpleTotals = simpleTotals;
    }
}