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
	out.print("<table><tr><th>Id</th><th>Name</th><th>Cgpa</th></tr>");
		List<Student> students = (List) request.getAttribute("students");
		for (Student s : students) {
			out.println("<tr><td>"+s.getId()+"</td><td> " + s.getName()+"</td><td> " + s.getCgpa()+"</td><td>"+" <a href='edit?id="+s.getId() +"'>Edit</a></th></tr>");
		}
	out.print("</table");
	%>

</body>
</html>