<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
             <p >新密码设置连接已发送到您的邮箱 1509221674@qq.com ，请登录邮箱查收。</p>
              <h6 style="text-align:left;">我收不到邮件，怎么办？</h6>
                <ul style="text-align:left;margin-top:-19px;">
                <li>重新发送邮件，<a href="forgetpassword.html">点击重新发送</a></li>
                <li>请邮件联系xuemiadmin@163.com，我们将在1个工作日内处理。</li>
                </ul>
                <div class="action">
                    <a class="btn-glow primary signup" href="#">提交</a>
                </div>                
            </div>
        </div>

    </div>
</body>
</html>