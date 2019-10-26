<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Students</title>
</head>
<body>
<%
 	String validate = (String) request.getAttribute("validate");
	String setName = (String)request.getAttribute("setName");
	String setCgpa = (String)request.getAttribute("setCgpa");
 	if (validate==null) {
 		validate="";
 	}
 	if(setName ==null){
 		setName="";
 	}
 	if(setCgpa ==null){
 		setCgpa="";
 	}
 	
 %>
	<form method="POST" action="add">
		<div align="center">
			<span>Name: <input type="text" name="name1" value="<%=setName %>"></span> <br>
			<span>CGPA: <input type="text" name="cgpa" value="<%=setCgpa %>"></span><br>
			
			<label style="color: red"><%=validate %> </label>  <br>
			<input type="submit" value="Add">
		</div>
	</form>
</body>
</html>