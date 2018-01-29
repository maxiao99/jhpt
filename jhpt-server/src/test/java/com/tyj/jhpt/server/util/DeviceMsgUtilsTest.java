/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.util;

import com.github.fartherp.framework.common.util.DateUtil;
import com.github.fartherp.framework.common.util.ISOUtil;
import com.tyj.jhpt.vo.SettingConfigVo;
import com.tyj.jhpt.vo.TerminalConfigVo;
import org.apache.commons.lang.RandomStringUtils;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
        bytes[0] = 18;
        bytes[1] = 1;
        bytes[2] = 21;
        bytes[3] = 9;
        bytes[4] = 48;
        bytes[5] = 27;
        Date d = DeviceMsgUtils.resolveTime(bytes, 0);
        System.out.println(DateUtil.format(DateUtil.yyyy_MM_dd_HH_mm_ss, d));
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
        String s = RandomStringUtils.randomNumeric(8);
        System.out.println(s);

        List<String> list = new ArrayList<String>();
        list.add("fdafsa");
        list.add("ddsfd");
        System.out.println(list.toString());
    }

    @Test
    public void testParam() {
        SettingConfigVo vo = new SettingConfigVo();
        vo.setLocalStoreCycle(5);
        vo.setTerminalHeartSendCycle(5);
        String s = DeviceMsgUtils.param("LRDS6PEB3HR002350", "81", vo);
        System.out.println(s);
    }

    @Test
    public void testControl() throws Exception {
        TerminalConfigVo vo = new TerminalConfigVo();
        vo.setDeviceControl(3);
        String s = DeviceMsgUtils.control("LRDS6PEB3HR002350", vo);
        System.out.println(s);
    }
}