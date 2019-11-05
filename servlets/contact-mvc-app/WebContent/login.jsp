<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<style>
form {
	margin: 0 auto;
	width: 250px;
	padding: 30%;
	background-color: lightblue;
}

div {
	color: red;
}
</style>
	<%
		String errorMsg = (String) request.getAttribute("errorMsg");
	%>
	<form name="LoginForm" onsubmit="return validate();" action="login"
		method="POST">

		<p>
			<label id="errorMsg" style="color: red"><%=errorMsg%></label>
		</p>
		Name: <input type="text" name="username" onchange="return validate();">

		<div id="warning"></div>

		<br> Password:<input type="password" name="userpassword"
			onchange="return validate();">
		<div id="warnings"></div>
		<br> <input type="submit" value="Submit">

	</form>
</body>

</html>
<script>
	function validate() {

		var name = document.forms["LoginForm"]["username"];
		var password = document.forms["LoginForm"]["userpassword"];
		var warning1 = document.getElementById("warning");
		var warning2 = document.getElementById("warnings");
		var returnvalue;

		if (name.value == "") {

			warning1.innerHTML = "<h4>*Name required</h4>";
			name.focus();
			return false;
		} else {
			warning1.innerHTML = "";
			returnvalue = true;
		}

		if (password.value == "") {

			warning2.innerHTML = "<h4>*Password required</h4>";
			password.focus();
			return false;
		} else {
			warning2.innerHTML = "";
			returnvalue = true;
		}

		return true;

	}
</script>

