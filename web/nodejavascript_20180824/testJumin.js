var str = "890629-1914920";
var result = str.search(/[0-9]{6}-[1234][0-9]{6}/);
if(result != -1){
	console.log("유효한 주민 등록 번호입니다.");
}else{
	console.log("주민 등록 번호가 올바르지 않습니다.");
}