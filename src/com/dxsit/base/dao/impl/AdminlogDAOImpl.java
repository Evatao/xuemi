package com.dxsit.base.dao.impl;

import org.springframework.stereotype.Repository;

import com.dxsit.base.base.impl.BaseDaoImpl;
import com.dxsit.base.dao.AdminlogDAO;
import com.dxsit.base.entity.Adminlog;

@Repository("adminLogDao")
public class AdminlogDAOImpl    extends BaseDaoImpl<Adminlog>  implements AdminlogDAO{
	   
}