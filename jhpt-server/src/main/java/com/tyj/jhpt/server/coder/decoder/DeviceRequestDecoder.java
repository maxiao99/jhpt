/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.coder.decoder;

import com.github.fartherp.framework.common.util.ISOUtil;
import com.github.fartherp.framework.security.symmetry.ThreeDES;
import com.tyj.jhpt.server.message.MessageBean;
import com.tyj.jhpt.server.util.ByteUtils;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ReplayingDecoder;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static com.tyj.jhpt.server.util.ByteUtils.getAsciiString;
import static com.tyj.jhpt.server.util.ByteUtils.getGBKString;

/**
 * 解析终端上送数据
 *
 * @author: CK
 * @date: 2017/12/7
 */
public class DeviceRequestDecoder extends ReplayingDecoder {

    private static final Logger logger = LoggerFactory.getLogger(DeviceRequestDecoder.class);

    protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
        logger.info("######### Decoder Request start...");
        in.markReaderIndex();
        int index = in.readableBytes();
        if (2147483647 == index) {
            return;
        }
        MessageBean mb = new MessageBean();

        String data = getAsciiString(in, index);
        if (StringUtils.isBlank(data)) {
            logger.info("######### Decoder Request data is empty");
            return;
        }
        logger.info("######### Request data=[{}]", data);
        mb.setStart(data.substring(0, 4));
        byte[] srcBytes = ISOUtil.hex2byte(data.substring(4));

        // 命令标识
        int offset = 0;
        mb.setCommandFlag(srcBytes[offset]);
        offset += 1;
        // 应答标志
        mb.setRespFlag(srcBytes[offset]);
        offset += 1;
        // vin
        mb.setVin(getGBKString(srcBytes, offset, 17));
        offset += 17;
        // 数据加密方式
        mb.setEncrypt(srcBytes[offset]);
        offset += 1;
        // 数据单元长度
        byte[] tmp = new byte[2];
        tmp[0] = srcBytes[offset];
        tmp[1] = srcBytes[offset + 1];
        mb.setLength(Integer.parseInt(ISOUtil.hexString(tmp), 16));
        offset += 2;

        int size = mb.getLength();
        if (size < 0 || size > 65531) {
            return;
        }

        // 校验范围从命令单元的第一个字节开始，同后一字节异或，直到校验码前一字节为止
        // 先检验后解密
        byte b = ByteUtils.calculate(srcBytes);
        if (srcBytes[srcBytes.length - 1] != b) {
            logger.info("收到不合法的指令");
            return;
        }

        int encryptLength = srcBytes.length - offset - 1;
        byte[] encryptDataB = new byte[encryptLength];
        System.arraycopy(srcBytes, offset, encryptDataB, 0, encryptLength);
        byte[] content = ThreeDES.decrypt(encryptDataB, ByteUtils.key);

        mb.setContent(content);
        out.add(mb);
    }
}
