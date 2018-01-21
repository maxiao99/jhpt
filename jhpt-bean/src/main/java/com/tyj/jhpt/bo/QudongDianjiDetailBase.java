/*
 * Copyright (c) 2018. CK. All rights reserved.
 */

package com.tyj.jhpt.bo;

import com.github.fartherp.framework.core.dao.FieldAccessVo;
import com.github.fartherp.framework.core.dao.TableDataConvertable;
import com.github.fartherp.framework.core.dao.annotation.ColumnDescription;
import com.github.fartherp.framework.core.dao.annotation.Id;

/**
 * This class corresponds to the database table `tb_qudong_dianji_detail`
 */
public abstract class QudongDianjiDetailBase extends FieldAccessVo implements TableDataConvertable {
    /**
     * This field corresponds to the database column `tb_qudong_dianji_detail`.id
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field corresponds to the database column `tb_qudong_dianji_detail`.id
     */
    private static final String PROPERTY_REMARK_ID = "自增IDtb_qudong_dianji的ID";

    /**
     * This field corresponds to the database column `tb_qudong_dianji_detail`.id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Long id;

    /**
     * This field corresponds to the database column `tb_qudong_dianji_detail`.seq
     */
    private static final String PROPERTY_SEQ = "seq";

    /**
     * This field corresponds to the database column `tb_qudong_dianji_detail`.seq
     */
    private static final String PROPERTY_REMARK_SEQ = "驱动电机序号";

    /**
     * This field corresponds to the database column `tb_qudong_dianji_detail`.seq
     */
    @ColumnDescription(desc = PROPERTY_REMARK_SEQ)
    private Integer seq;

    /**
     * This field corresponds to the database column `tb_qudong_dianji_detail`.status
     */
    private static final String PROPERTY_STATUS = "status";

    /**
     * This field corresponds to the database column `tb_qudong_dianji_detail`.status
     */
    private static final String PROPERTY_REMARK_STATUS = "驱动电机状态";

    /**
     * This field corresponds to the database column `tb_qudong_dianji_detail`.status
     */
    @ColumnDescription(desc = PROPERTY_REMARK_STATUS)
    private Integer status;

    /**
     * This field corresponds to the database column `tb_qudong_dianji_detail`.control_temperature
     */
    private static final String PROPERTY_CONTROLTEMPERATURE = "controlTemperature";

    /**
     * This field corresponds to the database column `tb_qudong_dianji_detail`.control_temperature
     */
    private static final String PROPERTY_REMARK_CONTROLTEMPERATURE = "驱动电机控制器温度";

    /**
     * This field corresponds to the database column `tb_qudong_dianji_detail`.control_temperature
     */
    @ColumnDescription(desc = PROPERTY_REMARK_CONTROLTEMPERATURE)
    private Integer controlTemperature;

    /**
     * This field corresponds to the database column `tb_qudong_dianji_detail`.speed
     */
    private static final String PROPERTY_SPEED = "speed";

    /**
     * This field corresponds to the database column `tb_qudong_dianji_detail`.speed
     */
    private static final String PROPERTY_REMARK_SPEED = "驱动电机转速";

    /**
     * This field corresponds to the database column `tb_qudong_dianji_detail`.speed
     */
    @ColumnDescription(desc = PROPERTY_REMARK_SPEED)
    private Integer speed;

    /**
     * This field corresponds to the database column `tb_qudong_dianji_detail`.zhuanju
     */
    private static final String PROPERTY_ZHUANJU = "zhuanju";

    /**
     * This field corresponds to the database column `tb_qudong_dianji_detail`.zhuanju
     */
    private static final String PROPERTY_REMARK_ZHUANJU = "驱动电机转矩";

    /**
     * This field corresponds to the database column `tb_qudong_dianji_detail`.zhuanju
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ZHUANJU)
    private Integer zhuanju;

    /**
     * This field corresponds to the database column `tb_qudong_dianji_detail`.temperature
     */
    private static final String PROPERTY_TEMPERATURE = "temperature";

    /**
     * This field corresponds to the database column `tb_qudong_dianji_detail`.temperature
     */
    private static final String PROPERTY_REMARK_TEMPERATURE = "驱动电机温度";

    /**
     * This field corresponds to the database column `tb_qudong_dianji_detail`.temperature
     */
    @ColumnDescription(desc = PROPERTY_REMARK_TEMPERATURE)
    private Integer temperature;

    /**
     * This field corresponds to the database column `tb_qudong_dianji_detail`.dianya
     */
    private static final String PROPERTY_DIANYA = "dianya";

    /**
     * This field corresponds to the database column `tb_qudong_dianji_detail`.dianya
     */
    private static final String PROPERTY_REMARK_DIANYA = "电机控制器输入电压";

    /**
     * This field corresponds to the database column `tb_qudong_dianji_detail`.dianya
     */
    @ColumnDescription(desc = PROPERTY_REMARK_DIANYA)
    private Integer dianya;

    /**
     * This field corresponds to the database column `tb_qudong_dianji_detail`.dianliu
     */
    private static final String PROPERTY_DIANLIU = "dianliu";

    /**
     * This field corresponds to the database column `tb_qudong_dianji_detail`.dianliu
     */
    private static final String PROPERTY_REMARK_DIANLIU = "电机控制器直流母线母线电流";

