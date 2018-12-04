var count = 1;
var str = "생각이란 생각할수록 생각이 나므로 생각하지 말아야 할 생각은"+
		  "생각하지 않으려고 하는 생각이 옳은 생각이라고 생각합니다.";
var result = str.replace(/생각/g, "[$&]");
console.log(str);
console.log("---------------------------");
console.log(result);
console.log();

var str = "네이버 주소는 www.naver.com 입니다.";
var result = str.replace(/www\.naver\.com/g, '<a href="http://$&">$&</a>');
console.log(str);
console.log("---------------------------");
console.log(result);
console.log();

var str = "Hello\nJavascript\n정규표현식";
var result = str.replace(/\n/g, "<br/>");
console.log("---------------------------");
console.log(result);
