var add = function(a,b){
	return a+b;
}

var multi = function(a,b){
	return a*b;
}

function calc(a,b,f){//마지막 매개변수에 함수전달하는것이 관례
	return f(a,b);
}

console.log("2+3 = " +calc(2,3,add));
console.log("2*3 = " +calc(2,3,multi));

console.log();

//익명함수로 호출하기
console.log("2 + 3 = " +calc(2, 3, function(a,b){
	return a+b;
}));
console.log("2 * 3 = " +calc(2, 3, function(a,b){
	return a*b;
}));

console.log();

//람다로 호출하기
console.log("2 + 3 = " +calc(2, 3, (a,b)=>a+b));
console.log("2 * 3 = " +calc(2, 3, (a,b)=>a*b));
console.log();

calc(2, 3, console.log);