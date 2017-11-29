package com.tyj.jhpt.message;

/**
 * Created by IntelliJ IDEA .
 * Auth: CK
 * Date: 2016/6/30
 */
public enum DeviceGpsInfoEnum {
    msgId(3, "消息ID",""),
    EventTime(7, "采集时间",""),
    Longitude(4, "经度",""),
    Latitude(4, "纬度",""),
    Speed(1, "速度",""),
    MsgType(1, "告警类型",""),
    Acceleration(1, "加速度",""),
    DriverPersonId(3, "驾驶员ID",""),
    KM(3, "公里",""),

    ;

    private int length;
    private String name;
    private String desc;

    DeviceGpsInfoEnum(int length, String name, String desc) {
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

    public static int getTotalLength(DeviceGpsInfoEnum messageForm) {
        DeviceGpsInfoEnum [] forms = DeviceGpsInfoEnum.values();
        int count = 0;
        for (DeviceGpsInfoEnum form : forms) {
            if (form == messageForm) {
                break;
            }
            count += form.getLength();
        }
        return count;
    }

    public static byte[] getOffset(DeviceGpsInfoEnum messageForm, byte[] bytes) {
        DeviceGpsInfoEnum [] forms = DeviceGpsInfoEnum.values();
        int offset = 0;
        for (DeviceGpsInfoEnum form : forms) {
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
