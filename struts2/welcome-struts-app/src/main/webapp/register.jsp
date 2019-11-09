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
	<h2>Hello from register</h2>

	<s:form action="register" namespace="/">
		<s:textfield name="name" label="Name" />
		<s:textfield name="email" label="EmailId" />
		<s:textfield name="phoneNo" label="Phone No." />
		<s:submit value="Register" />
	</s:form>

	<h2>
		<s:property value="name" /><br>
		<s:property value="email" /><br>
		<s:property value="phoneNo" /><br>
	</h2>

</body>
</html>