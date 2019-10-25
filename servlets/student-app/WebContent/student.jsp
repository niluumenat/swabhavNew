<%@page import="com.techlabs.model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Data</title>
</head>
<body>
Click here to add student<br>
<a href="add.jsp">Add</a>
<br>
	<%
		List<Student> students = (List) request.getAttribute("students");
		for (Student s : students) {
			out.println(s.getId()+" " + s.getName()+" " + s.getCgpa()+"<br>");
		}
	%>

</body>
</html>