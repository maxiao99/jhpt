/*
 * Copyright (c) 2017. juzhen.io. All rights reserved.
 */

package com.tyj.jhpt.bo;

import com.github.fartherp.framework.core.dao.FieldAccessVo;
import com.github.fartherp.framework.core.dao.TableDataConvertable;
import com.github.fartherp.framework.core.dao.annotation.ColumnDescription;
import com.github.fartherp.framework.core.dao.annotation.Id;

import java.util.Date;

/**
 * This class corresponds to the database table `trade_infos`
 */
public abstract class TradeInfosBase extends FieldAccessVo implements TableDataConvertable {
    /**
     * This field corresponds to the database column `trade_infos`.id
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field corresponds to the database column `trade_infos`.id
     */
    private static final String PROPERTY_REMARK_ID = "";

    /**
     * This field corresponds to the database column `trade_infos`.id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Integer id;

    /**
     * This field corresponds to the database column `trade_infos`.device_id
     */
    private static final String PROPERTY_DEVICEID = "deviceId";

    /**
     * This field corresponds to the database column `trade_infos`.device_id
     */
    private static final String PROPERTY_REMARK_DEVICEID = "设备ID";

    /**
     * This field corresponds to the database column `trade_infos`.device_id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_DEVICEID)
    private Integer deviceId;

    /**
     * This field corresponds to the database column `trade_infos`.accountant_id
     */
    private static final String PROPERTY_ACCOUNTANTID = "accountantId";

    /**
     * This field corresponds to the database column `trade_infos`.accountant_id
     */
    private static final String PROPERTY_REMARK_ACCOUNTANTID = "确认付费会计ID";

    /**
     * This field corresponds to the database column `trade_infos`.accountant_id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ACCOUNTANTID)
    private Integer accountantId;

    /**
     * This field corresponds to the database column `trade_infos`.accountant_confirm_time
     */
    private static final String PROPERTY_ACCOUNTANTCONFIRMTIME = "accountantConfirmTime";

    /**
     * This field corresponds to the database column `trade_infos`.accountant_confirm_time
     */
    private static final String PROPERTY_REMARK_ACCOUNTANTCONFIRMTIME = "会计确认时间";

    /**
     * This field corresponds to the database column `trade_infos`.accountant_confirm_time
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ACCOUNTANTCONFIRMTIME)
    private Date accountantConfirmTime;

    /**
     * This field corresponds to the database column `trade_infos`.activator_id
     */
    private static final String PROPERTY_ACTIVATORID = "activatorId";

    /**
     * This field corresponds to the database column `trade_infos`.activator_id
     */
    private static final String PROPERTY_REMARK_ACTIVATORID = "激活者ID";

    /**
     * This field corresponds to the database column `trade_infos`.activator_id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ACTIVATORID)
    private Integer activatorId;

    /**
     * This field corresponds to the database column `trade_infos`.activator_confirm_time
     */
    private static final String PROPERTY_ACTIVATORCONFIRMTIME = "activatorConfirmTime";

    /**
     * This field corresponds to the database column `trade_infos`.activator_confirm_time
     */
    private static final String PROPERTY_REMARK_ACTIVATORCONFIRMTIME = "激活者激活时间";

    /**
     * This field corresponds to the database column `trade_infos`.activator_confirm_time
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ACTIVATORCONFIRMTIME)
    private Date activatorConfirmTime;

    /**
     * This field corresponds to the database column `trade_infos`.activate_type
     */
    private static final String PROPERTY_ACTIVATETYPE = "activateType";

    /**
     * This field corresponds to the database column `trade_infos`.activate_type
     */
    private static final String PROPERTY_REMARK_ACTIVATETYPE = "激活类型";

    /**
     * This field corresponds to the database column `trade_infos`.activate_type
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ACTIVATETYPE)
    private Byte activateType;

    /**
     * This field corresponds to the database column `trade_infos`.create_time
     */
    private static final String PROPERTY_CREATETIME = "createTime";

    /**
     * This field corresponds to the database column `trade_infos`.create_time
     */
    private static final String PROPERTY_REMARK_CREATETIME = "交易建立时间";

    /**
     * This field corresponds to the database column `trade_infos`.create_time
     */
    @ColumnDescription(desc = PROPERTY_REMARK_CREATETIME)
    private Date createTime;

    /**
     * This field corresponds to the database column `trade_infos`.outofdate_time
     */
    private static final String PROPERTY_OUTOFDATETIME = "outofdateTime";

    /**
     * This field corresponds to the database column `trade_infos`.outofdate_time
     */
    private static final String PROPERTY_REMARK_OUTOFDATETIME = "过期时间";

