package com.tyj.jhpt.server.command;

import com.tyj.jhpt.message.MessageBean;
import com.tyj.jhpt.message.MessageType;
import com.tyj.jhpt.server.handler.DeviceManagerServerHandler;

/**
 * 设备发送第1条指令
 * Auth: CK
 * Date: 2016/7/1
 */
public class OneCommand extends AbstractCommand {

    byte type;

    protected OneCommand(DeviceManagerServerHandler handler, MessageBean bean, byte type) {
        super(handler, bean);
        this.type = type;
    }

    public MessageBean finish() {
        // 第一次激活 发送注册的信息(姓名、年龄、驾照类型、身份账号、车辆号、车型、手机号等)
        // 再次激活 发送VD和定位信息的配置参数
        Command command = null;
        if (type  == MessageType.FIRST_ACTIVATION) {
            command = new DeviceInfoCommand(handler, bean);
        } else if (type  == MessageType.ACTIVATING_AGAIN) {
            command = new ParamSettingCommand(handler, bean);
        }
        MessageBean messageBean = command.finish();
        return messageBean;
    }
}
