<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Statistics Page</title>

	<link href="../css/all.css" rel="stylesheet">

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
          <a class="brand" href="/TKin/manager/welcome.jsp">天健</a>
          <div class="nav-collapse collapse">
            <ul class="nav">
              <li class="active"><a href='<s:url action="manager/showUserStatistics"/>'> 查看用户统计</a></li>
			  <li><a href='<s:url action="manager/showClubStatistics"/>'> 查看俱乐部统计</a></li>
            </ul>
          	<a class="btn btn-primary pull-right" href='<s:url action="logout"/>'> 注销</a>
          </div><!--/.nav-collapse -->
        </div>
      </div>
    </div>
    
        <div class="container">
 		<div id="age"></div>
		<div class="hide" id="ageInfo">
			[<s:iterator value="userStatistics.ageGroupCount">
				['<s:property value="key" />', <s:property value="value" />],
			</s:iterator>]
		</div>
		
		<div id="gender"></div>
		<div class="hide" id="genderInfo">
			[
				['男', <s:property value="userStatistics.maleCount" />],
				['女', <s:property value="userStatistics.femaleCount" />],
			]
		</div>

		<div id="addr"></div>
		<div class="hide" id="addrInfo">
			[<s:iterator value="userStatistics.addrCount">
				['<s:property value="key" />', <s:property value="value" />],
			</s:iterator>]
		</div>
		
		<div id="qualifications"></div>
		<div class="hide" id="qualificationsInfo">
			[<s:iterator value="userStatistics.qualificationsCount">
				['<s:property value="key" />', <s:property value="value" />],
			</s:iterator>]
		</div>
    </div>
    <script type="text/javascript" src="../js/jquery-1.8.3.min.js"></script>
	<script src="../js/highcharts.js"></script>
	<script src="../js/data.js"></script>
	<script src="../js/drilldown.js"></script>
	<script src="../js/exporting.js"></script>
	<script src="../js/user-statistics.js"></script>
</body>
</html>