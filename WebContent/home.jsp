<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Home Page</title>
</head>
<body>
<h2>Welcome,</h2>
<h2>
<%=session.getAttribute("name") %>
</h2>
<a href="CheckBalance">Check Balance</a><br>
<a href="ChangePwd.jsp">Change Password</a><br/>
<a href="transfer.jsp">Transfer Amount</a><br>
<a href="ApplyLoan.jsp">Apply Loan</a><br>
<a href="GetStatement">Get Statement</a><br><br>
<a href="Logout">Logout</a><br>
<a href="Credential.jsp">Forgot Password?</a>
</body>
</html>