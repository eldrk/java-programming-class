<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<h1 class="my-5">
	<i class="fas-fa-list-ol"></i>게시글 목록
</h1>

<div class="my-3 text-right">
	<c:if test="${not empty USER }">
		<a href="write"><i class="fas fa-pencil-alt"></i>글쓰기</a>
	</c:if>
	(총 : ${totalCount}건)</div>

<table class="table table-striped">
	<thead>
		<tr>
			<td>No</td>
			<td>제목</td>
			<td>작성자</td>
			<td>작성일</td>
		</tr>
	</thead>
	
	<tbody>
		<c:forEach var="board" items="${list}" varStatus="status">
			<tr>
				<td>${status.index+(page-1)*10+1 }</td>
				<td>
					<a href="view?id=${status.index+(page-1)*10+1 }">
					${board.title }</a>
				</td>
				<td>${board.writer }</td>
				<td>
					<fmt:formatDate value="${board.regDate}" pattern="yyyy-MM-dd"/>
				</td>
			</tr>
		</c:forEach>
	</tbody>
	
</table>
	<jsp:include page="/WEB-INF/views/common/pagination.jsp"/> 