package com.tyj.jhpt.server.handler.decoder;

import com.github.fartherp.framework.common.util.ISOUtil;
import com.tyj.jhpt.message.MessageBean;
import com.tyj.jhpt.util.ByteUtils;
import com.tyj.jhpt.util.CheckSumUtils;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ReplayingDecoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by IntelliJ IDEA .
 * Auth: CK
 * Date: 2016/5/3
 */
public class TYJNewProtocolDeviceRequestDecoder extends ReplayingDecoder<TYJNewProtocolDeviceRequestDecoder.State> {
    private static final Logger logger = LoggerFactory.getLogger(TYJNewProtocolDeviceRequestDecoder.class);

    enum State {
        SKIP_CONTROL_CHARS, READ_INITIAL, READ_HEADER, READ_VARIABLE_LENGTH_CONTENT,
        READ_FIXED_LENGTH_CONTENT, READ_CHUNK_SIZE, READ_CHUNKED_CONTENT, READ_CHUNK_DELIMITER,
        READ_CHUNK_FOOTER, BAD_MESSAGE, UPGRADED
    }

    protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
        in.markReaderIndex();
        MessageBean mb = new MessageBean();
        mb.setDeviceId(ByteUtils.readInt(in));

        byte needReply = ByteUtils.readByte(in);
        mb.setNeedReply((byte) (needReply & 0xf));
        mb.setEncryptIndex((byte) ((needReply & 0xf0) >> 4));

        mb.setMessageType(ByteUtils.readByte(in));

        byte instructionSize = ByteUtils.readByte(in);
        if (instructionSize < 0 || instructionSize > 5) {
            return;
        }
        for (int i = 0; i < instructionSize; i++) {
            byte instructionLength = ByteUtils.readByte(in);
            byte actualLength = instructionLength;
            if (mb.getEncryptIndex() != 0) {
                actualLength += 8 - instructionLength % 8; // 需要加密时，instruction
                // 必须是8字节的整数倍，解密后应该只读取
            }
            byte[] content = ByteUtils.readBytes(in, actualLength);
            logger.info("actualLength:{} content: {}", ISOUtil.hexString(new byte[]{actualLength}), ISOUtil.hexString(content));
            mb.addInstruction(ByteUtils.decode(mb.getEncryptIndex(), content));
        }
        byte checksum = ByteUtils.readByte(in);
        byte [] b = mb.getBytes();
        boolean effectiveInstruction = (checksum == CheckSumUtils.calculate(b));
        if (effectiveInstruction) {
            out.add(mb);
        } else {
            logger.info("收到不合法的指令");
        }
    }
}
