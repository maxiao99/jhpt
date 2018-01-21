/*
 * Copyright (c) 2018. CK. All rights reserved.
 */

package com.tyj.jhpt.server.message.type;

import com.github.fartherp.framework.common.util.ISOUtil;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: CK
 * @date: 2018/1/21
 */
public enum ParamMessage {
    localStoreCycle("01", "车载终端本地存储时间周期", 4),
    normalUploadCycle("02", "正常时，信息上报时间周期", 4),
    alarmUploadCycle("03", "出现报警时，信息上报时间周期", 4),
    manageDomainLength("04", "远程服务与管理平台域名长度", 2),
    manageDomain("05", "远程服务与管理平台域名", 0),
    managePort("06", "远程服务与管理平台端口", 4),
    hardwareVersion("07", "硬件版本", 5),
    firmwareVersion("08", "固件版本", 5),
    terminalHeartSendCycle("09", "车载终端心跳发送周期", 2),
    terminalRespOverTime("0A", "终端应答超时时间", 4),
    platformRespOverTime("0B", "平台应答超时时间", 4),
    threeNextLoginTime("0C", "连续三次登入失败后，到下一次登入的间隔时间", 2),
    govPlatformDomainLength("0D", "政府平台域名长度", 2),
    govPlatformDomain("0E", "政府平台域名", 0),
    govPlatformPort("0F", "政府平台端口", 4),
    monitor("10", "是否处于抽样监测", 2),
    ;
    private String code;
    private String name;
    private int length;
    private byte codeB;
    ParamMessage(String code, String name, int length) {
        this.code = code;
        this.name = name;
        this.length = length;
        this.codeB = ISOUtil.hex2byte(code)[0];
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }

    public byte getCodeB() {
        return codeB;
    }

    public static ParamMessage get(byte codeB) {
        ParamMessage[] values = ParamMessage.values();
        for (ParamMessage v : values) {
            if (v.getCodeB() == codeB) {
                return v;
            }
        }
        return null;
    }
}
