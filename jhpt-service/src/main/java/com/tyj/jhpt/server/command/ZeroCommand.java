package com.tyj.jhpt.server.command;

import com.github.fartherp.framework.common.util.DateUtil;
import com.tyj.jhpt.bo.DeviceInfo;
import com.tyj.jhpt.message.MessageBean;
import com.tyj.jhpt.server.handler.DeviceManagerServerHandler;
import com.tyj.jhpt.server.handler.MessageBeanFactory;

import java.util.Date;

/**
 * 设备发送第0条指令
 * Auth: CK
 * Date: 2016/7/1
 */
public class ZeroCommand extends AbstractCommand {
    protected ZeroCommand(DeviceManagerServerHandler handler, MessageBean bean) {
        super(handler, bean);
    }

    public MessageBean finish() {
        // 平台发送第1条指令 发送设备的失效日期
        DeviceInfo dev = handler.getDeviceInfoService().findById(bean.getDeviceId());
        Date outofDateTime = dev.getOutofdateTime();
        MessageBean messageBean = MessageBeanFactory.buildExpireDateInstruction1(
                dev.getDeviceId(),
                DateUtil.year(outofDateTime),
                DateUtil.month(outofDateTime),
                DateUtil.day(outofDateTime));
        return messageBean;
    }
}
