function test(name){
	var output = 'Hello' +name+ '...!';
	
	return function(){
		console.log(output);
		console.log(name);
	}
}

test('javascript')();

var fn = test('Javascript2');
fn();
fn();

var fn2 = test('Javascript3');
fn2();
fn2();

