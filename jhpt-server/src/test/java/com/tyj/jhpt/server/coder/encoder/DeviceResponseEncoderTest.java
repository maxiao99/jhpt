/*
 * Copyright (c) 2018. CK. All rights reserved.
 */

package com.tyj.jhpt.server.coder.encoder;

import com.github.fartherp.framework.common.util.ISOUtil;
import com.github.fartherp.framework.security.symmetry.ThreeDES;
import com.tyj.jhpt.server.message.MessageBean;
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
        MessageBean msg = new MessageBean();
        msg.setCommandFlag((byte)1);
        msg.setRespFlag((byte) -2);
        msg.setVin("LRDS6PEB3HR002350");
        msg.setEncrypt((byte) 2);
        msg.setLength((short) 31);

        StringBuilder sb = new StringBuilder();
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
        // 0补位
        int diff = 8 - (content.length % 8);
        byte[] data = new byte[content.length + diff];
        System.arraycopy(content, 0, data, 0, content.length);
        byte[] encryptD = ThreeDES.encrypt(data, ByteUtils.key);

        byte[] bytes = new byte[24 + encryptD.length + 1];
        System.arraycopy(msg.getBytes(), 0, bytes, 0, 24);
        System.arraycopy(encryptD, 0, bytes, 24, encryptD.length);
        byte b = ByteUtils.calculate(bytes);
        System.out.println(ISOUtil.hexString(encryptD) + ISOUtil.hexString(new byte[]{b}));
    }

}