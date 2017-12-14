/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.tyj.jhpt.web.controller.general;


import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * Author: CK
 * Date: 2016/5/22
 */
public class KvVoExt {

    public KvVoExt(Integer module, String desc, Map<String, Object> params) {
        this(module, desc, null, params);
    }

    public KvVoExt(Integer module, String desc, Long id, Map<String, Object> params) {
        this.module = module;
        this.desc = desc;
        this.id = id;
        this.params = params;
    }

    private Integer module;
    private String desc;
    private Long id;
    private Map<String, Object> params;

    public Integer getModule() {
        return module;
    }

    public void setModule(Integer module) {
        this.module = module;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }
}
