package com.tyj.jhpt.server.handler.encoder;

import com.tyj.jhpt.message.MessageBean;
import com.tyj.jhpt.util.ByteUtils;
import com.tyj.jhpt.util.CheckSumUtils;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;

import java.util.List;

/**
 * Created by IntelliJ IDEA .
 * Auth: CK
 * Date: 2016/5/3
 */
public class TYJDeviceResponseEncoder extends MessageToMessageEncoder<MessageBean> {
    protected void encode(ChannelHandlerContext ctx, MessageBean msg, List<Object> out) throws Exception {
        ByteBuf buffer = ctx.alloc().buffer();
        buffer.writeInt(msg.getDeviceId());
        byte bb = (byte) (msg.getEncryptIndex() << 4 | msg.getNeedReply());
        buffer.writeByte(bb);
        buffer.writeByte(msg.getMessageType());
        buffer.writeByte(msg.getInstructionSize());
        boolean needEncrypt = msg.getEncryptIndex() > 0;
        for (MessageBean.Instruction it : msg.getInstructions()) {
            byte[] content = it.getContent();
            buffer.writeByte(content.length);
            if (needEncrypt) {
                content = ByteUtils.encrypt(msg.getEncryptIndex(), content);
            }
            buffer.writeBytes(content);
        }

        byte b = CheckSumUtils.calculate(msg.getBytes());

        buffer.writeByte(b);
        out.add(buffer);
    }
}
