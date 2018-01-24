/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.util;

import com.github.fartherp.framework.common.util.ISOUtil;
import com.tyj.jhpt.server.message.type.ParamMessage;
import com.tyj.jhpt.vo.SettingConfigVo;
import com.tyj.jhpt.vo.TerminalConfigVo;
import org.apache.commons.lang.RandomStringUtils;

import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: CK
 * @date: 2017/12/8
 */
public class DeviceMsgUtils {
    /**
     * 计算时间
     * @param content byte数组
     * @param offset 位置
     * @return Date
     */
    public static Date resolveTime(byte[] content, int offset) {
        Calendar c = Calendar.getInstance();
        int year = Integer.parseInt("20" + (0xff & content[offset]));
        c.set(Calendar.YEAR, year);
        int month = (0xff & content[1 + offset]) - 1;
        c.set(Calendar.MONTH, month);
        int day = 0xff & content[2 + offset];
        c.set(Calendar.DAY_OF_MONTH, day);
        int hour = 0xff & content[3 + offset];
        c.set(Calendar.HOUR_OF_DAY, hour);
        int minute = 0xff & content[4 + offset];
        c.set(Calendar.MINUTE, minute);
        int second = 0xff & content[5 + offset];
        c.set(Calendar.SECOND, second);
        return c.getTime();
    }

