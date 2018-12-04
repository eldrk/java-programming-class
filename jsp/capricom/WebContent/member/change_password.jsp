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
	$('form').submit(function(e){
		e.preventDefault();
		
		//	비밀번호 확인.
		var password=$('[name=newPassword]').val();
		var password2=$('[name=pwdCheck]').val();
		if(password!=password2){
			alert('비밀번호가 일치하지 않습니다.');
			$('[name=password]').focus();
			return;
		}
		this.submit();
		
	});
});
</script>
</head>
<body>
<div class ="container">
	<jsp:include page="/common/header.jsp"/>
	<jsp:include page="/common/menu.jsp"/>
	<br>
	<br>
	<h1><i class="fas fa-user-lock"></i>비밀번호변경</h1>
	
	<form method="post">
	
		<input type = "hidden" name="userId" value="${member.userId }">
		<input type = "hidden" name="name" value="${member.name }">

			<p> 아이디 : ${USER.userId}</p>
		
			<p> 이름 : ${USER.name }</p>
		
		
			<p>
				비 밀 번 호 : <input type="password" name="oldPassword" value="" required
					placeholder="비밀번호를 입력하세요." />
			</p>
			<p>
				비 밀 번 호 : <input type="password" name="newPassword" value="" required
					placeholder="변경할 비밀번호를 입력하세요." />
			</p>
			<p>
				비밀번호 확인 : <input type="password" name="pwdCheck" required
					placeholder="재입력하세요." />
			</p>
			
			<p class = "error">${error }</p>
			
			<p>
				<button type= "submit" class="btn btn-primary">
					<i class="fas fa-check"></i>확인</button>
				<button type = "reset" class="btn btn-primary">
					<i class="fas fa-undo-alt"></i>취소</button>
			</p>
	
	</form>
	
	<jsp:include page="/common/footer.jsp"/>
</div>
</body>
</html>