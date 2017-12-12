/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.command.device;

import com.tyj.jhpt.server.message.CommandEnum;
import com.tyj.jhpt.server.message.MessageBean;
import org.springframework.stereotype.Component;

import java.util.Calendar;

/**
 * 终端校时
 *
 * @author: CK
 * @date: 2017/12/8
 */
@Component
public class SixCommand extends DeviceAbstractCommand {
    public SixCommand() {
        super(CommandEnum.TERMINAL_VERIFY_TIME.getType());
    }

    public MessageBean finish(MessageBean mb) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR) - 2000;
        int month = calendar.get(Calendar.MONTH) + 1;
        int date = calendar.get(Calendar.DATE);
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        byte yearb = Byte.parseByte(Integer.toHexString(year));
        byte monthb = Byte.parseByte(Integer.toHexString(month));
        byte dateb = Byte.parseByte(Integer.toHexString(date));
        byte hourb = Byte.parseByte(Integer.toHexString(hour));
        byte minuteb = Byte.parseByte(Integer.toHexString(minute));
        byte secondb = Byte.parseByte(Integer.toHexString(second));
        mb.setContent(new byte[]{0x00, 0x06, yearb, monthb, dateb, hourb, minuteb, secondb});
        return mb;
    }
}
