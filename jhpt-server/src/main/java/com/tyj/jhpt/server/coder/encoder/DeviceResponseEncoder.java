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
        ByteBuf buffer = ctx.alloc().buffer();
        // 起始符
        buffer.writeBytes(msg.getStart().getBytes());
        // 命令标识
        buffer.writeByte((byte)1);
        // 应答标致
        buffer.writeByte(msg.getRespFlag());
        // vin
        buffer.writeBytes(msg.getVin().getBytes("GBK"));
        // 数据加密方式
        buffer.writeByte(msg.getEncrypt());
        // 数据单元长度
        String length = Integer.toHexString(msg.getContent().length);
        buffer.writeBytes(ISOUtil.zeropad(length, 4).getBytes());

        byte[] content = msg.getContent();
        // 0补位
        int diff = 8 - (content.length % 8);
        diff = (diff == 8) ? 0 : diff;
        byte[] data = new byte[content.length + diff];
        System.arraycopy(content, 0, data, 0, content.length);
        byte[] encryptD = ThreeDES.encrypt(data, ByteUtils.key);
        buffer.writeBytes(encryptD);

        byte[] bytes = new byte[24 + encryptD.length + 1];
        System.arraycopy(msg.getBytes(), 0, bytes, 0, 24);
        System.arraycopy(encryptD, 0, bytes, 24, encryptD.length);
        // 检验码
        byte b = ByteUtils.calculate(bytes);
        buffer.writeByte(b);
        logger.info("######### Response data=[{}] mac=[{}]", ISOUtil.hexString(content), ISOUtil.hexString(new byte[]{b}));
        out.add(buffer);
    }
}
