var now= new Date();
console.log("현재 시간은 " +
	now.getFullYear() + "년 " +
	(now.getMonth() + 1) + "월 " +
	now.getDate() +"일 " +
	now.getHours()+ ":" +
	now.getMinutes()+" 입니다."
	);

Date.prototype.dateFormat = function(){
	var year = this.getFullYear();
	var month = this.getMonth()+1;
	var date = this.getDate();
	
	month = (month < 10)? '0'+month :month;
	date = (date < 10)? '0'+date : date;
	
	return `${year}-${month}-${date}`;
	
}

Date.prototype.timeFormat = function(){
	var hour = this.getHours();
	var min = this.getMinutes();
	var sec = this.getSeconds();
	
	hour = (hour <10 )? '0'+hour : hour;
	min = (min <10 )? '0'+min :min;
	sec = (sec <10)? '0'+sec :sec;
	
	return `${hour}:${min}:${sec}`;
}

console.log(now.dateFormat());
console.log(now.timeFormat());