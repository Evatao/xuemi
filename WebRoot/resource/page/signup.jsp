<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <link href="<%=path%>/resource/css/bootstrap/bootstrap-responsive.css" rel="stylesheet">
    <link href="<%=path%>/resource/css/bootstrap/bootstrap-overrides.css" type="text/css" rel="stylesheet">

    <!-- global styles -->
    <link rel="stylesheet" type="text/css" href="<%=path%>/resource/css/compiled/layout.css">
    <link rel="stylesheet" type="text/css" href="<%=path%>/resource/css/compiled/elements.css">
    <link rel="stylesheet" type="text/css" href="<%=path%>/resource/css/compiled/icons.css">
    <!-- libraries -->
    <link rel="stylesheet" type="text/css" href="<%=path%>/resource/css/lib/font-awesome.css">
    
    <!-- this page specific styles -->
    <link rel="stylesheet" href="<%=path%>/resource/css/compiled/signup.css" type="text/css" media="screen" />

    <!-- open sans font -->
    <!--<link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
    -->

    <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
</head>
<body>
    <div class="header">
        <a href="#">
            <img src="<%=path%>/resource/img/logo.png" style="margin-top:-20px; width:130px;height:60px;" />
        </a>
    </div>
    <div class="login-wrapper">
        <div class="box">
            <div class="content-wrap">
                <h6>注册</h6>
                
                <p style="color:red; margin-top:-5px; margin-bottom:7px;text-align:center;" id="error">${errormsg}</p>
                <form class="form-horizontal" action="<%=path%>/user/register" method="post" id="registerForm">
                <input class="form-control"  name="email" type="text" id="email" placeholder="请输入邮箱">
                <input class="form-control" name="password" type="password" id="password" placeholder="密码" data-toggle="tooltip" data-placement="right" title="密码为6-15位字符">
                <input class="form-control" type="password" id="confirmpassword" placeholder="确认密码">
                <div class="captcha">
                <input class="form-control" name="idfcode"  type="text" id="idfcode" placeholder="验证码" style="width:50%;">
                <img src="<%=path%>/kaptcha/s" id="captcha_img" class="captcha-img" />
                </div>
                <div class="action">
                   <a class="btn-glow primary signup" id="regverId">注册</a>
                </div>   
                </form>
            </div>
        </div>

        <div class="already">
            <p>已经有账户</p>
            <a href="<%=path %>/resource/page/signin.jsp">登陆</a>
        </div>
    </div>

	<!-- scripts -->
    <script src="<%=path%>/resource/js/ace/jquery-latest.js"></script>
    <script src="<%=path%>/resource/js/bootstrap.min.js"></script>
    <script src="<%=path%>/resource/js/theme.js"></script>
    <script type="text/javascript" src="<%=path%>/resource/js/jquery.min.js"></script>

  
  <script type="text/javascript">
	$(document).ready(function(){
		var emailAvaiable=false;
		var isCheck=false;
		var passConfirm=false;
		
		$("#captcha_img").click(function(){
			$("#captcha_img").attr("src",'<%=path%>/kaptcha/s?'+Math.random());
			
		});
		
		
		$("#confirmpassword").blur(function(){ 
			var password=$("#password").val();
		    var confirmpassword=$("#confirmpassword").val();
			if(password==confirmpassword){
				if(! passConfirm){
					$("#error").text("");
				}
			}
		});
		
		$("#regverId").click(function(){
			var email=document.getElementById("email").value.replace(/^\s+|\s+$/g,"").toLowerCase();//去除前后空格并转小写
	        var reg=/^[a-z0-9](\w|\.|-)*@([a-z0-9]+-?[a-z0-9]+\.){1,3}[a-z]{2,4}$/i;
	        var password1=document.getElementById("password").value;
	    	var confirmpassword=document.getElementById("confirmpassword").value;
	        if(email.match(reg)==null){
	        	document.getElementById("error").innerHTML="请输入有效的邮箱地址";
	       }
	       else if(password1==null||password1==""){
	    		document.getElementById("error").innerHTML="密码不能为空";
	    		 passConfirm=false;
	       }
	       else if(password1.length<6){
	    	document.getElementById("error").innerHTML="密码大于或等于6位";
	    	 passConfirm=false;
	    	}
	        else  if(password1!=confirmpassword){
	       	  document.getElementById("error").innerHTML="两次密码不一致";
	       	  passConfirm=false;
	    	}
	        else{
	        	passConfirm=true;
	        	if(emailAvaiable&&isCheck&& passConfirm)
	        	$("#registerForm").submit();
	        }
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
		
		
		$("#email").blur(function(){
		var email=document.getElementById("email").value.replace(/^\s+|\s+$/g,"").toLowerCase();//去除前后空格并转小写
        var reg=/^[a-z0-9](\w|\.|-)*@([a-z0-9]+-?[a-z0-9]+\.){1,3}[a-z]{2,4}$/i;
        if(email.match(reg)==null){
        	document.getElementById("error").innerHTML="请输入有效的邮箱地址";
     	 }else{
     		$.post('<%=path%>/user/check_email',{email:email},function(data){
				if(data=='available'){
					if(!emailAvaiable){
					 $("#error").text("");
					}
					emailAvaiable=true;
				}else{
					emailAvaiable=false;
					$("#email").focus();
					$("#error").text("邮箱已被注册，请直接登录");
				}
			});
     	 
     	 }
		
		});
		
	});
  
  
  </script>
</body>
</html>