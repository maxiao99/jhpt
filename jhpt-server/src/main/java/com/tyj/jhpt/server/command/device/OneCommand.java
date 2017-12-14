/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.command.device;

import com.tyj.jhpt.bo.CarLoginLogout;
import com.tyj.jhpt.server.message.CommandEnum;
import com.tyj.jhpt.server.handler.DeviceManagerServerHandler;
import com.tyj.jhpt.server.message.MessageBean;
import com.tyj.jhpt.server.util.ByteUtils;
import com.tyj.jhpt.server.util.DeviceMsgUtils;
import com.tyj.jhpt.service.CarLoginLogoutService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.math.BigInteger;
import java.util.Date;

import static com.tyj.jhpt.server.command.device.OneCommand.DataEnum.ICCID;
import static com.tyj.jhpt.server.command.device.OneCommand.DataEnum.SYSTEM_CODE_LENGTH;
import static com.tyj.jhpt.server.command.device.OneCommand.DataEnum.SYSTEM_NUM;
import static com.tyj.jhpt.server.command.device.OneCommand.DataEnum.TIME;
import static com.tyj.jhpt.server.command.device.OneCommand.DataEnum.TRACE_NO;

/**
 * 车辆登入
 *
 * @author: CK
 * @date: 2017/12/8
 */
@Component
public class OneCommand extends DeviceAbstractCommand {
    public OneCommand() {
        super(CommandEnum.CAR_LOGIN.getType());
    }

    @Resource(name = "carLoginLogoutService")
    CarLoginLogoutService carLoginLogoutService;

    public void deal(DeviceManagerServerHandler handler, MessageBean mb) {
        byte[] content = mb.getContent();
        CarLoginLogout carLoginLogout = new CarLoginLogout();
        // 数据采集时间
        Date time = DeviceMsgUtils.resolveTime(content, TIME.length);
        int offset = TIME.length;
        carLoginLogout.setLoginTime(time);

        // 登入流水号
        byte [] bytes = new byte[TRACE_NO.length];
        System.arraycopy(content, offset, bytes, 0, TRACE_NO.length);
        offset += TRACE_NO.length;
        BigInteger bigInteger = new BigInteger(bytes);
        int traceNo = bigInteger.intValue();
        carLoginLogout.setTraceNo(traceNo);

        // ICCID
        String iccid = ByteUtils.getAsciiString(content, offset, ICCID.length);
        offset += ICCID.length;
        carLoginLogout.setIccid(iccid);

        // 可充电储能子系统数
        byte systemNum = content[offset + SYSTEM_NUM.length];
        offset += SYSTEM_NUM.length;

        // 可充电储能系统编码长度
        byte systemCodeLength = content[offset + SYSTEM_CODE_LENGTH.length];
        offset += SYSTEM_CODE_LENGTH.length;

        // 可充电储能系统编码
        String systemCode = ByteUtils.getAsciiString(content, offset, systemCodeLength);
        carLoginLogout.setSystemCode(systemCode);

        carLoginLogoutService.saveEntitySelective(carLoginLogout);
    }

    public static enum DataEnum {
        TIME(6, "数据采集时间"),
        TRACE_NO(4, "登入流水号"),
        ICCID(20, "ICCID"),
        SYSTEM_NUM(1, "可充电储能子系统数"),
        SYSTEM_CODE_LENGTH(1, "可充电储能子系统编码长度"),
        ;
        private int length;
        private String desc;
        DataEnum(int length, String desc) {
            this.length = length;
            this.desc = desc;
        }
    }
}
