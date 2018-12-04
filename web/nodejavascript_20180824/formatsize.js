var size = 12345689;

function formatSize(bytes,dm=2){
	if(bytes ==0 ) return '0B';
	var k = 1024,
		//dm = decimalPoint || 2,
		sizes = ['B','K','M','G','T','P','E','Z','Y'],
		i = Math.floor(Math.log10(bytes) / Math.log10(k));
	
	return parseFloat((bytes / Math.pow(k,i)).toFixed(dm)) + sizes[i];
}

console.log(formatSize(1234567));
