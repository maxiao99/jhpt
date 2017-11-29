package com.tyj.jhpt.server.handler;

import com.tyj.jhpt.message.MessageBean;
import com.tyj.jhpt.util.CharacterUtils;
import com.tyj.jhpt.util.DeviceMsgUtils;

/**
 * Created by IntelliJ IDEA .
 * Auth: CK
 * Date: 2016/6/14
 */
public class MessageBeanFactory {

    public static final int EXPIRATION_DATE = 1;
    public static final int DEVICE_DISTRIBUTION = 2;
    public static final int PARAMETER_SETTING = 3;
    public static final int GET_FLASH_USAGE = 4;
    public static final int GET_FLASH_RECORDS = 5;
    public static final int FINISH = 6;
    public static final int CLEAR_FLASH = 7;
    public static final int GET_SYSTEM_TIME = 9;

    /**
     * 创建过期时间报文
     *
     * @return
     */
    public static MessageBean buildExpireDateInstruction1(int deviceId, int year, int month, int day) {
        return buildExpireDateInstruction1(deviceId, 0, year, month, day);
    }

    public static MessageBean buildExpireDateInstruction1(int deviceId, int encryptIndex, int year, int month, int day) {
        return new MessageBean(deviceId, 1, encryptIndex,
                EXPIRATION_DATE, new byte[] { 1, (byte) (year % 100), (byte) month, (byte) day });
    }

    /**
     * 创建状态选择报文
     *
     * @param deviceId
     *            设备的deviceId地址
     * @return
     */
    public static MessageBean buildDeviceDistribution2(int deviceId, String driverName, int age, int driverLicenseType,
                                                       String identityNo, String carNo, int carType, String phoneNo) {
        return buildDeviceDistribution2(deviceId, 0, driverName, age,
                driverLicenseType, identityNo, carNo, carType, phoneNo);
    }

    public static MessageBean buildDeviceDistribution2(int deviceId,
                                                       int encryptIndex, String driverName, int age,
                                                       int driverLicenseType, String identityNo, String carNo,
                                                       int carType, String phoneNo) {
        byte[] content = new byte[39];
        content[0] = 00;
        content[1] = (byte) 0xd6;
        content[2] = 1;
        content[3] = 0;
        content[4] = 23;
        // --司机姓名 8字节
        byte[] nb = CharacterUtils.encode(driverName, CharacterUtils.GBK);
        fillBuf(nb, content, 5, 8);
        // --年龄 1字节
        content[13] = (byte) age;
        content[14] = DeviceMsgUtils.getDriverLicenseType(driverLicenseType);
        // --身份证号
        byte[] idBuf = DeviceMsgUtils.encodeIdentityNo(identityNo);
        fillBuf(idBuf, content, 15, 9);
        // --车牌号
        byte[] encodeCarNo = DeviceMsgUtils.encodeCarNo(carNo);
        fillBuf(encodeCarNo, content, 24, 8);
        // --车型 1 bytes
        content[32] = (byte) carType;
        // --手机号 6 bytes
        byte[] phoneBuf = DeviceMsgUtils.encodePhoneNo(phoneNo);
        fillBuf(phoneBuf, content, 33, 6);

        return new MessageBean(deviceId, 1, encryptIndex, DEVICE_DISTRIBUTION, content);
    }

    /**
     * 用src中的内容填充dst,从offset位置开始，最多填充 maxLength字节
     *
     * @param src
     *            源数组
     * @param dst
     *            目标数组
     * @param offset
     * @param maxLength
     */
    private static void fillBuf(byte[] src, byte[] dst, int offset, int maxLength) {
        for (int i = 0; i < maxLength && i < src.length; i++) {
            dst[offset + i] = src[i];
        }
    }

