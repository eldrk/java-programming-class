<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Capricorn</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<c:set var="context" value="${pageContext.request.contextPath}" scope="request"/>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.2.0/css/all.css" integrity="sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ" crossorigin="anonymous">
<link rel="stylesheet" href="${context}/bower_components/bootstrap/dist/css/bootstrap.min.css">
<link rel="stylesheet" href="${context}/css/main.css">

<script src="${context}/bower_components/jquery/dist/jquery.min.js"></script>
<script src="${context}/bower_components/popper.js/dist/umd/popper.min.js"></script>
<script src="${context}/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
<script src="${context}/js/common.js"></script>
<script>
$(function(){
	
});
</script>
</head>
<body>
<div class ="container">
	<jsp:include page="/common/header.jsp"/>
	<jsp:include page="/common/menu.jsp"/>
	<br>
	<br>
	<h1><i class="fas fa-users"></i>회원목록</h1>
	<div class="text-right">전체 : ${total }명</div>
	<br>
	<br>
	<table class="table table-striped">
		<thead>
			<tr>
				<th>#</th>
				<th>ID</th>
				<th>이름</th>
				<th>전화번호</th>
				<th>email</th>
				<th>등록일</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="item" items="${list}" varStatus="status">
				<fmt:formatDate var="regDate" value="${item.regDate}" 
								pattern="yyyy-MM-dd"/>
				<tr>
					<td>${total - item.seq +1 }</td>
					<td>
						<a href="view?userId=${item.userId }">${item.userId}</a>
						<c:if test="${today ==regDate }">
							<span class="badge badge-pill badge-danger">
								<i class="fas fa-tag"></i>New</span>
						</c:if>
					</td>
					<td>${item.name }</td>
					<td>${item.phoneNumber}</td>
					<td>${item.email }</td>
					<td>${regDate }</td>
				</tr>
			</c:forEach>
	</table>
	
	<jsp:include page="/common/pagination.jsp"/>
	
	<jsp:include page="/common/footer.jsp"/>
</div>
</body>
</html>