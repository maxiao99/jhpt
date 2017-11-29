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
public class DeviceInfoCommand extends AbstractCommand {
    protected DeviceInfoCommand(DeviceManagerServerHandler handler, MessageBean bean) {
        super(handler, bean);
    }

    public MessageBean finish() {
        // 平台发送第2条指令 发送注册的信息(姓名、年龄、驾照类型、身份账号、车辆号、车型、手机号等)
        DeviceInfo dev = handler.getDeviceInfoService().findById(bean.getDeviceId());
        MessageBean messageBean = MessageBeanFactory.buildDeviceDistribution2(
                dev.getDeviceId(),
                dev.getName(),
                dev.getAge(),
                dev.getDrivingLicense(),
                dev.getIdentityNo(),
                dev.getPlateNo(),
                dev.getCarType(),
                dev.getTelephone());
        return messageBean;
    }
}