    /**
     * 创建参数配置报文
     *
     * @param deviceId
     *            设备ID
     * @param coverVdVideo
     *            VD中的事故视频是否需要覆盖 01为是，00为否
     * @param carType
     *            车辆类型 01为私家车，02为集团车
     * @param videoLengthBeforeInterrupt
     *            中断信号前的视频时间长度 5-10秒
     * @param videoLengthAfterInterrupt
     *            中断信号后的视频时间长度 5-10秒
     * @param gpsMsgSendIntervalInMinute
     *            3G激活设备GPS信息发送间隔 5-30分钟 还有5个字节的保留位
     * @return
     */
    public static MessageBean buildParamSetting3(int deviceId, boolean coverVdVideo, int carType,
                                                 int videoLengthBeforeInterrupt, int videoLengthAfterInterrupt,
                                                 int gpsMsgSendIntervalInMinute) {
        return buildParamSetting3(deviceId, 0, coverVdVideo, carType, videoLengthBeforeInterrupt,
                videoLengthAfterInterrupt, gpsMsgSendIntervalInMinute);
    }

    public static MessageBean buildParamSetting3(int deviceId, int encryptIndex, boolean coverVdVideo, int carType,
                                                 int videoLengthBeforeInterrupt, int videoLengthAfterInterrupt,
                                                 int gpsMsgSendIntervalInMinute) {
        byte[] data = new byte[11];
        data[0] = 2;
        data[1] = (byte) (coverVdVideo ? 1 : 0);
        data[2] = (byte) carType;
        data[3] = (byte) videoLengthBeforeInterrupt;
        data[4] = (byte) videoLengthAfterInterrupt;
        data[5] = (byte) gpsMsgSendIntervalInMinute;
        return new MessageBean(deviceId, 1, encryptIndex, PARAMETER_SETTING, data);
    }

    public static MessageBean buildGetFlashUsage4(int deviceId) {
        return buildGetFlashUsage4(deviceId, 0);
    }

    public static MessageBean buildGetFlashUsage4(int deviceId, int encryptIndex) {
        byte[] data = new byte[5];
        data[0] = 00;
        data[1] = (byte) 0xB0;
        data[2] = 2;
        data[3] = 0;
        data[4] = 3;
        return new MessageBean(deviceId, 1, encryptIndex, GET_FLASH_USAGE, data);
    }

    /**
     * 取Flash 占用空间
     * @param deviceId
     * @param offset
     * @param msgCount
     * @return
     */
    public static MessageBean buildGetFlashMsg5(int deviceId, int offset, int msgCount) {
        return buildGetFlashMsg5(deviceId, 0, offset, msgCount);
    }

    public static MessageBean buildGetFlashMsg5(int deviceId, int encryptIndex, int offset, int msgCount) {
        byte[] data = new byte[8];
        data[0] = 00;
        data[1] = (byte) 0xB0;
        data[2] = 3;
        data[3] = (byte) (offset >> 16);
        data[4] = (byte) (offset >> 8);
        data[5] = (byte) (offset);
        data[6] = (byte) (msgCount >> 8);
        data[7] = (byte) (msgCount);
        return new MessageBean(deviceId, 1, encryptIndex, GET_FLASH_RECORDS, data);
    }

    /**
     * 创建清空flash中信息指令
     *
     * @param deviceId
     * @return
     */
    public static MessageBean buildClearMsgsInFlash7(int deviceId) {
        return buildClearMsgsInFlash7(deviceId, 0);
    }

    public static MessageBean buildClearMsgsInFlash7(int deviceId, int encrytIndex) {
        return new MessageBean(deviceId, 0, encrytIndex, CLEAR_FLASH, new byte[] { 0x3f, 0 });
    }

    /**
     * 创建自定义报文。 一般情况下不需要用此方法，如果创建上面方法不包含的报文，可以使用此方法。
     *
     * @param deviceId
     *            设备的deviceId地址
     * @return
     */
    public static MessageBean build(int deviceId, int needReply, int encryptIndex, int operationType, byte[] data) {
        return new MessageBean(deviceId, needReply, encryptIndex, operationType, data);
    }
}
