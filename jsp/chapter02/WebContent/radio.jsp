<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="RadioServlet">
		<label for="gender">성별:</label> 
		<input type="radio" id="gender"
			name="gender" value="남자">남자 
		<input type="radio"
			id="gender" name="gender" value="여자">여자 
		<br> 
		<label for="chk_mail"> 메일 정보 수신 여부 : </label> 
		<input type="radio"
			id="chk_mail" name="chk_mail" value="yes"> 수신 
		<input
			type="radio" id="chk_mail" name="chk_mail" value="no"> 거 부
		<br>
		<br> 
		<label for="content"> 간단핚 가입 인사를 적어주세요^o^ </label>
		<textarea id="content" name="content" rows="3" cols="35"></textarea>
		<br> 
		<input type="submit" value="전송">
	</form>
</body>
</html>