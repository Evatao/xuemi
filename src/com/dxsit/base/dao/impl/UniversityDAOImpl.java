package com.dxsit.base.dao.impl;

import org.springframework.stereotype.Repository;

import com.dxsit.base.base.impl.BaseDaoImpl;
import com.dxsit.base.dao.UniversityDAO;
import com.dxsit.base.entity.University;

@Repository("universityDAO")
public class UniversityDAOImpl extends BaseDaoImpl<University> implements UniversityDAO {
	 
}