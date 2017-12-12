/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.coder.decoder;

import com.github.fartherp.framework.common.util.ISOUtil;
import com.tyj.jhpt.server.message.MessageBean;
import com.tyj.jhpt.server.util.ByteUtils;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ReplayingDecoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: CK
 * @date: 2017/12/7
 */
public class DeviceRequestDecoder extends ReplayingDecoder {

    private static final Logger logger = LoggerFactory.getLogger(DeviceRequestDecoder.class);

    protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
        in.markReaderIndex();
        MessageBean mb = new MessageBean();
        mb.setStart(ByteUtils.getAsciiString(in, 2));
        mb.setCommandFlag(ByteUtils.readBytes(in, 1)[0]);
        mb.setRespFlag(ByteUtils.readBytes(in, 1)[0]);
        mb.setVin(ByteUtils.getAsciiString(in, 17));
        mb.setEncrypt(ByteUtils.readBytes(in, 1)[0]);
        mb.setLength(ByteUtils.readInt(in));

        int instructionSize = mb.getLength();
        if (instructionSize < 0 || instructionSize > 5) {
            return;
        }
        byte[] content = ByteUtils.readBytes(in, instructionSize);
        logger.info("actualLength:{} content: {}", instructionSize, ISOUtil.hexString(content));
        mb.setContent(content);
        byte checksum = ByteUtils.readByte(in);
        byte [] b = mb.getBytes();
        boolean effectiveInstruction = (checksum == ByteUtils.calculate(b));
        if (effectiveInstruction) {
            out.add(mb);
        } else {
            logger.info("收到不合法的指令");
        }
    }
}
