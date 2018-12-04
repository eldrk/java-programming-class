<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class="row">
	<div class="col-md-6 offset-md-3">
		<h1 class="my-5">회원가입</h1>
		<form:form commandName="member">
			<div class="md-form">
				<label for="userId">사용자 ID</label>
				<form:input path="userId" class="form-control"/>
				<form:errors path="userId" element="div" cssClass="error"/>
			</div>
			
			<div class="md-form">
				<label for="password">비밀번호</label>
				<form:password path="password" class="form-control"/>
				<form:errors path="password" element="div" cssClass="error"/>
			</div>
			
			<div class="md-form">
				<label for="name">이름</label>
				<form:input path="name" class="form-control"/>
				<form:errors path="name" element="div" cssClass="error"/>
			</div>
			
			<div class="md-form">
				
				<label for="name">이메일</label>
				<form:input path="email" class="form-control validate"/>
				<form:errors path="email" element="div" cssClass="error"/>
			</div>
			<button class="btn btn-outline-success waves-effect btn-block my-4" type="submit">회원가입</button>
		</form:form>
	</div>
</div>