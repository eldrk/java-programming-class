var str = "test S123 s-45 s67M S-8m s-123M s-superTM";
var result = str.search(/[sS]-[0-9]*T?M/);
console.log(result);