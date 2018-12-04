'use strict'
var global = "전역";
function func(){
	var local = "로컬";
	console.log("함수 안 local = "+local+"<br>");
	console.log("함수 안 global= "+global+"<br>");
	global +="변경";
}
func();
cosole.log("함수 밖 global=" +global+"<br>");