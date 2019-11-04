<%@page import="com.techlabs.model.Contact"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Click here to add new contact
	<br>
	<a href="http://localhost:8080/contact-mvc-app/addContact">Add
		Contact</a>
	<br>


	<%
		String userName = (String) session.getAttribute("userName");
		if (userName != null ) {
			out.print("<button <a href='http://localhost:8080/contact-mvc-app/Contacts'>LogOut</a></button>");
		}

		out.print(
				"<table border=1px style=width:900px, align=center><tr><th>Id</th><th>FirstName</th><th>LastName</th><th>PhoneNo</th><th>EmailId</th></tr>");
		List<Contact> contacts = (List<Contact>) request.getAttribute("contacts");

		for (Contact c : contacts) {

			out.println("<tr><td>" + c.getId() + "</td><td>" + c.getFirstname() + "</td><td> " + c.getLastName()
					+ "</td><td> " + c.getPhoneNo() + "</td><td>" + c.getEmailId() + "</td><td>"
					+ "<a href='edit?id=" + c.getId() + "'>Edit</a></td>" + "<td><a href='delete?id=" + c.getId()
					+ "'>Delete</a></td></tr>");
		}
		out.print("</table");
	%>

</body>
</html>