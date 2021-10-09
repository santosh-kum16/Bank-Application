<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Loan Information Detail Page</title>
</head>
<body>
<form action="ApproveLoan">
<table>
	<tr>
		<td>First Name:</td>
		<td><input type="text" name="first_name" placeholder="Fill the require data" required/></td>
	</tr>
	
	<tr>
		<td>Last Name:</td>
		<td><input type="text" name="last_name" placeholder="Fill the require data" required/></td>
	</tr>
	
	<tr>
		<td>Occupation:</td>
		<td><input type="text" name="occupation" placeholder="ex- Employee,Student,Farmer etc." required/></td>
	</tr>
	
	<tr>
		<td>Types of Loan:</td>
		<td><input type="text" name="loan_type" placeholder="Home,Car,Personal loan " required/></td>
	</tr>
	
	<tr>
		<td>Account Number:</td>
		<td><input type="text" name="accno" placeholder="Fill the require data" required/></td>
	</tr>
	
	<tr>
		<td>Salary:</td>
		<td><input type="text" name="salary" placeholder="Fill the require data" required/></td>
	</tr>
	
	<tr>
		<td>Loan Amount:</td>
		<td><input type="text" name="loan_amount" placeholder="Fill the require data" required/></td>
	</tr>
	
	<tr>
		<td>Time in Year:</td>
		<td><input type="text" name="time_duration" placeholder="Fill the require data" required/></td>
	</tr>
	
	<tr>
		<td>Interest Rate:</td>
		<td><input type="text" name="interest" placeholder="Fill the require data" required/></td>
	</tr>
	
	
	<tr>
		<td></td>
		<td><input type="submit" value="Submit"/></td>
	</tr>
	


</table>
</form>

</body>
</html>