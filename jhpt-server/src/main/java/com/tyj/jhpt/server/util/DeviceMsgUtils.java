/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.util;

import com.github.fartherp.framework.common.util.ISOUtil;

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
        int month = (0xff & content[1 + offset]) - 1;
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
     * 获取当前服务器时间
     * @return byte[]
     */
    public static byte[] getTime() {
        byte[] date = new byte[6];
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR) - 2000;
        date[0] = ISOUtil.hex2byte(Integer.toHexString(year))[0];
        int month = c.get(Calendar.MONTH) + 1;
        date[1] = ISOUtil.hex2byte(Integer.toHexString(month))[0];
        int day = c.get(Calendar.DAY_OF_MONTH);
        date[2] = ISOUtil.hex2byte(Integer.toHexString(day))[0];
        int hour = c.get(Calendar.HOUR_OF_DAY);
        date[3] = ISOUtil.hex2byte(Integer.toHexString(hour))[0];
        int minute = c.get(Calendar.MINUTE);
        date[4] = ISOUtil.hex2byte(Integer.toHexString(minute))[0];
        int second = c.get(Calendar.SECOND);
        date[5] = ISOUtil.hex2byte(Integer.toHexString(second))[0];
        return date;
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
        return value * 1.0 / 1000000;
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
}
