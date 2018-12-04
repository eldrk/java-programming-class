var items=["100선","지역별","일정잡기"];
var result = "<ul>\n";
for(var item of items){
	result +=`    <li>${item}</li>\n`;
}
result += '</ul>';

console.log(result);
console.log();

var result = "<table>\n"
for(var ix=0;ix<items.length;ix++){
	result +=
		`  <tr><td>${ix+1}</td><td>${items[ix]}</td></tr>\n`;
}
result += '</table>';
console.log(result);