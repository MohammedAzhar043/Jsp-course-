<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
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

	<!--  	<c:out value="${students}" /> 
		<c:forEach items="${students}" var="s">
			<c:out value="${s}" />
		</c:forEach>		
		-->
	<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/mohammed" user="root" password="root"></sql:setDataSource>
	<sql:query var="rs" dataSource="${db}"> select * from class</sql:query>
	<c:forEach items="${rs.rows}" var="s">
		<c:out value="${s}"></c:out>
	</c:forEach>



</body>
</html>