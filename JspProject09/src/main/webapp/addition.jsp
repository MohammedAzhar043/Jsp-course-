<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    errorPage="error.jsp"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- 	handling an exception in jsp , this is by using normal java concepts -->
	<%
	/* 	try{
		int a = 18/0;			
		}
	catch(Exception e ){
		out.println("error!!!" +  e );

	}
		out.println("hi"); */
		int a = 18/0;
	%>
</body>
</html>