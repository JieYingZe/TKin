<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Activity Page</title>

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
		<table class="table table-striped table-bordered">
		    <tr>
      			<th>活动名称</th>
      			<th>教练</th>
      			<th>起始时间</th>
      			<th>结束时间</th>
      			<th>地点</th>
      			<th>操作</th>
    		</tr>
			<s:iterator value="activityList">
				<tr>
					<td><s:property value="activityName"/></td>
					<td><s:property value="coach"/></td>
					<td><s:date name="startTime" format="yyyy-MM-dd hh:mm"/></td>
					<td><s:date name="endTime" format="yyyy-MM-dd hh:mm"/></td>
					<td><s:property value="site"/></td>
					<td>
					<s:form action="reserveActivity" style="margin:0px">
					<s:hidden name="activityId"></s:hidden>
					<input type="submit"  value="预约" class="btn btn-success">
					</s:form>
					</td>
				</tr>
  			</s:iterator>
		</table>
    </div>
</body>
</html>