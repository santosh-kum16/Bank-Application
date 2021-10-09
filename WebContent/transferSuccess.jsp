<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2> <%=session.getAttribute("balance") %> has been  transfered to <%= session.getAttribute("racn") %> account number.. </h2>
</body>
</html>