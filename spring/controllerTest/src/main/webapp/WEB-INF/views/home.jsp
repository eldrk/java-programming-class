<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello world!</h1>
	
	<p>
		<c:if test="${empty USER }">
			<a href="account/login">로그인</a>
			<a href="account/join">회원가입</a>
		</c:if>
		<c:if test="${not empty USER }">
		${USER.userId }
		<a href="account/logout">로그아웃</a>
		</c:if>
	</p>
	
	<ul>
		<li><a href="mdb">MDBootstrap</a></li>
		<li><a href="home2">Home2</a></li>
		<li><a href="test/test">Test</a></li>
		<li><a href="hello">Hello</a></li>
		<li><a href="board/write">게시글작성</a></li>
		<li><a href="board/search">Search</a></li>
	</ul>
</body>
</html>