/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.body;

import com.tyj.jhpt.bo.Wendu;
import com.tyj.jhpt.bo.WenduDetail;
import com.tyj.jhpt.server.body.dto.WenDuDto;
import com.tyj.jhpt.server.body.dto.WenDusDto;
import com.tyj.jhpt.server.message.MessageBean;
import com.tyj.jhpt.server.message.type.RealTimeMessage;
import com.tyj.jhpt.service.WenduDetailService;
import com.tyj.jhpt.service.WenduService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

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

    @Resource(name = "wenduService")
    WenduService wenduService;

    @Resource(name = "wenduDetailService")
    WenduDetailService wenduDetailService;

    public int deal(MessageBean mb, int offset) {
        WenDusDto dtos = new WenDusDto();

        byte[] content = mb.getContent();

        // 可充电储能子系统个数
        dtos.setNumber(content[offset]);
        offset += 1;

        Wendu wendu = new Wendu();
        wendu.setCarVin(mb.getVin());
        wendu.setEventTime(mb.getEventTime());
        wenduService.saveEntitySelective(wendu);

        for (int i = 0; i < dtos.getNumber(); i++) {
            WenDuDto dto = new WenDuDto();

            // 可充电储能子系统号
            dto.setSystemNo(content[offset]);
            offset += systemNo.length;

            // 可充电储能温度探针个数
            byte[] bytes = new byte[count.length];
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

        if (CollectionUtils.isNotEmpty(dtos.getList())) {
            List<WenduDetail> list = new ArrayList<WenduDetail>();
            for (WenDuDto dto : dtos.getList()) {
                WenduDetail bo = new WenduDetail();
                bo.setWenduId(wendu.getId());
                BeanUtils.copyProperties(dto, bo);
                list.add(bo);
            }
            wenduDetailService.saveBatch(list);
        }
        return offset;
    }

    public static enum DataEnum {
        systemNo(1, "可充电储能子系统号"),
        count(2, "可充电储能温度探针个数"),
        ;
        private int length;
        private String desc;
        DataEnum(int length, String desc) {
            this.length = length;
            this.desc = desc;
        }
    }
}
