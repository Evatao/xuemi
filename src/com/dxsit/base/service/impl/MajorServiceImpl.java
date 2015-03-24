package com.dxsit.base.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.dxsit.base.base.impl.BaseServiceImpl;
import com.dxsit.base.dao.impl.MajorDAOImpl;
import com.dxsit.base.entity.Major;
import com.dxsit.base.service.MajorService;

@Repository("majorService")
public class MajorServiceImpl extends BaseServiceImpl<MajorDAOImpl,Major> implements MajorService  {

	@Override
	public List<Major> getMajorsBySName(String sname) {
		List<Major> majors = getListByHQL("select new Major(majorId, sid, majorName) from Major where univerId=(select sid from University where universityName=?)", sname);
		return majors;
	}
	 
}