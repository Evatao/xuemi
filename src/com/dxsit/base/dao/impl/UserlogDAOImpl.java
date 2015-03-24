package com.dxsit.base.dao.impl;

import org.springframework.stereotype.Repository;

import com.dxsit.base.base.impl.BaseDaoImpl;
import com.dxsit.base.dao.UserlogDAO;
import com.dxsit.base.entity.Userlog;

@Repository("userlogDAO")
public class UserlogDAOImpl extends BaseDaoImpl<Userlog>  implements UserlogDAO {
	   
}