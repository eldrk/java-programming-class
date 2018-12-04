<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<script>
$(function(){
	$('.delete-btn').click(function(e){
		e.preventDefault();
		var result=confirm('${member.userId}회원을 정말 삭제할까요?');
		if(result){
			location = $(this).attr('href');
		}
	})
})
</script>

<h1 class="my-5">게시글 보기</h1>
<p>제목 : ${board.title }</p>
<p>작성자 : ${board.writer }</p>
<p>작성일 : <fmt:formatDate value="${board.regDate}" pattern="yyyy-MM-dd"/> </p>
<p>내용 : </p>
<div>${board.content }</div>

<div class="text-center">
		<a href="javascript:history.back()" class="btn btn-dark-green">
			<i class="far fa-list-alt"></i>목록</a>
	<%-- <c:if test="${USER.userId == board.writer }"> --%>
	<c:if test="${not empty USER}">
		<a href="update?id=1234" class="btn btn-dark-green">
			<i class="fas fa-pencil-alt"></i>수정</a>
		<a href="delete?id=1234" class="delete-btn btn btn-dark-green">
			<i class="fas fa-eraser"></i>삭제</a>
	</c:if>
</div>
