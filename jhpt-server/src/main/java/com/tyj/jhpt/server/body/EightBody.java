/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.body;

import com.tyj.jhpt.bo.Dianya;
import com.tyj.jhpt.bo.DianyaDetail;
import com.tyj.jhpt.server.body.dto.DianYaDto;
import com.tyj.jhpt.server.body.dto.DianYasDto;
import com.tyj.jhpt.server.message.MessageBean;
import com.tyj.jhpt.server.message.type.RealTimeMessage;
import com.tyj.jhpt.service.DianyaDetailService;
import com.tyj.jhpt.service.DianyaService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import static com.tyj.jhpt.server.body.EightBody.DataEnum.dianliu;
import static com.tyj.jhpt.server.body.EightBody.DataEnum.dianya;
import static com.tyj.jhpt.server.body.EightBody.DataEnum.ownSimpleTotal;
import static com.tyj.jhpt.server.body.EightBody.DataEnum.seq;
import static com.tyj.jhpt.server.body.EightBody.DataEnum.simpleTotal;
import static com.tyj.jhpt.server.body.EightBody.DataEnum.systemNo;

/**
 * 可充电储能装置电压数据
 *
 * @author: CK
 * @date: 2017/12/8
 */
@Component
public class EightBody extends AbstractBody<DianYasDto> {
    public EightBody() {
        super(RealTimeMessage.DIANYA.getCode());
    }

    @Resource(name = "dianyaService")
    DianyaService dianyaService;

    @Resource(name = "dianyaDetailService")
    DianyaDetailService dianyaDetailService;

    public int deal(MessageBean mb, int offset) {
        DianYasDto dtos = new DianYasDto();
        byte[] content = mb.getContent();

        // 可充电储能子系统个数
        dtos.setNumber(content[offset]);
        offset += 1;

        Dianya pojo = new Dianya();
        pojo.setCarVin(mb.getVin());
        pojo.setEventTime(mb.getEventTime());
        dianyaService.saveEntitySelective(pojo);

        for (int i = 0; i < dtos.getNumber(); i++) {
            DianYaDto dto = new DianYaDto();

            // 可充电储能子系统号
            dto.setSystemNo(content[offset]);
            offset += systemNo.length;

            // 可充电储能装置电压
            byte[] bytes = new byte[dianya.length];
            System.arraycopy(content, offset, bytes, 0, dianya.length);
            offset += dianya.length;
            BigInteger bigInteger = new BigInteger(bytes);
            int dianya = bigInteger.intValue();
            dto.setDianya(dianya);

            // 可充电储能装置电流
            bytes = new byte[dianliu.length];
            System.arraycopy(content, offset, bytes, 0, dianliu.length);
            offset += dianliu.length;
            bigInteger = new BigInteger(bytes);
            int dianliu = bigInteger.intValue();
            dto.setDianliu(dianliu);

            // 单体电池总数
            bytes = new byte[simpleTotal.length];
            System.arraycopy(content, offset, bytes, 0, simpleTotal.length);
            offset += simpleTotal.length;
            bigInteger = new BigInteger(bytes);
            int simpleTotal = bigInteger.intValue();
            dto.setDianliu(simpleTotal);

            // 单体电池总数
            bytes = new byte[seq.length];
            System.arraycopy(content, offset, bytes, 0, seq.length);
            offset += seq.length;
            bigInteger = new BigInteger(bytes);
            int seq = bigInteger.intValue();
            dto.setSeq(seq);

            // 本帧单体电池总数
            dto.setOwnSimpleTotal(content[offset]);
            offset += ownSimpleTotal.length;

            bytes = new byte[dto.getOwnSimpleTotal() * 2];
            System.arraycopy(content, offset, bytes, 0, dto.getOwnSimpleTotal());
            offset += dto.getOwnSimpleTotal();
            dto.setSimpleTotals(bytes);

            dtos.addDto(dto);
        }

        if (CollectionUtils.isNotEmpty(dtos.getList())) {
            List<DianyaDetail> list = new ArrayList<DianyaDetail>();
            for (DianYaDto dto : dtos.getList()) {
                DianyaDetail bo = new DianyaDetail();
                bo.setDianyaId(pojo.getId());
                BeanUtils.copyProperties(dto, bo);
                list.add(bo);
            }
            dianyaDetailService.saveBatch(list);
        }
        return offset;
    }

    public static enum DataEnum {
        systemNo(1, "可充电储能子系统号"),
        dianya(2, "可充电储能装置电压"),
        dianliu(2, "可充电储能装置电流"),
        simpleTotal(2, "单体电池总数"),
        seq(2, "本帧起始电池序号"),
        ownSimpleTotal(1, "本帧单体电池总数"),
        ;
        private int length;
        private String desc;
        DataEnum(int length, String desc) {
            this.length = length;
            this.desc = desc;
        }
    }
}
