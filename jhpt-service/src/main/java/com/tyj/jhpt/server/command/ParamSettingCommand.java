package com.tyj.jhpt.server.command;

import com.tyj.jhpt.bo.DeviceInfo;
import com.tyj.jhpt.message.MessageBean;
import com.tyj.jhpt.server.handler.DeviceManagerServerHandler;
import com.tyj.jhpt.server.handler.MessageBeanFactory;

/**
 * Created by IntelliJ IDEA .
 * Auth: CK
 * Date: 2016/7/1
 */
public class ParamSettingCommand extends AbstractCommand {

    protected ParamSettingCommand(DeviceManagerServerHandler handler, MessageBean bean) {
        super(handler, bean);
    }

    public MessageBean finish() {
        // 平台发送第3条指令 发送VD和定位信息的配置参数
        DeviceInfo dev = handler.getDeviceInfoService().findById(bean.getDeviceId());
        MessageBean messageBean = MessageBeanFactory.buildParamSetting3(
                dev.getDeviceId(), false, dev.getCarType(), 2, 2, 10);
        return messageBean;
    }
}
