<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Register Page</title>

	<link href="../css/all.css" rel="stylesheet">
    
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
	<s:form action="updateUserInfoByWaiter" theme="bootstrap" cssClass="form-horizontal form-signin">
		<s:textfield name="user.username" label="用户名" ></s:textfield>
		<s:password  name="user.password" label="密码" showPassword="true"></s:password>
		<s:radio list="#{'1':'男','0':'女'}" listKey="key" listValue="value"
			name="user.gender" label="性别" labelposition="inline"></s:radio>
		<s:textfield type="number" min="1" max="128"  name="user.age" label="年龄"  />
		<s:if test='family!=null'>
		<s:textfield type="number" min="0" max="20" name="family.numOfChildren" label="孩子个数"  />		
		</s:if>
		<s:select
                        label="地址"
                        list="{'玄武区', '秦淮区', '鼓楼区', '建邺区', '雨花台区', '浦口区', '六合区', '栖霞区', '江宁区', '溧水区', '高淳区', '非南京地区'}"
                        name="user.address"
                        headerKey="None" headerValue="请选择您的地址" />
        <s:hidden name="user.userId"></s:hidden>
		<s:submit value="修改信息" cssClass="btn btn-primary btn-large"></s:submit>
	</s:form>
	
		<table class="table table-striped table-bordered">
		    <tr>
      			<th>活动名称</th>
      			<th>教练</th>
      			<th>起始时间</th>
      			<th>结束时间</th>
      			<th>地点</th>
      			<th>状态</th>
      			<th>操作</th>
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
					<td>
						<s:form action="participateActivity" style="margin:0px">
						<s:hidden name="userId"></s:hidden>
						<s:hidden name="activityId"></s:hidden>
						<input type="submit"  value="已参加" class="btn btn-success">
						</s:form>
						<s:form action="missActivity" style="margin:0px">
						<s:hidden name="userId"></s:hidden>
						<s:hidden name="activityId"></s:hidden>
						<input type="submit"  value="已错过" class="btn">
						</s:form>
					</td>
				</tr>
  			</s:iterator>
		</table>
		
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