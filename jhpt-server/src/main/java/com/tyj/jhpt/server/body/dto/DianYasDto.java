/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.body.dto;

import org.apache.commons.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: CK
 * @date: 2017/12/9
 */
public class DianYasDto {
    // 可充电储能子系统个数
    private int number;
    // 可充电储能子系统电压信息列表
    private List<DianYaDto> list;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<DianYaDto> getList() {
        return list;
    }

    public void setList(List<DianYaDto> list) {
        this.list = list;
    }

    public void addDto(DianYaDto dto) {
        if (CollectionUtils.isEmpty(list)) {
            list = new ArrayList<DianYaDto>();
        }
        list.add(dto);
    }
}
