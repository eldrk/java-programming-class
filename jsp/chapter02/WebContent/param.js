
function check(){//유효성검사
	if(isNaN(document.frm.age.value)){
		alert("숫자를 입력해주세요");
		document.frm.age.focus();
		return false;
	
	}
}