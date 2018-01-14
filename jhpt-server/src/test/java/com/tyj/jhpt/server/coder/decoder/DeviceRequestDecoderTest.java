/*
 * Copyright (c) 2018. CK. All rights reserved.
 */

package com.tyj.jhpt.server.coder.decoder;

import com.github.fartherp.framework.common.util.ISOUtil;
import com.github.fartherp.framework.security.symmetry.DES;
import com.github.fartherp.framework.security.symmetry.ThreeDES;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: CK
 * @date: 2018/1/14
 */
public class DeviceRequestDecoderTest {
    @Test
    public void testDecode() throws Exception {
        String key = "23457A6256901B4676C89A1C2D4E2A46";
        String data = "01FE4C5244533650454233485230303233353002001F12010E091C0000013839383630304D46535359594731323334353650000030000000";
        byte[] encryptD = ThreeDES.encrypt(ISOUtil.hex2byte(data), ISOUtil.hex2byte(key));
        System.out.println(ISOUtil.hexString(encryptD));
        String decryptD = "0CDD0F2C40601CE84D107170C365DA15603C07B14C09445EFFE5D3637EDF861CEF8FEBD77425E7EE160FE29F0355019317FC127056E25290";
        byte[] decrypt = ThreeDES.decrypt(ISOUtil.hex2byte(decryptD), ISOUtil.hex2byte(key));
        System.out.println(ISOUtil.hexString(decrypt));

    }

}