<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib tagdir="/WEB-INF/tags/util" prefix="iot"%>

<div class="bg2 bg-base">
	<div class=" mask flex-center rgba-white-strong">
		<div class="container">
			<div class="my-5">
				<iot:page-header icon="hotel" title="숙박 목록" />
			</div>
			<div class="text-right">
				<form action="search">
					검색 : <select name="category">
						<option value="">종류</option>
						<option value="가족호텔">가족호텔</option>
						<option value="관광호텔">관광호텔</option>
						<option value="소형호텔">소형호텔</option>
						<option value="한국전통호텔">한국전통호텔</option>
						<option value="호스텔">호스텔</option>
						<option value="휴양 콘도미니엄">휴양 콘도미니엄</option>
					</select>
					<button type="submit">
						<i class="fas fa-search"></i>
					</button>
				</form>
				( 총 ${pagination.total}건 )
			</div>

			<table class="table table-stripped">
				<thead>
					<tr>
						<th style="width: 60px">No</th>
						<th style="width: 100px">종류</th>
						<th style="width: 120px">이름</th>
						<th style="width: 120px">객실수</th>

					</tr>
				</thead>
				<tbody>
					<c:forEach var="residence" items="${list}" varStatus="status">
						<tr>
							<td>${residence.residenceId}</td>
							<td>${residence.type}</td>
							<td><a
								href="view/${residence.residenceId }?page=${pagination.page}">
									${residence.name}</a></td>
							<td>${residence.rooms}</td>

						</tr>
					</c:forEach>
				</tbody>
			</table>
			<iot:pagination />
		</div>
	</div>
</div>