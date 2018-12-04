//화살표 함수

function add(a,b){
	return a+b;
};//선언적함수

var add2 = function(a,b){
	return a+b;
};//익명함수

var add3 = (a,b)=>{ //java에서는 ->로 표시
	return a+b;
};//ESv6 화살표함수(익명함수=>람다)

//함수가 처리하는 코드가 한줄인경우 블럭기호와 return를 생략가능
var add4 = (a,b)=>a+b;

//매개 변수가 하나인경우 괄호도 생략가능 
var prn = a=>console.log(a);

console.log(add4(3,4));
prn('Hello');