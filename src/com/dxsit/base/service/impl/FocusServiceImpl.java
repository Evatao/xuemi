package com.dxsit.base.service.impl;

import org.springframework.stereotype.Repository;

import com.dxsit.base.base.impl.BaseServiceImpl;
import com.dxsit.base.dao.impl.FocusDAOImpl;
import com.dxsit.base.entity.Focus;
import com.dxsit.base.service.FocusService;

@Repository("focusService")
public class FocusServiceImpl   extends BaseServiceImpl<FocusDAOImpl,Focus>   implements FocusService{
	
}