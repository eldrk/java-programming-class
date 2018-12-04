$.fn.lightbox=function(opt){
	var self = this;
	opt = $.extend({
		images : [],
		boxname : 'lightbox-set'
	},opt);
	
	//images.forEach(item=>{
	opt.images.forEach(function(item){
		var templ=`
				<a href="images/${item}" data-lightbox="${opt.boxname}">	
					<img src="images/${item}" width="100"
						class = "img-thumbnail">
				</a>`;
		$(self).append(templ);
	})
	
	return this;
}