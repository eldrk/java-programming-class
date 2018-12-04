<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.error{color:red;}
</style>
</head>
<body>
	<form method="post">
		아이디 : <input type="text" name="userID" value="${member.userID }"><br>
		암 &nbsp; 호 : <input type="password" name="userPwd"><br>
		
		<input type="radio" name="loginCheck" value="user"
			<c:if test= "${empty manager || manager.loginCheck=='user'}">
				checked="checked"
			</c:if>	
		>사용자
		<input type="radio" name="loginCheck" value="manager"
			<c:if test= "${manager.loginCheck=='manager'}">
				checked="checked"
			</c:if>
		>관리자 <br>
		
		
		<div class="error">${error}</div>
		<input type="submit" value="로그인">
	</form>
</body>
</html>