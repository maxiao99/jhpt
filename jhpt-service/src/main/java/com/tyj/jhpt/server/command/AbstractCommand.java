package com.tyj.jhpt.server.command;

import com.tyj.jhpt.message.MessageBean;
import com.tyj.jhpt.server.handler.DeviceManagerServerHandler;
import com.tyj.jhpt.server.handler.MessageBeanFactory;

/**
 * Created by IntelliJ IDEA .
 * Auth: CK
 * Date: 2016/7/1
 */
public class AbstractCommand implements Command {
    protected DeviceManagerServerHandler handler;
    protected MessageBean bean;

    protected AbstractCommand(DeviceManagerServerHandler handler, MessageBean bean) {
        this.handler = handler;
        this.bean = bean;
    }

    public void deal() {

    }

    public MessageBean finish() {
        return new MessageBean(bean.getDeviceId(), 0, 0, MessageBeanFactory.FINISH, new byte[] { 0x4f, 0 });
    }

    public MessageBean getBean() {
        return bean;
    }

    public void setBean(MessageBean bean) {
        this.bean = bean;
    }

    public DeviceManagerServerHandler getHandler() {
        return handler;
    }

    public void setHandler(DeviceManagerServerHandler handler) {
        this.handler = handler;
    }
}
