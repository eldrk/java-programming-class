<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:set var="context" value="${pageContext.request.contextPath }" scope="request"/>
<!-- Font Awesome -->
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
<!-- Bootstrap core CSS -->
<link
	href="${context }/resources/bower_components/bootstrap/dist/css/bootstrap.min.css"
	rel="stylesheet">
<!-- Material Design Bootstrap -->
<link href="${context }/resources/bower_components/MDBootstrap/css/mdb.min.css"
	rel="stylesheet">
<!-- Your custom styles (optional) -->
<link href="${context }/resources/css/style.css" rel="stylesheet">

</head>
<!-- JQuery -->
<script src="${context }/resources/bower_components/jquery/dist/jquery.min.js"></script>
<!-- Bootstrap tooltips -->
<script
	src="${context }/resources/bower_components/popper.js/dist/umd/popper.min.js"></script>
<!-- Bootstrap core JavaScript -->
<script
	src="${context }/resources/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
</head>

<body>

	<!--Main Navigation-->

	<header>
		<!--Navbar-->
		<nav class="navbar navbar-expand-lg navbar-dark light-green darken-4">
			<!-- Navbar brand -->
			<a class="navbar-brand" href="#">Navbar</a>
			<!-- Collapse button -->
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#basicExampleNav" aria-controls="basicExampleNav"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<!-- Collapsible content -->
			<div class="collapse navbar-collapse" id="basicExampleNav">
				<ul class="navbar-nav mr-auto">
					<li class="nav-item active"><a class="nav-link" href="#">Home
							<span class="sr-only">(current)</span>
					</a></li>
					<li class="nav-item"><a class="nav-link" href="#">Features</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="#">Pricing</a>
					</li>
					<!-- Dropdown -->
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" id="navbarDropdownMenuLink"
						data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Dropdown</a>
						<div class="dropdown-menu dropdown-primary"
							aria-labelledby="navbarDropdownMenuLink">
							<a class="dropdown-item" href="#">Action</a> <a
								class="dropdown-item" href="#">Another action</a> <a
								class="dropdown-item" href="#"> Something else here</a>
						</div></li>
				</ul>
				<form class="form-inline">
					<div class="md-form mt-0">
						<input class="form-control mr-sm-2" type="text"
							placeholder="Search" aria-label="Search">
					</div>
				</form>
			</div>
			<!-- Collapsible content -->
		</nav>
	</header>
	<!--Main Navigation-->
	<!--Main layout-->

	<main> <!--Main container-->
	<div class="container">
		<div class="row my-3">
			<div class="col-md-7">
				<div class="view overlay z-depth-1-half">
					<img src="resources/images/4.jpg" class="card-img-top">
					<div class="mask rgba-white-light"></div>
				</div>
			</div>

			<div class="col-md-5">
				<h2>Some awesome heading</h2>
				<hr>
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
					Blanditiis pariatur quod ipsum atque quam dolorem voluptate officia
					sunt placeat consectetur alias fugit cum praesentium ratione sint
					mollitia, perferendis natus quaerat!</p>
				<a href="https://mdbootstrap.com/" class="btn purple-gradient btn-lg">
					Get it now!</a>
			</div>
		</div>

		<div class="row my-3">
			<!--Grid column-->
			<div class="col-lg-4 col-md-12">
				<div class="card">
					<div class="view overlay">
						<img
							src="resources/images/5.jpg" height="193.31"
							class="card-img-top" alt=""> <a href="#">
							<div class="mask rgba-white-slight"></div>
						</a>
					</div>
					<div class="card-body">
						<h4 class="card-title">Card title</h4>
						<p class="card-text">Some quick example text to build on the
							card title and make up the bulk of the card's content.</p>
						<a href="#!" class="btn btn-default btn-lg active">Button</a>
					</div>
				</div>
			</div>

			<div class="col-lg-4 col-md-6">
				<div class="card">
					<div class="view overlay">
						<img
							src="https://mdbootstrap.com/img/Photos/Horizontal/Nature/4-col/img%20(74).jpg"
							class="card-img-top" alt=""> <a href="#">
							<div class="mask rgba-white-slight"></div>
						</a>
					</div>
					<div class="card-body">
						<h4 class="card-title">Card title</h4>
						<p class="card-text">Some quick example text to build on the
							card title and make up the bulk of the card's content.</p>
						<a href="#" class="btn btn-default btn-lg active">Button</a>
					</div>
				</div>
			</div>

			<div class="col-lg-4 col-md-6">
				<div class="card">
					<div class="view overlay">
						<img
							src="https://mdbootstrap.com/img/Photos/Horizontal/Nature/4-col/img%20(75).jpg"
							class="card-img-top" alt=""> <a href="#">
							<div class="mask rgba-white-slight"></div>
						</a>
					</div>
					<div class="card-body">
						<h4 class="card-title">Card title</h4>
						<p class="card-text">Some quick example text to build on the
							card title and make up the bulk of the card's content.</p>
						<a href="#" class="btn btn-default btn-lg active">Button</a>
					</div>
				</div>
			</div>
		</div>
		<!--Grid row-->
	</main>
	<!--Main layout-->
	<!--Footer-->

	<footer
		class="page-footer text-center text-md-left font-small light-green darken-4 pt-4 mt-4">
		<div class="container-fluid text-center text-md-left">
			<div class="row my-3">
				<div class="col-md-6 pb-3">
					<h5 class="text-uppercase">Footer Content</h5>
					<p>Here you can use rows and columns here to organize your
						footer content.</p>
				</div>

				<div class="col-md-6 pb-3">
					<h5 class="text-uppercase">Links</h5>
					<ul class="list-unstyled">
						<li><a href="#!">Link 1</a></li>
						<li><a href="#!">Link 2</a></li>
						<li><a href="#!">Link 3</a></li>
						<li><a href="#!">Link 4</a></li>
					</ul>
				</div>
				
			</div>
		</div>
		<div class="footer-copyright py-3 text-center">
			© 2018 Copyright: <a href="https://mdbootstrap.com/bootstrap-tutorial/">
				MDBootstrap.com </a>
		</div>
	</footer>
	<!--Footer-->
</body>

<!-- MDB core JavaScript -->
<script src="resources/bower_components/MDBootstrap/js/mdb.min.js"></script>
</html>