<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<!DOCTYPE html>
<html class="login-bg">
<head>
	 <meta charset="utf-8">
	<title>学觅</title>
	<meta name="description" content="学觅">
	<meta name="author" content="xuemi.org">
	<meta name="keywords" content="学觅，大学生，大学生交流">
	<meta name="apple-mobile-web-app-capable" content="yes">
	<meta name="apple-mobile-web-app-status-bar-style" content="black" />
	<meta name="viewport" content="width=device-width,initial-scale=1.0,user-scale=no">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!-- bootstrap -->
    <link href="<%=path%>/resource/css/bootstrap/bootstrap.css" rel="stylesheet">
    <link href="<%=path%>/resource/css/bootstrap/bootstrap-overrides.css" type="text/css" rel="stylesheet">

    <!-- global styles -->
    <link rel="stylesheet" type="text/css" href="<%=path%>/resource/css/compiled/layout.css">
    <link rel="stylesheet" type="text/css" href="<%=path%>/resource/css/compiled/elements.css">
    <link rel="stylesheet" type="text/css" href="<%=path%>/resource/css/compiled/icons.css">
    <link rel="stylesheet" href="<%=path%>/resource/css/compiled/supersized.css" />

    <!-- libraries -->
    <link rel="stylesheet" type="text/css" href="<%=path%>/resource/css/lib/font-awesome.css">
    
    <!-- this page specific styles -->
    <link rel="stylesheet" href="<%=path%>/resource/css/compiled/signin.css" type="text/css" media="screen" />
 
    <!-- open sans font -->
   
    <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
   
</head>
<body>
    <div class="login-wrapper">
       
            <img class="logo2" src="<%=path%>/resource/img/logo.png">
        

        <div class="box">
            <div class="content-wrap">
                <h6>登录</h6>
                <form  method="post" action="<%= path%>/user/login" id="loginForm">
               <p style="color:red; margin-top:-5px; margin-bottom:7px;" id="error">${errormsg}</p>
                <input class="form-control" name="nickName" type="text" id="nickName" placeholder="邮箱地址/用户名">
                <input class="form-control" name="password" type="password" id="password" placeholder="密码">
                
                <div class="captcha" style="display: none" id="idfdiv">
                	<input class="form-control" name="idfcode"  type="text" id="idfcode" placeholder="验证码" style="width:50%;">
                	<img src="<%=path%>/kaptcha/s" id="captcha_img" class="captcha-img" />
                </div>
                <a href="<%=path %>/resource/page/forgetpassword.jsp" class="forgot">忘记密码?</a>
                <div class="remember" >
                    <input id="remember-me" type="checkbox">
                    <label for="remember-me">记住密码</label>
                </div>
                <a class="btn-glow primary login" id="loginButton">登录</a>
                </form>
            </div>
        </div>

        <div class="no-account">
            <p>还没账号?</p>
            <a href="<%=path %>/resource/page/signup.jsp">注册</a>
        </div>
    </div>

	<!-- scripts -->
	<script type="text/javascript" src="<%=path%>/resource/js/scripts.js" ></script>
	
	<script type="text/javascript" src="<%=path%>/resource/js/jquery-1.8.2.min.js" ></script>
	<script type="text/javascript" src="<%=path%>/resource/js/supersized.3.2.7.min.js" ></script>
	<script type="text/javascript" src="<%=path%>/resource/js/supersized-init.js" ></script>
    <script src="/jquery-latest.js"></script>
    <script src="<%=path%>/resource/js/bootstrap.min.js"></script>
    <script src="<%=path%>/resource/js/theme.js"></script>
     <script>
 	$(document).ready(function() {
 		var isNeedIdf=false;
     	var loginCount=${loginCount}+'';
		if(loginCount==''){
			loginCount=0;
		}
		if(loginCount>3){
			isNeedIdf=true;
			console.log(loginCount);
			$("#idfdiv").css("display","block");
		}
		
		$("#captcha_img").click(function(){
			$("#captcha_img").attr("src",'<%=path%>/kaptcha/s?'+Math.random());
			
		});
		
		$("#loginButton").click(function(){
			var username1=document.getElementById("nickName").value;
			var password1=document.getElementById("password").value;
			if((username1==null||username1=="")&&(password1!=null||password1!="")){
				document.getElementById("error").innerHTML="请输入用户名或者邮箱";
				return false;
			}
			if((username1!=null||username1!="")&&(password1==null||password1=="")){
				document.getElementById("error").innerHTML="请输入密码";
				return false;
			}
			if((username1==null||username1=="")&&(password1==null||password1=="")){
				document.getElementById("error").innerHTML="请输入用户名和密码";
				return false;
			}
			
			var idfcode=$("#idfcode").val();
			if(idfcode==''&&isNeedIdf){
				document.getElementById("error").innerHTML="验证码不能为空";
				return false;
			}
			$("#loginForm").submit();
		});
		
		
		$("#idfcode").keyup(function(){
			isCheck=false;
			var idfcode=$("#idfcode").val();	
			var length=idfcode.length;
			if(length==4)
			$.post('<%=path%>/user/check_idfcode',{idfcode:idfcode},function(data){
				if(data=="true"){
					
					if(!isCheck){
						 $("#error").text("");
					}
					isCheck=true;
					
				}else{
					isCheck=false;
					$("#idfcode").focus();
					$("#error").text("验证码错误");
				
				}
			
			});
		});
		
 	});
    </script>
</body>
</html>