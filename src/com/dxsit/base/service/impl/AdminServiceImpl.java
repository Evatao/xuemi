package com.dxsit.base.service.impl;

import org.springframework.stereotype.Repository;

import com.dxsit.base.base.impl.BaseServiceImpl;
import com.dxsit.base.dao.impl.AdminDAOImpl;
import com.dxsit.base.entity.Admin;
import com.dxsit.base.service.AdminService;


@Repository("adminService")
public class AdminServiceImpl   extends BaseServiceImpl<AdminDAOImpl,Admin> implements AdminService {
	
}