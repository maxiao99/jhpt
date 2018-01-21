/*
 * Copyright (c) 2018. CK. All rights reserved.
 */

package com.tyj.jhpt.server.command.device;

import com.tyj.jhpt.server.message.CommandEnum;

/**
 * 车载终端控制反馈
 *
 * @author: CK
 * @date: 2018/1/21
 */
public class TwelveCommand extends DeviceAbstractCommand {
    public TwelveCommand() {
        super(CommandEnum.CAR_TERMINAL_CONTROL.getType());
    }
}
