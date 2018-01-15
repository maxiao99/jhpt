/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.command.device;

import com.tyj.jhpt.server.message.CommandEnum;
import com.tyj.jhpt.server.message.MessageBean;
import com.tyj.jhpt.server.util.DeviceMsgUtils;
import org.springframework.stereotype.Component;

/**
 * 终端校时
 *
 * @author: CK
 * @date: 2017/12/8
 */
@Component
public class SixCommand extends DeviceAbstractCommand {
    public SixCommand() {
        super(CommandEnum.TERMINAL_VERIFY_TIME.getType());
    }

    public MessageBean finish(MessageBean mb) {
        mb.setContent(DeviceMsgUtils.getTime());
        return mb;
    }
}
