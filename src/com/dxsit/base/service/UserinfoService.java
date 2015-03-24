package com.dxsit.base.service;

import com.dxsit.base.base.BaseService;
import com.dxsit.base.dao.impl.UserinfoDAOImpl;
import com.dxsit.base.entity.Userinfo;


public interface UserinfoService extends BaseService<UserinfoDAOImpl,Userinfo>  {

	Userinfo getUserInfoByEmailOrUserName(String nickName);

	boolean checkUserName(String nickName);

	boolean checkEmail(String email);
	
	Userinfo getUserInfoByEmail(String email);

	void activeAccount(int parseInt);

	void sendResetEmail(String email);

	String registerTwo(String userId, String userName, int majorId,
			String schoolName, String innerSchoolYear);

	void updatePassword(int userId, String newPass);
	     
}