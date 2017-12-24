/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.dao.impl;

import com.github.fartherp.framework.core.dao.ConfigurableBaseSqlMapDao;
import com.github.fartherp.framework.core.dao.DaoMapper;
import javax.annotation.Resource;

import com.tyj.jhpt.bo.Alarm;
import com.tyj.jhpt.dao.AlarmDao;
import com.tyj.jhpt.dao.AlarmMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `tb_alarm`
 */
@Repository("alarmDao")
public class AlarmDaoImpl extends ConfigurableBaseSqlMapDao<Alarm, Long> implements AlarmDao {
    @Autowired
    private AlarmMapper alarmMapper;

    public DaoMapper<Alarm, Long> getDaoMapper() {
        return alarmMapper;
    }

    @Resource(name = "sqlSessionFactory")
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }

    public List<Alarm> findPageAlarm(Map<String, Object> map) {
        return alarmMapper.findPageAlarm(map);
    }
}