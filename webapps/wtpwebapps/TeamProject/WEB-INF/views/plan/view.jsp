<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib tagdir="/WEB-INF/tags/util" prefix="iot"%>
<script>
	$(function() {
		$(".delete-btn").click(function(e) {
			e.preventDefault();
			var result = confirm('게시물을 삭제할까요?');
			if (result) {
				location = $(this).attr('href');
			}
		})
	});
</script>
<div class="container">
	<iot:page-header icon="torah" title="여행계획 상세보기" />
	
	<div class="row">
		<div class="col-md-2">작성일</div>
		<div class="col-md-10">
			<fmt:formatDate value="${plan.regDate}" pattern="yyyy-MM-dd" />
		</div>
	</div>

	<div class="row">
		<div class="col-md-2">수정일</div>
		<div class="col-md-10">
			<fmt:formatDate value="${plan.updateDate}" pattern="yyyy-MM-dd" />
		</div>
	</div>
	<div>
		<div>내용</div>
		<hr>
		<div>${plan.content}</div>
	</div>

	<div class="text-center">
		<a href="../list/${USER.userId}" class="mr-4"> <i
			class="fas fa-undo mr-2"></i>돌아가기
		</a> <a href="../edit/${plan.planId}" class="mr-4"> <i
			class="fas fa-edit mr-2"></i> 수정
		</a> <a href="../delete/${plan.planId}" id="delete-btn"
			class="mr-4 delete-btn"> <i class="fas fa-trash mr-2"></i> 삭제
		</a>
	</div>

</div>