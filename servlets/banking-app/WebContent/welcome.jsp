<%@page import="com.techlabs.model.BankingMaster"%>
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
	<%
		List<BankingMaster> master = (List<BankingMaster>) request.getAttribute("master");

		for (BankingMaster m : master) {

			out.println("<span text-align='left'><h2>Account holder's Name: " + m.getName() + "  Account Balance: "
					+ m.getBalance() + "</h2></span> ");
			out.println("<br><h2><a href='transaction?userName=" + m.getName()
					+ "'>Transaction</a> <span> </span><a href='passbook?userName=" + m.getName() + "'>Passbook</a><h2>");
		}
	%>



</body>
</html>