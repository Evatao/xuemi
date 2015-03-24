package com.dxsit.base.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dxsit.base.entity.Major;
import com.dxsit.base.entity.University;
import com.dxsit.base.entity.Userinfo;
import com.dxsit.base.service.UniversityService;
import com.dxsit.base.service.UserinfoService;
import com.dxsit.base.util.DESEncryptUtil;
import com.dxsit.base.util.EmailSendUtil;
import com.google.code.kaptcha.Constants;

@Controller
@RequestMapping("/user")
public class UserInfoController {

	@Autowired
	private UserinfoService userinfoService;
	@Autowired
	private EmailSendUtil emailSendUtil;
	@Autowired
	private DESEncryptUtil desEncryptUtil;
	@Autowired
	private UniversityService universityService;
	private Logger log = LoggerFactory.getLogger(UserInfoController.class);

	@RequestMapping("/login")
	public String login(Userinfo userinfo, String idfcode,
			HttpServletRequest request) {
		System.out.println(userinfo);
		boolean isValidate = true;
		HttpSession session = request.getSession();
		// 登录三次以上要输入验证码
		Integer loginCount = (Integer) session.getAttribute("loginCount");
		if (loginCount == null) {
			loginCount = 1;
			session.setAttribute("loginCount", 1);
		} else if (loginCount > 3) {
			// 获得验证码
			String code = (String) session
					.getAttribute(Constants.KAPTCHA_SESSION_KEY);
			idfcode = idfcode.toLowerCase();
			// 验证码不正确
			if (!idfcode.equals(code)) {
				isValidate = false;
				request.setAttribute("errormsg", "验证码错误");
				request.setAttribute("erroruser", userinfo);
			}
		}
		// 将用户名和密码与数据库中的邮箱或者用户名进行比对
		Userinfo userInfoDB = null;
		if (isValidate) {
			userInfoDB = userinfoService.getUserInfoByEmailOrUserName(userinfo
					.getNickName());
			if (userInfoDB == null) {
				isValidate = false;
				request.setAttribute("errormsg", "用户名不存在");
			} else if (userInfoDB.getActiveState() == null
					|| userInfoDB.getActiveState() == false) {
				isValidate = false;
				request.setAttribute("errormsg", "账户未激活，请登录邮箱进行激活");
			} else if (!userInfoDB.getPassword().equals(userinfo.getPassword())) {
				isValidate = false;
				request.setAttribute("errormsg", "密码错误");
			}
		}

		if (!isValidate) {
			session.setAttribute("loginCount", ++loginCount);
			request.setAttribute("erroruser", userinfo);
			return "/resource/page/signin";
		} else {
			session.setAttribute("userInfo", userInfoDB);
			return "/success";
		}
	}

	@RequestMapping("/register")
	public String register(Userinfo userinfo, String idfcode,
			HttpServletRequest request) throws Exception {
		HttpSession session = request.getSession();
		boolean isValidate = true;
		Userinfo userinfoDB = null;
		String code = (String) session
				.getAttribute(Constants.KAPTCHA_SESSION_KEY);
		if (!idfcode.equals(code)) {
			isValidate = false;
			request.setAttribute("errormsg", "验证码错误");
			request.setAttribute("erroruser", userinfo);
		} else {
			userinfoService.insert(userinfo);
		}
		userinfoDB = userinfoService.getUserInfoByEmail(userinfo.getEmail());
		if (isValidate) {
			try {

				String sendActiveEmailToUser = emailSendUtil
						.sendActiveEmailToUser(userinfoDB);
				log.info(sendActiveEmailToUser);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("邮件发送失败");
			}
			// 给注册激活页面设置页面将要显示的信息
			request.setAttribute("email", userinfo.getEmail());
			String data = userinfoDB.getUserId().toString();
			System.out.println(data);
			String encrypt = desEncryptUtil.encrypt(data);
			request.setAttribute("userId", encrypt);
			System.out.println(encrypt);
			// 返回页面
			return "/resource/page/Activation";
		} else {
			// 注册失败返回到注册页面
			return "/resource/page/signup";
		}
	}

	@ResponseBody
	@RequestMapping("/checkUserName")
	public String checkUserName(String userName) throws IOException {
		boolean isAvailable = userinfoService.checkUserName(userName);
		if (isAvailable) {
			return "available";
		} else {
			return "unAvailable";
		}
	}

	@RequestMapping("/check_idfcode")
	public void checkIdfCode(String idfcode, HttpServletResponse response,
			HttpServletRequest request) throws IOException {
		String code = (String) request.getSession().getAttribute(
				Constants.KAPTCHA_SESSION_KEY);
		if (!idfcode.equals(code)) {
			response.getWriter().write("false");
		} else {
			response.getWriter().write("true");
		}

	}

	@RequestMapping("/check_email")
	public void checkEmail(String email, HttpServletResponse response)
			throws IOException {
		boolean isAvailable = userinfoService.checkEmail(email);
		if (isAvailable) {
			response.getWriter().write("available");
		} else {
			response.getWriter().write("unavailable");
		}
	}

	@RequestMapping("resend_email")
	public String reSendEamil(String u, String email, HttpServletRequest request)
			throws NumberFormatException, Exception {
		// 给注册激活页面设置页面将要显示的信息
		Integer userId = Integer.parseInt(desEncryptUtil.decrypt(u));
		Userinfo userinfo = userinfoService.getById(userId);
		// 发送个邮件
		try {
			emailSendUtil.sendActiveEmailToUser(userinfo);

		} catch (Exception e) {
			System.out.println("邮箱激活重新发送出错");
		}
		// 设置属性
		request.setAttribute("email", email);
		request.setAttribute("userId", u);
		return "/resource/page/Activation";
	}

	@RequestMapping("/active")
	public String activeAccount(String u, HttpServletRequest request)
			throws IOException {
		String userId = null;
		try {
			userId = desEncryptUtil.decrypt(u);
		} catch (Exception e) {
			e.printStackTrace();
		}
		userinfoService.activeAccount(Integer.parseInt(userId));
		request.setAttribute("userId", u);
		return "/resource/page/perfectinformation";
	}

	@RequestMapping("/registerStep2")
	public String registerStep2(String userId, String userName, int majorId,
			String schoolName, String innerSchoolYear) throws Exception {
		// 解密
		userId = desEncryptUtil.decrypt(userId);
		userinfoService.registerTwo(userId, userName, majorId, schoolName,
				innerSchoolYear);
		return null;
	}

	@RequestMapping("/findPassword")
	public String getPassWord(String email) {
		userinfoService.sendResetEmail(email);
		return "/resource/page/forgetpassword1";
	}

	@RequestMapping("/reset")
	public String resetPassWord(String u,HttpServletRequest request) throws NumberFormatException, Exception {
		
		request.setAttribute("u", u);
		return "/resource/page/reset";
	}
	
	@RequestMapping("/changePassword")
	public String changePassword(String u,String newPass) throws NumberFormatException, Exception {
		// 解密
		int userId = Integer.parseInt(desEncryptUtil.decrypt(u));
		userinfoService.updatePassword(userId,newPass);
		return "/resource/page/signin";
	}
}
