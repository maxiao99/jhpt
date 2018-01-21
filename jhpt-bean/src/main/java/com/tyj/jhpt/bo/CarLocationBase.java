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
 * This class corresponds to the database table `tb_car_location`
 */
public abstract class CarLocationBase extends FieldAccessVo implements TableDataConvertable {
    /**
     * This field corresponds to the database column `tb_car_location`.id
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field corresponds to the database column `tb_car_location`.id
     */
    private static final String PROPERTY_REMARK_ID = "自增ID";

    /**
     * This field corresponds to the database column `tb_car_location`.id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Long id;

    /**
     * This field corresponds to the database column `tb_car_location`.car_vin
     */
    private static final String PROPERTY_CARVIN = "carVin";

    /**
     * This field corresponds to the database column `tb_car_location`.car_vin
     */
    private static final String PROPERTY_REMARK_CARVIN = "车辆vin";

    /**
     * This field corresponds to the database column `tb_car_location`.car_vin
     */
    @ColumnDescription(desc = PROPERTY_REMARK_CARVIN)
    private String carVin;

    /**
     * This field corresponds to the database column `tb_car_location`.event_time
     */
    private static final String PROPERTY_EVENTTIME = "eventTime";

    /**
     * This field corresponds to the database column `tb_car_location`.event_time
     */
    private static final String PROPERTY_REMARK_EVENTTIME = "数据采集时间";

    /**
     * This field corresponds to the database column `tb_car_location`.event_time
     */
    @ColumnDescription(desc = PROPERTY_REMARK_EVENTTIME)
    private Date eventTime;

    /**
     * This field corresponds to the database column `tb_car_location`.location_status
     */
    private static final String PROPERTY_LOCATIONSTATUS = "locationStatus";

    /**
     * This field corresponds to the database column `tb_car_location`.location_status
     */
    private static final String PROPERTY_REMARK_LOCATIONSTATUS = "定位状态";

    /**
     * This field corresponds to the database column `tb_car_location`.location_status
     */
    @ColumnDescription(desc = PROPERTY_REMARK_LOCATIONSTATUS)
    private Integer locationStatus;

    /**
     * This field corresponds to the database column `tb_car_location`.longitude
     */
    private static final String PROPERTY_LONGITUDE = "longitude";

    /**
     * This field corresponds to the database column `tb_car_location`.longitude
     */
    private static final String PROPERTY_REMARK_LONGITUDE = "经度";

    /**
     * This field corresponds to the database column `tb_car_location`.longitude
     */
    @ColumnDescription(desc = PROPERTY_REMARK_LONGITUDE)
    private Double longitude;

    /**
     * This field corresponds to the database column `tb_car_location`.latitude
     */
    private static final String PROPERTY_LATITUDE = "latitude";

    /**
     * This field corresponds to the database column `tb_car_location`.latitude
     */
    private static final String PROPERTY_REMARK_LATITUDE = "纬度";

    /**
     * This field corresponds to the database column `tb_car_location`.latitude
     */
    @ColumnDescription(desc = PROPERTY_REMARK_LATITUDE)
    private Double latitude;

    /**
     * This method returns the value of the database column `tb_car_location`.id
     *
     * @return the value of `tb_car_location`.id
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column `tb_car_location`.id
     *
     * @param id the value for `tb_car_location`.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column `tb_car_location`.car_vin
     *
     * @return the value of `tb_car_location`.car_vin
     */
    public String getCarVin() {
        return carVin;
    }

    /**
     * This method sets the value of the database column `tb_car_location`.car_vin
     *
     * @param carVin the value for `tb_car_location`.car_vin
     */
    public void setCarVin(String carVin) {
        this.carVin = carVin;
    }

    /**
     * This method returns the value of the database column `tb_car_location`.event_time
     *
     * @return the value of `tb_car_location`.event_time
     */
    public Date getEventTime() {
        return eventTime;
    }

    /**
     * This method sets the value of the database column `tb_car_location`.event_time
     *
     * @param eventTime the value for `tb_car_location`.event_time
     */
    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
    }

    /**
     * This method returns the value of the database column `tb_car_location`.location_status
     *
     * @return the value of `tb_car_location`.location_status
     */
    public Integer getLocationStatus() {
        return locationStatus;
    }

    /**
     * This method sets the value of the database column `tb_car_location`.location_status
     *
     * @param locationStatus the value for `tb_car_location`.location_status
     */
    public void setLocationStatus(Integer locationStatus) {
        this.locationStatus = locationStatus;
    }

    /**
     * This method returns the value of the database column `tb_car_location`.longitude
     *
     * @return the value of `tb_car_location`.longitude
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * This method sets the value of the database column `tb_car_location`.longitude
     *
     * @param longitude the value for `tb_car_location`.longitude
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * This method returns the value of the database column `tb_car_location`.latitude
     *
     * @return the value of `tb_car_location`.latitude
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * This method sets the value of the database column `tb_car_location`.latitude
     *
     * @param latitude the value for `tb_car_location`.latitude
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }
}