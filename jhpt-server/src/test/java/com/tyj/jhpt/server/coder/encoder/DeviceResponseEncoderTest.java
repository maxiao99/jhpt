/*
 * Copyright (c) 2018. CK. All rights reserved.
 */

package com.tyj.jhpt.server.coder.encoder;

import com.github.fartherp.framework.common.util.ISOUtil;
import com.github.fartherp.framework.security.symmetry.ThreeDES;
import com.tyj.jhpt.server.util.ByteUtils;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: CK
 * @date: 2018/1/14
 */
public class DeviceResponseEncoderTest {
    @Test
    public void testEncode() throws Exception {
        StringBuilder sb = new StringBuilder();
        sb.append(ISOUtil.hexString(new byte[]{1}));
        sb.append(ISOUtil.hexString(new byte[]{-2}));
        sb.append(ISOUtil.hexString("LRDS6PEB3HR002350".getBytes("GBK")));
        sb.append(ISOUtil.hexString(new byte[]{2}));

        String length = Integer.toHexString(31);
        sb.append(ISOUtil.zeropad(length, 4));
        byte[] content = new byte[31];
        content[0] = 18;
        content[1] = 1;
        content[2] = 14;
        content[3] = 9;
        content[4] = 28;
        content[5] = 0;
        content[6] = 0;
        content[7] = 1;
        content[8] = 56;
        content[9] = 57;
        content[10] = 56;
        content[11] = 54;
        content[12] = 48;
        content[13] = 48;
        content[14] = 77;
        content[15] = 70;
        content[16] = 83;
        content[17] = 83;
        content[18] = 89;
        content[19] = 89;
        content[20] = 71;
        content[21] = 49;
        content[22] = 50;
        content[23] = 51;
        content[24] = 52;
        content[25] = 53;
        content[26] = 54;
        content[27] = 80;
        content[28] = 0;
        content[29] = 0;
        content[30] = 48;
        sb.append(ISOUtil.hexString(content));
        int diff = 8 - (sb.length() % 8);
        for (int i = 0; i < diff; i++) {
            sb.append("0");
        }
        String data = sb.toString();
        byte[] encryptD = ThreeDES.encrypt(ISOUtil.hex2byte(data), ByteUtils.key);
        byte b = ByteUtils.calculate(encryptD);
        System.out.println(ISOUtil.hexString(encryptD) + ISOUtil.hexString(new byte[]{b}));
    }

}