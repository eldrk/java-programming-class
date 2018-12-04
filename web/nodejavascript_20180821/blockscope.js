test();

function test(){//식별자 알고 실행한다
	//console.log(i,k);
	
	for(let i=0;i<3;i++){
		let k= 1234;//블럭단위로 실행하는 scope
		console.log("i=" +i);
	}
	console.log(i);
	console.log(k);
	console.log("i= " +i+" , k=" +k);
}

//console.log("i= " +i+" , k=" +k);