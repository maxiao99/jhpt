/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.coder.decoder;

import com.github.fartherp.framework.common.util.ISOUtil;
import com.github.fartherp.framework.security.symmetry.ThreeDES;
import com.tyj.jhpt.server.message.MessageBean;
import com.tyj.jhpt.server.util.ByteUtils;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ReplayingDecoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static com.tyj.jhpt.server.util.ByteUtils.getAsciiString;
import static com.tyj.jhpt.server.util.ByteUtils.getGBKString;

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
        logger.info("######### Request buff=[{}]", buff);
        int length = buff.length() / 2;
        in.markReaderIndex();
        MessageBean mb = new MessageBean();
        String data = getAsciiString(in, length);
        mb.setStart(data.substring(0, 4));

        String encryptData = data.substring(4, data.length() - 2);
        byte[] encryptDataB = ISOUtil.hex2byte(encryptData);
        String mac = data.substring(data.length() - 2);
        // 校验范围从命令单元的第一个字节开始，同后一字节异或，直到校验码前一字节为止
        byte b = ByteUtils.calculate(encryptDataB);
        if (ISOUtil.hex2byte(mac)[0] != b) {
            logger.info("收到不合法的指令");
            return;
        }

        byte[] bytes = ThreeDES.decrypt(encryptDataB, ByteUtils.key);
        logger.info("actualLength:{} content: {}", ISOUtil.hexString(bytes));

        int offset = 0;
        // 命令标识
        mb.setCommandFlag(bytes[offset]);
        offset += 1;
        // 应答标志
        mb.setRespFlag(bytes[offset]);
        offset += 1;
        // vin
        mb.setVin(getGBKString(bytes, offset, 17));
        offset += 17;
        // 数据加密方式
        mb.setEncrypt(bytes[offset]);
        offset += 1;
        // 数据单元长度
        byte[] tmp = new byte[2];
        tmp[0] = bytes[offset ];
        tmp[1] = bytes[offset + 1];;
        mb.setLength(Integer.parseInt(ISOUtil.hexString(tmp), 16));
        offset += 2;

        int size = mb.getLength();
        if (size < 0 || size > 65531) {
            return;
        }
        byte[] content = new byte[size];
        System.arraycopy(bytes, offset, content, 0, size);

        mb.setContent(content);
        out.add(mb);
    }
}
