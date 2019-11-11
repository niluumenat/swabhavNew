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
	<center>
		<a href="add">Add</a>
	</center>
	<h1>Hello from contactDisplay</h1>
	<table>
	<tr><th>Id</th>
	<th>Name</th>
	<th>EmailId</th>
	<th>Phone Number</th>
	</tr>
		<s:iterator value="contacts">
			<tr>
				<td><s:property value="id" /></td>
				<td><s:property value="name" /></td>
				<td><s:property value="emailId" /></td>
				<td><s:property value="phoneNo" /></td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>