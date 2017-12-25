/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.vo;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: CK
 * @date: 2017/12/25
 */
public class Merges {
    private Integer index;
    private int rowspan;
    private transient long id;

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public int getRowspan() {
        return rowspan;
    }

    public void setRowspan(int rowspan) {
        this.rowspan = rowspan;
    }

    public long increaseByLong() {
        this.rowspan = this.rowspan + 1;
        return this.rowspan;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
