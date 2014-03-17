<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Management Page</title>

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

	<s:action name="showUser"></s:action>
	<div class="container">
		<table class="table table-striped table-bordered">
		    <tr>
      			<th>卡号</th>
      			<th>卡类型</th>
      			<th>用户名</th>
      			<th>性别</th>
      			<th>年龄</th>
      			<th>地址</th>
      			<th>会员资格</th>
    		</tr>
			<s:iterator value="#request.userList">
				<tr >
					<td><s:property value="cardNo"/></td>
					<td><s:if test='gender==0'>会员卡</s:if><s:else>家庭卡</s:else></td>
					<td><s:property value="username"/></td>
					<td><s:if test='gender==1'>男</s:if><s:else>女</s:else></td>
					<td><s:property value="age"/></td>
					<td><s:property value="address"/></td>
					<td><s:if test='qualifications==0'>未激活</s:if>
						<s:elseif test='qualifications=1'>正常</s:elseif>
						<s:elseif test='qualifications=2'>暂停</s:elseif>
						<s:else>停止</s:else>
					</td>
				</tr>
  			</s:iterator>
		</table>
    </div>
</body>
</html>