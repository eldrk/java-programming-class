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
	$('#delete-btn').click(function(){
		var result = confirm('${member.userId}회원을 삭제할까요?');
		if(result){
			location = 'delete?userId=${member.userId}';
		}
	})
});
</script>
</head>
<body>
<div class ="container">
	<jsp:include page="/common/header.jsp"/>
	<jsp:include page="/common/menu.jsp"/>
	
	
	<h1 class="my-5"><i class="fas fa-users"></i>회원 정보 보기</h1>
	<br><br>
	
	<div>
		<div class="row">
			<div class="col-md-2">아이디 : </div>
			<div class="col-md-10">${member.userId}</div>
		</div>
		
		<div class="row">
			<div class="col-md-2">이름 :</div>
			<div class="col-md-10">${member.name }</div>
		</div>
		
		<div class="row">
			<div class="col-md-2">권한 :</div>
			<div class="col-md-10">${member.userLevel }</div>
		</div>
		
		<div class="row">
			<div class="col-md-2">닉네임:</div>
			<div class="col-md-10">${member.nickName }</div>
		</div>
		
		<div class="row">
			<div class="col-md-2">전화번호:</div>
			<div class="col-md-10">${member.phoneNumber }</div>
		</div>
		
		<div class="row">
			<div class="col-md-2">이메일</div>
			<div class="col-md-10">${member.email }</div>
		</div>
		
		<div class="row">
			<div class="col-md-2">주소</div>
			<div class="col-md-10">${member.address }</div>
		</div>
		
		<div class="row">
			<div class="col-md-2">등록일</div>
			<div class="col-md-10">
				<fmt:formatDate value="${member.regDate }"/></div>
		</div>
		
		<div class="row">
			<div class="col-md-2">수정일</div>
			<div class="col-md-10">
				<fmt:formatDate value="${member.updateDate }"/></div>
		</div>
		
		
	
	<div>
		<button type="submit" class="btn btn-primary" disabled>
			<i class="fas fa-check"></i>목록
		</button>
	
		<button type="reset" class="btn btn-success" id="delete-btn">
			<i class="fas fa-undo"></i>삭제
		</button>

	</div>
	

	
	<jsp:include page="/common/footer.jsp"/>
</div>
</body>
</html>