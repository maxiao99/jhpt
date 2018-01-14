/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.coder.encoder;

import com.github.fartherp.framework.common.util.ISOUtil;
import com.github.fartherp.framework.security.symmetry.ThreeDES;
import com.tyj.jhpt.server.message.MessageBean;
import com.tyj.jhpt.server.util.ByteUtils;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: CK
 * @date: 2017/12/7
 */
public class DeviceResponseEncoder extends MessageToMessageEncoder<MessageBean> {
    private static final Logger logger = LoggerFactory.getLogger(DeviceResponseEncoder.class);

    protected void encode(ChannelHandlerContext ctx, MessageBean msg, List<Object> out) throws Exception {
        ByteBuf buffer = ctx.alloc().buffer();
        buffer.writeBytes(msg.getStart().getBytes());
        StringBuilder sb = new StringBuilder();
        sb.append(ISOUtil.hexString(new byte[]{msg.getCommandFlag()}));
        sb.append(ISOUtil.hexString(new byte[]{msg.getRespFlag()}));
        sb.append(ISOUtil.hexString(msg.getVin().getBytes("GBK")));
        sb.append(ISOUtil.hexString(new byte[]{msg.getEncrypt()}));
        String length = Integer.toHexString(msg.getContent().length);
        sb.append(ISOUtil.zeropad(length, 4));
        sb.append(ISOUtil.hexString(msg.getContent()));
        int diff = 8 - (sb.length() % 8);
        for (int i = 0; i < diff; i++) {
            sb.append("0");
        }
        String data = sb.toString();
        logger.info("######### Response data=[{}]", data);
        byte[] encryptD = ThreeDES.encrypt(ISOUtil.hex2byte(data), ByteUtils.key);
        buffer.writeBytes(encryptD);
        byte b = ByteUtils.calculate(encryptD);
        buffer.writeByte(b);
        out.add(buffer);
    }
}
