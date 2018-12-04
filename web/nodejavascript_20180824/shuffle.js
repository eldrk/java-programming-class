
function random(range,start=0){
	return Math.floor(Math.random()*range)+start;
	
}

Array.prototype.suffle = function(){
	var arr = this.slice(0); //배열복사
	
	for(var i=arr.length-1; i>0; i--){
		var rx = random(i+1);
		var temp = arr[i];
		arr[i]=arr[rx];
		arr[rx]=temp;
		
	}
	return arr;
	
}

Array.prototype.range = function(start,end){
	for(var i=start; i<end; i++){
		this.push(i);
	}
	
	return this;
}

var orgin = [].range(0,48);
var deck = orgin.suffle();

var p1 = deck.splice(0,7);
var p2 = deck.splice(0,7);
var p3 = deck.splice(0,7);
var bottom=deck.splice(0,6);

console.log(p1);
console.log(p2);
console.log(p3);
console.log(bottom);
console.log(deck.length);

var images = [].range(0,48).map(v=>`card${v}.jpg`);
console.log(images);

bottom.forEach(v=>console.log(images[v]));
