var intervalID = setInterval(function(){
	console.log(new Date());
},1000);

setTimeout(function(){
	clearInterval(intervalID);
},600000);