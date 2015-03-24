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
    <link href="<%=path %>/resource/css/bootstrap/bootstrap.css" rel="stylesheet">
    <link href="<%=path %>/resource/css/bootstrap/bootstrap-responsive.css" rel="stylesheet">
    <link href="<%=path %>/resource/css/bootstrap/bootstrap-overrides.css" type="text/css" rel="stylesheet">

    <!-- global styles -->
    <link rel="stylesheet" type="text/css" href="<%=path %>/resource/css/compiled/layout.css">
    <link rel="stylesheet" type="text/css" href="<%=path %>/resource/css/compiled/elements.css">
    <link rel="stylesheet" type="text/css" href="<%=path %>/resource/css/compiled/icons.css">
    <!-- libraries -->
    <link rel="stylesheet" type="text/css" href="<%=path %>/resource/css/lib/font-awesome.css">
    
    <!-- this page specific styles -->
    <link rel="stylesheet" href="<%=path %>/resource/css/compiled/signup.css" type="text/css" media="screen" />

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
            <img src="<%=path %>/resource/img/logo.png" style="margin-top:-20px; width:130px;height:60px;" />
        </a>
    </div>
    <div class="login-wrapper">
        <div class="box">
            <div class="content-wrap">
            	<h6>重设密码</h6>
            	<p style="color:red; margin-top:5px; margin-bottom:7px; text-align:center;" id="error">${errormsg}</p>
               <form action="<%=path%>/user/changePassword" method="post" id="resetForm">
            	<input type="hidden" name="u" value="${u}">
            	<input class="form-control" id="newPass" name="newPass" type="password" placeholder="密码">
                <input class="form-control" id="confirmPass" type="password" placeholder="确认密码">
               </form>
                <div class="action">
                    <a class="btn-glow primary signup" id="resetButton">重设密码</a>
                </div>                
            </div>
        </div>

    </div>
</body>
</html>
<script src="<%=path%>/resource/js/theme.js"></script>
    	<script type="text/javascript" src="<%=path%>/resource/js/jquery-1.8.2.min.js" ></script>
    <script type="text/javascript">
    $(document).ready(function(){
    	$("#resetButton").click(function(){
    		var newPass=$("#newPass").val();
    		var confirmPass=$("#confirmPass").val();
	        if(newPass!=confirmPass){
	        	document.getElementById("error").innerHTML="密码不一致";
	        	return false;
	       }
	        if(newPass.length<6){
		    	document.getElementById("error").innerHTML="密码大于或等于6位";
	        	return false;
	       }else{
	    	   $("#resetForm").submit();
	       }
    		
    	});
    });
    
    </script>