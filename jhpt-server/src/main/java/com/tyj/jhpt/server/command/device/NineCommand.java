/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.command.device;

import com.github.fartherp.framework.common.util.ISOUtil;
import com.tyj.jhpt.server.message.CommandEnum;
import com.tyj.jhpt.server.handler.DeviceManagerServerHandler;
import com.tyj.jhpt.server.message.MessageBean;
import com.tyj.jhpt.server.util.DeviceMsgUtils;
import org.springframework.stereotype.Component;

import java.math.BigInteger;
import java.util.Date;

import static com.tyj.jhpt.server.command.device.NineCommand.DataEnum.DRIVER_ID;
import static com.tyj.jhpt.server.command.device.NineCommand.DataEnum.DRIVER_IDENTITY_NO;
import static com.tyj.jhpt.server.command.device.NineCommand.DataEnum.DRIVER_NAME_LENGTH;
import static com.tyj.jhpt.server.command.device.NineCommand.DataEnum.SEND_CERTIFICATE_NAME_LENGTH;
import static com.tyj.jhpt.server.command.device.NineCommand.DataEnum.TIME;
import static com.tyj.jhpt.server.command.device.NineCommand.DataEnum.WORK_QUALIFICATION_NO;

/**
 * 驾驶员身份信息采集上报
 *
 * @author: CK
 * @date: 2017/12/8
 */
@Component
public class NineCommand extends DeviceAbstractCommand {
    public NineCommand() {
        super(CommandEnum.DRIVER_IDENTITY_MESSAGE_COLLECTION_UPLOAD.getType());
    }

    public void deal(DeviceManagerServerHandler handler, MessageBean mb) {
        byte[] content = mb.getContent();
        // 数据采集时间
        Date time = DeviceMsgUtils.resolveTime(content, TIME.length);
        int offset = TIME.length;

        // 驾驶员ID
        byte[] bytes = new byte[DRIVER_ID.length];
        System.arraycopy(content, offset, bytes, 0, DRIVER_ID.length);
        offset += DRIVER_ID.length;
        BigInteger bigInteger = new BigInteger(bytes);
        int alarmId = bigInteger.intValue();

        // 驾驶员姓名长度
        bytes = new byte[]{content[offset + DRIVER_NAME_LENGTH.length]};
        offset += DRIVER_NAME_LENGTH.length;
        byte driverNameLength = bytes[0];

        // 驾驶员姓名
        bytes = new byte[driverNameLength];
        System.arraycopy(content, offset, bytes, 0, driverNameLength);
        offset += driverNameLength;
        String driveName = ISOUtil.byte2hex(bytes);

        // 驾驶员身份证编码
        bytes = new byte[DRIVER_IDENTITY_NO.length];
        System.arraycopy(content, offset, bytes, 0, DRIVER_IDENTITY_NO.length);
        offset += DRIVER_IDENTITY_NO.length;
        String driveIdentityNo = ISOUtil.byte2hex(bytes);

        // 从业资格证编码
        bytes = new byte[WORK_QUALIFICATION_NO.length];
        System.arraycopy(content, offset, bytes, 0, WORK_QUALIFICATION_NO.length);
        offset += WORK_QUALIFICATION_NO.length;
        String workQualification = ISOUtil.byte2hex(bytes);

        // 发证机构名称长度
        bytes = new byte[]{content[offset + SEND_CERTIFICATE_NAME_LENGTH.length]};
        offset += SEND_CERTIFICATE_NAME_LENGTH.length;
        byte sendCertificateNameLength = bytes[0];

        // 发证机构名称
        bytes = new byte[sendCertificateNameLength];
        System.arraycopy(content, offset, bytes, 0, sendCertificateNameLength);
        offset += sendCertificateNameLength;
        String sendCertificateName = ISOUtil.byte2hex(bytes);
    }

    public static enum DataEnum {
        TIME(6, "数据采集时间"),
        DRIVER_ID(3, "驾驶员ID"),
        DRIVER_NAME_LENGTH(1, "驾驶员姓名长度"),
        DRIVER_IDENTITY_NO(20, "驾驶员身份证编码"),
        WORK_QUALIFICATION_NO(40, "从业资格证编码"),
        SEND_CERTIFICATE_NAME_LENGTH(1, "发证机构名称长度"),
        ;
        private int length;
        private String desc;
        DataEnum(int length, String desc) {
            this.length = length;
            this.desc = desc;
        }
    }
}
