<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib tagdir="/WEB-INF/tags/util" prefix="iot"%>

<script>
$(function(){
	var mdTypeList1 = ['건축', '문화시설', '산업관광지','역사관광지', '체험관광지', '휴양관광지'];
	var mdTypeList2 = ['관광자원', '자연관광지' ];
	
	var smTypeList1= ['다리', '기념탑'];
	var smTypeList2= ['박물관'];
	var smTypeList3= ['발전소', '기타', '식음료'];
	var smTypeList4= ['사찰', '유적지', '성', '고택', '종교성지', '민속마을'];
	var smTypeList5= ['이색체험', '전통체험', '농.산.어촌 체험', '관광농원', '이색거리', '관광농원'];
	var smTypeList6= ['공원', '유람선', '테마공원','온천', '관광단지'];
	var smTypeList7= ['기암괴석'];
	var smTypeList8= ['계곡', '국립공원', '도립공원', '동굴', '등대', '산', '섬', '수목원', '약수터', '어촌', '자연생태관광지', '자연휴양림', '폭포', '해수욕장', '해안절경', '호수'];

	
	
	
	
	$('#lgType').change(function(){
		var sel = $(this).val();
		if(sel != '') {
			$('#mdType').empty();	// 기존 option 제거 
			if(sel == '인문') {
				mdTypeList1.forEach(item=>{
					$('#mdType').append(`<option value="\${item}">\${item}</option>`);
				})
				
			} else if(sel == '자연'){
				mdTypeList2.forEach(item=>{
					$('#mdType').append(`<option value="\${item}">\${item}</option>`);
				})
				
			}
		}
	});
	
	$('#mdType').change(function(){
		var sel = $(this).val();
		if(sel != '') {
			$('#smType').empty();	// 기존 option 제거 
			if(sel == '건축') {
				smTypeList1.forEach(item=>{
					$('#smType').append(`<option value="\${item}">\${item}</option>`);
				})
				
			} else if(sel == '문화시설'){
				smTypeList2.forEach(item=>{
					$('#smType').append(`<option value="\${item}">\${item}</option>`);
				})
				
			}else if(sel == '산업관광지'){
				smTypeList3.forEach(item=>{
					$('#smType').append(`<option value="\${item}">\${item}</option>`);
				})
				
			}else if(sel == '역사관광지'){
				smTypeList4.forEach(item=>{
					$('#smType').append(`<option value="\${item}">\${item}</option>`);
				})
				
			}else if(sel == '체험관광지'){
				smTypeList5.forEach(item=>{
					$('#smType').append(`<option value="\${item}">\${item}</option>`);
				})
				
			}else if(sel == '휴양관광지'){
				smTypeList6.forEach(item=>{
					$('#smType').append(`<option value="\${item}">\${item}</option>`);
				})
				
			}else if(sel == '관광자원'){
				smTypeList7.forEach(item=>{
					$('#smType').append(`<option value="\${item}">\${item}</option>`);
				})
				
			}else if(sel == '자연관광지'){
				smTypeList8.forEach(item=>{
					$('#smType').append(`<option value="\${item}">\${item}</option>`);
				})
				
			}
		}
	});
	
});

</script>

<div class="bg1 bg-base">
	<div class=" mask flex-center rgba-white-strong">
		<div class="container">
			<div class="my-5">
				<iot:page-header icon="motorcycle" title="관광지 목록" />
			</div>
			<div class="text-right">

				<form action="search">
					검색 : <select id="lgType" name="lgType">
						<option value="">검색항목</option>
						<option value="인문">인문</option>
						<option value="자연">자연</option>
					</select> <select id="mdType" name="mdType">

					</select> <select id="smType" name="smType">

					</select>

					<button type="submit">
						<i class="fas fa-search"></i>
					</button>
				</form>

				( 총 ${list.size()}건 )
			</div>

			<table class="table table-stripped">
				<thead>
					<tr>
						<th style="width: 60px">No</th>
						<th style="width: 100px">이름</th>
						<th style="width: 120px">대분류</th>
						<th style="width: 120px">중분류</th>
						<th style="width: 120px">소분류</th>
						<th style="width: 120px">지역</th>

					</tr>
				</thead>
				<tbody>
					<c:forEach var="tour" items="${list}" varStatus="status">
						<tr>
							<td>${status.index+1}</td>
							<td><a href="view/${tour.tourId }?page=${pagination.page}">
									${tour.name}</a></td>
							<td>${tour.lgType}</td>
							<td>${tour.mdType}</td>
							<td>${tour.smType}</td>
							<td>${tour.region}</td>


						</tr>
					</c:forEach>
				</tbody>
			</table>
			<iot:pagination />
		</div>
	</div>
</div>