/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.command.device;

import com.tyj.jhpt.bo.DriverPerson;
import com.tyj.jhpt.server.message.CommandEnum;
import com.tyj.jhpt.server.handler.DeviceManagerServerHandler;
import com.tyj.jhpt.server.message.MessageBean;
import com.tyj.jhpt.server.util.ByteUtils;
import com.tyj.jhpt.server.util.DeviceMsgUtils;
import com.tyj.jhpt.service.DriverPersonService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
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

    @Resource(name = "driverPersonService")
    DriverPersonService driverPersonService;

    public void deal(DeviceManagerServerHandler handler, MessageBean mb) {
        byte[] content = mb.getContent();

        DriverPerson driverPerson = new DriverPerson();
        driverPerson.setCarVin(mb.getVin());

        // 数据采集时间
        Date time = DeviceMsgUtils.resolveTime(content, 0);
        int offset = TIME.length;
        driverPerson.setEventTime(time);

        // 驾驶员ID
        byte[] bytes = new byte[DRIVER_ID.length];
        System.arraycopy(content, offset, bytes, 0, DRIVER_ID.length);
        offset += DRIVER_ID.length;
        BigInteger bigInteger = new BigInteger(bytes);
        int driverId = bigInteger.intValue();
        driverPerson.setDriverId(driverId);

        // 驾驶员姓名长度
        byte driverNameLength = content[offset];
        offset += DRIVER_NAME_LENGTH.length;

        // 驾驶员姓名
        String driveName = ByteUtils.getGBKString(content, offset, driverNameLength);
        offset += driverNameLength;
        driverPerson.setDriverName(driveName);

        // 驾驶员身份证编码
        String driveIdentityNo = ByteUtils.getAsciiString(content, offset, DRIVER_IDENTITY_NO.length);
        offset += DRIVER_IDENTITY_NO.length;
        driverPerson.setDriverIdentityNo(driveIdentityNo);

        // 从业资格证编码
        String workQualification = ByteUtils.getAsciiString(content, offset, WORK_QUALIFICATION_NO.length);
        offset += WORK_QUALIFICATION_NO.length;
        driverPerson.setWorkQualification(workQualification);

        // 发证机构名称长度
        byte sendCertificateNameLength = content[offset];
        offset += SEND_CERTIFICATE_NAME_LENGTH.length;

        // 发证机构名称
        String issueOrganizationName = ByteUtils.getGBKString(content, offset, sendCertificateNameLength);
        driverPerson.setIssueOrganizationName(issueOrganizationName);
        driverPersonService.saveEntitySelective(driverPerson);
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
