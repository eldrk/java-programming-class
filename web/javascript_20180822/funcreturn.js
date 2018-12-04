function outer(){
	return function(){
		console.log('메롱');
	};
}

outer()();
var fn = outer();
fn();