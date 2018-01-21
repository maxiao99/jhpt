/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.body;

import com.tyj.jhpt.bo.AllCar;
import com.tyj.jhpt.server.body.dto.AllCarDto;
import com.tyj.jhpt.server.message.MessageBean;
import com.tyj.jhpt.server.message.type.RealTimeMessage;
import com.tyj.jhpt.service.AllCarService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.math.BigInteger;

import static com.tyj.jhpt.server.body.OneBody.DataEnum.carStatus;
import static com.tyj.jhpt.server.body.OneBody.DataEnum.changeStatus;
import static com.tyj.jhpt.server.body.OneBody.DataEnum.dangwei;
import static com.tyj.jhpt.server.body.OneBody.DataEnum.dcStatus;
import static com.tyj.jhpt.server.body.OneBody.DataEnum.footplateStatus;
import static com.tyj.jhpt.server.body.OneBody.DataEnum.insulationResistance;
import static com.tyj.jhpt.server.body.OneBody.DataEnum.runMode;
import static com.tyj.jhpt.server.body.OneBody.DataEnum.soc;
import static com.tyj.jhpt.server.body.OneBody.DataEnum.speed;
import static com.tyj.jhpt.server.body.OneBody.DataEnum.totalElectricity;
import static com.tyj.jhpt.server.body.OneBody.DataEnum.totalKm;
import static com.tyj.jhpt.server.body.OneBody.DataEnum.totalVoltage;
import static com.tyj.jhpt.server.body.OneBody.DataEnum.upFootplateKm;

/**
 * 整车数据
 *
 * @author: CK
 * @date: 2017/12/8
 */
@Component
public class OneBody extends AbstractBody<AllCarDto> {
    public OneBody() {
        super(RealTimeMessage.ALL_CAR.getCode());
    }

    @Resource(name = "allCarService")
    AllCarService allCarService;

    public int deal(MessageBean mb, int offset) {
        AllCarDto dto = new AllCarDto();
        byte[] content = mb.getContent();

        // 车辆状态
        dto.setCarStatus(content[offset]);
        offset += carStatus.length;

        // 充电状态
        dto.setChangeStatus(content[offset]);
        offset += changeStatus.length;

        // 运行模式
        dto.setRunMode(content[offset]);
        offset += runMode.length;

        // 车速
        byte[] bytes = new byte[speed.length];
        System.arraycopy(content, offset, bytes, 0, speed.length);
        offset += speed.length;
        BigInteger bigInteger = new BigInteger(bytes);
        int speed = bigInteger.intValue();
        dto.setSpeed(speed);

        // 累计里程
        bytes = new byte[totalKm.length];
        System.arraycopy(content, offset, bytes, 0, totalKm.length);
        offset += totalKm.length;
        bigInteger = new BigInteger(bytes);
        int totalKm = bigInteger.intValue();
        dto.setTotalKm(totalKm);

        // 总电压
        bytes = new byte[totalVoltage.length];
        System.arraycopy(content, offset, bytes, 0, totalVoltage.length);
        offset += totalVoltage.length;
        bigInteger = new BigInteger(bytes);
        int totalVoltage = bigInteger.intValue();
        dto.setTotalVoltage(totalVoltage);

        // 总电流
        bytes = new byte[totalElectricity.length];
        System.arraycopy(content, offset, bytes, 0, totalElectricity.length);
        offset += totalElectricity.length;
        bigInteger = new BigInteger(bytes);
        int totalElectricity = bigInteger.intValue();
        dto.setTotalElectricity(totalElectricity);

        // SOC
        dto.setSoc(content[offset]);
        offset += soc.length;

        // DC-DC状态
        dto.setDcStatus(content[offset]);
        offset += dcStatus.length;

        // 挡位
        dto.setDangwei(content[offset]);
        offset += dangwei.length;

        // 绝缘电阻
        bytes = new byte[insulationResistance.length];
        System.arraycopy(content, offset, bytes, 0, insulationResistance.length);
        offset += insulationResistance.length;
        bigInteger = new BigInteger(bytes);
        int insulationResistance = bigInteger.intValue();
        dto.setInsulationResistance(insulationResistance);

        // 加速踏板行程值
        dto.setUpFootplateKm(content[offset]);
        offset += upFootplateKm.length;

        // 制动踏板状态
        dto.setFootplateStatus(content[offset]);
        offset += footplateStatus.length;

        AllCar bo = new AllCar();
        bo.setCarVin(mb.getVin());
        bo.setEventTime(mb.getEventTime());
        BeanUtils.copyProperties(dto, bo);
        allCarService.saveEntitySelective(bo);
        return offset;
    }

    public static enum DataEnum {
        carStatus(1, "车辆状态"),
        changeStatus(1, "充电状态"),
        runMode(1, "运行模式"),
        speed(2, "车速"),
        totalKm(4, "累计里程"),
        totalVoltage(2, "总电压"),
        totalElectricity(2, "总电流"),
        soc(1, "SOC"),
        dcStatus(1, "DC-DC状态"),
        dangwei(1, "挡位"),
        insulationResistance(2, "绝缘电阻"),
        upFootplateKm(1, "加速踏板行程值"),
        footplateStatus(1, "制动踏板状态"),
        ;
        private int length;
        private String desc;
        DataEnum(int length, String desc) {
            this.length = length;
            this.desc = desc;
        }
    }
}
