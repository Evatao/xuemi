package com.dxsit.base.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dxsit.base.base.impl.BaseServiceImpl;
import com.dxsit.base.dao.UserinfoDAO;
import com.dxsit.base.dao.impl.UserinfoDAOImpl;
import com.dxsit.base.entity.Major;
import com.dxsit.base.entity.University;
import com.dxsit.base.entity.Userinfo;
import com.dxsit.base.service.UniversityService;
import com.dxsit.base.service.UserinfoService;
import com.dxsit.base.util.EmailSendUtil;

@Repository("userinfoService")
public class UserinfoServiceImpl extends
		BaseServiceImpl<UserinfoDAOImpl, Userinfo> implements UserinfoService {

	private  Logger log= LoggerFactory.getLogger(UserinfoServiceImpl.class);
	
	@Autowired
	private UserinfoDAO userinfoDAO;

	@Autowired
	private EmailSendUtil emailSendUtil;

	@Autowired
	private UniversityService universityService;
	
	@Override
	public Userinfo getUserInfoByEmailOrUserName(String nickName) {

		Userinfo userinfo = (Userinfo) userinfoDAO
				.findObjectBySql(
						"FROM Userinfo where nickName=? or email = ? ",
						nickName, nickName);
		if (userinfo == null)
			return null;
		else 
			return userinfo;
	}

	@Override
	public boolean checkUserName(String nickName) {
		Userinfo userinfo= (Userinfo) findObjectBySql("FROM Userinfo where nickName=?", nickName);
		if(userinfo==null){
			return true;
		}
		return false;
	}

	@Override
	public boolean checkEmail(String email) {
		Userinfo userinfo = getUserInfoByEmail(email);
		if(userinfo==null){
			return true;
		}
		return false;
	}

	@Override
	public Userinfo getUserInfoByEmail(String email) {
		Userinfo userinfo= (Userinfo) findObjectBySql("FROM Userinfo where email=?", email);
		return userinfo;
	}

	@Override
	public void activeAccount(int userId) {
		log.debug("ready to  active the account for userId:"+userId);
		try {
			executeHqlForUpdate("update Userinfo set activeState=1 where userId= ?", userId);			
		} catch (Exception e) {
			log.debug("active the account for userId:"+userId+"  fail!!");
			 e.printStackTrace();
		}
	}

	@Override
	public void sendResetEmail(String email) {
		Userinfo userInfoByEmail = getUserInfoByEmail(email);
		try {
			emailSendUtil.sendResetPassWord(userInfoByEmail);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public String registerTwo(String userId, String userName, int majorId,
			String schoolName, String innerSchoolYear) {

			//获得用户对象
			Userinfo userinfo = getById(Integer.parseInt(userId));
			//设置对象信息
			userinfo.setNickName(userName);
			University university = universityService
					.getUniversityByName(schoolName);
			userinfo.setUniversity(university);
			Major majorById = universityService.getMajorById(majorId);
			userinfo.setMajor(majorById);
			userinfo.setInnerSchoolYear(Integer.parseInt(innerSchoolYear));
			//更新对象
			update(userinfo);
		return null;
	}

	@Override
	public void updatePassword(int userId, String newPass) {
		Userinfo byId = getById(userId);
		byId.setPassword(newPass);
		update(byId);
	}


}