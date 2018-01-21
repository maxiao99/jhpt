/*
 * Copyright (c) 2018. CK. All rights reserved.
 */

package com.tyj.jhpt.server.command.device;

import com.tyj.jhpt.server.message.CommandEnum;

/**
 * 参数设置反馈
 *
 * @author: CK
 * @date: 2018/1/21
 */
public class ElevenCommand extends DeviceAbstractCommand {
    public ElevenCommand() {
        super(CommandEnum.PARAM_SET.getType());
    }
}
