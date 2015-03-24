<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
  
    <title>用户注册</title>

    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="<%=path%>/resource/bootstrap/css/bootstrap.min.css"> 
    <!-- Custom styles for this template -->


  </head>
  <body>
   <div class="container" style="margin-top:100px;width:250%;">
	<form class="form-horizontal" action="user/register" method="post" id="registerForm">
	  <div class="form-group">
	    <label for="nickName" class="col-sm-2 control-label">用户名：</label>
	    <div class="col-sm-10">
	      <input type="text" id="nickName" name="nickName" value="${erroruser.nickName }" class="form-control" style="width:250px;" placeholder="UserName" required >
	      <span id="nickNameTip" style="display:none;color:red"></span>
	    </div>
	  </div>
	  <div class="form-group">
	    <label for="email" class="col-sm-2 control-label">邮箱</label>
	    <div class="col-sm-10">
	      <input type="email"  id="email" name="email" class="form-control" style="width:250px;" placeholder="email" required="required">
	      <span id="emailTip" style="display:none;color:red;"></span>
	    </div>
	  </div>
	  <div class="form-group">
	    <label for="password" class="col-sm-2 control-label">密码</label>
	    <div class="col-sm-10">
	      <input type="password" id="password" name="password" class="form-control" style="width:250px;"  placeholder="New Password" required="required">
	      <span id="passwordTip" style="display:none;"></span>
	    </div>
	  </div>
	  <div class="form-group">
	    <label for="confirmPassword" class="col-sm-2 control-label">确认密码</label>
	    <div class="col-sm-10">
	      <input type="password" id="confirmPassword" class="form-control" style="width:250px;"  placeholder="Again New Password" required="required">
	      <span id="confirmTip" style="display:none;color:red;"></span>
	    </div>
	  </div>
	  <div class="form-group">
	    <label for="idfcode" class="col-sm-2 control-label">验证码</label>
	    <div class="col-sm-10">
	      <input type="text" id="idfcode" name="idfcode"  style="width:150px;"  placeholder="验证码" required="required">
	   	  <img src="kaptcha/s" name="idfimage" height="40px" width="100px"  />
	      <span id="idfcodeTip" style="display:none;color:red"></span>
	    </div>
	  </div>
	 <div class="form-group">
	    <label class="col-sm-2 control-label">  </label>
	 	 <button type="submit" class="btn btn-primary" id="submit" style="text-align:center;">确认修改</button>
	  </div>
	</form>
	
</div>
  </body>
 <script type="text/javascript"
	src="<%=path%>/resource/js/jquery-1.11.2.min.js"></script>
	
	<script type="text/javascript">
	
	$(document).ready(function(){
		var nameAvaiable=false;
		var emailAvaiable=false;
		var passwordConfirm=false;
		var isCheck=false;
		$("#idfcode").keyup(function(){
			isCheck=false;
			var idfcode=$("#idfcode").val();	
			var length=idfcode.length;
			if(length==4)
			$.post('<%=path%>/user/check_idfcode',{idfcode:idfcode},function(data){
				if(data=="true"){
					isCheck=true;
					$("#idfcode").css({"border-color":"green"});
					$("#idfcodeTip").css("display","none");
				}else{
					isCheck=false;
					$("#idfcode").focus();
					$("#idfcode").css({"border-color":"red"});
					$("#idfcodeTip").text("验证码错误");
					$("#idfcodeTip").css("display","block");
				
				}
			
			});
		});
		
		$("#submit").click(function(){
			if(nameAvaiable&&emailAvaiable&&passwordConfirm&&isCheck){
				$("#registerForm").submit();
			}else{
				return false;
			}
		});
		
		$("#nickName").blur(function(){
			var nickName = $("#nickName").val();
			if(nickName!=''){
				$.post('<%=path%>/user/check_nickname',{nickName:nickName},function(data){
					if(data=='available'){
						nameAvaiable=true;
						$("#nickName").css({"border-color":"green"});
						$("#nickNameTip").css({"display":"none"});
					
					}else{
						nameAvaiable=false;
						$("#nickName").focus();
						$("#nickName").css({"border-color":"red"});
						$("#nickNameTip").text("用户名已存在");
						$("#nickNameTip").css("display","block");
					
					}
				
				});
				
			}
	
		});
		
		$("#email").blur(function(){
			var email = $("#email").val();
			if(email!=''){
				$.post('<%=path%>/user/check_email',{email:email},function(data){
					if(data=='available'){
						emailAvaiable=true;
						$("#email").css({"border-color":"green"});
						$("#emailTip").css({"display":"none"});
					}else{
						emailAvaiable=false;
						$("#email").focus();
						$("#email").css({"border-color":"red"});
						$("#emailTip").text("邮箱已被注册，请直接登录");
						$("#emailTip").css("display","block");
					
					}
				});
			}
		});

	   $("#confirmPassword").blur(function(){
		   
		  var password=$("#password").val();
		  var confirmpassword=$("#confirmPassword").val();
		  
		  if(password!=confirmpassword){
			  passwordConfirm=false;
			  $("#confirmPassword").focus();
			  $("#confirmPassword").css({"border-color":"red"});
			  $("#confirmTip").text("密码不一致");
			  $("#confirmTip").css("display","block");
		  }else{
			  passwordConfirm=true;
			  $("#confirmPassword").css({"border-color":"green"});
			  $("#confirmTip").css("display","none");
		  }		   
	   });
	
	
	
	
	});
	</script>
	
	
	
	
	
	
</html>
