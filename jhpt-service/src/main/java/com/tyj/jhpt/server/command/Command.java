package com.tyj.jhpt.server.command;

import com.tyj.jhpt.message.MessageBean;

/**
 * Created by IntelliJ IDEA .
 * Auth: CK
 * Date: 2016/7/1
 */
public interface Command {

    void deal();

    MessageBean finish();
}
