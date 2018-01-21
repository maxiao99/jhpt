/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.body;

import com.tyj.jhpt.bo.QudongDianji;
import com.tyj.jhpt.bo.QudongDianjiDetail;
import com.tyj.jhpt.server.body.dto.QuDongDianJiDto;
import com.tyj.jhpt.server.body.dto.QuDongDianJisDto;
import com.tyj.jhpt.server.message.MessageBean;
import com.tyj.jhpt.server.message.type.RealTimeMessage;
import com.tyj.jhpt.service.QudongDianjiDetailService;
import com.tyj.jhpt.service.QudongDianjiService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import static com.tyj.jhpt.server.body.TwoBody.DataEnum.dianliu;
import static com.tyj.jhpt.server.body.TwoBody.DataEnum.dianya;
import static com.tyj.jhpt.server.body.TwoBody.DataEnum.speed;
import static com.tyj.jhpt.server.body.TwoBody.DataEnum.controlTemperature;
import static com.tyj.jhpt.server.body.TwoBody.DataEnum.seq;
import static com.tyj.jhpt.server.body.TwoBody.DataEnum.status;
import static com.tyj.jhpt.server.body.TwoBody.DataEnum.temperature;
import static com.tyj.jhpt.server.body.TwoBody.DataEnum.zhuanju;

/**
 * 驱动电机数据
 *
 * @author: CK
 * @date: 2017/12/8
 */
@Component
public class TwoBody extends AbstractBody<QuDongDianJisDto> {
    public TwoBody() {
        super(RealTimeMessage.QUDONG_DIANJI.getCode());
    }

    @Resource(name = "qudongDianjiService")
    QudongDianjiService qudongDianjiService;

    @Resource(name = "qudongDianjiDetailService")
    QudongDianjiDetailService qudongDianjiDetailService;

    public int deal(MessageBean mb, int offset) {
        QuDongDianJisDto dtos = new QuDongDianJisDto();

        byte[] content = mb.getContent();

        // 车辆状态
        dtos.setNumber(content[offset]);
        offset += 1;

        QudongDianji qudongDianji = new QudongDianji();
        qudongDianji.setCarVin(mb.getVin());
        qudongDianji.setEventTime(mb.getEventTime());
        qudongDianjiService.saveEntitySelective(qudongDianji);
        for (int i = 0; i < dtos.getNumber(); i++) {
            QuDongDianJiDto dto = new QuDongDianJiDto();

            // 驱动电机序号
            dto.setSeq(content[offset]);
            offset += seq.length;

            // 驱动电机状态
            dto.setStatus(content[offset]);
            offset += status.length;

            // 驱动电机控制器温度
            dto.setControlTemperature(content[offset]);
            offset += controlTemperature.length;

            // 驱动电机转速
            byte[] bytes = new byte[speed.length];
            System.arraycopy(content, offset, bytes, 0, speed.length);
            offset += speed.length;
            BigInteger bigInteger = new BigInteger(bytes);
            int speed = bigInteger.intValue();
            dto.setSpeed(speed);

            // 驱动电机转矩
            bytes = new byte[zhuanju.length];
            System.arraycopy(content, offset, bytes, 0, zhuanju.length);
            offset += zhuanju.length;
            bigInteger = new BigInteger(bytes);
            int zhuanju = bigInteger.intValue();
            dto.setZhuanju(zhuanju);

            // 驱动电机温度
            dto.setTemperature(content[offset]);
            offset += temperature.length;

            // 电机控制器输入电压
            bytes = new byte[dianya.length];
            System.arraycopy(content, offset, bytes, 0, dianya.length);
            offset += dianya.length;
            bigInteger = new BigInteger(bytes);
            int dianya = bigInteger.intValue();
            dto.setDianya(dianya);

            // 电机控制器直流母线母线电流
            bytes = new byte[dianliu.length];
            System.arraycopy(content, offset, bytes, 0, dianliu.length);
            offset += dianliu.length;
            bigInteger = new BigInteger(bytes);
            int dianliu = bigInteger.intValue();
            dto.setDianliu(dianliu);

            dtos.addDto(dto);
        }

        if (CollectionUtils.isNotEmpty(dtos.getList())) {
            List<QudongDianjiDetail> list = new ArrayList<QudongDianjiDetail>();
            for (QuDongDianJiDto dto : dtos.getList()) {
                QudongDianjiDetail bo = new QudongDianjiDetail();
                bo.setQudongDianjiId(qudongDianji.getId());
                BeanUtils.copyProperties(dto, bo);
                list.add(bo);
            }
            qudongDianjiDetailService.saveBatch(list);
        }
        return offset;
    }

    public static enum DataEnum {
        seq(1, "驱动电机序号"),
        status(1, "驱动电机状态"),
        controlTemperature(1, "驱动电机控制器温度"),
        speed(2, "驱动电机转速"),
        zhuanju(2, "驱动电机转矩"),
        temperature(1, "驱动电机温度"),
        dianya(2, "电机控制器输入电压"),
        dianliu(2, "电机控制器直流母线母线电流"),
        ;
        private int length;
        private String desc;
        DataEnum(int length, String desc) {
            this.length = length;
            this.desc = desc;
        }
    }
}
