/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.coder.decoder;

import com.github.fartherp.framework.security.symmetry.ThreeDES;
import com.tyj.jhpt.server.message.MessageBean;
import com.tyj.jhpt.server.util.ByteUtils;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ReplayingDecoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static com.tyj.jhpt.server.util.ByteUtils.readASCIIString;
import static com.tyj.jhpt.server.util.ByteUtils.readByte;
import static com.tyj.jhpt.server.util.ByteUtils.readBytes;
import static com.tyj.jhpt.server.util.ByteUtils.readGBKString;
import static com.tyj.jhpt.server.util.ByteUtils.readShort;

/**
 * 解析终端上送数据
 *
 * @author: CK
 * @date: 2017/12/7
 */
public class DeviceRequestDecoder extends ReplayingDecoder {

    private static final Logger logger = LoggerFactory.getLogger(DeviceRequestDecoder.class);

    protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
        if (in.readableBytes() < 4) {
            logger.info("######### Decoder Request data is empty");
            return;
        }
        logger.info("######### Decoder Request start...");
        in.markReaderIndex();
        MessageBean mb = new MessageBean();
        mb.setStart(readASCIIString(in, 2));

        // 命令标识
        mb.setCommandFlag(readByte(in));
        // 应答标志
        mb.setRespFlag(readByte(in));
        // vin
        mb.setVin(readGBKString(in, 17));
        // 数据加密方式
        mb.setEncrypt(readByte(in));
        // 数据单元长度
        mb.setLength(readShort(in));

        short size = mb.getLength();
        if (size < 0 || size > 65531) {
            return;
        }

        int diff = 8 - (size % 8);
        diff = (diff == 8) ? 0 : diff;
        int encryptLength = size + diff;
        byte[] bytes = mb.getBytes();
        byte[] tmpBytes = new byte[bytes.length + encryptLength];
        System.arraycopy(bytes, 0, tmpBytes, 0, bytes.length);

        byte[] encryptDataB = readBytes(in, encryptLength);
        System.arraycopy(encryptDataB, 0, tmpBytes, bytes.length, encryptLength);

        // 校验范围从命令单元的第一个字节开始，同后一字节异或，直到校验码前一字节为止
        // 先检验后解密
        byte b = ByteUtils.calculate(tmpBytes);
        if (readByte(in) != b) {
            logger.info("收到不合法的指令");
            return;
        }

        byte[] content = ThreeDES.decrypt(encryptDataB, ByteUtils.key);

        mb.setContent(content);
        out.add(mb);
    }
}
