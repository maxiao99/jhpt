/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by IntelliJ IDEA .
 * Auth: CK
 * Date: 2016/7/1
 */
public abstract class AbstractCommand implements Command {
    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    protected byte type;

    public AbstractCommand(byte type) {
        this.type = type;
    }

    public boolean support(byte type) {
        return this.type == type;
    }
}
