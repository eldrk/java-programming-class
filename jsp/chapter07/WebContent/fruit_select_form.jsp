<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="fruit_select.jsp">
	<label for="fruit">과일을 선택하세요</label><br>
	<select id="fruit" name="fruit">
		<option value="1">사과</option>
		<option value="2">포도</option>
		<option value="3">메론</option>
	</select>
	<input type="submit" value="전송">
</form>
</body>
</html>