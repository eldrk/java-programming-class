<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:set var="context" value="${pageContext.request.contextPath }" scope="request"/>
<link rel="stylesheet" href="${context }/resources/css/main.css"/>
</head>
<body>

<form:form commandName="member">
	<p>사용자 ID <form:input path="userId"/></p>
	<form:errors path="userId" element="div" cssClass="error"/>
	
	<p>비밀번호 <form:password path="password"/>
	<form:errors path="password" element="div" cssClass="error"/>
	
	<p>이메일 <form:input path="email"/>
	<form:errors path="email" element="div" cssClass="error"/>
	
	<%-- <p>생일 <form:input type="date" path="data"/></p> --%>
	<p>생일 <input type="text" name="date"/></p>
		
	<p><input type="submit"></p>
</form:form>
	
</body>
</html>