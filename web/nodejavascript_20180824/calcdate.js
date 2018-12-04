var now = new Date();
var epoch = now.getTime();
epoch += (86400 * 1000 * 3);//하루를 초로나타냄 86400
now.setTime(epoch);
console.log("사흘 후는 " +now.toLocaleDateString() +"입니다.");