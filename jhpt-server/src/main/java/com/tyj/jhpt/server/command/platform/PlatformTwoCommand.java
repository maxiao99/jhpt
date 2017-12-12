/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.command.platform;

import com.tyj.jhpt.server.message.PlatformCommandEnum;
import com.tyj.jhpt.server.handler.DeviceManagerServerHandler;
import com.tyj.jhpt.server.message.MessageBean;
import com.tyj.jhpt.server.util.DeviceMsgUtils;
import org.springframework.stereotype.Component;

import java.util.Date;

import static com.tyj.jhpt.server.command.platform.PlatformTwoCommand.DataEnum.PARAM_TOTAL;
import static com.tyj.jhpt.server.command.platform.PlatformTwoCommand.DataEnum.TIME;

/**
 * 参数查询
 *
 * @author: CK
 * @date: 2017/12/8
 */
@Component
public class PlatformTwoCommand extends PlatformAbstractCommand {
    public PlatformTwoCommand() {
        super(PlatformCommandEnum.PARAM_SET.getType());
    }

    public void deal(DeviceManagerServerHandler handler, MessageBean mb) {
        // 参数设置时间
        byte[] content = mb.getContent();
        Date time = DeviceMsgUtils.resolveTime(content, TIME.length);
        int offset = TIME.length;

        // 参数总数
        byte paramTotal = content[offset + PARAM_TOTAL.length];
        offset += PARAM_TOTAL.length;

    }

    public static enum DataEnum {
        TIME(6, "参数设置时间"),
        PARAM_TOTAL(1, "参数总数"),
        ;
        private int length;
        private String desc;
        DataEnum(int length, String desc) {
            this.length = length;
            this.desc = desc;
        }
    }
}
