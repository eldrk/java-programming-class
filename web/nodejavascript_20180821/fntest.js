function fn(){
	console.log('Hello javascript')
}

function process(f){//f 함수명 데이타 갖고있다
	f(10,20);
}

var fn2 = fn;
fn2();

process(fn2);//
process(console.log);

var arr=[1,2,3,4];
function process01(f){
	for(var value of arr){
		f(value)
	}
}

function fs(v){
	console.log(v*v);
}

process01(console.log);
process01(fs);