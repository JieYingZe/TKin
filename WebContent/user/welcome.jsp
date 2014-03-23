<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>天健健身俱乐部</title>
    <!-- Le HTML5 shim, for IE6-8 support of HTML elements -->
    <!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
    <sb:head/>

</head>

    <s:actionerror theme="bootstrap"/>
    <s:actionmessage theme="bootstrap"/>
    <s:fielderror theme="bootstrap"/>

<body style="padding-top: 60px; padding-bottom: 40px;">
	<div class="navbar navbar-inverse navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container">
          <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="brand" href="#">天健</a>
          <div class="nav-collapse collapse">
          	<a class="btn btn-primary pull-right" href='<s:url action="logout"/>'> 注销</a>
          	欢迎<s:property value="#session.username" />
			<a class="btn btn-primary pull-right" href='<s:url action="showUserInfo"/>'> 查看个人信息</a>
			<a class="btn btn-primary pull-right" href='<s:url action="showActivityForUser"/>'>查看所有活动</a>
			<a class="btn btn-primary pull-right" href='<s:url action="showActivityRecord"/>'>查看活动记录</a>
			<a class="btn btn-primary pull-right" href='<s:url action="showPayment"/>'>查看支付记录</a>
          </div><!--/.nav-collapse -->
        </div>
      </div>
    </div>
    
 
</body>
</html>