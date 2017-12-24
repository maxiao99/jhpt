/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.tyj.jhpt.web.controller;

import com.github.fartherp.framework.core.kv.service.KvService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * Created by IntelliJ IDEA.
 * Author: CK
 * Date: 2016/4/4
 */
public abstract class AbstractController {

    @Resource(name = "kvService")
    KvService kvService;

    /**
     * 统一初始化页面
     * @return
     */
    @RequestMapping(value = "/{model}")
    public ModelAndView init(@PathVariable String model) {
        RequestMapping r = this.getClass().getAnnotation(RequestMapping.class);
        return new ModelAndView(r.value()[0] + "/" + model);
    }
}
