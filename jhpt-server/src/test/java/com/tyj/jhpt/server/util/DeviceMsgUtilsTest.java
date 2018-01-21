/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.util;

import com.github.fartherp.framework.common.util.ISOUtil;
import org.testng.annotations.Test;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: CK
 * @date: 2017/12/9
 */
public class DeviceMsgUtilsTest {
    @Test
    public void testResolveTime() throws Exception {
        String time = "12010E091C00";
        byte[] bytes = ISOUtil.hex2byte(time);
        Date d = DeviceMsgUtils.resolveTime(bytes, 0);
        String date = "171214160810";
        String s = Integer.toHexString(12);
        System.out.println(s);
        Integer i = Integer.parseInt("001F", 16);
        System.out.println(i);
        String vin = "LRDS6PEB3HR002350";
        byte[] b = vin.getBytes("GBK");
        String vinb = ISOUtil.hexString(b);
        System.out.println(vinb);
        String sb = new String(b, "GBK");
        System.out.println(sb);

        byte bc = 38;
        System.out.println(0xff & bc);

        byte[] a = "FE".getBytes();
        System.out.println(1);
    }

    @Test
    public void testGetTime() {
        byte[] bytes = DeviceMsgUtils.getTime();
        System.out.println(1);
    }

    @Test
    public void testReadLatLongInfo() throws Exception {
        String s = "4C52445336504542334852303032333530";
        byte[] b = s.getBytes();
        byte[] bytes = ISOUtil.hex2byte(s);
        String a = new String(bytes, "GBK");
        System.out.println(a);
    }

    @Test
    public void testParseAcceleration() throws Exception {

    }

}