<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="font-size: 30px;">
	<%@ taglib uri="/struts-tags" prefix="s"%>
	
		Welcome,
		<s:property value="#session.name" />
		<br> <br> <a href="logout"><button>Logout</button></a>
	
</body>
</html>