<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
form {
	margin: 0 auto;
	width: 250px;
	padding: 30%;
	background-color: lightgreen;
}

</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	
		String errorMsg = (String) request.getAttribute("errorMsg");
	%>
	<form name="LoginForm" action="login" method="POST">

		Name: <input type="text" name="username"><br> 
		Password:<input type="password" name="userpassword"><br> 
		<br>
		<p>
			<label id="errorMsg" style="color: red"><%=errorMsg%></label>
		</p>
		<input type="submit" value="Login" >
	</form>


</body>
</html>