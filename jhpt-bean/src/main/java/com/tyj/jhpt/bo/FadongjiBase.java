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
 * This class corresponds to the database table `tb_fadongji`
 */
public abstract class FadongjiBase extends FieldAccessVo implements TableDataConvertable {
    /**
     * This field corresponds to the database column `tb_fadongji`.id
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field corresponds to the database column `tb_fadongji`.id
     */
    private static final String PROPERTY_REMARK_ID = "自增ID";

    /**
     * This field corresponds to the database column `tb_fadongji`.id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Long id;

    /**
     * This field corresponds to the database column `tb_fadongji`.car_vin
     */
    private static final String PROPERTY_CARVIN = "carVin";

    /**
     * This field corresponds to the database column `tb_fadongji`.car_vin
     */
    private static final String PROPERTY_REMARK_CARVIN = "车辆vin";

    /**
     * This field corresponds to the database column `tb_fadongji`.car_vin
     */
    @ColumnDescription(desc = PROPERTY_REMARK_CARVIN)
    private String carVin;

    /**
     * This field corresponds to the database column `tb_fadongji`.event_time
     */
    private static final String PROPERTY_EVENTTIME = "eventTime";

    /**
     * This field corresponds to the database column `tb_fadongji`.event_time
     */
    private static final String PROPERTY_REMARK_EVENTTIME = "数据采集时间";

    /**
     * This field corresponds to the database column `tb_fadongji`.event_time
     */
    @ColumnDescription(desc = PROPERTY_REMARK_EVENTTIME)
    private Date eventTime;

    /**
     * This field corresponds to the database column `tb_fadongji`.status
     */
    private static final String PROPERTY_STATUS = "status";

    /**
     * This field corresponds to the database column `tb_fadongji`.status
     */
    private static final String PROPERTY_REMARK_STATUS = "发动机状态";

    /**
     * This field corresponds to the database column `tb_fadongji`.status
     */
    @ColumnDescription(desc = PROPERTY_REMARK_STATUS)
    private Integer status;

    /**
     * This field corresponds to the database column `tb_fadongji`.speed
     */
    private static final String PROPERTY_SPEED = "speed";

    /**
     * This field corresponds to the database column `tb_fadongji`.speed
     */
    private static final String PROPERTY_REMARK_SPEED = "曲轴转速";

    /**
     * This field corresponds to the database column `tb_fadongji`.speed
     */
    @ColumnDescription(desc = PROPERTY_REMARK_SPEED)
    private Integer speed;

    /**
     * This field corresponds to the database column `tb_fadongji`.xiaohaolv
     */
    private static final String PROPERTY_XIAOHAOLV = "xiaohaolv";

    /**
     * This field corresponds to the database column `tb_fadongji`.xiaohaolv
     */
    private static final String PROPERTY_REMARK_XIAOHAOLV = "燃料消耗率";

    /**
     * This field corresponds to the database column `tb_fadongji`.xiaohaolv
     */
    @ColumnDescription(desc = PROPERTY_REMARK_XIAOHAOLV)
    private Integer xiaohaolv;

    /**
     * This method returns the value of the database column `tb_fadongji`.id
     *
     * @return the value of `tb_fadongji`.id
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column `tb_fadongji`.id
     *
     * @param id the value for `tb_fadongji`.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column `tb_fadongji`.car_vin
     *
     * @return the value of `tb_fadongji`.car_vin
     */
    public String getCarVin() {
        return carVin;
    }

    /**
     * This method sets the value of the database column `tb_fadongji`.car_vin
     *
     * @param carVin the value for `tb_fadongji`.car_vin
     */
    public void setCarVin(String carVin) {
        this.carVin = carVin;
    }

    /**
     * This method returns the value of the database column `tb_fadongji`.event_time
     *
     * @return the value of `tb_fadongji`.event_time
     */
    public Date getEventTime() {
        return eventTime;
    }

    /**
     * This method sets the value of the database column `tb_fadongji`.event_time
     *
     * @param eventTime the value for `tb_fadongji`.event_time
     */
    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
    }

    /**
     * This method returns the value of the database column `tb_fadongji`.status
     *
     * @return the value of `tb_fadongji`.status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method sets the value of the database column `tb_fadongji`.status
     *
     * @param status the value for `tb_fadongji`.status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method returns the value of the database column `tb_fadongji`.speed
     *
     * @return the value of `tb_fadongji`.speed
     */
    public Integer getSpeed() {
        return speed;
    }

    /**
     * This method sets the value of the database column `tb_fadongji`.speed
     *
     * @param speed the value for `tb_fadongji`.speed
     */
    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    /**
     * This method returns the value of the database column `tb_fadongji`.xiaohaolv
     *
     * @return the value of `tb_fadongji`.xiaohaolv
     */
    public Integer getXiaohaolv() {
        return xiaohaolv;
    }

    /**
     * This method sets the value of the database column `tb_fadongji`.xiaohaolv
     *
     * @param xiaohaolv the value for `tb_fadongji`.xiaohaolv
     */
    public void setXiaohaolv(Integer xiaohaolv) {
        this.xiaohaolv = xiaohaolv;
    }
}