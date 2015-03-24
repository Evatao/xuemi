package com.dxsit.base.dao.impl;

import org.springframework.stereotype.Repository;

import com.dxsit.base.base.impl.BaseDaoImpl;
import com.dxsit.base.dao.AdminDAO;
import com.dxsit.base.entity.Admin;


@Repository("adminDao")
public class AdminDAOImpl   extends BaseDaoImpl<Admin> implements AdminDAO {
	
}