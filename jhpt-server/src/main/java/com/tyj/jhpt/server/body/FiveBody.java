/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.body;

import com.tyj.jhpt.bo.CarLocation;
import com.tyj.jhpt.server.body.dto.CarLocationDto;
import com.tyj.jhpt.server.message.MessageBean;
import com.tyj.jhpt.server.message.type.RealTimeMessage;
import com.tyj.jhpt.server.util.DeviceMsgUtils;
import com.tyj.jhpt.service.CarLocationService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

import static com.tyj.jhpt.server.body.FiveBody.DataEnum.locationStatus;
import static com.tyj.jhpt.server.body.FiveBody.DataEnum.LONGITUDE;
import static com.tyj.jhpt.server.body.FiveBody.DataEnum.LATITUDE;

/**
 * 车辆位置
 *
 * @author: CK
 * @date: 2017/12/8
 */
@Component
public class FiveBody extends AbstractBody<CarLocationDto> {
    public FiveBody() {
        super(RealTimeMessage.CAR_LOCATION.getCode());
    }

    @Resource(name = "carLocationService")
    CarLocationService carLocationService;

    public int deal(MessageBean mb, int offset) {
        CarLocationDto dto = new CarLocationDto();
        byte[] content = mb.getContent();

        // 定位状态
        dto.setLocationStatus(content[offset]);
        offset += locationStatus.length;

        // 经度
        double longitude = DeviceMsgUtils.readLatLongInfo(content, offset);
        offset += LONGITUDE.length;
        dto.setLongitude(longitude);

        // 纬度
        double latitude = DeviceMsgUtils.readLatLongInfo(content, offset);
        offset += LATITUDE.length;
        dto.setLatitude(latitude);

        CarLocation bo = new CarLocation();
        bo.setCarVin(mb.getVin());
        bo.setEventTime(mb.getEventTime());
        BeanUtils.copyProperties(dto, bo);
        carLocationService.saveEntitySelective(bo);
        return offset;
    }

    public static enum DataEnum {
        locationStatus(1, "定位状态"),
        LONGITUDE(4, "经度"),
        LATITUDE(4, "纬度"),
        ;
        private int length;
        private String desc;
        DataEnum(int length, String desc) {
            this.length = length;
            this.desc = desc;
        }
    }
}
