/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.tyj.jhpt.message;

import com.github.fartherp.framework.common.util.ISOUtil;
import com.tyj.jhpt.util.ByteUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Author: CK
 * Date: 2016/5/2
 */
public class MessageBean {
    private int deviceId;
    private byte needReply;
    private byte encryptIndex;
    private byte messageType;
    private List<Instruction> instructions = new ArrayList<Instruction>(1);
    private Integer msgId;

    public MessageBean() {

    }

    public MessageBean(int deviceId, int needReply, int encryptIndex, int messageType, byte[] instruction) {
        this.deviceId = deviceId;
        this.needReply = (byte) needReply;
        this.encryptIndex = (byte) encryptIndex;
        this.messageType = (byte) messageType;
        this.instructions.add(new Instruction(instruction));
    }

    public MessageBean(int deviceId, int needReply, int encryptIndex, int messageType, List<Instruction> instructions) {
        this.deviceId = deviceId;
        this.needReply = (byte) needReply;
        this.encryptIndex = (byte) encryptIndex;
        this.messageType = (byte) messageType;
        this.instructions = instructions;
    }

    public int getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

    public byte getNeedReply() {
        return needReply;
    }

    public void setNeedReply(byte needReply) {
        this.needReply = needReply;
    }

    public byte getEncryptIndex() {
        return encryptIndex;
    }

    public boolean needReply() {
        return needReply == 1;
    }

    public void setEncryptIndex(byte encryptIndex) {
        this.encryptIndex = encryptIndex;
    }

    public byte getMessageType() {
        return messageType;
    }

    public void setMessageType(byte messageType) {
        this.messageType = messageType;
    }

    public List<Instruction> getInstructions() {
        return instructions;
    }

    public Instruction getInstruction(int i) {
        return instructions.get(i);
    }

    public void setInstructions(List<Instruction> instructions) {
        this.instructions = instructions;
    }

    public int getInstructionSize() {
        if (this.instructions == null) {
            return 0;
        }
        return instructions.size();
    }

    public void addInstruction(byte[] content) {
        Instruction i = new Instruction(content);
        addInstruction(i);
    }

    public void addInstruction(Instruction in) {
        if (this.instructions == null || instructions.size() == 0) {
            this.instructions = new ArrayList<Instruction>(2);
        }
        this.instructions.add(in);
    }

    public byte[] getBytes() {
        byte[] bs = init();
        int offset = 0;
        ByteUtils.putIntToBufferBigEndian(bs, offset, deviceId);
        offset = 4;
        ByteUtils.putByteToBuffer(bs, (byte) (encryptIndex << 4 | needReply), offset);
        offset = 5;
        ByteUtils.putByteToBuffer(bs, messageType, offset);
        offset = 6;
        ByteUtils.putByteToBuffer(bs, (byte) instructions.size(), offset);
        offset = 7;
        for (Instruction i : instructions) {
            ByteUtils.putByteToBuffer(bs, (byte) i.getContentLength(), offset);
            offset += 1;
            System.arraycopy(i.getContent(), 0, bs, offset, i.getContentLength());
            offset += i.getContentLength();
        }
        return bs;
    }

    private byte[] init() {
        int length = 7;
        if (instructions != null) {
            for (Instruction i : instructions) {
                length += 1;
                length += i.getContentLength();
            }
        }
        return new byte[length + 1]; // add checksum length
    }

    public Integer getMsgId() {
        return msgId;
    }

    public void setMsgId(Integer msgId) {
        this.msgId = msgId;
    }

    public static class Instruction {
        private byte[] content;

        public Instruction(byte[] content) {
            this.content = content;
        }

        public byte[] getContent() {
            return content;
        }

        public int getContentLength() {
            return content.length;
        }
    }

    public String toString() {
        String content = null;
        if (!instructions.isEmpty()) {
            byte[] b = instructions.get(0).getContent();
            content= ISOUtil.hexString(b);
        }
        return "MessageBean{" +
                "deviceId=" + deviceId +
                ", needReply=" + ISOUtil.hexString(new byte[]{needReply}) +
                ", encryptIndex=" + ISOUtil.hexString(new byte[]{encryptIndex}) +
                ", messageType=" + ISOUtil.hexString(new byte[]{messageType}) +
                ", msgId=" + msgId +
                "}content=" + content;
    }
}
