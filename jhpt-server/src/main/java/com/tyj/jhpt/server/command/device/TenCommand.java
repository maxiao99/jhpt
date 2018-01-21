/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.command.device;

import com.tyj.jhpt.bo.ParamQueryBack;
import com.tyj.jhpt.server.message.CommandEnum;
import com.tyj.jhpt.server.handler.DeviceManagerServerHandler;
import com.tyj.jhpt.server.message.MessageBean;
import com.tyj.jhpt.server.message.type.ParamMessage;
import com.tyj.jhpt.server.util.ByteUtils;
import com.tyj.jhpt.server.util.DeviceMsgUtils;
import com.tyj.jhpt.service.ParamQueryBackService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.math.BigInteger;
import java.util.Date;

import static com.tyj.jhpt.server.command.device.TenCommand.DataEnum.TIME;

/**
 * 参数查询反馈
 *
 * @author: CK
 * @date: 2017/12/8
 */
@Component
public class TenCommand extends DeviceAbstractCommand {
    public TenCommand() {
        super(CommandEnum.PARAM_QUERY_FEEDBACK.getType());
    }

    @Resource(name = "paramQueryBackService")
    ParamQueryBackService paramQueryBackService;

    public void deal(DeviceManagerServerHandler handler, MessageBean mb) {
        // 返回参数查询时间
        byte[] content = mb.getContent();
        ParamQueryBack paramQueryBack = new ParamQueryBack();
        paramQueryBack.setCarVin(mb.getVin());

        Date time = DeviceMsgUtils.resolveTime(content, 0);
        paramQueryBack.setEventTime(time);
        int offset = TIME.length;

        // 参数总数
        byte paramNum = content[offset];
        offset += 1;
        paramQueryBack.setParamNum((int) paramNum);

        deal(offset, mb, paramQueryBack);

        paramQueryBackService.saveEntity(paramQueryBack);
    }

