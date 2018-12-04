<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="edu.iot.chapter04.model.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>일반 사용자 모드</h1>
	<p> ID : ${USER.userID}</p>
	<p> 이름 : ${USER.name}</p>
	<p> 역할 : ${USER.loginCheck }</p>

</body>
</html>