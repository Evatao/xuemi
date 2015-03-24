package com.dxsit.base.dao.impl;

import org.springframework.stereotype.Repository;

import com.dxsit.base.base.impl.BaseDaoImpl;
import com.dxsit.base.dao.FocusDAO;
import com.dxsit.base.entity.Focus;

@Repository("focusDAO")
public class FocusDAOImpl   extends BaseDaoImpl<Focus>   implements FocusDAO{
	
}