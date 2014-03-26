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
          <a class="brand" href="/TKin/user/welcome.jsp">天健</a>
          
          <div class="nav-collapse collapse">

            <ul class="nav">
              <li class="active"><a href='<s:url action="user/showUserInfo" />'> 查看个人信息</a></li>
			  <li><a href='<s:url action="user/showActivityForUser" />'>查看所有活动</a></li>
			  <li><a href='<s:url action="user/showActivityRecord" />'>查看活动记录</a></li>
			  <li><a href='<s:url action="user/showPayment" />'>查看支付记录</a></li>
            </ul>
			
          	<a class="btn btn-primary pull-right" href='<s:url action="logout"/>'> 注销</a>


          </div>
        </div>
      </div>
    </div>
    
	<div class="container"> 
	<s:form action="updateUserInfo" theme="bootstrap" cssClass="form-horizontal form-signin">
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
                        
		<s:submit value="修改信息" cssClass="btn btn-primary btn-large"></s:submit>
	</s:form>
    </div>
</body>
</html>