/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.util;

import com.github.fartherp.framework.common.util.ISOUtil;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: CK
 * @date: 2017/12/9
 */
public class DeviceMsgUtilsTest {
    @Test
    public void testResolveTime() throws Exception {
        String time = "07E10C0908380E";
        byte[] bytes = ISOUtil.hex2byte(time);
        DeviceMsgUtils.resolveTime(bytes, 0);
        String date = "20171109085614";


    }

    @Test
    public void testReadLatLongInfo() throws Exception {

    }

    @Test
    public void testParseAcceleration() throws Exception {

    }

}