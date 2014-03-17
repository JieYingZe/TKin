<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New Activity Page</title>

    <!-- Le HTML5 shim, for IE6-8 support of HTML elements -->
    <!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
    <sb:head/>

</head>
<body>

    <s:actionerror theme="bootstrap"/>
    <s:actionmessage theme="bootstrap"/>
    <s:fielderror theme="bootstrap"/>


	<div class="container"> 
	<s:form action="register" theme="bootstrap" cssClass="form-horizontal">
		<s:textfield name="user.username" label="用户名"></s:textfield>
		<s:password name="user.password" label="密码"></s:password>
		<s:radio list="#{'1':'男','0':'女'}" listKey="key" listValue="value"
			name="user.gender" label="性别" labelposition="inline" value="1"></s:radio>
		<s:textfield type="number" min="1" max="128" value="18" name="user.age" label="年龄"  />
		<s:select
                        label="地址"
                        list="{'玄武区', '秦淮区', '鼓楼区', '建邺区', '雨花台区', '浦口区', '六合区', '栖霞区', '江宁区', '溧水区', '高淳区', '非南京地区'}"
                        name="user.address"
                        headerKey="None" headerValue="请选择您的地址"/>
                        
		<s:submit value="注册" cssClass="btn btn-primary btn-large"></s:submit>
	</s:form>
    </div>
</body>
</html>