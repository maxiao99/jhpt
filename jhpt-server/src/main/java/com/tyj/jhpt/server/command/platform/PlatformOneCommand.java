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

import static com.tyj.jhpt.server.command.platform.PlatformOneCommand.DataEnum.PARAM_TOTAL;
import static com.tyj.jhpt.server.command.platform.PlatformOneCommand.DataEnum.TIME;

/**
 * 参数查询
 *
 * @author: CK
 * @date: 2017/12/8
 */
@Component
public class PlatformOneCommand extends PlatformAbstractCommand {
    public PlatformOneCommand() {
        super(PlatformCommandEnum.PARAM_QUERY.getType());
    }

    public void deal(DeviceManagerServerHandler handler, MessageBean mb) {
        // 参数查询时间
        byte[] content = mb.getContent();
        Date time = DeviceMsgUtils.resolveTime(content, TIME.length);
        int offset = TIME.length;

        // 参数总数N
        byte paramTotal = content[offset + PARAM_TOTAL.length];
        offset += PARAM_TOTAL.length;

    }

    public static enum DataEnum {
        TIME(6, "参数查询时间"),
        PARAM_TOTAL(1, "参数总数N"),
        ;
        private int length;
        private String desc;
        DataEnum(int length, String desc) {
            this.length = length;
            this.desc = desc;
        }
    }
}
