function sum(n=100){
	//if(n == undefined) n=100; 
	//n = n || 100;
	var s = 0;
	for(var i=0; i<=n; i++){
		s += i;
	}
	return s;
}
console.log(sum(10));
console.log(sum());