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
 * This class corresponds to the database table `tb_terminal_status_upload`
 */
public abstract class TerminalStatusUploadBase extends FieldAccessVo implements TableDataConvertable {
    /**
     * This field corresponds to the database column `tb_terminal_status_upload`.id
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field corresponds to the database column `tb_terminal_status_upload`.id
     */
    private static final String PROPERTY_REMARK_ID = "车载终端状态的ID";

    /**
     * This field corresponds to the database column `tb_terminal_status_upload`.id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Long id;

    /**
     * This field corresponds to the database column `tb_terminal_status_upload`.car_vin
     */
    private static final String PROPERTY_CARVIN = "carVin";

    /**
     * This field corresponds to the database column `tb_terminal_status_upload`.car_vin
     */
    private static final String PROPERTY_REMARK_CARVIN = "车辆vin";

    /**
     * This field corresponds to the database column `tb_terminal_status_upload`.car_vin
     */
    @ColumnDescription(desc = PROPERTY_REMARK_CARVIN)
    private String carVin;

    /**
     * This field corresponds to the database column `tb_terminal_status_upload`.event_time
     */
    private static final String PROPERTY_EVENTTIME = "eventTime";

    /**
     * This field corresponds to the database column `tb_terminal_status_upload`.event_time
     */
    private static final String PROPERTY_REMARK_EVENTTIME = "数据采集时间";

    /**
     * This field corresponds to the database column `tb_terminal_status_upload`.event_time
     */
    @ColumnDescription(desc = PROPERTY_REMARK_EVENTTIME)
    private Date eventTime;

    /**
     * This field corresponds to the database column `tb_terminal_status_upload`.message_type
     */
    private static final String PROPERTY_MESSAGETYPE = "messageType";

    /**
     * This field corresponds to the database column `tb_terminal_status_upload`.message_type
     */
    private static final String PROPERTY_REMARK_MESSAGETYPE = "信息类型标志, 01:电源状态, 02:通电状态 03:通信传输状态";

    /**
     * This field corresponds to the database column `tb_terminal_status_upload`.message_type
     */
    @ColumnDescription(desc = PROPERTY_REMARK_MESSAGETYPE)
    private Integer messageType;

    /**
     * This field corresponds to the database column `tb_terminal_status_upload`.message_body
     */
    private static final String PROPERTY_MESSAGEBODY = "messageBody";

    /**
     * This field corresponds to the database column `tb_terminal_status_upload`.message_body
     */
    private static final String PROPERTY_REMARK_MESSAGEBODY = "信息体, 电源状态: 0-电源故障, 1-电源正常, 通电状态: 0-断电, 1-通电, 通信传输状态: 0-通信传输异常, 1-通信传输正常";

    /**
     * This field corresponds to the database column `tb_terminal_status_upload`.message_body
     */
    @ColumnDescription(desc = PROPERTY_REMARK_MESSAGEBODY)
    private Integer messageBody;

    /**
     * This method returns the value of the database column `tb_terminal_status_upload`.id
     *
     * @return the value of `tb_terminal_status_upload`.id
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column `tb_terminal_status_upload`.id
     *
     * @param id the value for `tb_terminal_status_upload`.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column `tb_terminal_status_upload`.car_vin
     *
     * @return the value of `tb_terminal_status_upload`.car_vin
     */
    public String getCarVin() {
        return carVin;
    }

    /**
     * This method sets the value of the database column `tb_terminal_status_upload`.car_vin
     *
     * @param carVin the value for `tb_terminal_status_upload`.car_vin
     */
    public void setCarVin(String carVin) {
        this.carVin = carVin;
    }

    /**
     * This method returns the value of the database column `tb_terminal_status_upload`.event_time
     *
     * @return the value of `tb_terminal_status_upload`.event_time
     */
    public Date getEventTime() {
        return eventTime;
    }

    /**
     * This method sets the value of the database column `tb_terminal_status_upload`.event_time
     *
     * @param eventTime the value for `tb_terminal_status_upload`.event_time
     */
    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
    }

    /**
     * This method returns the value of the database column `tb_terminal_status_upload`.message_type
     *
     * @return the value of `tb_terminal_status_upload`.message_type
     */
    public Integer getMessageType() {
        return messageType;
    }

    /**
     * This method sets the value of the database column `tb_terminal_status_upload`.message_type
     *
     * @param messageType the value for `tb_terminal_status_upload`.message_type
     */
    public void setMessageType(Integer messageType) {
        this.messageType = messageType;
    }

    /**
     * This method returns the value of the database column `tb_terminal_status_upload`.message_body
     *
     * @return the value of `tb_terminal_status_upload`.message_body
     */
    public Integer getMessageBody() {
        return messageBody;
    }

    /**
     * This method sets the value of the database column `tb_terminal_status_upload`.message_body
     *
     * @param messageBody the value for `tb_terminal_status_upload`.message_body
     */
    public void setMessageBody(Integer messageBody) {
        this.messageBody = messageBody;
    }
}