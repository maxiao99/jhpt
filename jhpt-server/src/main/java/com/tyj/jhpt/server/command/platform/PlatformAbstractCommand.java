/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.command.platform;

import com.tyj.jhpt.server.command.AbstractCommand;
import com.tyj.jhpt.server.command.PlatformCommand;
import com.tyj.jhpt.server.handler.DeviceManagerServerHandler;
import com.tyj.jhpt.server.message.MessageBean;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: CK
 * @date: 2017/12/8
 */
public abstract class PlatformAbstractCommand extends AbstractCommand implements PlatformCommand {
    protected byte type;

    public PlatformAbstractCommand(byte type) {
        super(type);
    }

    public void deal(DeviceManagerServerHandler handler, MessageBean mb) {
        throw new IllegalStateException("无效的操作");
    }
}