    /**
     * This field corresponds to the database column `tb_qudong_dianji_detail`.dianliu
     */
    @ColumnDescription(desc = PROPERTY_REMARK_DIANLIU)
    private Integer dianliu;

    /**
     * This field corresponds to the database column `tb_qudong_dianji_detail`.qudong_dianji_id
     */
    private static final String PROPERTY_QUDONGDIANJIID = "qudongDianjiId";

    /**
     * This field corresponds to the database column `tb_qudong_dianji_detail`.qudong_dianji_id
     */
    private static final String PROPERTY_REMARK_QUDONGDIANJIID = "tb_qudong_dianji的ID";

    /**
     * This field corresponds to the database column `tb_qudong_dianji_detail`.qudong_dianji_id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_QUDONGDIANJIID)
    private Long qudongDianjiId;

    /**
     * This method returns the value of the database column `tb_qudong_dianji_detail`.id
     *
     * @return the value of `tb_qudong_dianji_detail`.id
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column `tb_qudong_dianji_detail`.id
     *
     * @param id the value for `tb_qudong_dianji_detail`.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column `tb_qudong_dianji_detail`.seq
     *
     * @return the value of `tb_qudong_dianji_detail`.seq
     */
    public Integer getSeq() {
        return seq;
    }

    /**
     * This method sets the value of the database column `tb_qudong_dianji_detail`.seq
     *
     * @param seq the value for `tb_qudong_dianji_detail`.seq
     */
    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    /**
     * This method returns the value of the database column `tb_qudong_dianji_detail`.status
     *
     * @return the value of `tb_qudong_dianji_detail`.status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method sets the value of the database column `tb_qudong_dianji_detail`.status
     *
     * @param status the value for `tb_qudong_dianji_detail`.status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method returns the value of the database column `tb_qudong_dianji_detail`.control_temperature
     *
     * @return the value of `tb_qudong_dianji_detail`.control_temperature
     */
    public Integer getControlTemperature() {
        return controlTemperature;
    }

    /**
     * This method sets the value of the database column `tb_qudong_dianji_detail`.control_temperature
     *
     * @param controlTemperature the value for `tb_qudong_dianji_detail`.control_temperature
     */
    public void setControlTemperature(Integer controlTemperature) {
        this.controlTemperature = controlTemperature;
    }

    /**
     * This method returns the value of the database column `tb_qudong_dianji_detail`.speed
     *
     * @return the value of `tb_qudong_dianji_detail`.speed
     */
    public Integer getSpeed() {
        return speed;
    }

    /**
     * This method sets the value of the database column `tb_qudong_dianji_detail`.speed
     *
     * @param speed the value for `tb_qudong_dianji_detail`.speed
     */
    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    /**
     * This method returns the value of the database column `tb_qudong_dianji_detail`.zhuanju
     *
     * @return the value of `tb_qudong_dianji_detail`.zhuanju
     */
    public Integer getZhuanju() {
        return zhuanju;
    }

    /**
     * This method sets the value of the database column `tb_qudong_dianji_detail`.zhuanju
     *
     * @param zhuanju the value for `tb_qudong_dianji_detail`.zhuanju
     */
    public void setZhuanju(Integer zhuanju) {
        this.zhuanju = zhuanju;
    }

    /**
     * This method returns the value of the database column `tb_qudong_dianji_detail`.temperature
     *
     * @return the value of `tb_qudong_dianji_detail`.temperature
     */
    public Integer getTemperature() {
        return temperature;
    }

    /**
     * This method sets the value of the database column `tb_qudong_dianji_detail`.temperature
     *
     * @param temperature the value for `tb_qudong_dianji_detail`.temperature
     */
    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    /**
     * This method returns the value of the database column `tb_qudong_dianji_detail`.dianya
     *
     * @return the value of `tb_qudong_dianji_detail`.dianya
     */
    public Integer getDianya() {
        return dianya;
    }

    /**
     * This method sets the value of the database column `tb_qudong_dianji_detail`.dianya
     *
     * @param dianya the value for `tb_qudong_dianji_detail`.dianya
     */
    public void setDianya(Integer dianya) {
        this.dianya = dianya;
    }

    /**
     * This method returns the value of the database column `tb_qudong_dianji_detail`.dianliu
     *
     * @return the value of `tb_qudong_dianji_detail`.dianliu
     */
    public Integer getDianliu() {
        return dianliu;
    }

    /**
     * This method sets the value of the database column `tb_qudong_dianji_detail`.dianliu
     *
     * @param dianliu the value for `tb_qudong_dianji_detail`.dianliu
     */
    public void setDianliu(Integer dianliu) {
        this.dianliu = dianliu;
    }

    /**
     * This method returns the value of the database column `tb_qudong_dianji_detail`.qudong_dianji_id
     *
     * @return the value of `tb_qudong_dianji_detail`.qudong_dianji_id
     */
    public Long getQudongDianjiId() {
        return qudongDianjiId;
    }

    /**
     * This method sets the value of the database column `tb_qudong_dianji_detail`.qudong_dianji_id
     *
     * @param qudongDianjiId the value for `tb_qudong_dianji_detail`.qudong_dianji_id
     */
    public void setQudongDianjiId(Long qudongDianjiId) {
        this.qudongDianjiId = qudongDianjiId;
    }
}