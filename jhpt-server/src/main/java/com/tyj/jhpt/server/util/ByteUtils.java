/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.util;

import com.github.fartherp.framework.common.util.ISOUtil;
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
     * ascii码的byte 转换 java的byte
     * @param b
     * @return
     */
    public static byte asciiToByte(byte b) {
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
    public static byte[] asciiToBytes(byte[] bytes) {
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = asciiToByte(bytes[i]);
        }
        byte[] bs = new byte[bytes.length / 2];
        for (int i = 0; i < bytes.length; i += 2) {
            bs[i / 2] = (byte) ((0xff & bytes[i]) << 4 | 0xff & bytes[i + 1]);
        }
        return bs;
    }

    public static String readASCIIString(ByteBuf in, int actualLength) {
        byte[] bytes = readBytes(in, actualLength);
        return new String(bytes);
    }

    public static String readGBKString(ByteBuf in, int actualLength) {
        byte[] bytes = readBytes(in, actualLength);
        try {
            return new String(bytes, "GBK");
        } catch (UnsupportedEncodingException e) {
            return null;
        }
    }

    public static byte[] readBytes(ByteBuf in, int actualLength) {
        byte[] bytes = new byte[actualLength * 2];
        in.readBytes(bytes);
        return asciiToBytes(bytes);
    }

    public static byte readByte(ByteBuf in) {
        return readBytes(in, 1)[0];
    }

    public static short readShort(ByteBuf in) {
        byte[] bytes = readBytes(in, 2);
        return (short) bytesToInt(bytes, 2);
    }

    public static int readInt(ByteBuf in) {
        byte[] bytes = readBytes(in, 4);
        return bytesToInt(bytes, 4);
    }

    public static int bytesToInt(byte[] bytes, int size) {
        int a = 0;
        for (int i = 0; i < size; i++) {
            a += (bytes[i] & 0xff) << ((size - 1 - i) * 8);
        }
        return a;
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
     * @param src 目标数组
     * @param offset 开始位置
     * @param length 字节长度
     * @return ASCII字符串
     */
    public static String getAsciiString(byte[] src, int offset, int length) {
        int diff = 0;
        for (int i = 0; i < length; i++) {
            byte b = src[offset + i];
            if (b != 0) {
                break;
            }
            diff += 1;
        }
        int activeLength = length - diff;
        byte[] dest = new byte[activeLength];
        System.arraycopy(src, offset + diff, dest, 0, activeLength);
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
