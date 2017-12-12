/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.command.device;

import com.tyj.jhpt.server.message.CommandEnum;
import com.tyj.jhpt.server.handler.DeviceManagerServerHandler;
import com.tyj.jhpt.server.message.MessageBean;
import com.tyj.jhpt.server.util.DeviceMsgUtils;
import org.springframework.stereotype.Component;

import java.util.Date;

import static com.tyj.jhpt.server.command.device.EightCommand.DataEnum.TIME;
import static com.tyj.jhpt.server.command.device.EightCommand.DataEnum.MESSAGE_TYPE;

/**
 * 车载终端状态信息上报
 *
 * @author: CK
 * @date: 2017/12/8
 */
@Component
public class EightCommand extends DeviceAbstractCommand {
    public EightCommand() {
        super(CommandEnum.PARAM_QUERY_FEEDBACK.getType());
    }

    public void deal(DeviceManagerServerHandler handler, MessageBean mb) {
        // 数据采集时间
        byte[] content = mb.getContent();
        Date time = DeviceMsgUtils.resolveTime(content, TIME.length);
        int offset = TIME.length;

        // 信息类型标志
        byte alarmType = content[offset + MESSAGE_TYPE.length];
        offset += MESSAGE_TYPE.length;

    }

    public static enum DataEnum {
        TIME(6, "数据采集时间"),
        MESSAGE_TYPE(1, "信息类型标志"),
        ;
        private int length;
        private String desc;
        DataEnum(int length, String desc) {
            this.length = length;
            this.desc = desc;
        }
    }
}
