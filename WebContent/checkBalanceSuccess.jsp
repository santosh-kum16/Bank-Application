<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Balance Success</title>
</head>
<body>
<h1>Dear Customer,</h1>
<h2>Your balance is</h2><%=session.getAttribute("balance") %>

</body>
</html>