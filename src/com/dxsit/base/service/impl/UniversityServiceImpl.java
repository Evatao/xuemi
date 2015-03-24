package com.dxsit.base.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dxsit.base.base.impl.BaseServiceImpl;
import com.dxsit.base.dao.impl.UniversityDAOImpl;
import com.dxsit.base.entity.Major;
import com.dxsit.base.entity.University;
import com.dxsit.base.service.MajorService;
import com.dxsit.base.service.UniversityService;

@Repository("universityService")
public class UniversityServiceImpl extends
		BaseServiceImpl<UniversityDAOImpl, University> implements
		UniversityService {

	@Autowired
	private MajorService majorService;

	@Override
	public University getUniversityByName(String universityName) {
		List<University> universitys = findByProperty("universityName",
				universityName);
		if (universitys != null) {
			return universitys.get(0);
		}
		return null;
	}

	@Override
	public List<Major> getMajorsBySid(Integer sid) {

		return null;
	}

	@Override
	public Major getMajorById(Integer majorId) {
		Major byId = majorService.getById(majorId);
		return byId;
	}

}