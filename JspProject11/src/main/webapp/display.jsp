<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- 	jstl - jsp standard tag library -->
<%-- 	<%
	String name = request.getAttribute("lable").toString();
	out.println(name);
	%> --%>
	<!-- El = expression language -->
<%-- 	${lable} --%>
	
 	<c:out value="${lable}"/> 
</body>
</html>