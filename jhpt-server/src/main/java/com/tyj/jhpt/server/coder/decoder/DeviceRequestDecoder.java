/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.coder.decoder;

import com.github.fartherp.framework.common.util.ISOUtil;
import com.tyj.jhpt.server.message.MessageBean;
import com.tyj.jhpt.server.util.ByteUtils;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ReplayingDecoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static com.tyj.jhpt.server.util.ByteUtils.convertGBK;
import static com.tyj.jhpt.server.util.ByteUtils.getAsciiString;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: CK
 * @date: 2017/12/7
 */
public class DeviceRequestDecoder extends ReplayingDecoder {

    private static final Logger logger = LoggerFactory.getLogger(DeviceRequestDecoder.class);

    protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
        String buff = ByteBufUtil.hexDump(in);
        logger.info("######### buff=[{}]", buff);
        in.markReaderIndex();
        MessageBean mb = new MessageBean();
        mb.setStart(convertGBK(getAsciiString(in, 4)));
        mb.setCommandFlag(ByteUtils.readBytes(in, 1)[0]);
        mb.setRespFlag(ByteUtils.readBytes(in, 1)[0]);
        mb.setVin(convertGBK(getAsciiString(in, 34)));
        mb.setEncrypt(ByteUtils.readBytes(in, 1)[0]);
        mb.setLength(Integer.parseInt(getAsciiString(in, 4), 16));

        int instructionSize = mb.getLength();
        if (instructionSize < 0 || instructionSize > 65531) {
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
