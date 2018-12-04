var name = "메롱이";

var person ={
		name : "정우성",
		eat : function(food){
			console.log(this);
			console.log(this.name + '이 ' + food + '을/를 먹습니다.');
		}
}

person.eat('햄버거');

var fn = person.eat;//익명함수를 참조한다
fn('피자');//name을 참조하는게 아니므로 this.name은 undefined가된다

setInterval(function(){
	person.eat('피자');
},1000);

setInterval(person.eat,1000);