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
	String name1=new String("정우성");
	String name2=new String("정우성");
	String name3=new String("최자바");
	
	request.setAttribute("name1", name1);
	request.setAttribute("name2", name2);
	request.setAttribute("name3", name3 );
%>
${name1 } / ${name2 } / ${name3}<br>
${name1 == name2} / ${name1 == name3 } 
</body>
</html>