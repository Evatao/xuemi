<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
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
<style type="text/css">
*{margin:0;padding:0;outline:none;}
body{padding:20px;font:12px "微软雅黑";background:#FFF;}
ul li{list-style:none;}
#schoolName{padding:0 8px;cursor:pointer;font-size:15px;}
.provinceSchool{display:none;position:absolute;width:580px;height:auto;border:1px solid #72B9D7;}
.provinceSchool .title{width:100%;height:30px;background:#72B9D7;cursor:move;}
.provinceSchool .title span{margin-left:10px;font-weight:600;color:#FFF;line-height:30px;}
.provinceSchool .proSelect{width:550px;text-align:center;padding:15px 0;}
.provinceSchool .proSelect select{width:136px;}
.provinceSchool .proSelect span{padding-left:10px;}
.provinceSchool .proSelect input{display:none;}
.provinceSchool .schoolList{width:550px;height:180px;padding:10px 0;overflow-y:auto;border:1px solid #ddd;}
.provinceSchool .schoolList ul{width:510px;clear:both;}
.provinceSchool .schoolList ul span.entertext{display:block;height:180px;font:normal 16px/180px 'microsoft yahei';color:#999;}
.provinceSchool .schoolList ul li{float:left;text-align:center;width:160px;margin:5px;height:25px;line-height:25px;cursor:pointer;background:#fafafa;border-radius:3px;}
.provinceSchool .schoolList ul li.DoubleWidthLi{overflow:hidden;}
.provinceSchool .schoolList ul li:hover{background:#72B9D7;color:#fff;}
.provinceSchool .button{width:100%;height:40px;margin-top:8px;}
.provinceSchool .button button{float:right;height:30px;margin-right:15px;padding:2px 15px;background:#72B9D7;border:none;color:#FFF;font-weight:600;cursor:pointer;border-radius:3px;}
.provinceSchool .button button:hover{background:#2e90bd;}
</style>
    <link href="<%=path%>/resource/css/bootstrap/bootstrap.css" rel="stylesheet">
    <link href="<%=path%>/resource/css/bootstrap/bootstrap-responsive.css" rel="stylesheet">
    <link href="<%=path%>/resource/css/bootstrap/bootstrap-overrides.css" type="text/css" rel="stylesheet">

    <!-- global styles -->
    <link rel="stylesheet" type="text/css" href="<%=path%>/resource/css/compiled/layout.css">
    <link rel="stylesheet" type="text/css" href="<%=path%>/resource/css/compiled/elements.css">
    <link rel="stylesheet" type="text/css" href="<%=path%>/resource/css/compiled/icons.css">
    <!-- libraries -->
    <link rel="stylesheet" type="text/css" href="<%=path%>/resource/css/lib/font-awesome.css">

<link rel="stylesheet" href="<%=path%>/resource/css/compiled/signup.css" type="text/css" media="screen" />

<script type="text/javascript" src="<%=path%>/resource/js/jquery.min.js"></script>
<script type="text/javascript" src="<%=path%>/resource/js/school.js"></script>
<script type="text/javascript">
$(document).ready(function() {
	
	var isUserNameCheck=false;
	var mydate=new Date();
	var nowYear=mydate.getFullYear();
	console.log(nowYear);
	var yearSelect=$("#yearSelect");
	for(var year=nowYear;year>1990;year--){
		yearSelect.append("<option value='"+year+"'>"+year+"</option>");
	}
	
	$("#subButton").click(function(){
		
			var name=$("#userName").val();
			if(name==""||name==null){
				$("#msg").text("请输入用户名");
				return false;
			}
		
			var school=$("#schoolName").val();
			if(school==""||school==null){
				$("#msg").text("请选择学校");
				return false;
			}
			
			var major=$("#majorSelect option:selected").text();
			if(major==""||major==null||major=='请选择专业或者学院'){
			alert(major);
				$("#msg").text("请选择专业或学院");
				return false;
			}
			
			var year=$("#yearSelect option:selected").text();
			if(year==""||year==null||year=='请点击选择入学年份'){
				$("#msg").text("请选择入学年份");
				return false;
			}
			
			if(isUserNameCheck){
				$("#subForm").submit();
			}else{
				$("#msg").text("用户名已存在");		
			}
					
		
	});
	
	$("#userName").blur(function(){
			var name=$(this).val();
			$.post('<%=path%>/user/checkUserName',{userName:name},function(data){
			if(data=='unAvailable'){
				$("#msg").text("用户名已存在");
				isUserNameCheck=false;
			}else{
				$("#msg").text("");
				isUserNameCheck=true;
			}
		});
	});
	
	//province;
	//proSchool;
	//学校名称 激活状态
	$("#schoolName").focus(function(){
	  var top = $(this).position().top+$(this).height()+2;
	  var left = $(this).position().left;
	  $("div[class='provinceSchool']").css({top:top,left:left});
	  $("div[class='provinceSchool']").show();
	});
	//初始化省下拉框
	var provinceArray = "";
	var provicneSelectStr = "";
	for(var i=0,len=province.length;i<len;i++){
	  provinceArray = province[i];
	  provicneSelectStr = provicneSelectStr + "<option value='"+provinceArray[0]+"'>"+provinceArray[1]+"</option>"
	} 
	$("div[class='proSelect'] select").html(provicneSelectStr);
	//初始化学校列表
	var selectPro = $("div[class='proSelect'] select").val();
	var schoolUlStr = "";
	var schoolListStr = new String(proSchool[selectPro]);
	var schoolListArray = schoolListStr.split(",");
	var tempSchoolName = "";
	for(var i=0,len=schoolListArray.length;i<len;i++){
	  tempSchoolName = schoolListArray[i];
	  if(tempSchoolName.length>13){
		schoolUlStr = schoolUlStr + "<li class='DoubleWidthLi' title="+schoolListArray[i]+">"+schoolListArray[i]+"</li>"
	  }else {
		schoolUlStr = schoolUlStr + "<li>"+schoolListArray[i]+"</li>"
	  }
	}
	$("div[class='schoolList'] ul").html(schoolUlStr);
	//省切换事件
	$("div[class='proSelect'] select").change(function(){
	  if("99"!=$(this).val()){
		$("div[class='proSelect'] span").show();
		$("div[class='proSelect'] input").hide();
		schoolUlStr = "";
		schoolListStr = new String(proSchool[$(this).val()]);
		schoolListArray = schoolListStr.split(",");
		for(var i=0,len=schoolListArray.length;i<len;i++){
		  tempSchoolName = schoolListArray[i];
		  if(tempSchoolName.length>13){
			schoolUlStr = schoolUlStr + "<li class='DoubleWidthLi' title="+schoolListArray[i]+">"+schoolListArray[i]+"</li>"
		  }else {
			schoolUlStr = schoolUlStr + "<li>"+schoolListArray[i]+"</li>"
		  }
		}
		$("div[class='schoolList'] ul").html(schoolUlStr);
	  }
	  else {
		$("div[class='schoolList'] ul").html("<span class='entertext'>请在输入框内手动输入学校！</span>");
		$("div[class='proSelect'] span").hide();
		$("div[class='proSelect'] input").show();
	  }
	});
	//学校列表mouseover事件
	$("div[class='schoolList'] ul li").live("mouseover",function(){
	  $(this).css("background-color","#72B9D7");
	});
	//学校列表mouseout事件
	$("div[class='schoolList'] ul li").live("mouseout",function(){
	  $(this).css("background-color","");
	});
	//学校列表点击事件
	$("div[class='schoolList'] ul li").live("click",function(){
	  $("#schoolName").val($(this).html());
	  var name=$(this).html();
	  $("div[class='provinceSchool']").hide();
	  
	  $.post('<%=path%>/school/getMajorList',{schoolName:name},function(data){
			
			var temp = decodeURIComponent(data);  
			var majors= jQuery.parseJSON(temp, true);
			var majors= jQuery.parseJSON(temp, true);
			var major_length=majors.length;
			var majorSelect=$("#majorSelect");
			majorSelect.html("");
			majorSelect.append("<option>请选择专业或者学院</option>");
			for(var i=0;i<major_length;i++){
				majorSelect.append("<option value='"+majors[i].majorId+"'>"+majors[i].majorName+"</option>");
			}
		});
			
			
	
	  
	});
	//按钮点击事件
	$("div[class='button'] button").live("click",function(){
	  var flag = $(this).attr("flag");
	  if("0"==flag){
		$("div[class='provinceSchool']").hide();
	  }else if("1"==flag){
		var selectPro = $("div[class='proSelect'] select").val();
		if("99"==selectPro){
		  $("#schoolName").val($("div[class='proSelect'] input").val());
		}
		$("div[class='provinceSchool']").hide();
	  }
	  
	  return false;
	});
	
	
	
	
//	$("#majorSelect").click(function(){
//		//alert("wefwif");
//		$("#majorSelect").attr("size","5");
//		//alert($("#majorSelect").attr("size"));
//	});
//	
//	$("#majorSelect").change(function(){
//		alert("wefwif");
//		$("#majorSelect").attr("size","5");
//		alert($("#majorSelect").attr("size"));
//	});
//	
	
	
});
</script>

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
              <h6>完善个人信息</h6>
              <p id="msg" style="color:red;text-align: center;"></p>
              <form action="<%=path%>/user/registerStep2" method="post" id="subForm">
              <input type="hidden" name="userId" value="${userId}">
              <input class="form-control" type="text" placeholder="请输入用户名" name="userName" id="userName">
              <input type="text" class="form-control" name="schoolName" id="schoolName" placeholder="请点击选择学校"  />
              <div id="proSchool" class="provinceSchool" style="z-index:2;">
                 <div class="title"><span>请选择学校</span></div>
               <div class="proSelect" style="background-color:#EFF0F3;">
                <select></select>
                <span>如没找到选择项，请选择其他手动填写</span>
                <input type="text" />
              </div>
                <div class="schoolList"style="background-color:#EFF0F3;">
                <ul></ul>
                 </div>
              <div class="button"style="background-color:#EFF0F3;">
                  <button flag='0'>取消</button>
                  <button flag='1'>确定</button>
               </div>
                 </div>	
                 <br/>
                 <div class="form-group">
					      <select name="majorId" class="form-control" id="majorSelect" >
					      	 <option selected="selected">请选择专业或者学院</option>
					      </select>
                  </div>
                   
                  <div class="form-group">
					      <select name="innerSchoolYear" class="form-control" id="yearSelect">
					      	 <option>请点击选择入学年份</option>
					      </select>
                  </div>
               </form>

               <div class="action" style="z-index:0;">
                    <a class="btn-glow primary signup" id="subButton">保存我的个人信息</a>
                </div>   
            </div>
        </div>

    </div>

</body>
</html>
