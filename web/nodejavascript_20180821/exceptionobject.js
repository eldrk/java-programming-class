function func(){
	if(true) throw "예외가 발생했습니다";
}

try{
	func();
}catch(exception){
	console.error("이름 : "+exception.name
			"\n메시지);
}