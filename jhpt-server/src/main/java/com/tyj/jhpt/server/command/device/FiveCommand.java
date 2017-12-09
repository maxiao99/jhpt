/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.command.device;

import com.tyj.jhpt.server.message.CommandEnum;
import org.springframework.stereotype.Component;

/**
 * 心跳
 *
 * @author: CK
 * @date: 2017/12/8
 */
@Component
public class FiveCommand extends DeviceAbstractCommand {
    public FiveCommand() {
        super(CommandEnum.HEART_BEAT.getType());
    }

}
