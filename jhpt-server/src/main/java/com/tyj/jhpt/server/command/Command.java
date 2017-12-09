/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.command;

import com.tyj.jhpt.server.handler.DeviceManagerServerHandler;
import com.tyj.jhpt.server.message.MessageBean;

/**
 * 公共命令
 * Auth: CK
 * Date: 2016/7/1
 */
public interface Command {

    void deal(DeviceManagerServerHandler handler, MessageBean mb);

    MessageBean finish(MessageBean mb);

    boolean support(byte type);
}
