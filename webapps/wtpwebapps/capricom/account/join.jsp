<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Capricorn</title>

<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet"
	href="bower_components/bootstrap/dist/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.2.0/css/all.css"
	integrity="sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ"
	crossorigin="anonymous">
<link rel="stylesheet" href="css/main.css">

<c:set var="context" value="${pageContext.request.contextPath}"
	scope="request" />

<script src="${context}/bower_components/jquery/dist/jquery.min.js"></script>
<script
	src="${context}/bower_components/popper.js/dist/umd/popper.min.js"></script>
<script
	src="${context}/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
<script src="${context}/js/common.js"></script>

<script>
	$(function() {
		$("#id-check").click(function(){
			var userId=$('#userId').val();
			// 브라우저에서 실행하므로 루트를 신경써야함
			var url='${context}/idcheck';	//	?userId='+userId;
			//	jsp는 문자열로 해석하기 때문에 뒤에 el식 표현을 이스케이프 시켜 단순 문자열로 인식하게 한다.
			//  var url=`${context}/idcheck?userId=\${userId}`;
			
			var params={
				userId : userId
			};
			
			$.get(url,params,function(data){
				console.log(data);
				if(data=="ok"){	//아이디가 중복 아님
					$('.check-result').text('사용 가능한 ID 입니다.')
									.removeClass('error')
									.addClass('text-success');
					$('[type=submit]').prop('disabled',false);
				}else{	// 아이디가 중복
					$('.check-result').text('이미 사용중인 ID 입니다.')
									.removeClass('text-success')
									.addClass('error');
					$('[type=submit]').prop('disabled',true);
				}
			});
		});
		
		$('#userId').keyup(function(){
			$('.check-result').text('ID 중복검사를 하세요.')
							  .removeClass('text-success')
							  .removeClass('error');
			$('[type=submit]').prop('disabled',true);
		});
		
		$('form').submit(function(e){
			e.preventDefault();
			
			//	비밀번호 확인.
			var password=$('[name=password]').val();
			var password2=$('[name=pwdCheck]').val();
			if(password!=password2){
				alert('비밀번호가 일치하지 않습니다.');
				$('[name=password]').focus();
				return;
			}
			this.submit();
			
		});
		
	});
</script>
</head>
<body>
	<div class="container">
		<jsp:include page="/common/header.jsp" />
		<jsp:include page="/common/menu.jsp" />
		<h3 class="my-5">
			<i class="fas fa-user-plus"></i> 회원가입
		</h3>
		<hr>
		<form method="post">
			<p>
				아 이 디 : <input type="text" id="userId" name="userId" value="${member.userId}"
					required placeholder="아이디를 입력하세요."/>
			</p>
			<p>
				<button type="button" id="id-check">ID 중복 검사</button>
				<span class="check-result">ID 중복 검사를 하세요.</span>
			</p>
			<p>
				비 밀 번 호 : <input type="password" name="password" value="" required
					placeholder="비밀번호를 입력하세요." />
			</p>
			<p>
				비밀번호 확인 : <input type="password" name="pwdCheck" required
					placeholder="재입력하세요." />
			</p>
			<p>
				이름 : <input type="text" name="name" value="${member.name}" required
					placeholder="이름을 입력하세요." />
			</p>
			<p>
				닉네임 : <input type="text" name="nickName" value="${member.nickName}"
					required placeholder="닉네임을 입력하세요." />
			</p>
			<p>
				전화번호: <input type="text" name="phoneNumber"
					value="${member.phoneNumber}" required placeholder="전화번호를 입력하세요." />
			</p>
			<p>
				이메일 : <input type="text" name="email" value="${member.email}"
					required placeholder="이메일을 입력하세요." />
			</p>
			<p>
				주소 : <input type="text" name="address" value="${member.address}"
					placeholder="주소를 입력하세요." />
			</p>

			<p class="error">${error}</p>
			<p>
				<button type="submit" class="btn btn-primary" disabled>
					<i class="fas fa-check"></i>확인
				</button>
				<button type="reset" class="btn btn-success">
					<i class="fas fa-undo"></i>취소
				</button>
			</p>
		</form>
		<jsp:include page="/common/footer.jsp" />
	</div>
</body>
</html>