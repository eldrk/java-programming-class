<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<nav class = "navbar navbar-expand-sm bg-primary navbar-dark sticky-top">

	<!-- Toggler/collapsibe Button -->
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#collapsibleNavbar">
		<span class="navbar-toggler-icon"></span>
	</button>
	
	<!-- Navbar links -->
	<div class="collapse navbar-collapse" id="collapsibleNavbar">
		<ul class="navbar-nav mr-auto">
			<li class="nav-item"><a class="nav-link" href="${context}/index">
				<i class="fas fa-home"></i>홈</a></li>
			<li class="nav-item"><a class="nav-link" href="#">
				<i class="fas fa-thumbs-up"></i>Top100</a></li>
			<li class="nav-item"><a class="nav-link" href="#">
				<i class="fas fa-map-marked-alt"></i>권역별</a></li>
			<li class="nav-item"><a class="nav-link" href="#">
				<i class="fas fa-calendar-alt"></i>일정</a></li>
			<li class="nav-item"><a class="nav-link" href="${context}/gallery">
				<i class="fas fa-images"></i>갤러리</a></li>
			<c:if test= "${USER.userLevel == 'ADMIN'}">
				<li class="nav-item">
					<a class ="nav-link" href="${context }/admin/member/list">
						<i class="fas fa-calendar-alt"></i>회원관리</a></li>
			</c:if>
			
		</ul>
		
		<ul class="navbar-nav">
			<c:if test="${empty USER }">
				<li class="nav-item"><a class="nav-link" href="${context}/login">
					<i class="fas fa-sign-in-alt"></i>로그인</a></li>
				<li class="nav-item"><a class="nav-link" href="${context}/join">
					<i class="fas fa-user-plus"></i>회원가입</a></li>
			</c:if>
			<c:if test="${not empty USER }">
				<li class="nav-item">
					<a class="nav-link" href="${context }/member/view">
						<i class="fas fa-user"></i>${USER.userId}</a></li>
						
				<li class="nav-item">
					<a class="nav-link" href="${context}/logout">
					<i class="fas fa-sign-out-alt"></i>로그아웃</a></li>
			</c:if>
		</ul>
	</div>

</nav>