
$.fn.pagination=function(opt){
		var self=this;
		opt=$.extend({
			total:1,
			active:1,
			size:'',
			callback:undefined,
			align:'justify-content-center'
		},opt);
	
		self.addClass(opt.size)
			.addClass(opt.align);
		
		self.empty();
		
		for(var i=1; i<=opt.total;i++){
			var pageItem;
				pageItem=$(`<li class="page-item">
						<a class="page-link" href="#">${i}</a></li>`);
			if(i==opt.active){
				pageItem.addClass('active');
			}
			
			self.append(pageItem);
		}
		
		self.off('click','a');
		self.on('click','a',function(e){
			e.preventDefault();
			console.log('click');
			self.find('.active').removeClass('active');
			$(this).parent().addClass('active');
			if(opt.callback){
				opt.callback(parseInt($(this).text()));
			}
		});
		return this;
	}