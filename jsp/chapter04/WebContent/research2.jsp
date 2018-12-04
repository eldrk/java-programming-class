<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	String name = request.getParameter("name");

	String gender = request.getParameter("gender");
	gender = gender.equals("male")?"남자":"여자";
	
	String[] seasons = {null,"봄","여름","가을","겨울"};
	String seasonArr[] = request.getParameterValues("season");
	String likeSeasons = "";
	for(String season: seasonArr){
		int n = Integer.parseInt(season);
		likeSeasons += seasons[n] +" ";
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>설문 조사 결과</h2>
	이름: <b><%=name %></b><br>
	성별: <b><%=gender %></b><br>
	당신이 좋아하는 계절은<b><%=likeSeasons%></b><br>
</body>
</html>