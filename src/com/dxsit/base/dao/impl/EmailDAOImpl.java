package com.dxsit.base.dao.impl;

import org.springframework.stereotype.Repository;

import com.dxsit.base.base.impl.BaseDaoImpl;
import com.dxsit.base.dao.EmailDAO;
import com.dxsit.base.entity.Email;

@Repository("emailDAO")
public class EmailDAOImpl   extends BaseDaoImpl<Email> implements EmailDAO {
	  
}