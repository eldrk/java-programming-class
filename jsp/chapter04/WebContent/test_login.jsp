<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.net.URLEncoder" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String id = "멍충이";
	String pwd = "1234";
	String name="바보";
	
	if(id.equals(request.getParameter("id")) &&
	   pwd.equals(request.getParameter("pwd"))){
		response.sendRedirect("main.jsp?name="+name);
	   //URLEncoder.encode(name,"UTF-8"));
	}
	else{
		response.sendRedirect("login_form.jsp");
	}
%>
</body>
</html>