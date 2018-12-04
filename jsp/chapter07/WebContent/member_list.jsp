<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>회원목록</h1>
<hr>
		${today }
	회원수 : 총${list.size()}명
	<table border="1" style="width:100%; text-align:center;">
		<tr>
			<th>#</th>
			<th>사용자</th>
			<th>이름</th>
			<th>등록일</th>
		</tr>
		
		<c:forEach var="item" items="${list}" varStatus="status">
			<fmt:formatDate var="regDate" value="${item.regDate}"
							pattern="yyyy-MM-dd"/>
			<tr>
				<td>${status.index+1 }</td>
				<td>
					<c:if test="${today == regDate}">[New]</c:if>
					${item.userid }
				</td>
				<td>${item.name }</td>
				<td>${regDate }</td>
			</tr>
		</c:forEach>
		
	</table>
</body>
</html>