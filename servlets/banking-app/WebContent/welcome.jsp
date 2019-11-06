<%@page import="org.apache.catalina.Context"%>
<%@page import="com.techlabs.listeners.SessionCounter"%>
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
	<center>
		<h1>Welcome to Dena Bank</h1>
	</center>
	Active Sessions : <%= SessionCounter.getActiveSessions() %>
	<jsp:useBean class="com.techlabs.listeners.SessionCounter"
          id="sessionCounter" scope="application" />
	<UL>
		<LI>Total number of sessions: <jsp:getProperty
				name="sessionCounter" property="totalSessionCount" />.
		<LI>Number of current sessions loggedIn : <jsp:getProperty
				name="sessionCounter" property="currentSessionCount" />.</UI>
				<br>
 <%
 	String userName = (String) session.getAttribute("userName");
 	if (userName != null) {
 		out.print("<button> <a href='logout'>LogOut</a></button>");
 	}

 	List<BankingMaster> master = (List<BankingMaster>) request.getAttribute("master");

 	for (BankingMaster m : master) {

 		out.println("<h2 align='left'>Account holder's Name: " + m.getName()
 				+ "</h2><h2 align='right'>  Account Balance: " + m.getBalance() + "</h2>");
 		out.println(
 				"<br><h2><a href='transaction'>Transaction</a> <span> </span><a href='passbook'>Passbook</a><h2>");
 	}
 %>
</body>


</html>