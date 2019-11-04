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
		String setId= (String) request.getAttribute("id");
		String setFName= (String) request.getAttribute("setFname");
		String setLName = (String) request.getAttribute("setLname");
		String setPhoneNo = (String) request.getAttribute("setPhoneno");
		String setEmailId = (String) request.getAttribute("setEmailid");
		
		if (validate == null) {
			validate = "";
		}
		if (setFName == null) {
			setFName = "";
		}
		if (setLName == null) {
			setLName = "";
		}
		if (setPhoneNo == null) {
			setPhoneNo = "";
		}
		if (setEmailId == null) {
			setEmailId = "";
		}
	%>
<form method="POST" action="edit?id=<%=setId %>">
		<div align="center">
		<br>
		<span>Id:  <%=setId %> </span>
			<span>First Name: <input type="text" name="fname" value="<%=setFName%>"></span> <br>
			<span>Last Name: <input type="text" name="lname" value="<%=setLName%>"></span> <br>
			<span>Phone No: <input type="text" name="phoneno" value="<%=setPhoneNo%>"></span> <br>
			<span>Email Id:<input type="text" name="emailid" value="<%=setEmailId%>"></span><br>
			<label style="color: red"><%=validate%> </label> <br>
			<input type="submit" value="Update" >
		</div>
	</form>



</body>
</html>