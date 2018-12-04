function makeStudent(name, korean, math, english, science){
	var student = {
		name : name,
		korean : korean,
		math : math,
		english : english,
		science : science,
			
			getSum : function(){
				return this.korean + this.math+ this.english
				+this.science;
			},
			getAverage : function(){
				return this.getSum()/4;
			},
			toString :function(){
				return this.이름 + '\t' + this.getSum() +'\t'
				+this.getAverage();
			}
	};
	return student;
	
}
var students = [];
students.push(makeStudent('윤인성',90,83,76,89));
students.push(makeStudent('박찬호',90,83,76,89));
students.push(makeStudent('류현진',90,83,76,89));
students.push(makeStudent('이세돌',90,83,76,89));
students.push(makeStudent('김세진',90,83,76,89));
students.push(makeStudent('이하나',90,83,76,89));



var scoreTable = `
<table border="1" style= "width:80%">
<thead><tr>
	<th>이름</th><th>국어</th><th>영어</th>
	<th>수학</th><th>과학</th><th>평균</th>
</tr></thead>
<tbody>`;

var totalAvg=0;
students.forEach(function(s){
	scoreTable += `
	<tr>
		<td>${s.name}</td>
		<td>${s.korean}</td>
		<td>${s.english}</td>
		<td>${s.math}</td>
		<td>${s.science}</td>
		<td>${s.getAverage()}</td>
	</tr>`;
	totalAvg += s.getAverage();
});

var avg = (totalAvg/students.length).toFixed(2);
scoreTable += `<tr><td colspan="6" style="text-align:right">
			총 ${students.length}명 (평균 : ${avg})</td></tr>`;
scoreTable += `</tbody></table>`;
	
	