<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
form {
	margin: 0 auto;
	width: 400px;
	padding: 30%;
	background-color: lightblue;
}

div {
	background-color: green;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body text-align="center">
<%
	String errorMsg = (String) request.getAttribute("errorMsg");
%>
	<div>
		<p>If you already have an account.. Click to following link to
			Login...</p>
		<a href="login">Login</a>
	</div>
	
	<form name="LoginForm" action="register" method="POST">

		Name: <input type="text" name="username"><br> Password:<input
			type="password" name="userpassword"><br> Re-enter
		Password: <input type="password" name="userpassword2"><br>
		Opening-balance: <input type="text" name="balance"><br>
		<p>
			<label id="errorMsg" style="color: red"><%=errorMsg%></label>
		</p>
		<br> <input type="submit" value="Register">

	</form>

</body>
</html>