<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Employee</title>
</head>
<body>
	<h1>Delete Employee</h1>
	<form action="deleteEmployee" method="post">
		Employee Id: <input type="text" name="id"/>
		<input type="submit" value="Delete">
	</form>
</body>
</html>