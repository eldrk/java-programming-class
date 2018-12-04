<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:url value="images/pic.jpg" var="data"></c:url>
		<h3>${data}</h3>
		<img src="${data }" width='150' height='150'>
	
	<img src='<c:url value="images/pic.jpg" />' width='150' height='150'>
	
	<c:url value="idcheck" var="link">
		<c:param name="id">hong</c:param>
		<c:param name="name">홍길동</c:param>
	</c:url>
	<h3>
	${link}
	</h3>
	<a href="${link }">홍길동</a>
</body>
</html>