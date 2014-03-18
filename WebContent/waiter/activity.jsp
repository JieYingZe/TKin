<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Activity Management Page</title>

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

	<s:action name="showActivity"></s:action>
	<div class="container">
		<table class="table table-striped table-bordered">
		    <tr>
      			<th>活动名称</th>
      			<th>教练</th>
      			<th>起始时间</th>
      			<th>结束时间</th>
      			<th>地点</th>
    		</tr>
			<s:iterator value="#request.userList">
				<tr >
					<td><s:property value="cardNo"/></td>
					<td><s:if test='type==0'>会员卡</s:if><s:else>家庭卡</s:else></td>
					<td><s:property value="username"/></td>
					<td><s:if test='gender==1'>男</s:if><s:else>女</s:else></td>
					<td><s:property value="age"/></td>
					<td><s:property value="address"/></td>
				</tr>
  			</s:iterator>
		</table>
    </div>
</body>
</html>