<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Employee</title>
</head>
<body>
	<h1>Add Employee</h1>
	
	<s:form modelAttribute="employee"  action="saveEmployee" method="post">
		
		First name: <input type="text" name="firstName"/>
		Last name: <input type="text" name="lastName"/>
		email: <input type="text" name="emailId"/>
		<input type="submit" value="Submit"/>
		
	
	</s:form>
</body>
</html>