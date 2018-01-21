/*
 * Copyright (c) 2018. CK. All rights reserved.
 */

package com.tyj.jhpt.bo;

import com.github.fartherp.framework.core.dao.FieldAccessVo;
import com.github.fartherp.framework.core.dao.TableDataConvertable;
import com.github.fartherp.framework.core.dao.annotation.ColumnDescription;
import com.github.fartherp.framework.core.dao.annotation.Id;

/**
 * This class corresponds to the database table `tb_wendu_detail`
 */
public abstract class WenduDetailBase extends FieldAccessVo implements TableDataConvertable {
    /**
     * This field corresponds to the database column `tb_wendu_detail`.id
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field corresponds to the database column `tb_wendu_detail`.id
     */
    private static final String PROPERTY_REMARK_ID = "tb_wendu的ID";

    /**
     * This field corresponds to the database column `tb_wendu_detail`.id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Long id;

    /**
     * This field corresponds to the database column `tb_wendu_detail`.system_no
     */
    private static final String PROPERTY_SYSTEMNO = "systemNo";

    /**
     * This field corresponds to the database column `tb_wendu_detail`.system_no
     */
    private static final String PROPERTY_REMARK_SYSTEMNO = "可充电储能子系统号";

    /**
     * This field corresponds to the database column `tb_wendu_detail`.system_no
     */
    @ColumnDescription(desc = PROPERTY_REMARK_SYSTEMNO)
    private Integer systemNo;

    /**
     * This field corresponds to the database column `tb_wendu_detail`.count
     */
    private static final String PROPERTY_COUNT = "count";

    /**
     * This field corresponds to the database column `tb_wendu_detail`.count
     */
    private static final String PROPERTY_REMARK_COUNT = "可充电储能温度探针个数";

    /**
     * This field corresponds to the database column `tb_wendu_detail`.count
     */
    @ColumnDescription(desc = PROPERTY_REMARK_COUNT)
    private Integer count;

    /**
     * This field corresponds to the database column `tb_wendu_detail`.values
     */
    private static final String PROPERTY_VALUES = "values";

    /**
     * This field corresponds to the database column `tb_wendu_detail`.values
     */
    private static final String PROPERTY_REMARK_VALUES = "可充电储能子系统各温度探针监测到的温度值";

    /**
     * This field corresponds to the database column `tb_wendu_detail`.values
     */
    @ColumnDescription(desc = PROPERTY_REMARK_VALUES)
    private byte[] values;

    /**
     * This field corresponds to the database column `tb_wendu_detail`.wendu_id
     */
    private static final String PROPERTY_WENDUID = "wenduId";

    /**
     * This field corresponds to the database column `tb_wendu_detail`.wendu_id
     */
    private static final String PROPERTY_REMARK_WENDUID = "tb_wendu的ID";

    /**
     * This field corresponds to the database column `tb_wendu_detail`.wendu_id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_WENDUID)
    private Long wenduId;

    /**
     * This method returns the value of the database column `tb_wendu_detail`.id
     *
     * @return the value of `tb_wendu_detail`.id
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column `tb_wendu_detail`.id
     *
     * @param id the value for `tb_wendu_detail`.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column `tb_wendu_detail`.system_no
     *
     * @return the value of `tb_wendu_detail`.system_no
     */
    public Integer getSystemNo() {
        return systemNo;
    }

    /**
     * This method sets the value of the database column `tb_wendu_detail`.system_no
     *
     * @param systemNo the value for `tb_wendu_detail`.system_no
     */
    public void setSystemNo(Integer systemNo) {
        this.systemNo = systemNo;
    }

    /**
     * This method returns the value of the database column `tb_wendu_detail`.count
     *
     * @return the value of `tb_wendu_detail`.count
     */
    public Integer getCount() {
        return count;
    }

    /**
     * This method sets the value of the database column `tb_wendu_detail`.count
     *
     * @param count the value for `tb_wendu_detail`.count
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * This method returns the value of the database column `tb_wendu_detail`.values
     *
     * @return the value of `tb_wendu_detail`.values
     */
    public byte[] getValues() {
        return values;
    }

    /**
     * This method sets the value of the database column `tb_wendu_detail`.values
     *
     * @param values the value for `tb_wendu_detail`.values
     */
    public void setValues(byte[] values) {
        this.values = values;
    }

    /**
     * This method returns the value of the database column `tb_wendu_detail`.wendu_id
     *
     * @return the value of `tb_wendu_detail`.wendu_id
     */
    public Long getWenduId() {
        return wenduId;
    }

    /**
     * This method sets the value of the database column `tb_wendu_detail`.wendu_id
     *
     * @param wenduId the value for `tb_wendu_detail`.wendu_id
     */
    public void setWenduId(Long wenduId) {
        this.wenduId = wenduId;
    }
}