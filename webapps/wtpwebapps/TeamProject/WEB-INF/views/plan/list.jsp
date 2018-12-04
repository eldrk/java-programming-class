<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib tagdir="/WEB-INF/tags/util" prefix="iot"%>


<div class="container">
	<div class="my-5">
		<iot:page-header icon="torah" title=" 여행계획 목록" />
	</div>
	<div class="text-right">
		<a href="../create"><i class="fa fa-plus"></i> 추가</a>
	</div>

	<table class="table table-stripped">
		<thead>
			<tr>
				<th style="width: 10px">No</th>
				<th style="width: 100px">제목</th>
				<th style="width: 100px">작성자</th>
				<th style="width: 120px">등록일</th>

			</tr>
		</thead>
		<tbody>
			<c:forEach var="plan" items="${list}" varStatus="status">
				<fmt:formatDate var="regDate" value="${plan.regDate}"
					pattern="yyyy-MM-dd" scope="request" />
				<tr>
					<td>${status.index+1}</td>
					<td><a href="../view/${plan.planId}"> ${plan.title}</a></td>
					<td>${plan.writer}</td>
					<td>${regDate}</td>

				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>