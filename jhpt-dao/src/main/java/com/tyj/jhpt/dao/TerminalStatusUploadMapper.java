/*
 * Copyright (c) 2018. CK. All rights reserved.
 */

package com.tyj.jhpt.dao;

import com.github.fartherp.framework.core.dao.DaoMapper;
import com.github.fartherp.framework.core.orm.mybatis.annotation.SqlMapper;
import com.tyj.jhpt.bo.TerminalStatusUpload;

/**
 * This class corresponds to the database table `tb_terminal_status_upload`
 */
@SqlMapper
public interface TerminalStatusUploadMapper extends DaoMapper<TerminalStatusUpload, Long> {
}