<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib tagdir="/WEB-INF/tags/util" prefix="iot"%>

<div class="bg3 bg-base">
	<div class=" mask flex-center rgba-white-strong">
		<div class="container">
			<div class="row my-4">
				<div class="col md-4">
					<iot:page-header icon="utensils" title="음식점 목록" />
					<div class="text-right">
						<form action="search">
							검색 : <select name="category">
								<option value="type">종류</option>
							</select> <input type="text" name="keyword" required>
							<button type="submit">
								<i class="fas fa-search"></i>
							</button>
						</form>
						( 총 ${list.size()}건 )

					</div>
				</div>

				<table class="table table-stripped">
					<thead>
						<tr>
							<th style="width: 60px">No</th>
							<th style="width: 100px">종류</th>
							<th style="width: 120px">식당이름</th>
							<th style="width: 120px">주 메뉴</th>

						</tr>
					</thead>
					<tbody>
						<c:forEach var="restaurant" items="${list}" varStatus="status">
							<tr>
								<td>${status.index+1}</td>
								<td>${restaurant.type}</td>
								<td><a
									href="view/${restaurant.restaurantId }?page=${pagination.page}">
										${restaurant.name}</a></td>
								<td>${restaurant.mainMenu}</td>

							</tr>
						</c:forEach>
					</tbody>
				</table>
				<iot:pagination />
			</div>
		</div>
	</div>
</div>