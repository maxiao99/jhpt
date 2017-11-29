package com.tyj.jhpt.server.command;

import com.tyj.jhpt.bo.DeviceInfo;
import com.tyj.jhpt.message.MessageBean;
import com.tyj.jhpt.server.handler.DeviceManagerServerHandler;

/**
 * Created by IntelliJ IDEA .
 * Auth: CK
 * Date: 2016/7/1
 */
public class ThreeCommand extends AbstractCommand {
    protected ThreeCommand(DeviceManagerServerHandler handler, MessageBean bean) {
        super(handler, bean);
    }

    public MessageBean finish() {
        // 平台发送第6条指令
        MessageBean messageBean = super.finish();
        DeviceInfo device = handler.getDeviceInfoService().findById(bean.getDeviceId());
        if (device != null) {
            device.setActivateTimes(device.getActivateTimes() + 1);
            handler.getDeviceInfoService().updateEntitySelective(device);
            handler.getTradeInfosService().updateDeviceSuccess(bean.getDeviceId());
        }
        return messageBean;
    }
}
