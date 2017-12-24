/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.service.impl;

import com.github.fartherp.framework.core.dao.SqlMapDao;
import com.github.fartherp.framework.core.service.GenericSqlMapServiceImpl;
import javax.annotation.Resource;

import com.tyj.jhpt.bo.Alarm;
import com.tyj.jhpt.dao.AlarmDao;
import com.tyj.jhpt.service.AlarmService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `tb_alarm`
 */
@Service("alarmService")
public class AlarmServiceImpl extends GenericSqlMapServiceImpl<Alarm, Long> implements AlarmService {
    @Resource(name = "alarmDao")
    private AlarmDao alarmDao;

    public SqlMapDao<Alarm, Long> getDao() {
        return alarmDao;
    }

    public List<Alarm> findPageAlarm(Map<String, Object> map) {
        return alarmDao.findPageAlarm(map);
    }
}