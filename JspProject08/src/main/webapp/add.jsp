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
		int i =Integer.parseInt(request.getParameter("num1"));	
	    int j =Integer.parseInt(request.getParameter("num2"));	
	    int k = i +j;
	    out.println("The sum of " + i +" and "+j +" is "+k);
	    System.out.println("we are in jsp");
	%>
</body>
</html>