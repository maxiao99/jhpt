/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.util;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: CK
 * @date: 2017/12/8
 */
public class DeviceMsgUtils {
    /**
     * 计算时间
     * @param content byte数组
     * @param offset 位置
     * @return Date
     */
    public static Date resolveTime(byte[] content, int offset) {
        Calendar c = Calendar.getInstance();
        int year = Integer.parseInt("20" + (0xff & content[offset]));
        c.set(Calendar.YEAR, year);
        int month = (0xff & content[1 + offset]);
        c.set(Calendar.MONTH, month);
        int day = 0xff & content[2 + offset];
        c.set(Calendar.DAY_OF_MONTH, day);
        int hour = 0xff & content[3 + offset];
        c.set(Calendar.HOUR_OF_DAY, hour);
        int minute = 0xff & content[4 + offset];
        c.set(Calendar.MINUTE, minute);
        int second = 0xff & content[5 + offset];
        c.set(Calendar.SECOND, second);
        return c.getTime();
    }

    /**
     * 计算经纬度
     * @param content byte数组
     * @param offset 位置
     * @return double
     */
    public static double readLatLongInfo(byte[] content, int offset) {
        long value = (0xff000000L & (content[offset] << 24))
                + (0xff0000L & (content[offset + 1] << 16))
                + (0xff00L & (content[offset + 2] << 8))
                + (0xffL & content[offset + 3]);
        return value * 1.0 / 10000000;
    }

    /**
     * 计算速度
     * @param content byte数组
     * @param offset 位置
     * @return 速度
     */
    public static Float parseAcceleration(byte[] content, int offset) {
        int a = 0xff & content[offset];
        return (float) (a * 1.0 / 10);
    }

    public static String formatActivateMsg(Long deviceId) {
        StringBuilder sb = new StringBuilder();
        sb.append("【天盈健】Act,");
        sb.append(getFullHexString(deviceId));
        sb.append(",$设备激活提醒，请输入激活码激活设备");
        return sb.toString();
    }

    public static String getFullHexString(long deviceId) {
        String x = Long.toHexString(deviceId);
        if (x.length() < 8) {
            x = repeat("0", 8 - x.length()) + x;
        }
        return x;
    }

    private static String repeat(String string, int i) {
        String re = "";
        for (int j = 0; j < i; j++) {
            re += string;
        }
        return re;
    }
}
