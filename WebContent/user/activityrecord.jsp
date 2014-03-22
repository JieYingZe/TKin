<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Activity Record Page</title>

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
      			<th>状态</th>
    		</tr>
			<s:iterator value="activityRecordList">
				<tr>
					<td><s:property value="activityName"/></td>
					<td><s:property value="coach"/></td>
					<td><s:date name="startTime" format="yyyy-MM-dd hh:mm"/></td>
					<td><s:date name="endTime" format="yyyy-MM-dd hh:mm"/></td>
					<td><s:property value="site"/></td>
					<td><s:if test='status==0'><span class="text-success">已预约</span></s:if>
						<s:elseif test='status==1'><span class="text-info">已参加</span></s:elseif>
						<s:else><span class="text-inverse">已错过</span></s:else></td>
				</tr>
  			</s:iterator>
		</table>
    </div>
</body>
</html>