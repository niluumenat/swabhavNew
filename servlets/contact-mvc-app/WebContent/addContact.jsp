<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String validate = (String) request.getAttribute("validate");
		String setFirstName = (String) request.getAttribute("setFirstName");
		String setLastName = (String) request.getAttribute("setLastName");
		String setPhoneNo = (String) request.getAttribute("setPhoneNo");
		String setEmailId = (String) request.getAttribute("setEmailId");

		if (validate == null) {
			validate = "";
		}
		if (setFirstName == null) {
			setFirstName = "";
		}
		if (setLastName == null) {
			setLastName = "";
		}
		if (setPhoneNo == null) {
			setPhoneNo = "";
		}
		if (setEmailId == null) {
			setEmailId = "";
		}
	%>
	<form method="post" action="addContact">
		<div align="center">
			First Name: <input type="text" name="firstname"
				value="<%=setFirstName%>"><br> Last Name: <input
				type="text" name="lastname" value="<%=setLastName%>"><br>
			Phone Number: <input type="text" name="phoneno"
				value="<%=setPhoneNo%>"><br> Email Id: <input
				type="text" name="emailid" value="<%=setEmailId%>"><br>
			<br> <label style="color: red"><%=validate%> </label> <br>
			<input type="submit" value="Add Contacts">
		</div>
	</form>
	
	

</body>
</html>