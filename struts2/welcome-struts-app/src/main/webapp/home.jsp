<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello from home action page</h1>
	<h1>
	<s:iterator begin="0" end="10" >
	<s:property value="developer"/> 
	</s:iterator>
	
	</h1>
</body>
</html>