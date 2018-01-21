/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.command.device;

import com.tyj.jhpt.server.body.Body;
import com.tyj.jhpt.server.message.CommandEnum;
import com.tyj.jhpt.server.handler.DeviceManagerServerHandler;
import com.tyj.jhpt.server.message.MessageBean;
import com.tyj.jhpt.server.util.DeviceMsgUtils;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 补发
 *
 * @author: CK
 * @date: 2017/12/8
 */
@Component
public class ThreeCommand extends DeviceAbstractCommand {
    public ThreeCommand() {
        super(CommandEnum.RELOAD_SEND.getType());
    }

    public void deal(DeviceManagerServerHandler handler, MessageBean mb) {
        // 数据采集时间
        byte[] content = mb.getContent();
        Date time = DeviceMsgUtils.resolveTime(content, 0);
        mb.setEventTime(time);
        deal(6, mb);
    }

    private void deal(int offset, MessageBean mb) {
        if (mb.getLength() <= offset) {
            return;
        }
        byte[] content = mb.getContent();
        // 信息体
        byte typeFlag = content[offset];
        offset += 1;
        for (Body body : bodyList) {
            if (body.support(typeFlag)) {
                offset = body.deal(mb, offset);
                break;
            }
        }
        deal(offset, mb);
    }
}
