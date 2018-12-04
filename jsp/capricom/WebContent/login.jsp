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
<c:set var="context"  value="${pageContext.request.contextPath}" scope="request"/>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.2.0/css/all.css" integrity="sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ" crossorigin="anonymous">
<link rel="stylesheet" href="bower_components/bootstrap/dist/css/bootstrap.min.css">
<link rel="stylesheet" href="css/main.css">

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
	<h1 class="ml-5 my-4"><i class="fas fa-sign-in-alt"></i>로그인</h1>
	
	<h4 class="text-center my-3">${message }</h4>
	
	<div class="w-25 mx-auto">
		<form method="post">
			<input type="hidden" name="destination" value="${destination }">
			<p>사용자 ID :
				<input type="text" name="userId" value="${userId }"
					required placeholder="ID를 입력하세요">
			</p>
			
			<p>비밀번호 : 	
				<input type="password" name="password"
				required placeholder="비밀번호를 입력하세요">
			</p>
			<p class="error">${error }</p>
			<p>	
				<button type="submit" class="btn btn-parimary">
					<i class = "fas fa-check"></i>로그인
				</button>
				<button type="reset" class="btn btn-success">
					<i class = "fas fa-undo"></i>취소
				</button>
			</p>
		</form>
	</div>
	
	<jsp:include page="/common/footer.jsp"/>
</div>
</body>
</html>