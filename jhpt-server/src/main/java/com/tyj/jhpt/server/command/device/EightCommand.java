/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.command.device;

import com.tyj.jhpt.bo.TerminalStatusUpload;
import com.tyj.jhpt.server.message.CommandEnum;
import com.tyj.jhpt.server.handler.DeviceManagerServerHandler;
import com.tyj.jhpt.server.message.MessageBean;
import com.tyj.jhpt.server.util.DeviceMsgUtils;
import com.tyj.jhpt.service.TerminalStatusUploadService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;

import static com.tyj.jhpt.server.command.device.EightCommand.DataEnum.MESSAGE_BODY;
import static com.tyj.jhpt.server.command.device.EightCommand.DataEnum.TIME;
import static com.tyj.jhpt.server.command.device.EightCommand.DataEnum.MESSAGE_TYPE;

/**
 * 车载终端状态信息上报
 *
 * @author: CK
 * @date: 2017/12/8
 */
@Component
public class EightCommand extends DeviceAbstractCommand {
    public EightCommand() {
        super(CommandEnum.PARAM_QUERY_FEEDBACK.getType());
    }

    @Resource(name = "terminalStatusUploadService")
    TerminalStatusUploadService terminalStatusUploadService;

    public void deal(DeviceManagerServerHandler handler, MessageBean mb) {
        // 数据采集时间
        byte[] content = mb.getContent();

        TerminalStatusUpload terminalStatusUpload = new TerminalStatusUpload();
        terminalStatusUpload.setCarVin(mb.getVin());

        Date time = DeviceMsgUtils.resolveTime(content, 0);
        int offset = TIME.length;
        terminalStatusUpload.setEventTime(time);

        // 信息类型标志
        byte messageType = content[offset];
        offset += MESSAGE_TYPE.length;
        terminalStatusUpload.setMessageType(messageType);

        // 信息体
        byte messageBody = content[offset];
        offset += MESSAGE_BODY.length;
        terminalStatusUpload.setMessageBody(messageBody);

        terminalStatusUploadService.saveEntitySelective(terminalStatusUpload);
    }

    public static enum DataEnum {
        TIME(6, "数据采集时间"),
        MESSAGE_TYPE(1, "信息类型标志"),
        MESSAGE_BODY(1, "信息体"),
        ;
        private int length;
        private String desc;
        DataEnum(int length, String desc) {
            this.length = length;
            this.desc = desc;
        }
    }
}
