/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.command;

import com.tyj.jhpt.server.handler.DeviceManagerServerHandler;
import com.tyj.jhpt.server.message.MessageBean;

/**
 * Created by IntelliJ IDEA .
 * Auth: CK
 * Date: 2016/7/1
 */
public abstract class AbstractCommand implements DeviceCommand {
    protected byte type;

    public AbstractCommand(byte type) {
        this.type = type;
    }

    public boolean support(byte type) {
        return this.type == type;
    }

    public void deal(DeviceManagerServerHandler handler, MessageBean mb) {

    }

    public MessageBean finish(MessageBean mb) {
        mb.setContent(new byte[]{0x00});
        return mb;
    }
}
