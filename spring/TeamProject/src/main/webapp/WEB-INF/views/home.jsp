<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<div class="container">
	<div class="row my-3">
		<!--Carousel Wrapper-->
		<div id="carousel-example-1z" class="carousel slide carousel-fade"
			data-ride="carousel">
			<!--Indicators-->
			<ol class="carousel-indicators">
				<li data-target="#carousel-example-1z" data-slide-to="0"
					class="active"></li>
				<li data-target="#carousel-example-1z" data-slide-to="1"></li>
				<li data-target="#carousel-example-1z" data-slide-to="2"></li>
			</ol>
			<!--/.Indicators-->
			<!--Slides-->
			<div class="carousel-inner" role="listbox">
				<!--First slide-->
				<div class="carousel-item active">
					<img class="d-block"
						src="resources/image/1.jpg" width="1140"height="504"
						alt="First slide">
				</div>
				<!--/First slide-->
				<!--Second slide-->
				<div class="carousel-item">
					<img class="d-block"
						src="resources/image/2.jpg" width="1140"height="504"
						alt="Second slide">
				</div>
				<!--/Second slide-->
				<!--Third slide-->
				<div class="carousel-item">
					<img class="d-block"
						src="resources/image/4.jpg" width="1140"height="504"
						alt="Third slide">
				</div>
				<!--/Third slide-->
			</div>
			<!--/.Slides-->
			<!--Controls-->
			<a class="carousel-control-prev" href="#carousel-example-1z"
				role="button" data-slide="prev"> <span
				class="carousel-control-prev-icon" aria-hidden="true"></span> <span
				class="sr-only">Previous</span>
			</a> <a class="carousel-control-next" href="#carousel-example-1z"
				role="button" data-slide="next"> <span
				class="carousel-control-next-icon" aria-hidden="true"></span> <span
				class="sr-only">Next</span>
			</a>
			<!--/.Controls-->
		</div>
		<!--/.Carousel Wrapper-->
	</div>

	<div class="row my-3">
		<!--Grid column-->
		<c:forEach var="item" items="${list}" varStatus="status">
			<div class="col-lg-4 col-md-12">
				<div class="card">
					<div class="view overlay">
						<img src="resources/image/${item.imageList[0]}" width="350"height="233"
							class="card-img-top" alt=""> <a href="${context }/restaurant/view/${item.restaurantId}">
							<div class="mask rgba-white-slight"></div>
						</a>
					</div>
					<div class="card-body">
						<h4 class="card-title">${item.name }</h4>
						<p class="card-text">
							${item.mainMenu }<br>
							${item.address }
						</p>
						<a href="${context }/restaurant/view/${item.restaurantId}" 
							class="btn tempting-azure-gradient color-bloc">Button</a>
					</div>
				</div>
			</div>
		</c:forEach>
		

		<c:forEach var="item2" items="${list2}" varStatus="status">
		<div class="col-lg-4 col-md-6">
			<div class="card">
				<div class="view overlay">
					<img
						src="resources/image/${item2.imageList[0]}" width="350"height="233"
						class="card-img-top" alt=""> <a href="${context }/residence/view/${item2.residenceId}">
						<div class="mask rgba-white-slight"></div>
					</a>
				</div>
				<div class="card-body">
					<h4 class="card-title">${item2.name }</h4>
					<p class="card-text">
						${item2.type },rooms:${item2.rooms }<br>
						${item2.address }
					</p>
					<a href="${context }/residence/view/${item2.residenceId}" 
						class="btn tempting-azure-gradient color-bloc">Button</a>
				</div>
			</div>
		</div>
		</c:forEach>
		
		<c:forEach var="item3" items="${list3}" varStatus="status">
			<div class="col-lg-4 col-md-6">
				<div class="card">
					<div class="view overlay">
						<img
							src="resources/image/${item3.imageList[0]}" width="350"height="233"
							class="card-img-top" alt=""> <a href="${context }/tour/view/${item3.tourId}">
							<div class="mask rgba-white-slight"></div>
						</a>
					</div>
					<div class="card-body">
						<h4 class="card-title">${item3.name }</h4>
						<p class="card-text">
							${item3.lgType } ${itme3.mdType } ${item3.smType }<br>
							${item3.address }
						</p>
						<a href="${context }/tour/view/${item3.tourId}" 
							class="btn tempting-azure-gradient color-bloc">Button</a>
					</div>
				</div>
			</div>
		</c:forEach>
		
		