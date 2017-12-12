/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.body;

import com.tyj.jhpt.server.body.dto.FaDongJiDto;
import com.tyj.jhpt.server.message.MessageBean;
import com.tyj.jhpt.server.message.type.RealTimeMessage;
import org.springframework.stereotype.Component;

import java.math.BigInteger;

import static com.tyj.jhpt.server.body.FourBody.DataEnum.speed;
import static com.tyj.jhpt.server.body.FourBody.DataEnum.status;
import static com.tyj.jhpt.server.body.FourBody.DataEnum.xiaohaolv;

/**
 * 发动机数据
 *
 * @author: CK
 * @date: 2017/12/8
 */
@Component
public class FourBody extends AbstractBody<FaDongJiDto> {
    public FourBody() {
        super(RealTimeMessage.FADONGJI.getCode());
    }

    public FaDongJiDto deal(MessageBean mb) {
        FaDongJiDto dto = new FaDongJiDto();
        byte[] content = mb.getContent();
        int offset = 0;

        // 发动机状态
        dto.setStatus(content[offset + status.length]);
        offset += status.length;

        // 曲轴转速
        byte[] bytes = new byte[speed.length];
        System.arraycopy(content, offset, bytes, 0, speed.length);
        offset += speed.length;
        BigInteger bigInteger = new BigInteger(bytes);
        int speed = bigInteger.intValue();
        dto.setSpeed(speed);

        // 燃料消耗率
        bytes = new byte[xiaohaolv.length];
        System.arraycopy(content, offset, bytes, 0, xiaohaolv.length);
        bigInteger = new BigInteger(bytes);
        int xiaohaolv = bigInteger.intValue();
        dto.setXiaohaolv(xiaohaolv);

        return dto;
    }

    public static enum DataEnum {
        status(1, "发动机状态"),
        speed(4, "曲轴转速"),
        xiaohaolv(4, "燃料消耗率"),
        ;
        private int length;
        private String desc;
        DataEnum(int length, String desc) {
            this.length = length;
            this.desc = desc;
        }
    }
}
