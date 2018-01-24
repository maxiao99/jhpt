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
 * 返回终端数据
 *
 * @author: CK
 * @date: 2017/12/7
 */
public class DeviceResponseEncoder extends MessageToMessageEncoder<MessageBean> {
    private static final Logger logger = LoggerFactory.getLogger(DeviceResponseEncoder.class);

    protected void encode(ChannelHandlerContext ctx, MessageBean msg, List<Object> out) throws Exception {
        logger.info("######### Encoder Response start...");
        ByteBuf buffer = ctx.alloc().buffer();
        // 起始符
        buffer.writeBytes(msg.getStart().getBytes());
        // 命令标识
        buffer.writeByte(msg.getCommandFlag());
        // 应答标致
        buffer.writeByte(msg.getRespFlag());
        // vin
        buffer.writeBytes(msg.getVin().getBytes("GBK"));
        // 数据加密方式
        buffer.writeByte(msg.getEncrypt());
        // 数据单元长度
        byte[] content = msg.getContent();
        int length = content.length;
        buffer.writeShort(length);

        // 0补位
        int diff = 8 - (length % 8);
        diff = (diff == 8) ? 0 : diff;
        byte[] srcData = new byte[length + diff];
        System.arraycopy(content, 0, srcData, 0, length);

        byte[] encryptData = ThreeDES.encrypt(srcData, ByteUtils.key);
        buffer.writeBytes(encryptData);

        byte[] bytes = msg.getBytes();
        byte[] tmpBytes = new byte[bytes.length + encryptData.length];
        System.arraycopy(bytes, 0, tmpBytes, 0, bytes.length);
        System.arraycopy(encryptData, 0, tmpBytes, bytes.length, encryptData.length);
        // 检验码
        byte b = ByteUtils.calculate(tmpBytes);
        buffer.writeByte(b);
        logger.info("######### Response data=[{}] mac=[{}]", ISOUtil.hexString(tmpBytes), ISOUtil.hexString(new byte[]{b}));
        out.add(buffer);
    }
}
