var arScore=[88,78, ,96,54,23];
for(var st = 0; st<arScore.length; st++){
	console.log(st+ "번째 학생의 성적: " +arScore[st]);
}
console.log();

for(var i in arScore){
	console.log(i,arScore[i]);
}
console.log();

for(var value of arScore){
	console.log(value);
}


console.log();

arScore.length = 10;
for(var st = 0; st<arScore.length; st++){
	console.log(st+ "번째 학생의 성적: " +arScore[st]);
}

console.log();

arScore.length=3;
for(var st = 0; st<arScore.length; st++){
	console.log(st+ "번째 학생의 성적: " +arScore[st]);
}

var arr=[];
arr.length=100;













