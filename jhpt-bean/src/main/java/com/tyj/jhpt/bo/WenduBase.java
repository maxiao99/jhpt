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
 * This class corresponds to the database table `tb_wendu`
 */
public abstract class WenduBase extends FieldAccessVo implements TableDataConvertable {
    /**
     * This field corresponds to the database column `tb_wendu`.id
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field corresponds to the database column `tb_wendu`.id
     */
    private static final String PROPERTY_REMARK_ID = "自增ID";

    /**
     * This field corresponds to the database column `tb_wendu`.id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Long id;

    /**
     * This field corresponds to the database column `tb_wendu`.car_vin
     */
    private static final String PROPERTY_CARVIN = "carVin";

    /**
     * This field corresponds to the database column `tb_wendu`.car_vin
     */
    private static final String PROPERTY_REMARK_CARVIN = "车辆vin";

    /**
     * This field corresponds to the database column `tb_wendu`.car_vin
     */
    @ColumnDescription(desc = PROPERTY_REMARK_CARVIN)
    private String carVin;

    /**
     * This field corresponds to the database column `tb_wendu`.event_time
     */
    private static final String PROPERTY_EVENTTIME = "eventTime";

    /**
     * This field corresponds to the database column `tb_wendu`.event_time
     */
    private static final String PROPERTY_REMARK_EVENTTIME = "数据采集时间";

    /**
     * This field corresponds to the database column `tb_wendu`.event_time
     */
    @ColumnDescription(desc = PROPERTY_REMARK_EVENTTIME)
    private Date eventTime;

    /**
     * This field corresponds to the database column `tb_wendu`.system_no
     */
    private static final String PROPERTY_SYSTEMNO = "systemNo";

    /**
     * This field corresponds to the database column `tb_wendu`.system_no
     */
    private static final String PROPERTY_REMARK_SYSTEMNO = "可充电储能子系统号";

    /**
     * This field corresponds to the database column `tb_wendu`.system_no
     */
    @ColumnDescription(desc = PROPERTY_REMARK_SYSTEMNO)
    private Byte systemNo;

    /**
     * This field corresponds to the database column `tb_wendu`.count
     */
    private static final String PROPERTY_COUNT = "count";

    /**
     * This field corresponds to the database column `tb_wendu`.count
     */
    private static final String PROPERTY_REMARK_COUNT = "可充电储能温度探针个数";

    /**
     * This field corresponds to the database column `tb_wendu`.count
     */
    @ColumnDescription(desc = PROPERTY_REMARK_COUNT)
    private Integer count;

    /**
     * This field corresponds to the database column `tb_wendu`.values
     */
    private static final String PROPERTY_VALUES = "values";

    /**
     * This field corresponds to the database column `tb_wendu`.values
     */
    private static final String PROPERTY_REMARK_VALUES = "可充电储能子系统各温度探针监测到的温度值";

    /**
     * This field corresponds to the database column `tb_wendu`.values
     */
    @ColumnDescription(desc = PROPERTY_REMARK_VALUES)
    private byte[] values;

    /**
     * This method returns the value of the database column `tb_wendu`.id
     *
     * @return the value of `tb_wendu`.id
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column `tb_wendu`.id
     *
     * @param id the value for `tb_wendu`.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column `tb_wendu`.car_vin
     *
     * @return the value of `tb_wendu`.car_vin
     */
    public String getCarVin() {
        return carVin;
    }

    /**
     * This method sets the value of the database column `tb_wendu`.car_vin
     *
     * @param carVin the value for `tb_wendu`.car_vin
     */
    public void setCarVin(String carVin) {
        this.carVin = carVin;
    }

    /**
     * This method returns the value of the database column `tb_wendu`.event_time
     *
     * @return the value of `tb_wendu`.event_time
     */
    public Date getEventTime() {
        return eventTime;
    }

    /**
     * This method sets the value of the database column `tb_wendu`.event_time
     *
     * @param eventTime the value for `tb_wendu`.event_time
     */
    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
    }

    /**
     * This method returns the value of the database column `tb_wendu`.system_no
     *
     * @return the value of `tb_wendu`.system_no
     */
    public Byte getSystemNo() {
        return systemNo;
    }

    /**
     * This method sets the value of the database column `tb_wendu`.system_no
     *
     * @param systemNo the value for `tb_wendu`.system_no
     */
    public void setSystemNo(Byte systemNo) {
        this.systemNo = systemNo;
    }

    /**
     * This method returns the value of the database column `tb_wendu`.count
     *
     * @return the value of `tb_wendu`.count
     */
    public Integer getCount() {
        return count;
    }

    /**
     * This method sets the value of the database column `tb_wendu`.count
     *
     * @param count the value for `tb_wendu`.count
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * This method returns the value of the database column `tb_wendu`.values
     *
     * @return the value of `tb_wendu`.values
     */
    public byte[] getValues() {
        return values;
    }

    /**
     * This method sets the value of the database column `tb_wendu`.values
     *
     * @param values the value for `tb_wendu`.values
     */
    public void setValues(byte[] values) {
        this.values = values;
    }
}