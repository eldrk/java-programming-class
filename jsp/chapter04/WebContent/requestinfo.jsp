<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
컨텍스트 패스 : <%= request.getContextPath() %><br>
요청방식 : <%= request.getMethod() %><br>
요청한 URL : <%= request.getRequestURL() %><br>
요청한 URI : <%= request.getRequestURI() %><br>
서버의 이름 : <%= request.getServerName() %><br>
프로토콜 : <%= request.getProtocol() %><br>
<%
//URI에서 컨텍스트 패스를 제외한 경로 추출하기
//컨텍스트 패스 : /chapter04
//요청한 URI : /chapter04/requestinfo.jsp
String contextPath = request.getContextPath();
String uri = request.getRequestURI();
String path = uri.substring(contextPath.length());
%>
<%= path %>
</body>
</html>