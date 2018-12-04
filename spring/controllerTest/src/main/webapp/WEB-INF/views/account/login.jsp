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
	<p>비밀번호 <form:input path="password"/></p>
	
	<p>로그인 타입 
		<form:select path="loginType" items="${loginTypes}"/>
	 </p>
	 <p>좋아하는 과일
	 	<form:checkboxes items="${favorites}" path="favorites"/>
	 </p>
	 
	 <form:checkbox path="agreement" label="약관에 동의합니다."/>
	 
	<div class="error">${error }</div>
	<p><input type="submit"></p>
</form:form>

</body>
</html>