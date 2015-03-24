<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>学觅网登录</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<link rel="stylesheet" type="text/css" href="styles.css">

<script type="text/javascript"
	src="<%=path%>/resource/js/jquery-1.11.2.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		//
		var isNeedIdf=false;
		var loginCount=${loginCount}+'';
		if(loginCount==''){
			loginCount=0;
		}
		if(loginCount>3){
			isNeedIdf=true;
			$("#idfdiv").css("display","block");
		}
		$("#subButton").click(function() {
			var isValidation=false;
			var username=$("#username").val();
			var pwd=$("#pwd").val();
			var idfcode=$("#idfcode").val();
			if(username==""){
				$("#errormsg").text("用户名不能为空");
			}else if(pwd==''){
				$("#errormsg").text("密码不能为空");
			}else if(idfcode==''&&isNeedIdf){
				$("#errormsg").text("验证码不能为空");				
			}else{
				isValidation=true;
			}
			if(isValidation){
				$("#loginForm").submit();
			}
		
			
		});
	});
</script>


</head>

<body>
	<center>
		<form action="user/login" method="post" id="loginForm">
			Username or Email 
			<br /> 
			<input id="username" type="text" name="nickName" 
				value="${erroruser.nickName }"/>
			<br /> 
			Password (forgot password) 
			<br /> 
			<input id="pwd" type="password" name="password" 
				value="${erroruser.password }" />
			<br	/>
			<div style="display: none" id="idfdiv">
			验证码
			<br /> 
			<input id="idfcode" type="text" name="idfcode" size="5"   />
			<img src="kaptcha/s" name="idfimage" height="40px" width="110px"  />
			</div>
			<br	/>
			<br	/>
			<label id="errormsg" style="color: red">${errormsg}</label>
		</form>
			<button id="subButton">登录</button>

	</center>
</body>
</html>