    private void deal(int offset, MessageBean mb, ParamQueryBack paramQueryBack) {
        if ((mb.getLength() - 4) <= offset) {
            return;
        }
        byte[] content = mb.getContent();
        // 参数ID
        byte paramId = content[offset];
        offset += 1;

        if (ParamMessage.localStoreCycle.getCodeB() == paramId) {
            int length = ParamMessage.localStoreCycle.getLength() / 2;
            byte [] bytes = new byte[length];
            System.arraycopy(content, offset, bytes, 0, length);
            offset += length;
            BigInteger bigInteger = new BigInteger(bytes);
            int localStoreCycle = bigInteger.intValue();
            paramQueryBack.setLocalStoreCycle(localStoreCycle);
        } else if (ParamMessage.normalUploadCycle.getCodeB() == paramId) {
            int length = ParamMessage.normalUploadCycle.getLength() / 2;
            byte [] bytes = new byte[length];
            System.arraycopy(content, offset, bytes, 0, length);
            offset += length;
            BigInteger bigInteger = new BigInteger(bytes);
            int normalUploadCycle = bigInteger.intValue();
            paramQueryBack.setNormalUploadCycle(normalUploadCycle);
        } else if (ParamMessage.alarmUploadCycle.getCodeB() == paramId) {
            int length = ParamMessage.alarmUploadCycle.getLength() / 2;
            byte [] bytes = new byte[length];
            System.arraycopy(content, offset, bytes, 0, length);
            offset += length;
            BigInteger bigInteger = new BigInteger(bytes);
            int alarmUploadCycle = bigInteger.intValue();
            paramQueryBack.setAlarmUploadCycle(alarmUploadCycle);
        } else if (ParamMessage.manageDomainLength.getCodeB() == paramId) {
            byte manageDomainActiveLength = content[offset];
            paramQueryBack.setManageDomainLength((int) manageDomainActiveLength);
            offset += 1;
            paramId = content[offset];
            offset += 1;
            if (ParamMessage.manageDomain.getCodeB() == paramId) {
                byte [] bytes = new byte[manageDomainActiveLength];
                System.arraycopy(content, offset, bytes, 0, manageDomainActiveLength);
                offset += manageDomainActiveLength;
                paramQueryBack.setManageDomain(bytes);
            }
        } else if (ParamMessage.managePort.getCodeB() == paramId) {
            int length = ParamMessage.managePort.getLength() / 2;
            byte [] bytes = new byte[length];
            System.arraycopy(content, offset, bytes, 0, length);
            offset += length;
            BigInteger bigInteger = new BigInteger(bytes);
            int managePort = bigInteger.intValue();
            paramQueryBack.setManagePort(managePort);
        } else if (ParamMessage.hardwareVersion.getCodeB() == paramId) {
            int length = ParamMessage.hardwareVersion.getLength() / 2;
            String hardwareVersion = ByteUtils.getGBKString(content, offset, length);
            offset += length;
            paramQueryBack.setHardwareVersion(hardwareVersion);
        } else if (ParamMessage.firmwareVersion.getCodeB() == paramId) {
            int length = ParamMessage.firmwareVersion.getLength() / 2;
            String firmwareVersion = ByteUtils.getGBKString(content, offset, length);
            offset += length;
            paramQueryBack.setFirmwareVersion(firmwareVersion);
        } else if (ParamMessage.terminalHeartSendCycle.getCodeB() == paramId) {
            int length = ParamMessage.terminalHeartSendCycle.getLength() / 2;
            byte [] bytes = new byte[length];
            System.arraycopy(content, offset, bytes, 0, length);
            offset += length;
            BigInteger bigInteger = new BigInteger(bytes);
            int terminalHeartSendCycle = bigInteger.intValue();
            paramQueryBack.setTerminalHeartSendCycle(terminalHeartSendCycle);
        } else if (ParamMessage.terminalRespOverTime.getCodeB() == paramId) {
            int length = ParamMessage.terminalRespOverTime.getLength() / 2;
            byte [] bytes = new byte[length];
            System.arraycopy(content, offset, bytes, 0, length);
            offset += length;
            BigInteger bigInteger = new BigInteger(bytes);
            int terminalRespOverTime = bigInteger.intValue();
            paramQueryBack.setTerminalRespOverTime(terminalRespOverTime);
        } else if (ParamMessage.platformRespOverTime.getCodeB() == paramId) {
            int length = ParamMessage.platformRespOverTime.getLength() / 2;
            byte [] bytes = new byte[length];
            System.arraycopy(content, offset, bytes, 0, length);
            offset += length;
            BigInteger bigInteger = new BigInteger(bytes);
            int platformRespOverTime = bigInteger.intValue();
            paramQueryBack.setPlatformRespOverTime(platformRespOverTime);
        } else if (ParamMessage.threeNextLoginTime.getCodeB() == paramId) {
            int length = ParamMessage.threeNextLoginTime.getLength() / 2;
            byte [] bytes = new byte[length];
            System.arraycopy(content, offset, bytes, 0, length);
            offset += length;
            BigInteger bigInteger = new BigInteger(bytes);
            int threeNextLoginTime = bigInteger.intValue();
            paramQueryBack.setThreeNextLoginTime(threeNextLoginTime);
        } else if (ParamMessage.govPlatformDomainLength.getCodeB() == paramId) {
            byte govPlatformDomainActiveLength = content[offset];
            paramQueryBack.setGovPlatformDomainLength((int) govPlatformDomainActiveLength);
            offset += 1;
            paramId = content[offset];
            offset += 1;
            if (ParamMessage.govPlatformDomain.getCodeB() == paramId) {
                byte [] bytes = new byte[govPlatformDomainActiveLength];
                System.arraycopy(content, offset, bytes, 0, govPlatformDomainActiveLength);
                offset += govPlatformDomainActiveLength;
                paramQueryBack.setGovPlatformDomain(bytes);
            }
        } else if (ParamMessage.govPlatformPort.getCodeB() == paramId) {
            int length = ParamMessage.govPlatformPort.getLength() / 2;
            byte [] bytes = new byte[length];
            System.arraycopy(content, offset, bytes, 0, length);
            offset += length;
            BigInteger bigInteger = new BigInteger(bytes);
            int govPlatformPort = bigInteger.intValue();
            paramQueryBack.setGovPlatformPort(govPlatformPort);
        } else if (ParamMessage.monitor.getCodeB() == paramId) {
            int length = ParamMessage.monitor.getLength() / 2;
            byte [] bytes = new byte[length];
            System.arraycopy(content, offset, bytes, 0, length);
            offset += length;
            BigInteger bigInteger = new BigInteger(bytes);
            int monitor = bigInteger.intValue();
            paramQueryBack.setMonitor(monitor);
        }

        deal(offset, mb, paramQueryBack);
    }

    public static enum DataEnum {
        TIME(6, "返回参数查询时间"),
        ;
        private int length;
        private String desc;
        DataEnum(int length, String desc) {
            this.length = length;
            this.desc = desc;
        }
    }
}
