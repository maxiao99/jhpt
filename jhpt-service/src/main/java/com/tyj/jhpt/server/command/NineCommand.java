package com.tyj.jhpt.server.command;

import com.tyj.jhpt.message.MessageBean;
import com.tyj.jhpt.server.handler.DeviceManagerServerHandler;
import com.tyj.jhpt.server.handler.MessageBeanFactory;
import com.tyj.jhpt.util.DeviceMsgUtils;

/**
 * 第九条指令,获取系统时间
 * Auth: CK
 * Date: 2016/7/1
 */
public class NineCommand extends AbstractCommand {
    protected NineCommand(DeviceManagerServerHandler handler, MessageBean bean) {
        super(handler, bean);
    }

    public MessageBean finish() {
        // 平台发送第9条指令 发送实时时间
        return new MessageBean(bean.getDeviceId(), 0, 0, MessageBeanFactory.GET_SYSTEM_TIME, DeviceMsgUtils.getTimeArray());
    }
}
