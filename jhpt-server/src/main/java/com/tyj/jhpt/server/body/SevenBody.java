/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.body;

import com.tyj.jhpt.server.body.dto.AlarmDto;
import com.tyj.jhpt.server.message.MessageBean;
import com.tyj.jhpt.server.message.type.RealTimeMessage;
import org.springframework.stereotype.Component;

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

    public AlarmDto deal(MessageBean mb) {
        AlarmDto dto = new AlarmDto();
        byte[] content = mb.getContent();
        int offset = 0;

        // 最高报警等级
        byte[] bytes = new byte[]{content[offset + maxAlarmLevel.length]};
        offset += maxAlarmLevel.length;
        dto.setMaxAlarmLevel(bytes[0]);

        // 通用报警标志
        bytes = new byte[generalAlarm.length];
        System.arraycopy(content, offset, bytes, 0, generalAlarm.length);
        offset += generalAlarm.length;
        BigInteger bigInteger = new BigInteger(bytes);
        int generalAlarm = bigInteger.intValue();
        dto.setGeneralAlarm(generalAlarm);

        // 可充电储能装置故障总数N1
        bytes = new byte[]{content[offset + totalN1.length]};
        offset += totalN1.length;
        dto.setTotalN1(bytes[0]);

        // 可充电储能装置故障代码列表
        bytes = new byte[dto.getTotalN1()];
        System.arraycopy(content, offset, bytes, 0, dto.getTotalN1());
        dto.setBytes1(bytes);

        // 驱动电机故障总数N2
        bytes = new byte[]{content[offset + totalN2.length]};
        offset += totalN2.length;
        dto.setTotalN2(bytes[0]);

        // 驱动电机故障代码列表
        bytes = new byte[dto.getTotalN2()];
        System.arraycopy(content, offset, bytes, 0, dto.getTotalN2());
        dto.setBytes2(bytes);

        // 发动机故障总数N3
        bytes = new byte[]{content[offset + totalN3.length]};
        offset += totalN3.length;
        dto.setTotalN3(bytes[0]);

        // 发动机故障列表
        bytes = new byte[dto.getTotalN3()];
        System.arraycopy(content, offset, bytes, 0, dto.getTotalN3());
        dto.setBytes3(bytes);

        // 其他故障总数N4
        bytes = new byte[]{content[offset + totalN4.length]};
        offset += totalN4.length;
        dto.setTotalN4(bytes[0]);

        // 其他故障代码列表
        bytes = new byte[dto.getTotalN4()];
        System.arraycopy(content, offset, bytes, 0, dto.getTotalN4());
        dto.setBytes4(bytes);

        return dto;
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
