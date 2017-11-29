package com.tyj.jhpt.server.command;

import com.tyj.jhpt.message.MessageBean;
import com.tyj.jhpt.message.MessageType;
import com.tyj.jhpt.server.handler.DeviceManagerServerHandler;

/**
 * Created by IntelliJ IDEA .
 * Auth: CK
 * Date: 2016/7/1
 */
public class TwoCommand extends AbstractCommand {

    byte type;

    protected TwoCommand(DeviceManagerServerHandler handler, MessageBean bean, byte type) {
        super(handler, bean);
        this.type = type;
    }

    public MessageBean finish() {
        // 第一次激活 发送VD和定位信息的配置参数
        // 再次激活 平台发送第6条指令
        Command command = null;
        if (type  == MessageType.FIRST_ACTIVATION) {
            command = new ParamSettingCommand(handler, bean);
        } else if (type  == MessageType.ACTIVATING_AGAIN) {
            command = new AbstractCommand(handler, bean);
        }
        MessageBean messageBean = command.finish();
        return messageBean;
    }
}
