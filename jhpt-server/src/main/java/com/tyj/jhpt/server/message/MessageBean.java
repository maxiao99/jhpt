/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.message;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: CK
 * @date: 2017/12/7
 */
public class MessageBean {
    /**
     * 起始符
     */
    private String start;
    /**
     * 命令标识
     */
    private byte commandFlag;
    /**
     * 应答标志
     */
    private byte respFlag;
    /**
     * 由 17 位字码构成，车辆唯一标识，应符合ASCII的规定
     */
    private String vin;
    /**
     * 数据加密方式 02: RSA
     */
    private byte encrypt;
    /**
     * 数据单元长度
     */
    private short length;
    /**
     * 数据单元
     */
    private byte[] content;

    private Date eventTime;

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public byte getCommandFlag() {
        return commandFlag;
    }

    public void setCommandFlag(byte commandFlag) {
        this.commandFlag = commandFlag;
    }

    public byte getRespFlag() {
        return respFlag;
    }

    public void setRespFlag(byte respFlag) {
        this.respFlag = respFlag;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public byte getEncrypt() {
        return encrypt;
    }

    public void setEncrypt(byte encrypt) {
        this.encrypt = encrypt;
    }

    public short getLength() {
        return length;
    }

    public void setLength(short length) {
        this.length = length;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public Date getEventTime() {
        return eventTime;
    }

    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
    }

    public byte[] getBytes() {
        byte[] bs = new byte[22];
        int offset = 0;
        bs[offset] = commandFlag;
        offset += 1;
        bs[offset] = respFlag;
        offset += 1;
        System.arraycopy(vin.getBytes(), 0, bs, offset, 17);
        offset += 17;
        bs[offset] = encrypt;
        offset += 1;
        // length
        bs[offset] = (byte)(length >> 8);
        offset += 1;
        bs[offset] = (byte)length;
        offset += 1;
        return bs;
    }
}
