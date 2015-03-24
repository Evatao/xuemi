package com.dxsit.base.service;

import java.util.List;

import com.dxsit.base.base.BaseService;
import com.dxsit.base.dao.impl.UniversityDAOImpl;
import com.dxsit.base.entity.Major;
import com.dxsit.base.entity.University;


public interface UniversityService extends BaseService<UniversityDAOImpl,University>  {
	 
	public University getUniversityByName(String universityName);
	
	public List<Major> getMajorsBySid(Integer sid);
	
	Major getMajorById(Integer majorId);
}