    /**
     * 获取当前服务器时间
     * @return byte[]
     */
    public static byte[] getTime() {
        byte[] date = new byte[6];
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR) - 2000;
        date[0] = ISOUtil.hex2byte(Integer.toHexString(year))[0];
        int month = c.get(Calendar.MONTH) + 1;
        date[1] = ISOUtil.hex2byte(Integer.toHexString(month))[0];
        int day = c.get(Calendar.DAY_OF_MONTH);
        date[2] = ISOUtil.hex2byte(Integer.toHexString(day))[0];
        int hour = c.get(Calendar.HOUR_OF_DAY);
        date[3] = ISOUtil.hex2byte(Integer.toHexString(hour))[0];
        int minute = c.get(Calendar.MINUTE);
        date[4] = ISOUtil.hex2byte(Integer.toHexString(minute))[0];
        int second = c.get(Calendar.SECOND);
        date[5] = ISOUtil.hex2byte(Integer.toHexString(second))[0];
        return date;
    }


    /**
     * 计算经纬度
     * @param content byte数组
     * @param offset 位置
     * @return double
     */
    public static double readLatLongInfo(byte[] content, int offset) {
        long value = (0xff000000L & (content[offset] << 24))
                + (0xff0000L & (content[offset + 1] << 16))
                + (0xff00L & (content[offset + 2] << 8))
                + (0xffL & content[offset + 3]);
        return value * 1.0 / 1000000;
    }

    /**
     * 计算速度
     * @param content byte数组
     * @param offset 位置
     * @return 速度
     */
    public static Float parseAcceleration(byte[] content, int offset) {
        int a = 0xff & content[offset];
        return (float) (a * 1.0 / 10);
    }

    /**
     * 参数设置/查询
     * @param vin carVin
     * @param type 接口类型
     * @param vo 对象
     * @return String
     */
    public static String param(String vin, String type, SettingConfigVo vo) {
        StringBuilder sb = null;
        try {
            sb = new StringBuilder("【四泽】CTRL.").append("2323").append(type).append("FE").append(ISOUtil.hexString(vin.getBytes("GBK"))).append("04");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        int offset = sb.length();
        byte[] time = getTime();
        int length = time.length;
        sb.append(ISOUtil.hexString(time));

        int total = 0;

        if (vo.getLocalStoreCycle() != null) {
            // 车载终端本地存储时间周期
            sb.append(ParamMessage.localStoreCycle.getCode());
            total += 1;
            if ("81".equals(type)) {
                length += (ParamMessage.localStoreCycle.getLength() / 2);
                sb.append(getIntegerValue(vo.getLocalStoreCycle(), ParamMessage.localStoreCycle.getLength()));
            }
        }
        if (vo.getNormalUploadCycle() != null) {
            // 正常时，信息上报时间周期
            sb.append(ParamMessage.normalUploadCycle.getCode());
            total += 1;
            if ("81".equals(type)) {
                length += (ParamMessage.normalUploadCycle.getLength() / 2);
                sb.append(getIntegerValue(vo.getNormalUploadCycle(), ParamMessage.normalUploadCycle.getLength()));
            }
        }
        if (vo.getAlarmUploadCycle() != null) {
            // 出现报警时，信息上报时间周期
            sb.append(ParamMessage.alarmUploadCycle.getCode());
            total += 1;
            if ("81".equals(type)) {
                length += (ParamMessage.alarmUploadCycle.getLength() / 2);
                sb.append(getIntegerValue(vo.getAlarmUploadCycle(), ParamMessage.alarmUploadCycle.getLength()));
            }
        }
        if (vo.getManageDomainLength() != null) {
            // 远程服务与管理平台域名长度
            sb.append(ParamMessage.manageDomainLength.getCode());
            total += 1;
            if ("81".equals(type)) {
                length += (ParamMessage.manageDomainLength.getLength() / 2);
                sb.append(getIntegerValue(vo.getManageDomainLength(), ParamMessage.manageDomainLength.getLength()));
            }
        }
        if (vo.getManageDomain() != null) {
            // 远程服务与管理平台域名
            sb.append(ParamMessage.manageDomain.getCode());
            total += 1;
            if ("81".equals(type)) {
                length += (vo.getManageDomain().length() / 2);
                sb.append(vo.getManageDomain());
            }
        }
        if (vo.getManagePort() != null) {
            // 远程服务与管理平台端口
            sb.append(ParamMessage.managePort.getCode());
            total += 1;
            if ("81".equals(type)) {
                length += (ParamMessage.managePort.getLength() / 2);
                sb.append(getIntegerValue(vo.getManagePort(), ParamMessage.managePort.getLength()));
            }
        }
        if (vo.getHardwareVersion() != null) {
            // 硬件版本
            sb.append(ParamMessage.hardwareVersion.getCode());
            total += 1;
            if ("81".equals(type)) {
                length += (vo.getHardwareVersion().length() / 2);
                sb.append(vo.getHardwareVersion());
            }
        }
        if (vo.getFirmwareVersion() != null) {
            // 固件版本
            sb.append(ParamMessage.firmwareVersion.getCode());
            total += 1;
            if ("81".equals(type)) {
                length += (vo.getFirmwareVersion().length() / 2);
                sb.append(vo.getFirmwareVersion());
            }
        }
        if (vo.getTerminalHeartSendCycle() != null) {
            // 车载终端心跳发送周期
            sb.append(ParamMessage.terminalHeartSendCycle.getCode());
            total += 1;
            if ("81".equals(type)) {
                length += (ParamMessage.terminalHeartSendCycle.getLength() / 2);
                sb.append(getIntegerValue(vo.getTerminalHeartSendCycle(), ParamMessage.terminalHeartSendCycle.getLength()));
            }
        }
        if (vo.getTerminalRespOverTime() != null) {
            // 终端应答超时时间
            sb.append(ParamMessage.terminalRespOverTime.getCode());
            total += 1;
            if ("81".equals(type)) {
                length += (ParamMessage.terminalRespOverTime.getLength() / 2);
                sb.append(getIntegerValue(vo.getTerminalRespOverTime(), ParamMessage.terminalRespOverTime.getLength()));
            }
        }
        if (vo.getPlatformRespOverTime() != null) {
            // 平台应答超时时间
            sb.append(ParamMessage.platformRespOverTime.getCode());
            total += 1;
            if ("81".equals(type)) {
                length += (ParamMessage.platformRespOverTime.getLength() / 2);
                sb.append(getIntegerValue(vo.getPlatformRespOverTime(), ParamMessage.platformRespOverTime.getLength()));
            }
        }
        if (vo.getThreeNextLoginTime() != null) {
            // 连续三次登入失败后，到下一次登入的间隔时间
            sb.append(ParamMessage.threeNextLoginTime.getCode());
            total += 1;
            if ("81".equals(type)) {
                length += (ParamMessage.threeNextLoginTime.getLength() / 2);
                sb.append(getIntegerValue(vo.getThreeNextLoginTime(), ParamMessage.threeNextLoginTime.getLength()));
            }
        }
        if (vo.getGovPlatformDomainLength() != null) {
            // 政府平台域名长度
            sb.append(ParamMessage.govPlatformDomainLength.getCode());
            total += 1;
            if ("81".equals(type)) {
                length += (ParamMessage.govPlatformDomainLength.getLength() / 2);
                sb.append(getIntegerValue(vo.getGovPlatformDomainLength(), ParamMessage.govPlatformDomainLength.getLength()));
            }
        }
        if (vo.getGovPlatformDomain() != null) {
            // 政府平台域名
            sb.append(ParamMessage.govPlatformDomain.getCode());
            total += 1;
            if ("81".equals(type)) {
                length += (vo.getGovPlatformDomain().length() / 2);
                sb.append(vo.getGovPlatformDomain());
            }
        }
        if (vo.getGovPlatformPort() != null) {
            // 政府平台端口
            sb.append(ParamMessage.govPlatformPort.getCode());
            total += 1;
            if ("81".equals(type)) {
                length += (ParamMessage.govPlatformPort.getLength() / 2);
                sb.append(getIntegerValue(vo.getGovPlatformPort(), ParamMessage.govPlatformPort.getLength()));
            }
        }
        if (vo.getMonitor() != null) {
            // 是否处于抽样监测中“0x01”表示是，“0x02”表示否，“0xFE”表示异常，“0xFF”表示无效
            sb.append(ParamMessage.monitor.getCode());
            total += 1;
            if ("81".equals(type)) {
                length += (ParamMessage.monitor.getLength() / 2);
                sb.append(getIntegerValue(vo.getMonitor(), ParamMessage.monitor.getLength()));
            }
        }

        length += total + 1;
        sb.insert(offset, getIntegerValue(length, 4));

        sb.insert(offset + 16, getIntegerValue(total, 2));

        String mac = sb.substring(13);
        byte[] bytes = ISOUtil.hex2byte(mac);

        byte b = ByteUtils.calculate(bytes);
        sb.append(ISOUtil.hexString(new byte[]{b}));
        sb.append('.');
        sb.append(RandomStringUtils.randomNumeric(8));
        sb.append('$');
        return sb.toString();
    }

    public static String control(String vin, TerminalConfigVo vo) {
        StringBuilder sb = null;
        try {
            sb = new StringBuilder("【四泽】CTRL.").append("2323").append("82").append("FE").append(ISOUtil.hexString(vin.getBytes("GBK"))).append("04");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        int offset = sb.length();
        int length = 0;
        byte[] time = getTime();
        length += time.length;
        sb.append(ISOUtil.hexString(time));

        if (vo.getDeviceControl() != null) {
            length += 1;
            sb.append(getIntegerValue(vo.getDeviceControl(), 2));
        }
        if (vo.getAlarmLevel() != null) {
            length += 1;
            sb.append(getIntegerValue(vo.getAlarmLevel(), 2));
        }

        sb.insert(offset, getIntegerValue(length, 4));

        String mac = sb.substring(13);
        byte[] bytes = ISOUtil.hex2byte(mac);

        byte b = ByteUtils.calculate(bytes);
        sb.append(ISOUtil.hexString(new byte[]{b}));
        sb.append('.');
        sb.append(RandomStringUtils.randomNumeric(8));
        sb.append('$');
        return sb.toString();
    }

    public static String getIntegerValue(int value, int length) {
        StringBuilder sb = new StringBuilder();
        String s = Integer.toHexString(value);
        for (int i = 0; i < length - s.length(); i++) {
            sb.append('0');
        }
        sb.append(s);
        return sb.toString();
    }
}
