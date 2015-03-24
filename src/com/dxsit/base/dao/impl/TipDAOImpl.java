package com.dxsit.base.dao.impl;

import org.springframework.stereotype.Repository;

import com.dxsit.base.base.impl.BaseDaoImpl;
import com.dxsit.base.dao.TipDAO;
import com.dxsit.base.entity.Tip;

@Repository("tipDAO")
public class	 TipDAOImpl extends BaseDaoImpl<Tip> implements TipDAO{
	
}