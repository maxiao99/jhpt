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
 * @date: 2017/12/8
 */
public class QuDongDianJisDto {
    // 驱动电机个数
    private int number;
    // 驱动电机总成信息列表
    private List<QuDongDianJiDto> list;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<QuDongDianJiDto> getList() {
        return list;
    }

    public void setList(List<QuDongDianJiDto> list) {
        this.list = list;
    }

    public void addDto(QuDongDianJiDto dto) {
        if (CollectionUtils.isEmpty(list)) {
            list = new ArrayList<QuDongDianJiDto>();
        }
        list.add(dto);
    }
}
