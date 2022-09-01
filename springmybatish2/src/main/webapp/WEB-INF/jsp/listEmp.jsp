<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List of Employees</title>
</head>
<body>
	<h1> List of Employees</h1>
	<a href="addEmployeeForm">ADD Employee</a>
	<div>
		<table border='1'>
			<tr>
				<th>ID</th>
				<th>FirstName</th>
				<th>LastName</th>
				<th>EmailId</th>
			</tr>
			
			<c:forEach items="${employeesList}" var="e">
			<tr>
				<td>${e.id}</td>
				<td>${e.firstName}</td>
				<td>${e.lastName}</td>
				<td>${e.emailId}</td>	
			</tr>
			</c:forEach>
			
		
		</table>
	</div>
</body>
</html>