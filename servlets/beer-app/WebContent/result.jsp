<%@ page language="java" contentType="text/html;" import="java.util.*" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<body>
<h1 align="center">Beer Recommendations JSP</h1>
<% 
List styles = (List)request.getAttribute("styles");
Iterator it = styles.iterator();
while (it.hasNext()) {
	out.print("<br>try: " + it.next());
}
%>

</body>
</html>