<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Payment Page</title>

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
		    	<th>支付单号</th>
      			<th>时间</th>
      			<th>金额</th>
    		</tr>
			<s:iterator value="paymentRecordList">
				<tr>
					<td><s:property value="getText('{0,number,0000000}',{paymentId})"/></td>
					<td><s:date name="time" format="yyyy-MM-dd HH:mm"/></td>
					<td><s:property value="getText('{0,number,$###,###.00}',{money})"/></td>
				</tr>
  			</s:iterator>
		</table>
    </div>
</body>
</html>