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
<body style="padding-top: 60px; padding-bottom: 40px;">
	<div class="navbar navbar-inverse navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container">
          <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="brand" href="/TKin/waiter/welcome.jsp">天健</a>
          
          <div class="nav-collapse collapse">

            <ul class="nav">
              <li><a href='activitynew.jsp'> 新建活动</a></li>
			  <li><a href='<s:url action="waiter/showActivityForWaiter" />'>查看所有活动</a></li>
			  <li class="active"><a href='<s:url action="waiter/showUser" />'>查看所有用户</a></li>
            </ul>
			
          	<a class="btn btn-primary pull-right" href='<s:url action="logout"/>'> 注销</a>

          </div>
        </div>
      </div>
    </div>
    
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
      			<th>操作</th>
    		</tr>
			<s:iterator value="userList">
				<tr >
					<td><s:property value="cardNo"/></td>
					<td><s:if test='type==0'>会员卡</s:if><s:else>家庭卡</s:else></td>
					<td><s:property value="username"/></td>
					<td><s:if test='gender==1'>男</s:if><s:else>女</s:else></td>
					<td><s:property value="age"/></td>
					<td><s:property value="address"/></td>
					<td><s:if test='qualifications==0'>未激活</s:if>
						<s:elseif test='qualifications=1'>正常</s:elseif>
						<s:elseif test='qualifications=2'>暂停</s:elseif>
						<s:else>停止</s:else>
					</td>
					<td>
					<s:form action="./showUserManage" style="margin:0px">
						<s:hidden name="userId"></s:hidden>
						<input type="submit"  value="管理用户" class="btn btn-info">
					</s:form>
					</td>
				</tr>
  			</s:iterator>
		</table>
		
    </div>
</body>
</html>