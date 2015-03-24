package com.dxsit.base.dao.impl;

import org.springframework.stereotype.Repository;

import com.dxsit.base.base.impl.BaseDaoImpl;
import com.dxsit.base.dao.MajorDAO;
import com.dxsit.base.entity.Major;

@Repository("majorDAO")
public class MajorDAOImpl extends BaseDaoImpl<Major> implements MajorDAO  {
	 
}