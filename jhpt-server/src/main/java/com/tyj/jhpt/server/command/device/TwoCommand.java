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
 * 实时信息上报
 *
 * @author: CK
 * @date: 2017/12/8
 */
@Component
public class TwoCommand extends DeviceAbstractCommand {
    public TwoCommand() {
        super(CommandEnum.RELOAD_SEND.getType());
    }

    public void deal(DeviceManagerServerHandler handler, MessageBean mb) {
        // 数据采集时间
        byte[] content = mb.getContent();
        Date time = DeviceMsgUtils.resolveTime(content, 6);
        int offset = 6;

        // 信息体
        byte[] bytes = new byte[]{content[offset + 1]};
        offset += 1;
        byte typeFlag = bytes[0];

        for (Body body : bodyList) {
            if (body.support(typeFlag)) {
                body.deal(mb);
                return;
            }
        }
    }
}
