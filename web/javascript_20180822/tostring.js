var student = {};
student.이름 = '정우성';
student.취미 = '자전거타기';
student.특기 = '노래부르기';
student.장래희망 = '지휘자';

student.toString = function(){
	for(var key in this){
		if(key != 'toString'){
		console.log(key + '\t' + this[key]);
		}
	}
}
delete student.장래희망0
student.toString();