/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.command.platform;

import com.tyj.jhpt.server.message.PlatformCommandEnum;
import com.tyj.jhpt.server.message.MessageBean;
import com.tyj.jhpt.server.util.DeviceMsgUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.Date;

import static com.tyj.jhpt.server.command.platform.PlatformThreeCommand.DataEnum.COMMAND_ID;
import static com.tyj.jhpt.server.command.platform.PlatformThreeCommand.DataEnum.TIME;

/**
 * 车载终端控制
 *
 * @author: CK
 * @date: 2017/12/8
 */
@Component("platformThreeCommand")
public class PlatformThreeCommand extends PlatformAbstractCommand {
    public PlatformThreeCommand() {
        super(PlatformCommandEnum.CAR_TERMINAL_CONTROL.getType());
    }

    public MessageBean finish(MessageBean mb) {
        int length = 0;
        byte[] data = new byte[length];
        // 参数查询时间
        byte[] date = DeviceMsgUtils.getTime();
        int offset = 0;
        System.arraycopy(date, 0, data, offset, TIME.length);
        offset += length;

        MessageBean bean = new MessageBean();
        BeanUtils.copyProperties(mb, bean, "content");
        bean.setContent(data);
        return bean;
    }

    public static enum DataEnum {
        TIME(6, "时间"),
        COMMAND_ID(1, "命令ID"),
        ;
        private int length;
        private String desc;
        DataEnum(int length, String desc) {
            this.length = length;
            this.desc = desc;
        }
    }
}
