/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.bo;

import com.github.fartherp.framework.core.dao.FieldAccessVo;
import com.github.fartherp.framework.core.dao.TableDataConvertable;
import com.github.fartherp.framework.core.dao.annotation.ColumnDescription;
import com.github.fartherp.framework.core.dao.annotation.Id;

/**
 * This class corresponds to the database table `tb_dianya_detail`
 */
public abstract class DianyaDetailBase extends FieldAccessVo implements TableDataConvertable {
    /**
     * This field corresponds to the database column `tb_dianya_detail`.id
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field corresponds to the database column `tb_dianya_detail`.id
     */
    private static final String PROPERTY_REMARK_ID = "tb_dianya的ID";

    /**
     * This field corresponds to the database column `tb_dianya_detail`.id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Long id;

    /**
     * This field corresponds to the database column `tb_dianya_detail`.system_no
     */
    private static final String PROPERTY_SYSTEMNO = "systemNo";

    /**
     * This field corresponds to the database column `tb_dianya_detail`.system_no
     */
    private static final String PROPERTY_REMARK_SYSTEMNO = "可充电储能子系统号";

    /**
     * This field corresponds to the database column `tb_dianya_detail`.system_no
     */
    @ColumnDescription(desc = PROPERTY_REMARK_SYSTEMNO)
    private Byte systemNo;

    /**
     * This field corresponds to the database column `tb_dianya_detail`.dianya
     */
    private static final String PROPERTY_DIANYA = "dianya";

    /**
     * This field corresponds to the database column `tb_dianya_detail`.dianya
     */
    private static final String PROPERTY_REMARK_DIANYA = "可充电储能装置电压";

    /**
     * This field corresponds to the database column `tb_dianya_detail`.dianya
     */
    @ColumnDescription(desc = PROPERTY_REMARK_DIANYA)
    private Integer dianya;

    /**
     * This field corresponds to the database column `tb_dianya_detail`.dianliu
     */
    private static final String PROPERTY_DIANLIU = "dianliu";

    /**
     * This field corresponds to the database column `tb_dianya_detail`.dianliu
     */
    private static final String PROPERTY_REMARK_DIANLIU = "可充电储能装置电流";

    /**
     * This field corresponds to the database column `tb_dianya_detail`.dianliu
     */
    @ColumnDescription(desc = PROPERTY_REMARK_DIANLIU)
    private Integer dianliu;

    /**
     * This field corresponds to the database column `tb_dianya_detail`.simple_total
     */
    private static final String PROPERTY_SIMPLETOTAL = "simpleTotal";

    /**
     * This field corresponds to the database column `tb_dianya_detail`.simple_total
     */
    private static final String PROPERTY_REMARK_SIMPLETOTAL = "单体电池总数";

    /**
     * This field corresponds to the database column `tb_dianya_detail`.simple_total
     */
    @ColumnDescription(desc = PROPERTY_REMARK_SIMPLETOTAL)
    private Integer simpleTotal;

    /**
     * This field corresponds to the database column `tb_dianya_detail`.seq
     */
    private static final String PROPERTY_SEQ = "seq";

    /**
     * This field corresponds to the database column `tb_dianya_detail`.seq
     */
    private static final String PROPERTY_REMARK_SEQ = "本帧起始电池序号";

    /**
     * This field corresponds to the database column `tb_dianya_detail`.seq
     */
    @ColumnDescription(desc = PROPERTY_REMARK_SEQ)
    private Integer seq;

    /**
     * This field corresponds to the database column `tb_dianya_detail`.own_simple_total
     */
    private static final String PROPERTY_OWNSIMPLETOTAL = "ownSimpleTotal";

    /**
     * This field corresponds to the database column `tb_dianya_detail`.own_simple_total
     */
    private static final String PROPERTY_REMARK_OWNSIMPLETOTAL = "本帧单体电池总数";

    /**
     * This field corresponds to the database column `tb_dianya_detail`.own_simple_total
     */
    @ColumnDescription(desc = PROPERTY_REMARK_OWNSIMPLETOTAL)
    private Byte ownSimpleTotal;

