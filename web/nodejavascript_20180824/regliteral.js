var str = "test S123 s-45 s67M S-8m s-123M s-superTM";
var reg = /[sS]-[0-9]*T?M/;
var result = reg.exec(str);
console.log(result);