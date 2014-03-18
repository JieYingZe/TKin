<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Login Page</title>

	<link href="../css/all.css" rel="stylesheet">

    <!-- Le HTML5 shim, for IE6-8 support of HTML elements -->
    <!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
    <sb:head/>

</head>
<body class="body-singnin">

    <s:actionerror theme="bootstrap"/>
    <s:actionmessage theme="bootstrap"/>
    <s:fielderror theme="bootstrap"/>


	<div class="container"> 
	<s:form action="login" theme="bootstrap" cssClass="form-horizontal form-signin">
		<s:textfield name="user.username" label="用户名"></s:textfield>
		<s:password name="user.password" label="密码"></s:password>
		<s:submit value="登录" cssClass="btn btn-primary btn-large"></s:submit>
	</s:form>
    </div>
</body>
</html>