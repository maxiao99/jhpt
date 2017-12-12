/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.body;

import com.tyj.jhpt.server.body.dto.CarLocationDto;
import com.tyj.jhpt.server.message.MessageBean;
import com.tyj.jhpt.server.message.type.RealTimeMessage;
import com.tyj.jhpt.server.util.DeviceMsgUtils;
import org.springframework.stereotype.Component;

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

    public CarLocationDto deal(MessageBean mb) {
        CarLocationDto dto = new CarLocationDto();
        byte[] content = mb.getContent();
        int offset = 0;

        // 定位状态
        dto.setLocationStatus(content[offset + locationStatus.length]);
        offset += locationStatus.length;

        // 经度
        double longitude = DeviceMsgUtils.readLatLongInfo(content, offset);
        offset += LONGITUDE.length;
        dto.setLongitude(longitude);

        // 纬度
        double latitude = DeviceMsgUtils.readLatLongInfo(content, offset);
        offset += LATITUDE.length;
        dto.setLatitude(latitude);

        return dto;
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
