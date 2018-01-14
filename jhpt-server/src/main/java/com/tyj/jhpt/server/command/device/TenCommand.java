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

import static com.tyj.jhpt.server.command.device.TenCommand.DataEnum.TIME;

/**
 * 参数查询反馈
 *
 * @author: CK
 * @date: 2017/12/8
 */
@Component
public class TenCommand extends DeviceAbstractCommand {
    public TenCommand() {
        super(CommandEnum.CAR_TERMINAL_STATUS_MESSAGE_UPLOAD.getType());
    }

    public void deal(DeviceManagerServerHandler handler, MessageBean mb) {
        // 返回参数查询时间
        byte[] content = mb.getContent();
        Date time = DeviceMsgUtils.resolveTime(content, 0);
        int offset = TIME.length;

    }

    public static enum DataEnum {
        TIME(6, "返回参数查询时间"),
        ;
        private int length;
        private String desc;
        DataEnum(int length, String desc) {
            this.length = length;
            this.desc = desc;
        }
    }
}
