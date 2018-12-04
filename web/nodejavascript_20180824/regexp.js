var str = "test S123 s-45 s67M S-8m s-123M s-superTM";
var reg = new RegExp("[sS]-[0-9]*T?M"); //== /[sS]-[0-9]*T?M/
var result = reg.exec(str);
console.log(result);
console.log(result[0]);//배열
console.log(result.index);
console.log(result.input);//검사한 문자열