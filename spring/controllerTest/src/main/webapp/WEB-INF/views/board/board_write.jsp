<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:set var="context" value="${pageContext.request.contextPath }" scope="request"/>
<link rel="stylesheet" href="${context }/resources/css/main.css"/>
</head>
<body>

<jsp:include page="keywords.jsp"/>
	<form:form commandName="board">

		<p>제목 : <form:input path="title"/></p>
		<form:errors path="title" element="div" cssClass="error"/>
		
		<p>작성자 :<form:input path="writer"/></p>
		<form:errors path="writer" element="div" cssClass="error"/>
		
		<p>내용 : </p>
		<form:textarea path="content" />
		<form:errors path="content" element="div" cssClass="error"/>
		<p><input type="submit"></p>


	</form:form>

</body>
</html>