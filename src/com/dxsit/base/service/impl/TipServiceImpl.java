package com.dxsit.base.service.impl;

import org.springframework.stereotype.Repository;

import com.dxsit.base.base.impl.BaseServiceImpl;
import com.dxsit.base.dao.impl.TipDAOImpl;
import com.dxsit.base.entity.Tip;
import com.dxsit.base.service.TipService;

@Repository("tipService")
public class	 TipServiceImpl extends BaseServiceImpl<TipDAOImpl,Tip> implements TipService{
	
}