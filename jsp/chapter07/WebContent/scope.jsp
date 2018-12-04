<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	pageContext.setAttribute("name","page man");
	request.setAttribute("name", "request man");
	session.setAttribute("name","session man");
	application.setAttribute("name","application man");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

name : ${name } <hr>
page속성 : ${pageScope.name}<br>
request속성 : ${requestScope.name }<br>
session속성: ${sessionScope.name }<br>
application속성:${applicationScope.name }<br>

</body>
</html>