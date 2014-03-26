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
<body class="body-singnin" style="padding-top: 60px; padding-bottom: 40px;">
	<div class="navbar navbar-inverse navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container">
          <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="brand" href="/TKin/user/welcome.jsp">天健</a>
          
          <div class="nav-collapse collapse">

            <ul class="nav">
              <li><a href='<s:url action="user/showUserInfo" />'> 查看个人信息</a></li>
			  <li><a href='<s:url action="user/showActivityForUser" />'>查看所有活动</a></li>
			  <li><a href='<s:url action="user/showActivityRecord" />'>查看活动记录</a></li>
			  <li class="active"><a href='<s:url action="user/showPayment" />'>查看支付记录</a></li>
            </ul>
			
          	<a class="btn btn-primary pull-right" href='<s:url action="logout"/>'> 注销</a>

          </div>
        </div>
      </div>
    </div>
    
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