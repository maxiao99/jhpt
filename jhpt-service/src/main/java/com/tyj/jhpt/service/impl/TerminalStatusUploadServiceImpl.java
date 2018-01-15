/*
 * Copyright (c) 2018. CK. All rights reserved.
 */

package com.tyj.jhpt.service.impl;

import com.github.fartherp.framework.core.dao.SqlMapDao;
import com.github.fartherp.framework.core.service.GenericSqlMapServiceImpl;
import javax.annotation.Resource;

import com.tyj.jhpt.bo.TerminalStatusUpload;
import com.tyj.jhpt.dao.TerminalStatusUploadDao;
import com.tyj.jhpt.service.TerminalStatusUploadService;
import org.springframework.stereotype.Service;

/**
 * This class corresponds to the database table `tb_terminal_status_upload`
 */
@Service("terminalStatusUploadService")
public class TerminalStatusUploadServiceImpl extends GenericSqlMapServiceImpl<TerminalStatusUpload, Long> implements TerminalStatusUploadService {
    @Resource(name = "terminalStatusUploadDao")
    private TerminalStatusUploadDao terminalStatusUploadDao;

    public SqlMapDao<TerminalStatusUpload, Long> getDao() {
        return terminalStatusUploadDao;
    }
}