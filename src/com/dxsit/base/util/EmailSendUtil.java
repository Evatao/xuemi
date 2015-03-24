package com.dxsit.base.util;

import java.util.Properties;

import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import com.dxsit.base.entity.Userinfo;

public class EmailSendUtil {
	private DESEncryptUtil desEncryptUtil;
	private String smtp;
	private String adminEmailAddress;
	private String adminEmailPassword;
	private JavaMailSenderImpl senderImpl;
	private MimeMessageHelper messageHelper;
	private MimeMessage mailMessage;

	private String title;
	private String introText;
	private String urlCode;
	private String url;
	private String urlEnd;
	private String end;
	private String activeUrl;
	private String activeIntroUp;
	private String activeIntroDown;
	private String resetIntroUp;
	private String resetIntroDown;
	private String resetUrl;
	private String nick;

	public EmailSendUtil(DESEncryptUtil desEncryptUtil, String smtp,
			String adminEmailAddress, String adminEmailPassword, String title,
			String introText, String urlCode, String url, String urlEnd,
			String end, String activeUrl, String activeIntroUp,
			String activeIntroDown, String resetIntroUp, String resetIntroDown,
			String resetUrl,String nick) throws MessagingException {
		this.desEncryptUtil = desEncryptUtil;
		this.smtp = smtp;
		this.adminEmailAddress = adminEmailAddress;
		this.adminEmailPassword = adminEmailPassword;
		this.nick=nick;
		this.title = title;
		this.introText = introText;
		this.urlCode = urlCode;
		this.url = url;
		this.urlEnd = urlEnd;
		this.end = end;
		this.activeUrl = activeUrl;
		this.activeIntroUp = activeIntroUp;
		this.activeIntroDown = activeIntroDown;
		this.resetIntroUp = resetIntroUp;
		this.resetIntroDown = resetIntroDown;
		this.resetUrl = resetUrl;

		senderImpl = new JavaMailSenderImpl();
		System.out.println(smtp);
		senderImpl.setHost(smtp);
		senderImpl.setUsername(adminEmailAddress); // 根据自己的情况,设置username

		senderImpl.setPassword(adminEmailPassword); // 根据自
		senderImpl.setDefaultEncoding("UTF-8");
		Properties prop = new Properties();
		prop.put("mail.smtp.auth", "true");
		// 将这个参数设为true，让服务器进行认证,认证用户名和密码是否正确
		prop.put("mail.smtp.timeout", "25000");
		senderImpl.setJavaMailProperties(prop);

		// 建立邮件消息,发送简单邮件和html邮件的区别
		mailMessage = senderImpl.createMimeMessage();
		// 注意这里的boolean,等于真的时候才能嵌套图片，在构建MimeMessageHelper时候，所给定的值是true表示启用，
		// multipart模式
		messageHelper = new MimeMessageHelper(mailMessage, true, "utf-8");
		messageHelper.setFrom(adminEmailAddress);
		// 设置寄件人

	}

	public String sendResetPassWord(Userinfo userinfo) throws Exception {
		
		String toEmail=userinfo.getEmail();
		resetUrl=resetUrl+desEncryptUtil.encrypt(userinfo.getUserId().toString());
		
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append(title).append(introText).append(resetIntroUp)
				.append(urlCode).append(resetUrl).append(" \">")
				.append(resetUrl).append(urlEnd).append(resetIntroDown)
				.append(end);
		String emailString = stringBuffer.toString();
		
		String nick = javax.mail.internet.MimeUtility.encodeText("学觅网<xuemiadmin@163.com>"); 
		messageHelper.setFrom(this.nick); // 根据自己的情况,设置username
		// 设置收件人，寄件人
		messageHelper.setTo(userinfo.getEmail());
		messageHelper.setSubject("学觅找回密码");
		// 设置邮件内容，true 表示启动HTML格式的邮件
		messageHelper.setText(emailString, true);
		// 发送邮件
		senderImpl.send(mailMessage);
		System.out.println("邮件发送成功..");
		
		return adminEmailAddress;
	}

	public String sendActiveEmailToUser(Userinfo userinfo) throws Exception {

		String string = userinfo.getUserId().toString();
		activeUrl = activeUrl
				+ desEncryptUtil.encrypt(string);
		System.out.println(activeUrl);
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append(title).append(introText).append(activeIntroUp)
				.append(urlCode).append(activeUrl).append(" \">")
				.append(activeUrl).append(urlEnd).append(activeIntroDown)
				.append(end);
		String emailString = stringBuffer.toString();
		
		String nick = javax.mail.internet.MimeUtility.encodeText("学觅网<xuemiadmin@163.com>"); 
		messageHelper.setFrom(this.nick); // 根据自己的情况,设置username
		// 设置收件人，寄件人
		messageHelper.setTo(userinfo.getEmail());
		messageHelper.setSubject("学觅账户激活");
		// 设置邮件内容，true 表示启动HTML格式的邮件
		messageHelper.setText(emailString, true);
		// 发送邮件
		senderImpl.send(mailMessage);
		System.out.println("邮件发送成功..");
		return emailString;
	}

}
