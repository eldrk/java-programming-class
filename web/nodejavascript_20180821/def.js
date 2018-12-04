function test(a,b) {
	a = a || 10;
	
	console.log(a);
	console.log(b);
}

test(20);//b=undefined
test('abc');
test();

test('abc',20,30);