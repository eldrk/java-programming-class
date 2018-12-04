

function formatSize(bytes,dm=2){
	if(bytes ==0 ) return '0B';
	var k = 1024,
		//dm = decimalPoint || 2,
		sizes = ['B','K','M','G','T','P','E','Z','Y'],
		i = Math.floor(Math.log10(bytes) / Math.log10(k));
	
	return parseFloat((bytes / Math.pow(k,i)).toFixed(dm)) + sizes[i];
}

//랜덤함수
function random(range,start=0){
	return Math.floor(Math.random()*range)+start;
	
}

function comPareIgnoreCase(left,right){
	left = left.toLowerCase();
	right = right.toLowerCase();
	if(left < right) return -1;
	if(left > right) return 1;
	return 0;
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

