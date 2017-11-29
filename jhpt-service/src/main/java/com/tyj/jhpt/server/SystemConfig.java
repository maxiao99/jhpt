package com.tyj.jhpt.server;

import com.github.fartherp.framework.common.util.BaseConfig;

/**
 * Created by IntelliJ IDEA .
 * Auth: CK
 * Date: 2016/5/3
 */
public class SystemConfig {
    private static BaseConfig config;

    public static void init(String file) {
        config = new BaseConfig(file);
    }

    public static int getInt(String key) {
        return config.getInt(key);
    }

    public static String getStr(String key) {
        return config.getString(key);
    }

    public static Boolean getBoolean(String key) {
        return config.getBoolean(key);
    }
}
