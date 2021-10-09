<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  <%@ page import="java.util.*" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Statement Success Page</title>
</head>
<body>
<h1>Your transactions are:</h1></br>
<h2>Money Credited:</h2>
<ol>
<%
ArrayList<Integer> arrayList = (ArrayList<Integer>)session.getAttribute("arrayList");
for(Integer x : arrayList)
{
	if(x>0)
		out.println("<li>"+x+"</li>");
}
%>
</ol>
</br></br>

<h2>Money Debited:</h2>
<ol>
<%
arrayList = (ArrayList<Integer>)session.getAttribute("arrayList");
for(Integer x : arrayList)
{
	if(x<0)
		out.println("<li>"+x+"</li>");
}
%>
</ol>

</body>
</html>