    /**
     * This field corresponds to the database column `trade_infos`.outofdate_time
     */
    @ColumnDescription(desc = PROPERTY_REMARK_OUTOFDATETIME)
    private Date outofdateTime;

    /**
     * This field corresponds to the database column `trade_infos`.activate
     */
    private static final String PROPERTY_ACTIVATE = "activate";

    /**
     * This field corresponds to the database column `trade_infos`.activate
     */
    private static final String PROPERTY_REMARK_ACTIVATE = "激活状态";

    /**
     * This field corresponds to the database column `trade_infos`.activate
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ACTIVATE)
    private Integer activate;

    /**
     * This method returns the value of the database column `trade_infos`.id
     *
     * @return the value of `trade_infos`.id
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method sets the value of the database column `trade_infos`.id
     *
     * @param id the value for `trade_infos`.id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column `trade_infos`.device_id
     *
     * @return the value of `trade_infos`.device_id
     */
    public Integer getDeviceId() {
        return deviceId;
    }

    /**
     * This method sets the value of the database column `trade_infos`.device_id
     *
     * @param deviceId the value for `trade_infos`.device_id
     */
    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * This method returns the value of the database column `trade_infos`.accountant_id
     *
     * @return the value of `trade_infos`.accountant_id
     */
    public Integer getAccountantId() {
        return accountantId;
    }

    /**
     * This method sets the value of the database column `trade_infos`.accountant_id
     *
     * @param accountantId the value for `trade_infos`.accountant_id
     */
    public void setAccountantId(Integer accountantId) {
        this.accountantId = accountantId;
    }

    /**
     * This method returns the value of the database column `trade_infos`.accountant_confirm_time
     *
     * @return the value of `trade_infos`.accountant_confirm_time
     */
    public Date getAccountantConfirmTime() {
        return accountantConfirmTime;
    }

    /**
     * This method sets the value of the database column `trade_infos`.accountant_confirm_time
     *
     * @param accountantConfirmTime the value for `trade_infos`.accountant_confirm_time
     */
    public void setAccountantConfirmTime(Date accountantConfirmTime) {
        this.accountantConfirmTime = accountantConfirmTime;
    }

    /**
     * This method returns the value of the database column `trade_infos`.activator_id
     *
     * @return the value of `trade_infos`.activator_id
     */
    public Integer getActivatorId() {
        return activatorId;
    }

    /**
     * This method sets the value of the database column `trade_infos`.activator_id
     *
     * @param activatorId the value for `trade_infos`.activator_id
     */
    public void setActivatorId(Integer activatorId) {
        this.activatorId = activatorId;
    }

    /**
     * This method returns the value of the database column `trade_infos`.activator_confirm_time
     *
     * @return the value of `trade_infos`.activator_confirm_time
     */
    public Date getActivatorConfirmTime() {
        return activatorConfirmTime;
    }

    /**
     * This method sets the value of the database column `trade_infos`.activator_confirm_time
     *
     * @param activatorConfirmTime the value for `trade_infos`.activator_confirm_time
     */
    public void setActivatorConfirmTime(Date activatorConfirmTime) {
        this.activatorConfirmTime = activatorConfirmTime;
    }

    /**
     * This method returns the value of the database column `trade_infos`.activate_type
     *
     * @return the value of `trade_infos`.activate_type
     */
    public Byte getActivateType() {
        return activateType;
    }

    /**
     * This method sets the value of the database column `trade_infos`.activate_type
     *
     * @param activateType the value for `trade_infos`.activate_type
     */
    public void setActivateType(Byte activateType) {
        this.activateType = activateType;
    }

    /**
     * This method returns the value of the database column `trade_infos`.create_time
     *
     * @return the value of `trade_infos`.create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method sets the value of the database column `trade_infos`.create_time
     *
     * @param createTime the value for `trade_infos`.create_time
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method returns the value of the database column `trade_infos`.outofdate_time
     *
     * @return the value of `trade_infos`.outofdate_time
     */
    public Date getOutofdateTime() {
        return outofdateTime;
    }

    /**
     * This method sets the value of the database column `trade_infos`.outofdate_time
     *
     * @param outofdateTime the value for `trade_infos`.outofdate_time
     */
    public void setOutofdateTime(Date outofdateTime) {
        this.outofdateTime = outofdateTime;
    }

    /**
     * This method returns the value of the database column `trade_infos`.activate
     *
     * @return the value of `trade_infos`.activate
     */
    public Integer getActivate() {
        return activate;
    }

    /**
     * This method sets the value of the database column `trade_infos`.activate
     *
     * @param activate the value for `trade_infos`.activate
     */
    public void setActivate(Integer activate) {
        this.activate = activate;
    }
}