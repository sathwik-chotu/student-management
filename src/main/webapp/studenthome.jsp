<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>STUDENT HOME</title>
</head>
<body>
	Welcome to :
	<%=session.getAttribute("username") %>
	<br>
	<br>

	<!-- Delete Button -->
	<a href="DeleteController?username=<%= session.getAttribute("username") %>"
		onclick="return confirm('Are you sure you want to delete this Student?');">
		Delete </a>
</body>

</html>