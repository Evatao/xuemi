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
                <h3>找回密码</h3>
                 <p style="color:red; margin-top:5px; margin-bottom:7px; text-align:center;" id="error">${errormsg}</p>
                <form action="<%=path %>/user/findPassword" method="post" id="resetForm">
                <input class="form-control" id="email" name="email" type="text" placeholder="注册邮箱">
                <span>请输入您注册的邮箱,我们将发送如何重新设置密码的邮件到该邮箱中.如果还有困难，请邮件联系xuemiadmin@163.com，我们将在1个工作日内处理。</span>
                <div class="action">
                    <a class="btn-glow primary signup" id="resetButton">提交</a>
                </div>   
                </form>             
            </div>
        </div>

    </div>

	<!-- scripts -->
    <script src="<%=path%>/resource/js/ace/jquery-latest.js"></script>
    <script src="<%=path%>/resource/js/bootstrap.min.js"></script>
    <script src="<%=path%>/resource/js/theme.js"></script>
    	<script type="text/javascript" src="<%=path%>/resource/js/jquery-1.8.2.min.js" ></script>
    <script type="text/javascript">
    $(document).ready(function(){
    	$("#resetButton").click(function(){
    		var email=$("#email").val();
    		var email=email.replace(/^\s+|\s+$/g,"").toLowerCase();//去除前后空格并转小写
	        var reg=/^[a-z0-9](\w|\.|-)*@([a-z0-9]+-?[a-z0-9]+\.){1,3}[a-z]{2,4}$/i;
	        if(email.match(reg)==null){
	        	document.getElementById("error").innerHTML="请输入有效的邮箱地址";
	        	return false;
	       }else{
	    	   $("#resetForm").submit();
	       }
    		
    	});
    });
    
    </script>
    
</body>
</html>