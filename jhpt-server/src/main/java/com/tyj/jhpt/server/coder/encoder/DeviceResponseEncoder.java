/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.coder.encoder;

import com.tyj.jhpt.server.message.MessageBean;
import com.tyj.jhpt.server.util.ByteUtils;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: CK
 * @date: 2017/12/7
 */
public class DeviceResponseEncoder extends MessageToMessageEncoder<MessageBean> {
    protected void encode(ChannelHandlerContext ctx, MessageBean msg, List<Object> out) throws Exception {
        ByteBuf buffer = ctx.alloc().buffer();
        buffer.writeBytes(msg.getStart().getBytes());
        buffer.writeByte(msg.getCommandFlag());
        buffer.writeByte(msg.getRespFlag());
        buffer.writeBytes(msg.getVin().getBytes());
        buffer.writeByte(msg.getEncrypt());
        buffer.writeByte(msg.getContent().length);
        buffer.writeBytes(msg.getContent());
        byte b = ByteUtils.calculate(msg.getBytes());
        buffer.writeByte(b);
        out.add(buffer);
    }
}
