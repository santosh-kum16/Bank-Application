<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>Transfer Page</title>
</head>
<body>
<h2>Minimum amount should be Re. 01</h2>
<form action="Transfer">
<table>
	<tr>
		<td>Receiver Account Number :</td>
		<td><input type="text" name="racn" placeholder="Fill the require data" required/></td>
	</tr>
	
	<tr>
		<td>Amount :</td>
		<td><input type="text" name="amt" placeholder="Fill the require data" required/></td>
	</tr>
	
	<tr>
		<td></td>
		<td><input type="submit" value="Transfer"/></td>
	</tr>


</table>
</form>
</body>
</html>