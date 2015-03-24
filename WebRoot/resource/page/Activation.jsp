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
            	<h3>注册成功，请验证邮箱</h3>
            	<br />
             <span style="text-align:left;">验证邮箱已发送到您的邮箱${email} ,您需要登陆邮箱完成认证，体验站内全部功能~</span>
                <div class="action">
                   <b style="color:#526273;font-size:20px;margin-left:-200px;">没有收到邮件</b>
                   <ul style="text-align:left;">
                <li style="color:#4A576A;">查看邮件回收站、垃圾邮箱</li>
                <form id="activeForm" action="<%=path%>/user/resend_email" method="post">
	                <input name="u" value="${userId}" type="hidden">
	                <input name="email" value="${email}" type="hidden">
                </form>
                
                
                <li><a  href="#" id="active">点击重新发送</a></li>
                </ul>
                </div>                
            </div>
        </div>

    </div>
</body>
<script type="text/javascript" src="<%=path%>/resource/js/jquery.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	
	$("#active").click(function(){
		
		$("#activeForm").submit();
	});
	
	
	
});
</script>
</html>