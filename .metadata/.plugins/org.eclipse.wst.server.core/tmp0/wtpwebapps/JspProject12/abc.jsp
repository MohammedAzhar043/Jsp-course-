<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fun" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:set var="str" value="Mohammed Azhar Mansoori"></c:set>
Length : ${fun:length(str)}
<br>
Uppercase: ${fun:toUpperCase(str)}
<br>
contains: ${fun:contains(str,"azhar") }
<br>
containsIgnoreCase: ${fun:containsIgnoreCase(str,"azhar") }
<br>
Lowercase: ${fun:toLowerCase((str))}
<br>

<c:forEach items="${fun:split(str,' ')}" var="s">
		<br>
		${s}
		<br>
</c:forEach>


<c:set var="name" value="                My name is mohammed Azhar mansoori              "></c:set>
removing spaces : ${fun:trim((str))}



</body>
</html>