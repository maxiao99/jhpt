/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.command.platform;

import com.tyj.jhpt.server.message.PlatformCommandEnum;
import com.tyj.jhpt.server.message.MessageBean;
import com.tyj.jhpt.server.util.DeviceMsgUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import static com.tyj.jhpt.server.command.platform.PlatformOneCommand.DataEnum.PARAM_TOTAL;
import static com.tyj.jhpt.server.command.platform.PlatformOneCommand.DataEnum.TIME;

/**
 * 参数查询
 *
 * @author: CK
 * @date: 2017/12/8
 */
@Component("platformOneCommand")
public class PlatformOneCommand extends PlatformAbstractCommand {
    public PlatformOneCommand() {
        super(PlatformCommandEnum.PARAM_QUERY.getType());
    }

    public MessageBean finish(MessageBean mb) {
        int length = 0;
        byte[] data = new byte[length];
        // 参数查询时间
        byte[] date = DeviceMsgUtils.getTime();
        int offset = 0;
        System.arraycopy(date, 0, data, offset, TIME.length);
        offset += TIME.length;

        MessageBean bean = new MessageBean();
        BeanUtils.copyProperties(mb, bean, "content");
        bean.setContent(data);
        return bean;
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
