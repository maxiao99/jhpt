/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.message.type;

import com.github.fartherp.framework.common.util.ISOUtil;

/**
 *
 * 车辆告警信息
 * @author: CK
 * @date: 2017/12/8
 */
public enum CarAlarmMessage {
    LEFT_LANE_DEVIATE("01", "左车道偏离"),
    RIGHT_LANE_DEVIATE("02", "右车道偏离"),
    CAR_DISTANCE_MONITOR("03", "车距监测"),
    LIMIT_SPEED_ALARM("04", "限速警示"),
    CITY_FRONT_COLLIDE("05", "城市前碰撞"),
    CAR_FRONT_COLLIDE("06", "车辆前部碰撞"),
    PERSON_FRONT_COLLIDE("07", "行人前部碰撞"),
    OVER_SPEED_ALARM("08", "超速告警"),
    CAR_START("09", "汽车启动"),
    CAR_END("0A", "汽车熄火"),
    LOCATION_MESSAGE("0B", "定位信息"),
    SPEED_UP("0C", "急加速"),
    SPEED_DOWN("0D", "急减速"),
    LEFT_UP("0E", "急左转弯"),
    RIGHT_UP("0F", "急右转弯"),
    FEN_SHEN_ALARM("10", "分神提醒"),
    SMOKE_ALARM("11", "吸烟报警"),
    CALL_PHONE_ALARM("12", "打电话报警"),
    DA_HA_QIAN("13", "打哈欠"),
    CAMERA_BLOCK("14", "摄像头遮挡"),
    OTHER_EXCEPTION("15", "其他异常（离岗）"),
    ;
    private byte code;
    private String name;
    CarAlarmMessage(String code, String name) {
        this.code = ISOUtil.hex2byte(code)[0];
        this.name = name;
    }

    public byte getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
