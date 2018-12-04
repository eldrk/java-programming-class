console.log(typeof 52);
console.log(typeof(typeof 52));

var a;
var type = typeof(a);
console.log(type);

a=12;
type=typeof(a);
console.log(type);

var b;
if(b == undefined){//값으로 비교
	console.log('b는 초기화 되지 않았습니다.');
}

if(typeof b == 'undefined'){//문자열로 비교
	console.log('b는 초기화 되지 않았습니다.');
}

console.log(typeof function(){});//변수로 참조할수있다
console.log(typeof{});