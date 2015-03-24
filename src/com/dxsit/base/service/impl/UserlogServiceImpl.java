package com.dxsit.base.service.impl;

import org.springframework.stereotype.Repository;

import com.dxsit.base.base.impl.BaseServiceImpl;
import com.dxsit.base.dao.impl.UserlogDAOImpl;
import com.dxsit.base.entity.Userlog;
import com.dxsit.base.service.UserlogService;

@Repository("userlogService")
public class UserlogServiceImpl extends BaseServiceImpl<UserlogDAOImpl,Userlog>  implements UserlogService {
	   
}