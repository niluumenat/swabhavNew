<%@page import="com.techlabs.model.BankingTransaction"%>
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
	<div>
		<span> Click here to download passbook</span>
		<h1>
			<a href='download'>Download</a>
		</h1>
	</div>
	<%
		String userName = (String) session.getAttribute("userName");
		if (userName != null) {
			out.print("<button> <a href='logout'>LogOut</a></button>");
		}
		List<BankingMaster> master = (List<BankingMaster>) request.getAttribute("master");

		for (BankingMaster m : master) {
			out.println("<span text-align='left'><h2>Account holder's Name: " + m.getName() + "  Account Balance: "
					+ m.getBalance() + "</h2></span> ");
		}

		out.print("<table border=1px style=width:900px, align=center><tr><th>Name</th>"
				+ "<th>Amount</th><th>Type</th><th>Date</th></tr>");

		List<BankingTransaction> transaction = (List<BankingTransaction>) request.getAttribute("transaction");
		for (BankingTransaction t1 : transaction) {
			out.println("<tr><td>" + t1.getName() + "</td><td>" + t1.getAmount() + "</td><td> " + t1.getType()
					+ "</td><td> " + t1.getDate() + "</td></tr>");
		}
		out.print("</table");
	%>
</body>
</html>