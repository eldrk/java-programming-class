<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script type="text/javascript"
	src="https://openapi.map.naver.com/openapi/v3/maps.js?clientId=0pizm5mucbw6k7XlRkDW&submodules=geocoder"></script>
<script>
	$(function() {

		var map = new naver.maps.Map('map');
		var myaddress = '${tour.address}';// 도로명 주소나 지번 주소만 가능 (건물명 불가!!!!)
		naver.maps.Service.geocode({
			address : myaddress
		}, function(status, response) {
			if (status !== naver.maps.Service.Status.OK) {
				return alert(myaddress + '의 검색 결과가 없거나 기타 네트워크 에러');
			}
			var result = response.result;
			// 검색 결과 갯수: result.total
			// 첫번째 결과 결과 주소: result.items[0].address
			// 첫번째 검색 결과 좌표: result.items[0].point.y, result.items[0].point.x
			var myaddr = new naver.maps.Point(result.items[0].point.x,
					result.items[0].point.y);
			map.setCenter(myaddr); // 검색된 좌표로 지도 이동
			// 마커 표시
			var marker = new naver.maps.Marker({
				position : myaddr,
				map : map
			});
			// 마커 클릭 이벤트 처리
			naver.maps.Event.addListener(marker, "click", function(e) {
				if (infowindow.getMap()) {
					infowindow.close();
				} else {
					infowindow.open(map, marker);
				}
			});
			// 마크 클릭시 인포윈도우 오픈

			var infowindow = new naver.maps.InfoWindow({
				content : '${tour.name}'
			});
		});
	});
</script>

<div class="bg1 bg-base">
	<div class=" mask flex-center rgba-white-strong">
		<div class="container">
			<h1 class="my-5">
				<i class="fas fa-motorcycle"></i>관광지 정보
			</h1>

			<c:forEach var="item" items="${list}" varStatus="status">
				<div>
					<img src="${context }/resources/image/${item.imageList[0]}"
						width=500>
				</div>
			</c:forEach>
			<br>
			<div>
				<div class="row">
					<div class="col-md-2">아이디</div>
					<div class="col-md-10">${tour.tourId}</div>
				</div>

				<div class="row">
					<div class="col-md-2">이름</div>
					<div class="col-md-10">${tour.name}</div>
				</div>

				<div class="row">
					<div class="col-md-2">대분류</div>
					<div class="col-md-10">${tour.lgType}</div>
				</div>


				<div class="row">
					<div class="col-md-2">중분류</div>
					<div class="col-md-10">${tour.mdType}</div>
				</div>


				<div class="row">
					<div class="col-md-2">소분류</div>
					<div class="col-md-10">${tour.smType}</div>
				</div>

				<div class="row">
					<div class="col-md-2">지역도</div>
					<div class="col-md-10">${tour.region}</div>
				</div>


				<div class="row">
					<div class="col-md-2">지역시</div>
					<div class="col-md-10">${tour.location}</div>
				</div>


				<div class="row">
					<div class="col-md-2">주소</div>
					<div class="col-md-10">${tour.address}</div>
				</div>

				<br>
				<div id="map" style="width: 100%; height: 500px;"></div>

				<div class="text-center">

						<a href="../list?page=${param.page}" class="btn btn aqua-gradient">돌아가기</a>
				
				</div>


			</div>

		</div>
	</div>
</div>
