/*
 * Copyright (c) 2018. CK. All rights reserved.
 */

package com.tyj.jhpt.bo;

import com.github.fartherp.framework.core.dao.FieldAccessVo;
import com.github.fartherp.framework.core.dao.TableDataConvertable;
import com.github.fartherp.framework.core.dao.annotation.ColumnDescription;
import com.github.fartherp.framework.core.dao.annotation.Id;

/**
 * This class corresponds to the database table `tb_car_terminal_status`
 */
public abstract class CarTerminalStatusBase extends FieldAccessVo implements TableDataConvertable {
    /**
     * This field corresponds to the database column `tb_car_terminal_status`.id
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field corresponds to the database column `tb_car_terminal_status`.id
     */
    private static final String PROPERTY_REMARK_ID = "自增ID";

    /**
     * This field corresponds to the database column `tb_car_terminal_status`.id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Long id;

    /**
     * This field corresponds to the database column `tb_car_terminal_status`.alarm_type
     */
    private static final String PROPERTY_ALARMTYPE = "alarmType";

    /**
     * This field corresponds to the database column `tb_car_terminal_status`.alarm_type
     */
    private static final String PROPERTY_REMARK_ALARMTYPE = "车载终端状态信息类型";

    /**
     * This field corresponds to the database column `tb_car_terminal_status`.alarm_type
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ALARMTYPE)
    private Integer alarmType;

    /**
     * This field corresponds to the database column `tb_car_terminal_status`.alarm_body
     */
    private static final String PROPERTY_ALARMBODY = "alarmBody";

    /**
     * This field corresponds to the database column `tb_car_terminal_status`.alarm_body
     */
    private static final String PROPERTY_REMARK_ALARMBODY = "车载终端状态信息体";

    /**
     * This field corresponds to the database column `tb_car_terminal_status`.alarm_body
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ALARMBODY)
    private Integer alarmBody;

    /**
     * This field corresponds to the database column `tb_car_terminal_status`.terminal_status_upload_id
     */
    private static final String PROPERTY_TERMINALSTATUSUPLOADID = "terminalStatusUploadId";

    /**
     * This field corresponds to the database column `tb_car_terminal_status`.terminal_status_upload_id
     */
    private static final String PROPERTY_REMARK_TERMINALSTATUSUPLOADID = "tb_terminal_status_upload的ID";

    /**
     * This field corresponds to the database column `tb_car_terminal_status`.terminal_status_upload_id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_TERMINALSTATUSUPLOADID)
    private Long terminalStatusUploadId;

    /**
     * This method returns the value of the database column `tb_car_terminal_status`.id
     *
     * @return the value of `tb_car_terminal_status`.id
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column `tb_car_terminal_status`.id
     *
     * @param id the value for `tb_car_terminal_status`.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column `tb_car_terminal_status`.alarm_type
     *
     * @return the value of `tb_car_terminal_status`.alarm_type
     */
    public Integer getAlarmType() {
        return alarmType;
    }

    /**
     * This method sets the value of the database column `tb_car_terminal_status`.alarm_type
     *
     * @param alarmType the value for `tb_car_terminal_status`.alarm_type
     */
    public void setAlarmType(Integer alarmType) {
        this.alarmType = alarmType;
    }

    /**
     * This method returns the value of the database column `tb_car_terminal_status`.alarm_body
     *
     * @return the value of `tb_car_terminal_status`.alarm_body
     */
    public Integer getAlarmBody() {
        return alarmBody;
    }

    /**
     * This method sets the value of the database column `tb_car_terminal_status`.alarm_body
     *
     * @param alarmBody the value for `tb_car_terminal_status`.alarm_body
     */
    public void setAlarmBody(Integer alarmBody) {
        this.alarmBody = alarmBody;
    }

    /**
     * This method returns the value of the database column `tb_car_terminal_status`.terminal_status_upload_id
     *
     * @return the value of `tb_car_terminal_status`.terminal_status_upload_id
     */
    public Long getTerminalStatusUploadId() {
        return terminalStatusUploadId;
    }

    /**
     * This method sets the value of the database column `tb_car_terminal_status`.terminal_status_upload_id
     *
     * @param terminalStatusUploadId the value for `tb_car_terminal_status`.terminal_status_upload_id
     */
    public void setTerminalStatusUploadId(Long terminalStatusUploadId) {
        this.terminalStatusUploadId = terminalStatusUploadId;
    }
}