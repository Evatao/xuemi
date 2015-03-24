package com.dxsit.base.dao.impl;

import org.springframework.stereotype.Repository;

import com.dxsit.base.base.impl.BaseDaoImpl;
import com.dxsit.base.dao.UserinfoDAO;
import com.dxsit.base.entity.Userinfo;

@Repository("userinfoDAO")
public class UserinfoDAOImpl extends BaseDaoImpl<Userinfo>   implements UserinfoDAO{
	     
}