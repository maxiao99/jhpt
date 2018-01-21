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
 * This class corresponds to the database table `tb_user`
 */
public abstract class UserBase extends FieldAccessVo implements TableDataConvertable {
    /**
     * This field corresponds to the database column `tb_user`.id
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field corresponds to the database column `tb_user`.id
     */
    private static final String PROPERTY_REMARK_ID = "自增ID";

    /**
     * This field corresponds to the database column `tb_user`.id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Long id;

    /**
     * This field corresponds to the database column `tb_user`.user_name
     */
    private static final String PROPERTY_USERNAME = "userName";

    /**
     * This field corresponds to the database column `tb_user`.user_name
     */
    private static final String PROPERTY_REMARK_USERNAME = "用户名";

    /**
     * This field corresponds to the database column `tb_user`.user_name
     */
    @ColumnDescription(desc = PROPERTY_REMARK_USERNAME)
    private String userName;

    /**
     * This field corresponds to the database column `tb_user`.real_name
     */
    private static final String PROPERTY_REALNAME = "realName";

    /**
     * This field corresponds to the database column `tb_user`.real_name
     */
    private static final String PROPERTY_REMARK_REALNAME = "真实姓名";

    /**
     * This field corresponds to the database column `tb_user`.real_name
     */
    @ColumnDescription(desc = PROPERTY_REMARK_REALNAME)
    private String realName;

    /**
     * This field corresponds to the database column `tb_user`.password
     */
    private static final String PROPERTY_PASSWORD = "password";

    /**
     * This field corresponds to the database column `tb_user`.password
     */
    private static final String PROPERTY_REMARK_PASSWORD = "密码";

    /**
     * This field corresponds to the database column `tb_user`.password
     */
    @ColumnDescription(desc = PROPERTY_REMARK_PASSWORD)
    private String password;

    /**
     * This field corresponds to the database column `tb_user`.salt
     */
    private static final String PROPERTY_SALT = "salt";

    /**
     * This field corresponds to the database column `tb_user`.salt
     */
    private static final String PROPERTY_REMARK_SALT = "加密盐";

    /**
     * This field corresponds to the database column `tb_user`.salt
     */
    @ColumnDescription(desc = PROPERTY_REMARK_SALT)
    private String salt;

    /**
     * This field corresponds to the database column `tb_user`.status
     */
    private static final String PROPERTY_STATUS = "status";

    /**
     * This field corresponds to the database column `tb_user`.status
     */
    private static final String PROPERTY_REMARK_STATUS = "状态:1:可用,2不可用";

    /**
     * This field corresponds to the database column `tb_user`.status
     */
    @ColumnDescription(desc = PROPERTY_REMARK_STATUS)
    private Integer status;

    /**
     * This field corresponds to the database column `tb_user`.creator_id
     */
    private static final String PROPERTY_CREATORID = "creatorId";

    /**
     * This field corresponds to the database column `tb_user`.creator_id
     */
    private static final String PROPERTY_REMARK_CREATORID = "创建人ID";

    /**
     * This field corresponds to the database column `tb_user`.creator_id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_CREATORID)
    private Long creatorId;

    /**
     * This field corresponds to the database column `tb_user`.create_time
     */
    private static final String PROPERTY_CREATETIME = "createTime";

    /**
     * This field corresponds to the database column `tb_user`.create_time
     */
    private static final String PROPERTY_REMARK_CREATETIME = "创建时间";

    /**
     * This field corresponds to the database column `tb_user`.create_time
     */
    @ColumnDescription(desc = PROPERTY_REMARK_CREATETIME)
    private Date createTime;

    /**
     * This field corresponds to the database column `tb_user`.auth_id
     */
    private static final String PROPERTY_AUTHID = "authId";

    /**
     * This field corresponds to the database column `tb_user`.auth_id
     */
    private static final String PROPERTY_REMARK_AUTHID = "权限系统ID";

    /**
     * This field corresponds to the database column `tb_user`.auth_id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_AUTHID)
    private Integer authId;

    /**
     * This method returns the value of the database column `tb_user`.id
     *
     * @return the value of `tb_user`.id
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column `tb_user`.id
     *
     * @param id the value for `tb_user`.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column `tb_user`.user_name
     *
     * @return the value of `tb_user`.user_name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method sets the value of the database column `tb_user`.user_name
     *
     * @param userName the value for `tb_user`.user_name
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * This method returns the value of the database column `tb_user`.real_name
     *
     * @return the value of `tb_user`.real_name
     */
    public String getRealName() {
        return realName;
    }

    /**
     * This method sets the value of the database column `tb_user`.real_name
     *
     * @param realName the value for `tb_user`.real_name
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * This method returns the value of the database column `tb_user`.password
     *
     * @return the value of `tb_user`.password
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method sets the value of the database column `tb_user`.password
     *
     * @param password the value for `tb_user`.password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method returns the value of the database column `tb_user`.salt
     *
     * @return the value of `tb_user`.salt
     */
    public String getSalt() {
        return salt;
    }

    /**
     * This method sets the value of the database column `tb_user`.salt
     *
     * @param salt the value for `tb_user`.salt
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }

    /**
     * This method returns the value of the database column `tb_user`.status
     *
     * @return the value of `tb_user`.status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method sets the value of the database column `tb_user`.status
     *
     * @param status the value for `tb_user`.status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method returns the value of the database column `tb_user`.creator_id
     *
     * @return the value of `tb_user`.creator_id
     */
    public Long getCreatorId() {
        return creatorId;
    }

    /**
     * This method sets the value of the database column `tb_user`.creator_id
     *
     * @param creatorId the value for `tb_user`.creator_id
     */
    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    /**
     * This method returns the value of the database column `tb_user`.create_time
     *
     * @return the value of `tb_user`.create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method sets the value of the database column `tb_user`.create_time
     *
     * @param createTime the value for `tb_user`.create_time
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method returns the value of the database column `tb_user`.auth_id
     *
     * @return the value of `tb_user`.auth_id
     */
    public Integer getAuthId() {
        return authId;
    }

    /**
     * This method sets the value of the database column `tb_user`.auth_id
     *
     * @param authId the value for `tb_user`.auth_id
     */
    public void setAuthId(Integer authId) {
        this.authId = authId;
    }
}