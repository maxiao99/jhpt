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
 * This class corresponds to the database table `user_infos`
 */
public abstract class UserInfosBase extends FieldAccessVo implements TableDataConvertable {
    /**
     * This field corresponds to the database column `user_infos`.id
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field corresponds to the database column `user_infos`.id
     */
    private static final String PROPERTY_REMARK_ID = "自增ID";

    /**
     * This field corresponds to the database column `user_infos`.id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Integer id;

    /**
     * This field corresponds to the database column `user_infos`.user_name
     */
    private static final String PROPERTY_USERNAME = "userName";

    /**
     * This field corresponds to the database column `user_infos`.user_name
     */
    private static final String PROPERTY_REMARK_USERNAME = "用户名";

    /**
     * This field corresponds to the database column `user_infos`.user_name
     */
    @ColumnDescription(desc = PROPERTY_REMARK_USERNAME)
    private String userName;

    /**
     * This field corresponds to the database column `user_infos`.real_name
     */
    private static final String PROPERTY_REALNAME = "realName";

    /**
     * This field corresponds to the database column `user_infos`.real_name
     */
    private static final String PROPERTY_REMARK_REALNAME = "真实姓名";

    /**
     * This field corresponds to the database column `user_infos`.real_name
     */
    @ColumnDescription(desc = PROPERTY_REMARK_REALNAME)
    private String realName;

    /**
     * This field corresponds to the database column `user_infos`.password
     */
    private static final String PROPERTY_PASSWORD = "password";

    /**
     * This field corresponds to the database column `user_infos`.password
     */
    private static final String PROPERTY_REMARK_PASSWORD = "密码";

    /**
     * This field corresponds to the database column `user_infos`.password
     */
    @ColumnDescription(desc = PROPERTY_REMARK_PASSWORD)
    private String password;

    /**
     * This field corresponds to the database column `user_infos`.salt
     */
    private static final String PROPERTY_SALT = "salt";

    /**
     * This field corresponds to the database column `user_infos`.salt
     */
    private static final String PROPERTY_REMARK_SALT = "";

    /**
     * This field corresponds to the database column `user_infos`.salt
     */
    @ColumnDescription(desc = PROPERTY_REMARK_SALT)
    private String salt;

    /**
     * This field corresponds to the database column `user_infos`.state
     */
    private static final String PROPERTY_STATE = "state";

    /**
     * This field corresponds to the database column `user_infos`.state
     */
    private static final String PROPERTY_REMARK_STATE = "状态:1:可用,2不可用";

    /**
     * This field corresponds to the database column `user_infos`.state
     */
    @ColumnDescription(desc = PROPERTY_REMARK_STATE)
    private Byte state;

    /**
     * This field corresponds to the database column `user_infos`.creator_id
     */
    private static final String PROPERTY_CREATORID = "creatorId";

    /**
     * This field corresponds to the database column `user_infos`.creator_id
     */
    private static final String PROPERTY_REMARK_CREATORID = "创建人ID";

    /**
     * This field corresponds to the database column `user_infos`.creator_id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_CREATORID)
    private Integer creatorId;

    /**
     * This field corresponds to the database column `user_infos`.create_time
     */
    private static final String PROPERTY_CREATETIME = "createTime";

    /**
     * This field corresponds to the database column `user_infos`.create_time
     */
    private static final String PROPERTY_REMARK_CREATETIME = "创建时间";

    /**
     * This field corresponds to the database column `user_infos`.create_time
     */
    @ColumnDescription(desc = PROPERTY_REMARK_CREATETIME)
    private Date createTime;

    /**
     * This field corresponds to the database column `user_infos`.auth_id
     */
    private static final String PROPERTY_AUTHID = "authId";

    /**
     * This field corresponds to the database column `user_infos`.auth_id
     */
    private static final String PROPERTY_REMARK_AUTHID = "权限系统ID";

    /**
     * This field corresponds to the database column `user_infos`.auth_id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_AUTHID)
    private Integer authId;

    /**
     * This method returns the value of the database column `user_infos`.id
     *
     * @return the value of `user_infos`.id
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method sets the value of the database column `user_infos`.id
     *
     * @param id the value for `user_infos`.id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column `user_infos`.user_name
     *
     * @return the value of `user_infos`.user_name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method sets the value of the database column `user_infos`.user_name
     *
     * @param userName the value for `user_infos`.user_name
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * This method returns the value of the database column `user_infos`.real_name
     *
     * @return the value of `user_infos`.real_name
     */
    public String getRealName() {
        return realName;
    }

    /**
     * This method sets the value of the database column `user_infos`.real_name
     *
     * @param realName the value for `user_infos`.real_name
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * This method returns the value of the database column `user_infos`.password
     *
     * @return the value of `user_infos`.password
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method sets the value of the database column `user_infos`.password
     *
     * @param password the value for `user_infos`.password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method returns the value of the database column `user_infos`.salt
     *
     * @return the value of `user_infos`.salt
     */
    public String getSalt() {
        return salt;
    }

    /**
     * This method sets the value of the database column `user_infos`.salt
     *
     * @param salt the value for `user_infos`.salt
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }

    /**
     * This method returns the value of the database column `user_infos`.state
     *
     * @return the value of `user_infos`.state
     */
    public Byte getState() {
        return state;
    }

    /**
     * This method sets the value of the database column `user_infos`.state
     *
     * @param state the value for `user_infos`.state
     */
    public void setState(Byte state) {
        this.state = state;
    }

    /**
     * This method returns the value of the database column `user_infos`.creator_id
     *
     * @return the value of `user_infos`.creator_id
     */
    public Integer getCreatorId() {
        return creatorId;
    }

    /**
     * This method sets the value of the database column `user_infos`.creator_id
     *
     * @param creatorId the value for `user_infos`.creator_id
     */
    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    /**
     * This method returns the value of the database column `user_infos`.create_time
     *
     * @return the value of `user_infos`.create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method sets the value of the database column `user_infos`.create_time
     *
     * @param createTime the value for `user_infos`.create_time
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method returns the value of the database column `user_infos`.auth_id
     *
     * @return the value of `user_infos`.auth_id
     */
    public Integer getAuthId() {
        return authId;
    }

    /**
     * This method sets the value of the database column `user_infos`.auth_id
     *
     * @param authId the value for `user_infos`.auth_id
     */
    public void setAuthId(Integer authId) {
        this.authId = authId;
    }
}