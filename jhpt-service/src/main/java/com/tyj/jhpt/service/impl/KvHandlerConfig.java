/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.service.impl;

import com.github.fartherp.framework.common.util.MapUtils;
import com.github.fartherp.framework.core.kv.dao.KvDao;
import com.github.fartherp.framework.core.kv.handler.DefaultKvHandler;
import com.github.fartherp.framework.core.kv.handler.KvHandler;
import com.github.fartherp.framework.core.kv.handler.SimpleKvHandler;
import com.github.fartherp.framework.core.kv.service.KvService;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * Created by IntelliJ IDEA.
 * Author: CK
 * Date: 2016/1/29
 */
@Service("kvHandlerConfig")
public class KvHandlerConfig {
    @Resource(name = "kvService")
    KvService kvService;

    @Resource(name = "kvDao")
    KvDao dao;

    public void addHandler(KvHandler handler) {
        kvService.addHandler(handler);
    }

    @PostConstruct
    void setup() {
        addHandler(new SimpleKvHandler(1, "tb_device_info", "identity_no",
                "id", MapUtils.<String, Object>build().put("identity_no", ":identity_no").get(),
                DefaultKvHandler.ALL));
        addHandler(new SimpleKvHandler(2, "td_composite_dictionary", "dic_name",
                "dic_id", MapUtils.<String, Object>build().put("dic_type", 1).get(),
                DefaultKvHandler.ALL));
        addHandler(new SimpleKvHandler(3, "td_composite_dictionary", "dic_name",
                "dic_id", MapUtils.<String, Object>build().put("dic_type", 2).get(),
                DefaultKvHandler.ALL));
        addHandler(new SimpleKvHandler(4, "td_composite_dictionary", "dic_name",
                "dic_id", MapUtils.<String, Object>build().put("dic_type", 3).get(),
                DefaultKvHandler.ALL));
        addHandler(new SimpleKvHandler(5, "td_composite_dictionary", "dic_name",
                "dic_id", MapUtils.<String, Object>build().put("dic_type", 4).get(),
                DefaultKvHandler.ALL));
        addHandler(new SimpleKvHandler(6, "td_composite_dictionary", "dic_name",
                "dic_id", MapUtils.<String, Object>build().put("dic_type", 5).get(),
                DefaultKvHandler.ALL));
        addHandler(new SimpleKvHandler(7, "roles", "name",
                "id", MapUtils.<String, Object>build().get(), DefaultKvHandler.ALL));
        addHandler(new SimpleKvHandler(8, "tb_user", "user_name",
                "id", MapUtils.<String, Object>build().put("user_name", ":user_name").get(),
                DefaultKvHandler.ALL));
        addHandler(new SimpleKvHandler(9, "td_composite_dictionary", "dic_name",
                "dic_id", MapUtils.<String, Object>build().put("dic_type", 7).get(),
                DefaultKvHandler.ALL));
        addHandler(new SimpleKvHandler(10, "td_composite_dictionary", "dic_name",
                "dic_id", MapUtils.<String, Object>build().put("dic_type", 8).get(),
                DefaultKvHandler.ALL));
    }
}
