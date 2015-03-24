package com.dxsit.base.service;

import java.util.List;

import com.dxsit.base.base.BaseService;
import com.dxsit.base.dao.impl.MajorDAOImpl;
import com.dxsit.base.entity.Major;


public interface MajorService extends BaseService<MajorDAOImpl,Major>  {
	public List<Major> getMajorsBySName(String sname);
}