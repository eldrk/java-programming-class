var ar = [1,2,3];
delete(ar[1]);

if(0 in ar){
	console.log("0번째 요소가 있습니다.");
}
if(1 in ar){
	console.log("1번째 요소가 있습니다.");
}
console.log(ar.length);
console.log(ar[0], ar[1], ar[2]);
console.log(ar);