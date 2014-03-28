<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>天健健身俱乐部</title>
    <!-- Le HTML5 shim, for IE6-8 support of HTML elements -->
    <!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
    <sb:head/>

</head>

    <s:actionerror theme="bootstrap"/>
    <s:actionmessage theme="bootstrap"/>
    <s:fielderror theme="bootstrap"/>

<body style="padding-top: 60px; padding-bottom: 40px;">
	<div class="navbar navbar-inverse navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container">
          <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="brand" href="/TKin/manager/welcome.jsp">天健</a>
          <div class="nav-collapse collapse">
            <ul class="nav">
              <li><a href='<s:url action="showUserStatistics"/>'> 查看用户统计</a></li>
			  <li><a href='<s:url action="showClubStatistics"/>'> 查看俱乐部统计</a></li>
            </ul>
          	<a class="btn btn-primary pull-right" href='<s:url action="logout"/>'> 注销</a>
          </div><!--/.nav-collapse -->
        </div>
      </div>
    </div>
    
        <div class="container">
    
    		<div class="hero-unit">
        	<h1>天行健，君子以自强不息</h1>
        	<p>@伏尔泰：生命在于运动 </p>
        	<p>@泰戈尔：静止便是死亡</p>
        	<p>@希尔康：不会管理自己身体的人，就无资格管理他人；经营不好自己健康的人，又如何经营好他的事业</p>
      	</div>
 </div>
</body>
</html>