var person={
	name: "정우성",
	age : 45
};

var json = JSON.stringify(person);//전송측
console.log(json);

var human=JSON.parse(json);//수신측
console.log("name = " +human.name );
console.log("age = " +human.age);