<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Change Password Page</title>
</head>
<body>
<h2>New Password and Confirm password did not match! Please try Again </h2><br>
<form action="ChangePwd.jsp">
<table>
	<tr>
		<td>New Password:</td>
		<td><input type="text" name="npd" placeholder="Fill the require data" required/></td>
	</tr>
	
	<tr>
		<td>Confirm new Password:</td>
		<td><input type="password" name="cnpd" placeholder="Fill the require data" required/></td>
	</tr>
	
	<tr>
		<td></td>
		<td><input type="submit" value="Change"/></td>
	</tr>


</table>
</form>


</body>
</html>