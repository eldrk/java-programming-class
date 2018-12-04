var count = 1;
var str = "생각이란 생각할수록 생각이 나므로 생각하지 말아야 할 생각은"+
		  "생각하지 않으려고 하는 생각이 옳은 생각이라고 생각합니다."
var result = str.replace(/생각/g,function(value){///정규표현식리터럴/
	return value+"(" +count++ +")";
			
});
console.log(str);
console.log("--------------------");
console.log(result);