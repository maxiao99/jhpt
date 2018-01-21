/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.body;

import com.tyj.jhpt.bo.Supers;
import com.tyj.jhpt.server.body.dto.SuperDto;
import com.tyj.jhpt.server.message.MessageBean;
import com.tyj.jhpt.server.message.type.RealTimeMessage;
import com.tyj.jhpt.service.SupersService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.math.BigInteger;

import static com.tyj.jhpt.server.body.SixBody.DataEnum.max;
import static com.tyj.jhpt.server.body.SixBody.DataEnum.maxSeq;
import static com.tyj.jhpt.server.body.SixBody.DataEnum.maxSimpleNo;
import static com.tyj.jhpt.server.body.SixBody.DataEnum.maxSystemNo;
import static com.tyj.jhpt.server.body.SixBody.DataEnum.maxTemperature;
import static com.tyj.jhpt.server.body.SixBody.DataEnum.maxTemperatureSystemNo;
import static com.tyj.jhpt.server.body.SixBody.DataEnum.min;
import static com.tyj.jhpt.server.body.SixBody.DataEnum.minSeq;
import static com.tyj.jhpt.server.body.SixBody.DataEnum.minSimpleNo;
import static com.tyj.jhpt.server.body.SixBody.DataEnum.minSystemNo;
import static com.tyj.jhpt.server.body.SixBody.DataEnum.minTemperature;
import static com.tyj.jhpt.server.body.SixBody.DataEnum.minTemperatureSystemNo;

/**
 * 极值数据
 *
 * @author: CK
 * @date: 2017/12/8
 */
@Component
public class SixBody extends AbstractBody<SuperDto> {
    public SixBody() {
        super(RealTimeMessage.SUPER.getCode());
    }

    @Resource(name = "supersService")
    SupersService supersService;

    public int deal(MessageBean mb, int offset) {
        SuperDto dto = new SuperDto();
        byte[] content = mb.getContent();

        // 最高电压电池系统号
        dto.setMaxSystemNo(content[offset]);
        offset += maxSystemNo.length;

        // 最高电压电池单体代号
        dto.setMaxSimpleNo(content[offset]);
        offset += maxSimpleNo.length;

        // 电池单体电压最高值
        byte[] bytes = new byte[max.length];
        System.arraycopy(content, offset, bytes, 0, max.length);
        offset += max.length;
        BigInteger bigInteger = new BigInteger(bytes);
        int max = bigInteger.intValue();
        dto.setMax(max);

        // 最低电压电池系统号
        dto.setMinSystemNo(content[offset]);
        offset += minSystemNo.length;

        // 最低电压电池单体代号
        dto.setMinSimpleNo(content[offset]);
        offset += minSimpleNo.length;

        // 电池单体电压最低值
        bytes = new byte[min.length];
        System.arraycopy(content, offset, bytes, 0, min.length);
        offset += min.length;
        bigInteger = new BigInteger(bytes);
        int min = bigInteger.intValue();
        dto.setMin(min);

        // 最高温度子系统号
        dto.setMaxTemperatureSystemNo(content[offset]);
        offset += maxTemperatureSystemNo.length;

        // 最高温度探针序号
        dto.setMaxSeq(content[offset]);
        offset += maxSeq.length;

        // 最高温度值
        dto.setMaxTemperature(content[offset]);
        offset += maxTemperature.length;

        // 最低温度子系统号
        dto.setMinTemperatureSystemNo(content[offset]);
        offset += minTemperatureSystemNo.length;

        // 最低温度探针序号
        dto.setMinSeq(content[offset]);
        offset += minSeq.length;

        // 最低温度值
        dto.setMinTemperature(content[offset]);
        offset += minTemperature.length;

        Supers bo = new Supers();
        bo.setCarVin(mb.getVin());
        bo.setEventTime(mb.getEventTime());
        BeanUtils.copyProperties(dto, bo);
        supersService.saveEntitySelective(bo);
        return offset;
    }

    public static enum DataEnum {
        maxSystemNo(1, "最高电压电池系统号"),
        maxSimpleNo(1, "最高电压电池单体代号"),
        max(2, "电池单体电压最高值"),
        minSystemNo(1, "最低电压电池系统号"),
        minSimpleNo(1, "最低电压电池单体代号"),
        min(2, "电池单体电压最低值"),
        maxTemperatureSystemNo(1, "最高温度子系统号"),
        maxSeq(1, "最高温度探针序号"),
        maxTemperature(1, "最高温度值"),
        minTemperatureSystemNo(1, "最低温度子系统号"),
        minSeq(1, "最低温度探针序号"),
        minTemperature(1, "最低温度值"),
        ;
        private int length;
        private String desc;
        DataEnum(int length, String desc) {
            this.length = length;
            this.desc = desc;
        }
    }
}
