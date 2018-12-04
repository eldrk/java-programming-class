function outer(){
	var outvalue = 5678;
	function inner(){
		var invalue = 1234;
		console.log("outvalue = " + outvalue);
		c=100;//정의되지않은 변수에 값을 넣으면 topscope로 찾아가므로 전역변수가된다
	}
	inner();
	console.log("invalue = " + invalue);
	//선언하지않는 변수를 읽으므로 에러
}
var a =23;
outer();