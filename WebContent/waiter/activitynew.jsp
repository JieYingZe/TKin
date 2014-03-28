<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New Activity Page</title>

   <link href="../css/bootstrap-datetimepicker.css" rel="stylesheet" media="screen">
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
	<s:form action="addActivity" theme="bootstrap" cssClass="form-horizontal form-signin">
		<s:textfield name="activity.activityName" label="活动名称"></s:textfield>
		<s:textfield name="activity.coach" label="教练"></s:textfield>
		<s:textfield cssClass="form_datetime" name="activity.startTime" label="起始时间"></s:textfield>
		<s:textfield cssClass="form_datetime" name="activity.endTime" label="结束时间"></s:textfield>
		<s:textfield name="activity.site" label="地点"></s:textfield>
		<s:submit value="新增活动" cssClass="btn btn-primary btn-large"></s:submit>
	</s:form>
    </div>
    
    <script type="text/javascript" src="../js/jquery-1.8.3.min.js" charset="UTF-8"></script>
	<script type="text/javascript" src="../js/bootstrap-datetimepicker.js" charset="UTF-8"></script>
	<script type="text/javascript" src="../js/bootstrap-datetimepicker.zh-CN.js" charset="UTF-8"></script>
	<script type="text/javascript">
    $('.form_datetime').datetimepicker({
        language:  'zh-CN',
        weekStart: 1,
        todayBtn:  1,
		autoclose: 1,
		todayHighlight: 1,
		startView: 2,
		forceParse: 0,
        showMeridian: 1,
        format: 'yyyy-mm-dd hh:ii:00'
    });
</script>
    
</body>
</html>