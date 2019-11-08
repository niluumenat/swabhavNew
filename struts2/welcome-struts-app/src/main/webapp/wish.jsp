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
	<h2>
		<s:form action="wish.do" namespace="/">
			<s:textfield name="userName" label="Name" value="Nilam"></s:textfield>
			<s:submit value="Wish"></s:submit>

			<s:property value="message" />

		</s:form>

	</h2>
</body>
</html>