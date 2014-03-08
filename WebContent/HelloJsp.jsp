<%-- http://localhost:8080/HelloWorld/HelloJsp.jsp?x=1&y=2&z=x*y --%>
<html>
<head>
<title>Hello World</title>
</head>
<body>
	<%@ page import="java.util.*" %>
	<%
		out.print("<p><b>Hello JSP World!</b></p>");
		Enumeration foo = request.getParameterNames();
		while (foo.hasMoreElements()) {
			String elementString = foo.nextElement().toString();
			out.print(elementString + "=" + request.getParameter(elementString) + "</br>"); 
		}
	%>
</body>
</html>