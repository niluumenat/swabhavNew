<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
form {
	margin: 0 auto;
	width: 250px;
	padding: 30%;
	background-color: skyblue;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Transaction</title>
</head>
<body>
<%
String userName = (String) session.getAttribute("userName");
if (userName != null) {
	out.print("<button> <a href='logout'>LogOut</a></button>");
}
%>

<form name="TransactionForm" action="transaction" method="POST">

		Amount: <input type="text" name="amount"><br> 
		Deposit:<input type="radio" name="type" onclick = \"getAnswer('deposit') value="deposit"> 
		Withdraw: <input type="radio" name="type" onclick = \"getAnswer('withdraw') value="withdraw"><br>
		
		<input type="submit" value="Save" >
	</form>

</body>
</html>