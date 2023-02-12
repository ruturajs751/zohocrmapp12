<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ include file="menu.jsp"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title bill</title>
</head>
<body>
	<h2>Create Bill</h2>
<form action="save" method="post">
<pre>
First Name<input type="text" name="firstName" value="${lead.firstName }">
last Name<input type="text" name="lastName" value="${lead.lastName }">
Email<input type="text" name="email" value="${lead.email }">
Mobile<input type="text" name="mobile" value="${lead.Mobile }">


<input type="submit" value="save" />
</pre>
</form>
</body>
</html>