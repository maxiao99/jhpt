/*
 * Copyright (c) 2018. CK. All rights reserved.
 */

package com.tyj.jhpt.dao.impl;

import com.github.fartherp.framework.core.dao.ConfigurableBaseSqlMapDao;
import com.github.fartherp.framework.core.dao.DaoMapper;
import javax.annotation.Resource;

import com.tyj.jhpt.bo.TerminalStatusUpload;
import com.tyj.jhpt.dao.TerminalStatusUploadDao;
import com.tyj.jhpt.dao.TerminalStatusUploadMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * This class corresponds to the database table `tb_terminal_status_upload`
 */
@Repository("terminalStatusUploadDao")
public class TerminalStatusUploadDaoImpl extends ConfigurableBaseSqlMapDao<TerminalStatusUpload, Long> implements TerminalStatusUploadDao {
    @Autowired
    private TerminalStatusUploadMapper terminalStatusUploadMapper;

    public DaoMapper<TerminalStatusUpload, Long> getDaoMapper() {
        return terminalStatusUploadMapper;
    }

    @Resource(name = "sqlSessionFactory")
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }
}