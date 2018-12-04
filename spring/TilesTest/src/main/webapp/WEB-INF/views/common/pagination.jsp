<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<ul class="pagination pagination-circle pg-green- justify-content-center" style="margin:20px 0">
		<c:if test="${page!=1}">
			<li class="page-item"><a class="page-link" href="?page=${page-1 }">
				<i class="fas fa-angle-double-left"></i></a></li>
		</c:if>
		
		<c:forEach var="cnt" begin="1" end="${totalPage }"> 
			<li class="page-item active= <c:if test ="${page==cnt}">active</c:if>" >
				<a class="page-link" href="?page=${cnt }">${cnt }</a>
			</li>
		</c:forEach>
		
		<c:if test="${page!=totalPage }">
			<li class="page-item"><a class="page-link" href="?page=${page+1 }">
				<i class="fas fa-angle-double-right"></i></a>
			</li>
		</c:if>
	</ul>