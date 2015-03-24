package com.dxsit.base.dao.impl;

import org.springframework.stereotype.Repository;

import com.dxsit.base.base.impl.BaseDaoImpl;
import com.dxsit.base.dao.WarningDAO;
import com.dxsit.base.entity.Warning;

@Repository("warningDAO")
public class WarningDAOImpl extends BaseDaoImpl<Warning>  implements WarningDAO{
	
}