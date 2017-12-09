/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.command.platform;

import com.tyj.jhpt.server.command.AbstractCommand;
import com.tyj.jhpt.server.message.MessageBean;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: CK
 * @date: 2017/12/8
 */
public abstract class PlatformAbstractCommand extends AbstractCommand {
    protected byte type;

    public PlatformAbstractCommand(byte type) {
        super(type);
    }

    public MessageBean finish(MessageBean mb) {
        mb.setContent(new byte[]{0x00});
        return mb;
    }
}
