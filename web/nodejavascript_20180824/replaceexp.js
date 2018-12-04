var str = "내가 그린 기린 그림은 암 기린을 그린 기린 그림이다.";
var result = str.replace("기린","코끼리");
console.log(str);
console.log(result);
console.log();

var str02 = "내가 그린 기린 그림은 암 기린을 그린 기린 그림이다";
var result02 = str.replace(/기린\s/g, "코끼리");
console.log(str02);
console.log(result02);