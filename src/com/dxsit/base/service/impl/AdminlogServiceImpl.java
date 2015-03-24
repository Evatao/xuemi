package com.dxsit.base.service.impl;

import org.springframework.stereotype.Repository;

import com.dxsit.base.base.impl.BaseServiceImpl;
import com.dxsit.base.dao.impl.AdminlogDAOImpl;
import com.dxsit.base.entity.Adminlog;
import com.dxsit.base.service.AdminlogService;

@Repository("adminlogService")
public class AdminlogServiceImpl    extends BaseServiceImpl<AdminlogDAOImpl, Adminlog> implements AdminlogService{
	   
}