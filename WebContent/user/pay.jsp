<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Pay</title>

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
	<s:form action="activeUser" theme="bootstrap" cssClass="form-horizontal form-signin">
		<s:textfield name="paymentRecord.bankCardNo" label="请输入你的银行卡号"></s:textfield>
		<s:submit value="激活会员卡" cssClass="btn btn-primary btn-large"></s:submit>
	</s:form>
    </div>
</body>
</html>