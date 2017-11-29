/*
 * Copyright (c) 2017. juzhen.io. All rights reserved.
 */

package com.tyj.jhpt.bo;

import com.github.fartherp.framework.core.dao.FieldAccessVo;
import com.github.fartherp.framework.core.dao.TableDataConvertable;
import com.github.fartherp.framework.core.dao.annotation.ColumnDescription;
import com.github.fartherp.framework.core.dao.annotation.Id;

/**
 * This class corresponds to the database table `user_roles`
 */
public abstract class UserRolesBase extends FieldAccessVo implements TableDataConvertable {
    /**
     * This field corresponds to the database column `user_roles`.id
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field corresponds to the database column `user_roles`.id
     */
    private static final String PROPERTY_REMARK_ID = "ID";

    /**
     * This field corresponds to the database column `user_roles`.id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Integer id;

    /**
     * This field corresponds to the database column `user_roles`.user_id
     */
    private static final String PROPERTY_USERID = "userId";

    /**
     * This field corresponds to the database column `user_roles`.user_id
     */
    private static final String PROPERTY_REMARK_USERID = "用户ID";

    /**
     * This field corresponds to the database column `user_roles`.user_id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_USERID)
    private Integer userId;

    /**
     * This field corresponds to the database column `user_roles`.role_id
     */
    private static final String PROPERTY_ROLEID = "roleId";

    /**
     * This field corresponds to the database column `user_roles`.role_id
     */
    private static final String PROPERTY_REMARK_ROLEID = "角色ID";

    /**
     * This field corresponds to the database column `user_roles`.role_id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ROLEID)
    private Integer roleId;

    /**
     * This method returns the value of the database column `user_roles`.id
     *
     * @return the value of `user_roles`.id
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method sets the value of the database column `user_roles`.id
     *
     * @param id the value for `user_roles`.id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column `user_roles`.user_id
     *
     * @return the value of `user_roles`.user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method sets the value of the database column `user_roles`.user_id
     *
     * @param userId the value for `user_roles`.user_id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method returns the value of the database column `user_roles`.role_id
     *
     * @return the value of `user_roles`.role_id
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method sets the value of the database column `user_roles`.role_id
     *
     * @param roleId the value for `user_roles`.role_id
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}