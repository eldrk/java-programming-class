'use strict'
var c=12 , d=10;

//선언하고,초기화 하지 않은 변수 읽기
console.log(d);//undefined
//var d=10;
console.log(d);


//선언하지 않은 변수 읽기
//console.log(c);예외발생

//선언하지 않은 변수 쓰기
//c=12;전역변수가 된다
console.log(c);