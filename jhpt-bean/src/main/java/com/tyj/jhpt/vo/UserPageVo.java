/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.vo;

import com.github.fartherp.framework.core.vo.BaseVo;
import com.tyj.jhpt.bo.User;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: CK
 * @date: 2017/12/14
 */
public class UserPageVo extends BaseVo<User> {
    private String keyword;
    private Integer type;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
