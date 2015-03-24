package mailtest;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.mail.internet.MimeMessage;

import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

/**
 * 本类测试邮件中嵌套图片
 * 
 * @author sunny
 * 
 */
public class AttachedImageMail {

	public String getEmail() {
		Properties properties = new Properties();
		InputStream inputStream = this.getClass().getClassLoader()
				.getResourceAsStream("config/props/email.properties");
		try {
			properties.load(inputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("微信配置文件加载错误");
			e.printStackTrace();
		}
		String email_name_head = properties.getProperty("email_name_head");
		String email_name_text = properties.getProperty("email_name_text");
		String email_name_end = properties.getProperty("email_name_end");
		String email_introduce_text = properties
				.getProperty("email_introduce_text");
		String email_introduce_end = properties
				.getProperty("email_introduce_end");
		String email_url_head = properties.getProperty("email_url_head");
		String email_url_end = properties.getProperty("email_url_end");
		String email_button_introduce = properties
				.getProperty("email_button_introduce");
		String email_button_end = properties.getProperty("email_button_end");
		String email_error_send = properties.getProperty("email_error_send");
		String email_error_end = properties.getProperty("email_error_end");

		String emaiString = email_name_head + email_name_text + email_name_end
				+ email_introduce_text + email_introduce_end + email_url_head
				+ email_url_end + email_button_introduce + email_button_end
				+ email_error_send + email_error_end;
		return emaiString;
	}

	public static void main(String[] args) throws Exception {
		AttachedImageMail attachedImageMail = new AttachedImageMail();
		String emailString = attachedImageMail.getEmail();
		JavaMailSenderImpl senderImpl = new JavaMailSenderImpl();
		// 设定mail server
		senderImpl.setHost("smtp.163.com");

		// 建立邮件消息,发送简单邮件和html邮件的区别
		MimeMessage mailMessage = senderImpl.createMimeMessage();
		// 注意这里的boolean,等于真的时候才能嵌套图片，在构建MimeMessageHelper时候，所给定的值是true表示启用，
		// multipart模式
		 MimeMessageHelper messageHelper = new MimeMessageHelper(mailMessage,true,"utf-8"); 

		// 设置收件人，寄件人
		// 设置收件人，寄件人
		messageHelper.setTo("dongxuan@puvsa.org ");
		messageHelper.setFrom("ZDX6301@163.com ");
		messageHelper.setSubject("测试邮件中嵌套图片!！");
		// true 表示启动HTML格式的邮件

		messageHelper.setText(emailString, true);

		senderImpl.setUsername("ZDX6301@163.com"); // 根据自己的情况,设置username
		senderImpl.setPassword("1103ZDX.."); // 根据自
		senderImpl.setDefaultEncoding("UTF-8");  
		Properties prop = new Properties();
		prop.put("mail.smtp.auth", "true"); // 将这个参数设为true，让服务器进行认证,认证用户名和密码是否正确
		prop.put("mail.smtp.timeout", "25000");
		senderImpl.setJavaMailProperties(prop);

		// 发送邮件
		senderImpl.send(mailMessage);

		System.out.println("邮件发送成功..");
	}
}
