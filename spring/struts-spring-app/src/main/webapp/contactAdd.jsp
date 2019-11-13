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
	<center> <s:form action="contactAdd" namespace="/">
		<s:textfield name="name" label="Name" />
		<s:textfield name="emailId" label="EmailId" />
		<s:textfield name="phoneNo" label="Phone No." />
		<center><s:submit value="Add" /></center>
	</s:form> </center>
</body>
</html>