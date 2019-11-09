<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello from contactDisplay</h1>
	<h2>
		<s:iterator status="start" value="contacts">
			<s:property value="id" />
			<br>
			<s:property value="name" />
			<br>
			<s:property value="emailId" />
			<br>
			<s:property value="phoneNo" />
			<br>
		</s:iterator>
	</h2>
</body>
</html>