console.log("2+3  = " +add1(2,3) );
//console.log("4+5  = " +add2(4,5) ); //에러

function add1(a,b){
	return a+b;
}

var add2 = function(a,b){
	return a+b;
}
console.log("4+5  = " +add2(4,5) );

add1=100;//함수에 숫자배정 가능하고 숫자타입이된다 
console.log('add1 : ' +add1);
add1(3,5);//함수가아니게 되므로 에러