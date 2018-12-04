<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Cookie cookie = new Cookie("id","");
	cookie.setMaxAge(0);
	response.addCookie(cookie);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <h3>id 쿠키가 삭제되었습니다.</h3>
 <a href="get_cookies.jsp">쿠키확인</a>
</body>
</html>