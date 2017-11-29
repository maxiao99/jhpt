package com.tyj.jhpt.util;

import com.github.fartherp.framework.common.util.ISOUtil;
import com.tyj.jhpt.bo.DeviceGpsInfos;
import com.tyj.jhpt.server.SystemConfig;

import java.security.MessageDigest;

/**
 * Created by IntelliJ IDEA .
 * Auth: CK
 * Date: 2016/5/3
 */
public class CheckSumUtils {
    public static byte calculate(byte[] content) {
        if (content == null || content.length == 0) {
            return 0;
        }
        byte re = content[0];
        for (int i = 1; i < content.length; i++) {
            re ^= content[i];
        }
        return re;
    }

    public static String hashcode(DeviceGpsInfos dgi) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(dgi.getDeviceId().toString().getBytes("UTF-8"));
            md.update(dgi.getMsgId().toString().getBytes("UTF-8"));
            md.update(String.valueOf(dgi.getEventTime().getTime()).getBytes("UTF-8"));
            md.update(dgi.getMsgType().toString().getBytes("UTF-8"));
            md.update(SystemConfig.getStr("shenzhousecret").getBytes("UTF-8"));
            return ISOUtil.hexString(md.digest());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
