package com.tyj.jhpt.server.command;

import com.tyj.jhpt.bo.DeviceInfo;
import com.tyj.jhpt.message.MessageBean;
import com.tyj.jhpt.message.MessageType;
import com.tyj.jhpt.server.handler.DeviceManagerServerHandler;

/**
 * Created by IntelliJ IDEA .
 * Auth: CK
 * Date: 2016/7/1
 */
public class CommandFactory {
    public static Command buildCommand(DeviceManagerServerHandler handler, MessageBean bean) {
        byte type = 1;
        if (bean.getMessageType() == MessageType.ZERO_COMMAND) {
            DeviceInfo deviceInfo = new DeviceInfo();
            deviceInfo.setDeviceId(bean.getDeviceId());
            byte operationType = bean.getInstruction(0).getContent()[0];
            if (operationType == MessageType.FIRST_ACTIVATION) {
                // 第一次激活
                deviceInfo.setIfActive(operationType);
            } else if (operationType == MessageType.ACTIVATING_AGAIN) {
                // 再次激活
                deviceInfo.setIfActive(operationType);
            }
            handler.getDeviceInfoService().updateEntitySelective(deviceInfo);
        } else if (bean.getMessageType() == MessageType.ONE_COMMAND
                || bean.getMessageType() == MessageType.TWO_COMMAND) {
            type = handler.getDeviceInfoService().findById(bean.getDeviceId()).getIfActive();
        }

        Command command = null;
        switch (bean.getMessageType()) {
            case MessageType.ZERO_COMMAND :
                command = new ZeroCommand(handler, bean);
                break;
            case MessageType.ONE_COMMAND :
                command = new OneCommand(handler, bean, type);
                break;
            case MessageType.TWO_COMMAND :
                command = new TwoCommand(handler, bean, type);
                break;
            case MessageType.THREE_COMMAND :
                command = new ThreeCommand(handler, bean);
                break;
            case MessageType.EIGHT_COMMAND :
                command = new EightCommand(handler, bean);
                break;
            case MessageType.NINE_COMMAND:
                command = new NineCommand(handler, bean);
                break;
            default:
        }
        return command;
    }
}
