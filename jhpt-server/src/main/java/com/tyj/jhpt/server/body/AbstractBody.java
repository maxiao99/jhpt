/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.body;

import com.tyj.jhpt.server.message.MessageBean;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: CK
 * @date: 2017/12/8
 */
public abstract class AbstractBody<T> implements Body<T> {
    protected byte type;

    public AbstractBody(byte type) {
        this.type = type;
    }

    public boolean support(byte type) {
        return this.type == type;
    }

    public int deal(MessageBean mb, int offset) {
        return 0;
    }
}
