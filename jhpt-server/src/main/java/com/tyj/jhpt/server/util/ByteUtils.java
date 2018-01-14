/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.util;

import com.github.fartherp.framework.common.util.ISOUtil;
import com.github.fartherp.framework.security.symmetry.ThreeDES;
import io.netty.buffer.ByteBuf;

import java.io.UnsupportedEncodingException;

/**
 * Created by IntelliJ IDEA .
 * Auth: CK
 * Date: 2016/5/3
 */
public class ByteUtils {

    public static final byte[] key = ISOUtil.hex2byte("23457A6256901B4676C89A1C2D4E2A46");

    /**
     * 字节转换成int，采用小端模式转换
     * @param content
     * @param offset
     * @return
     */
    public static int byteToIntLE(byte[] content, int offset) {
        int id = (0xff000000 & content[offset] << 24 )
                + (0xff0000	& content[offset + 1] << 16)
                + (0xff00	& content[offset + 2] << 8)
                + (0xff 	& content[offset+3]);
        return id;
    }

    /**
     * asc码到byte
     * @param b
     * @return
     */
    public static byte asciiToByteValue(byte b) {
        int a = 0xff & b;
        if (a >= '0' && a <= '9') {
            b = (byte) (a - 48);
        } else if (a >= 'A' && a <= 'Z') {
            b = (byte) (a - 55);
        } else if (a >= 'a' && a <= 'z') {
            b = (byte) (a - 87);
        }
        return b;
    }

    /**
     * 一位二进制数据被编码成两个字节的ascii码，本方法将ascii码转换成原始的二进制数据
     *
     * @param bytes
     */
    public static byte[] asciiCharsToBytes(byte[] bytes) {
        byte[] bs = new byte[bytes.length / 2];
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = ByteUtils.asciiToByteValue(bytes[i]);
        }
        for (int i = 0; i < bytes.length; i += 2) {
            bs[i / 2] = (byte) ((0xff & bytes[i]) << 4 | 0xff & bytes[i + 1]);
        }
        return bs;
    }

    public static int bytesToInt(byte[] deviceId) {
        int a = 0;
        for (int i = 0; i < 4; i++) {
            a += (deviceId[i] & 0xff) << ((3 - i) * 8);
        }
        return a;
    }

    public static void putIntToBufferBigEndian(byte[] bb, int offset, int x) {
        bb[offset] = (byte)(x >> 24);
        bb[(offset + 1)] = (byte)(x >> 16);
        bb[(offset + 2)] = (byte)(x >> 8);
        bb[(offset + 3)] = (byte)x;
    }

    public static void putByteToBuffer(byte[] bb, byte x, int index) {
        bb[index] = x;
    }

    public static byte[] readBytes(ByteBuf in, int actualLength) {
        byte[] bs = new byte[actualLength * 2];
        in.readBytes(bs);
        return ByteUtils.asciiCharsToBytes(bs);
    }

    public static int readInt(ByteBuf in) {
        byte[] deviceId = new byte[8];
        in.readBytes(deviceId);
        deviceId = ByteUtils.asciiCharsToBytes(deviceId);
        return ByteUtils.bytesToInt(deviceId);
    }

    public static byte readByte(ByteBuf in) {
        byte[] bs = new byte[2];
        in.readBytes(bs);
        return ByteUtils.asciiCharsToBytes(bs)[0];
    }

    /**
     * 将协议数据里的内容解密后再传进来
     *
     * @param encryptIndex
     * @param content
     * @return
     */
    public static byte[] decode(byte encryptIndex, byte[] content) {
        if (encryptIndex == 0) {
            return content;
        }
        byte[] key = new byte[]{encryptIndex};
        return ThreeDES.decrypt(content, key);
    }

    /**
     * 使用给定的密钥序号对内容进行加密
     *
     * @param encryptIndex
     * @param content
     * @return
     */
    public static byte[] encrypt(byte encryptIndex, byte[] content) {
        content = completeData(content);
        byte[] key = new byte[]{encryptIndex};
        return ThreeDES.encrypt(content, key);
    }

    /**
     * 按照加密算法的要求，加密的数据块必须是8个字节的整数倍。这里对加密的数据块进行补全
     *
     * @param content
     * @return
     */
    public static byte[] completeData(byte[] content) {
        if (content.length % 8 == 0) {
            return content;
        }
        byte[] newContent = new byte[content.length + (8 - content.length % 8)];
        System.arraycopy(content, 0, newContent, 0, content.length);
        newContent[content.length] = (byte) 0x80;
        for (int i = content.length + 1; i < newContent.length; i++) {
            newContent[i] = 0x00;
        }
        return newContent;
    }

    public static byte calculate(byte[] content) {
        if (content == null || content.length == 0) {
            return 0;
        }
        byte re = content[0];
        for (int i = 1; i < content.length; i++) {
            re ^= content[i];
        }
        return re;
    }

    /**
     * 解析ASCII
     * @param in ByteBuf
     * @param length 字节长度
     * @return ASCII字符串
     */
    public static String getAsciiString(ByteBuf in, int length) {
        byte[] dest = new byte[length];
        in.readBytes(dest);
        return new String(dest);
    }

    /**
     * 解析ASCII
     * @param src 目标数组
     * @param offset 开始位置
     * @param length 字节长度
     * @return ASCII字符串
     */
    public static String getAsciiString(byte[] src, int offset, int length) {
        byte[] dest = new byte[length];
        System.arraycopy(src, offset, dest, 0, length);
        return new String(dest);
    }

    /**
     * 解析GBK
     * @param src 目标数组
     * @param offset 开始位置
     * @param length 字节长度
     * @return GBK字符串
     */
    public static String getGBKString(byte[] src, int offset, int length) {
        byte[] dest = new byte[length];
        System.arraycopy(src, offset, dest, 0, length);
        try {
            return new String(dest, "GBK");
        } catch (UnsupportedEncodingException e) {
            return null;
        }
    }

}
