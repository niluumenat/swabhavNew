<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="font-size: 30px;">

	<s:form action="login" namespace="/">
		<s:textfield name="userName" label="Name"></s:textfield>
		<s:password name="userPassword" label="Password"></s:password>
		<s:submit value="Login"></s:submit>
	</s:form>

</body>
</html>