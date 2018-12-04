function sumAll(){//모든 함수는 arguments값을 갖는다 ES5
	var sum = 0;
	
	for(var i=0; i<arguments.length;i++){
		sum += arguments[i];
	}
	return sum;
}

console.log(sumAll(1,2,3,4,5,6,7,8,9))

function sumAll(...arr){//매개변수type 배열로 받는다 ES6
	var sum = 0;
	
	for(var i=0;i<arr.length;i++){
		sum += arr[i];
	}
	return sum;
}
console.log(sumAll(1,2,3,4));

var arr = [1,2,3,4];
console.log(sumAll(arr));//배열에 배열로 엉뚱한값이 나온다

console.log(sumAll(...arr));//배열펼쳐서 개별적으로 넘김