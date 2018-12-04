var ar = [[0,1,2,3],[4,5,6],[7,8]];
for(var i=0; i<ar.length;i++){
	for(var j=0; j<ar.length;j++){
		var str=`==================
ar[${i}][${j}]=${ar[i][j]}
======================`;//템플릿 문자열
		
		console.log(str);
		//console.log("ar["+i+"]["+j+"]=" +ar[i][j])
	}
	console.log();
}