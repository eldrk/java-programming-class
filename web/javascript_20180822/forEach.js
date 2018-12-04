


function forEach(arr, fn){
	for(var i=0; i<arr.length; i++)
		fn(arr[i],i,arr);
}

var data = [10, 2, 3, 90, 5, 1, 7];

forEach(data,console.log);
console.log();

//익명함수로
forEach(data,function(item){
	console.log(item);
});
console.log();

//람다로
//forEach(data, item=>console.log(item));
data.forEach(item=>console.log(item));//functional프로그래밍기법

var sum=0
//forEach(data,num=>sum+=num);
data.forEach(num =>sum+=num);
console.log("합계" , sum);
console.log();

console.log('최대값', Math.max(23,12,100,43));
console.log('최대값', Math.max(...data));//element 단위로 펼쳐라
console.log('최소값', Math.min(...data));

//람다
var str = "<ul>\n";
data.forEach(num=>str+= `  <li>${num}</li>\n`);
str+="</ul>"
console.log(str);
console.log();

//익명
var str = "<ul>\n";
data.forEach(function(num){
	str += `  <li>${num}</li>\n`
});
str += "</ul>";
console.log(str);