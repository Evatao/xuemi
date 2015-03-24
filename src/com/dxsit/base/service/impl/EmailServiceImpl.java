package com.dxsit.base.service.impl;

import org.springframework.stereotype.Repository;

import com.dxsit.base.base.impl.BaseServiceImpl;
import com.dxsit.base.dao.impl.EmailDAOImpl;
import com.dxsit.base.entity.Email;
import com.dxsit.base.service.EmailService;

@Repository("emailService")
public class EmailServiceImpl   extends BaseServiceImpl<EmailDAOImpl,Email> implements EmailService {
	  
}