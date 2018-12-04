<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div>실시간 인기 검색어</div>
<c:forEach var="keyword" items="${keywords }">
	${keyword }
</c:forEach>