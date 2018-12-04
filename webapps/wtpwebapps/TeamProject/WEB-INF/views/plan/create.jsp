<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib tagdir="/WEB-INF/tags/util" prefix="iot"%>

<script
	src="${context}/resources/bower_components/tinymce/tinymce.min.js"></script>

<script>
	$(function() {
		tinymce.init({
			selector : 'textarea',
			height : "300"
		});
	})
</script>
<div class="container">
	<div class="my-5">
		<iot:page-header icon="torah" title=" 여행계획 작성" />
	</div>
	<form:form commandName="plan" enctype="multipart/form-data">
		<input type="hidden" name="userId" value="${USER.userId}" />
		<div class="md-form">
			<label>제목</label>
			<form:input path="title" class="form-control" />
			<form:errors path="title" cssClass="error" />
		</div>

		<div class="md-form">
			<label>작성자</label>
			<form:input path="writer" class="form-control" />
			<form:errors path="writer" cssClass="error" />
		</div>

		<form:textarea path="content" />

		<div class="text-center mt-3">
			<button type="submit" class="btn btn-primary btn-md">
				<i class="fa fa-check mr-2"></i> 확인
			</button>
			<a href="list/${USER.userId}" class="btn btn-primary btn-md"> <i
				class="fa fa-undo mr-2"></i> 돌아가기
			</a>
		</div>
	</form:form>
</div>




