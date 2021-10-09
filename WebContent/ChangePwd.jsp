<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Change Password Page</title>
</head>
<body>
<form action="ChangePwd">
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