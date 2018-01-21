/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.body;

import com.tyj.jhpt.bo.Alarm;
import com.tyj.jhpt.server.body.dto.AlarmDto;
import com.tyj.jhpt.server.message.MessageBean;
import com.tyj.jhpt.server.message.type.RealTimeMessage;
import com.tyj.jhpt.service.AlarmService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.math.BigInteger;

import static com.tyj.jhpt.server.body.SevenBody.DataEnum.generalAlarm;
import static com.tyj.jhpt.server.body.SevenBody.DataEnum.maxAlarmLevel;
import static com.tyj.jhpt.server.body.SevenBody.DataEnum.totalN1;
import static com.tyj.jhpt.server.body.SevenBody.DataEnum.totalN2;
import static com.tyj.jhpt.server.body.SevenBody.DataEnum.totalN3;
import static com.tyj.jhpt.server.body.SevenBody.DataEnum.totalN4;

/**
 * 报警数据
 *
 * @author: CK
 * @date: 2017/12/8
 */
@Component
public class SevenBody extends AbstractBody<AlarmDto> {
    public SevenBody() {
        super(RealTimeMessage.ALARM.getCode());
    }

    @Resource(name = "alarmService")
    AlarmService alarmService;

    public int deal(MessageBean mb, int offset) {
        AlarmDto dto = new AlarmDto();
        byte[] content = mb.getContent();

        // 最高报警等级
        dto.setMaxAlarmLevel(content[offset]);
        offset += maxAlarmLevel.length;

        // 通用报警标志
        byte[] bytes = new byte[generalAlarm.length];
        System.arraycopy(content, offset, bytes, 0, generalAlarm.length);
        offset += generalAlarm.length;
        BigInteger bigInteger = new BigInteger(bytes);
        int generalAlarm = bigInteger.intValue();
        dto.setGeneralAlarm(generalAlarm);

        // 可充电储能装置故障总数N1
        dto.setTotalN1(content[offset]);
        offset += totalN1.length;

        // 可充电储能装置故障代码列表
        bytes = new byte[dto.getTotalN1() * 4];
        System.arraycopy(content, offset, bytes, 0, dto.getTotalN1());
        offset += dto.getTotalN1();
        dto.setBytes1(bytes);

        // 驱动电机故障总数N2
        dto.setTotalN2(content[offset]);
        offset += totalN2.length;

        // 驱动电机故障代码列表
        bytes = new byte[dto.getTotalN2() * 4];
        System.arraycopy(content, offset, bytes, 0, dto.getTotalN2());
        offset += dto.getTotalN2();
        dto.setBytes2(bytes);

        // 发动机故障总数N3
        dto.setTotalN3(content[offset]);
        offset += totalN3.length;

        // 发动机故障列表
        bytes = new byte[dto.getTotalN3() * 4];
        System.arraycopy(content, offset, bytes, 0, dto.getTotalN3());
        offset += dto.getTotalN3();
        dto.setBytes3(bytes);

        // 其他故障总数N4
        dto.setTotalN4(content[offset]);
        offset += totalN4.length;

        // 其他故障代码列表
        bytes = new byte[dto.getTotalN4() * 4];
        System.arraycopy(content, offset, bytes, 0, dto.getTotalN4());
        offset += dto.getTotalN4();
        dto.setBytes4(bytes);

        Alarm bo = new Alarm();
        bo.setCarVin(mb.getVin());
        bo.setEventTime(mb.getEventTime());
        BeanUtils.copyProperties(dto, bo);
        alarmService.saveEntitySelective(bo);
        return offset;
    }

    public static enum DataEnum {
        maxAlarmLevel(1, "最高报警等级"),
        generalAlarm(4, "通用报警标志"),
        totalN1(1, "可充电储能装置故障总数N1"),
        totalN2(1, "驱动电机故障总数N2"),
        totalN3(1, "发动机故障总数N3"),
        totalN4(1, "其他故障总数N4"),
        ;
        private int length;
        private String desc;
        DataEnum(int length, String desc) {
            this.length = length;
            this.desc = desc;
        }
    }
}
