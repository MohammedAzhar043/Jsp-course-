<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	String first_name = request.getParameter("first_name");
	String last_name = request.getParameter("last_name");
	int age = Integer.parseInt(request.getParameter("age"));
	String dob = request.getParameter("date");	
	out.println("My first name  is " + first_name + " and my last name is "+ last_name + " and my age is "+age +" and my dob is "+dob );
	
%>
</body>
</html>