    /**
     * This field corresponds to the database column `tb_dianya_detail`.simple_totals
     */
    private static final String PROPERTY_SIMPLETOTALS = "simpleTotals";

    /**
     * This field corresponds to the database column `tb_dianya_detail`.simple_totals
     */
    private static final String PROPERTY_REMARK_SIMPLETOTALS = "单体电池电压";

    /**
     * This field corresponds to the database column `tb_dianya_detail`.simple_totals
     */
    @ColumnDescription(desc = PROPERTY_REMARK_SIMPLETOTALS)
    private byte[] simpleTotals;

    /**
     * This method returns the value of the database column `tb_dianya_detail`.id
     *
     * @return the value of `tb_dianya_detail`.id
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column `tb_dianya_detail`.id
     *
     * @param id the value for `tb_dianya_detail`.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column `tb_dianya_detail`.system_no
     *
     * @return the value of `tb_dianya_detail`.system_no
     */
    public Byte getSystemNo() {
        return systemNo;
    }

    /**
     * This method sets the value of the database column `tb_dianya_detail`.system_no
     *
     * @param systemNo the value for `tb_dianya_detail`.system_no
     */
    public void setSystemNo(Byte systemNo) {
        this.systemNo = systemNo;
    }

    /**
     * This method returns the value of the database column `tb_dianya_detail`.dianya
     *
     * @return the value of `tb_dianya_detail`.dianya
     */
    public Integer getDianya() {
        return dianya;
    }

    /**
     * This method sets the value of the database column `tb_dianya_detail`.dianya
     *
     * @param dianya the value for `tb_dianya_detail`.dianya
     */
    public void setDianya(Integer dianya) {
        this.dianya = dianya;
    }

    /**
     * This method returns the value of the database column `tb_dianya_detail`.dianliu
     *
     * @return the value of `tb_dianya_detail`.dianliu
     */
    public Integer getDianliu() {
        return dianliu;
    }

    /**
     * This method sets the value of the database column `tb_dianya_detail`.dianliu
     *
     * @param dianliu the value for `tb_dianya_detail`.dianliu
     */
    public void setDianliu(Integer dianliu) {
        this.dianliu = dianliu;
    }

    /**
     * This method returns the value of the database column `tb_dianya_detail`.simple_total
     *
     * @return the value of `tb_dianya_detail`.simple_total
     */
    public Integer getSimpleTotal() {
        return simpleTotal;
    }

    /**
     * This method sets the value of the database column `tb_dianya_detail`.simple_total
     *
     * @param simpleTotal the value for `tb_dianya_detail`.simple_total
     */
    public void setSimpleTotal(Integer simpleTotal) {
        this.simpleTotal = simpleTotal;
    }

    /**
     * This method returns the value of the database column `tb_dianya_detail`.seq
     *
     * @return the value of `tb_dianya_detail`.seq
     */
    public Integer getSeq() {
        return seq;
    }

    /**
     * This method sets the value of the database column `tb_dianya_detail`.seq
     *
     * @param seq the value for `tb_dianya_detail`.seq
     */
    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    /**
     * This method returns the value of the database column `tb_dianya_detail`.own_simple_total
     *
     * @return the value of `tb_dianya_detail`.own_simple_total
     */
    public Byte getOwnSimpleTotal() {
        return ownSimpleTotal;
    }

    /**
     * This method sets the value of the database column `tb_dianya_detail`.own_simple_total
     *
     * @param ownSimpleTotal the value for `tb_dianya_detail`.own_simple_total
     */
    public void setOwnSimpleTotal(Byte ownSimpleTotal) {
        this.ownSimpleTotal = ownSimpleTotal;
    }

    /**
     * This method returns the value of the database column `tb_dianya_detail`.simple_totals
     *
     * @return the value of `tb_dianya_detail`.simple_totals
     */
    public byte[] getSimpleTotals() {
        return simpleTotals;
    }

    /**
     * This method sets the value of the database column `tb_dianya_detail`.simple_totals
     *
     * @param simpleTotals the value for `tb_dianya_detail`.simple_totals
     */
    public void setSimpleTotals(byte[] simpleTotals) {
        this.simpleTotals = simpleTotals;
    }
}