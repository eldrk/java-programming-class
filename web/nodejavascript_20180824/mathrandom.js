console.log("무작위 수 : " +Math.random());
console.log("1~10 사이 : " +Math.floor(Math.random()*10)+1);


function random(range,start=0){
	return Math.floor(Math.random()*range)+start;
	
}

Number.prototype.forEach = function(f){
	
	for(var i=0;i<=this;i++){
		f(i);
	}
}
console.log('forEach'in Number.prototype);

(10).forEach(function(i){
	console.log(i);
});