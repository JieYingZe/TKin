<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Club Statistics Page</title>

	<link href="../css/all.css" rel="stylesheet">

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
		<div id="peopleDaily"></div>
		<div class="hide" id="peopleDailyDataInfo">
			[<s:iterator value="clubStatistics.peopleCountDaily">
				[Date.UTC(<s:property value="key" />), <s:property value="value" />],
			</s:iterator>]
		</div>
		<div id="peopleMonthly"></div>
		<div class="hide" id="peopleMonthlyDataInfo">
			[<s:iterator value="clubStatistics.peopleCountMonthly">
				[Date.UTC(<s:property value="key" />), <s:property value="value" />],
			</s:iterator>]
		</div>
		<div id="site"></div>
		<div class="hide" id="siteCategoriesInfo">
			[<s:iterator value="clubStatistics.siteCount">
				'<s:property value="key" />',
			</s:iterator>]
		</div>
		<div class="hide" id="siteDataInfo">
			[<s:iterator value="clubStatistics.siteCount">
				<s:property value="value" />,
			</s:iterator>]
		</div>
		
		<div id="coach"></div>
		<div class="hide" id="coachCategoriesInfo">
			[<s:iterator value="clubStatistics.coachCount">
				'<s:property value="key" />',
			</s:iterator>]
		</div>
		<div class="hide" id="coachDataInfo">
			[<s:iterator value="clubStatistics.coachCount">
				<s:property value="value" />,
			</s:iterator>]
		</div>

    </div>
    <script type="text/javascript" src="../js/jquery-1.8.3.min.js"></script>
	<script src="../js/highcharts.js"></script>
	<script src="../js/data.js"></script>
	<script src="../js/drilldown.js"></script>
	<script src="../js/exporting.js"></script>
	<script src="../js/club-statistics.js"></script>
</body>
</html>