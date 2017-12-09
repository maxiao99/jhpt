/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.body;

import com.tyj.jhpt.server.body.dto.WenDuDto;
import com.tyj.jhpt.server.body.dto.WenDusDto;
import com.tyj.jhpt.server.message.MessageBean;
import com.tyj.jhpt.server.message.type.RealTimeMessage;
import org.springframework.stereotype.Component;

import java.math.BigInteger;

import static com.tyj.jhpt.server.body.NineBody.DataEnum.count;
import static com.tyj.jhpt.server.body.NineBody.DataEnum.systemNo;

/**
 * 可充电储能装置温度数据
 *
 * @author: CK
 * @date: 2017/12/8
 */
@Component
public class NineBody extends AbstractBody<WenDusDto> {
    public NineBody() {
        super(RealTimeMessage.WENDU.getCode());
    }

    public WenDusDto deal(MessageBean mb) {
        WenDusDto dtos = new WenDusDto();

        byte[] content = mb.getContent();
        int offset = 0;
        // 可充电储能子系统个数
        byte[] bytes = new byte[]{content[offset + 1]};
        offset += 1;
        dtos.setNumber(bytes[0]);

        for (int i = 0; i < dtos.getNumber(); i++) {
            WenDuDto dto = new WenDuDto();
            // 可充电储能子系统号
            bytes = new byte[]{content[offset + systemNo.length]};
            offset += systemNo.length;
            dto.setSystemNo(bytes[0]);

            // 可充电储能温度探针个数
            bytes = new byte[count.length];
            System.arraycopy(content, offset, bytes, 0, count.length);
            offset += count.length;
            BigInteger bigInteger = new BigInteger(bytes);
            int count = bigInteger.intValue();
            dto.setCount(count);

            bytes = new byte[dto.getCount()];
            System.arraycopy(content, offset, bytes, 0, dto.getCount());
            offset += dto.getCount();
            dto.setValues(bytes);

            dtos.addDto(dto);
        }
        return dtos;
    }

    public static enum DataEnum {
        systemNo(1, "可充电储能子系统号"),
        count(4, "可充电储能温度探针个数"),
        ;
        private int length;
        private String desc;
        DataEnum(int length, String desc) {
            this.length = length;
            this.desc = desc;
        }
    }
}
