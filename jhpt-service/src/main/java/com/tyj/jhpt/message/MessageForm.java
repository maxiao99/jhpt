package com.tyj.jhpt.message;

/**
 * Created by IntelliJ IDEA .
 * Auth: CK
 * Date: 2016/6/29
 */
public enum MessageForm {
    DEVICE_ID(4, "设备ID", ""),
    EncryptIndex_NeedReply(1, "", ""),
    MessageType(1, "上传类型", ""),
    instructionSize(1, "", ""),
    instructionLength(1, "实际内容长度", ""),
    ;

    private int length;
    private String name;
    private String desc;

    MessageForm(int length, String name, String desc) {
        this.length = length;
        this.name = name;
        this.desc = desc;
    }

    public int getLength() {
        return length;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public static int getTotalLength() {
        MessageForm [] forms = MessageForm.values();
        int count = 0;
        for (MessageForm form : forms) {
            count += form.getLength();
        }
        return count;
    }

    public static byte[] getOffset(MessageForm messageForm, byte[] bytes) {
        MessageForm [] forms = MessageForm.values();
        int offset = 0;
        for (MessageForm form : forms) {
            if (form == messageForm) {
                break;
            }
            offset += form.getLength();
        }
        int size = messageForm.getLength();
        byte[] content = new byte[size];
        System.arraycopy(bytes, offset, content, 0, size);
        return content;
    }
}
