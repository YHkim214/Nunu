<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
	crossorigin="anonymous">
<link rel="stylesheet" href="/practiceMall/css/style.css" type="text/css">
<title>마이페이지</title>
</head>
<body>
	<jsp:include page="/module/header.jsp"/>
	<div class="container" id="mypage_wrap">
		<h2 id="mypage_title">마이페이지</h2>
		<ul class="nav nav-tabs">
			<li class="nav-item">
				<a class="nav-link mypage_menu" href="/practiceMall/mypage/passwdCheck.do">정보수정</a>
			</li>
			<li class="nav-item">
				<a class="nav-link mypage_menu" href="/practiceMall/mypage/deleteUser.do">회원탈퇴</a>
			</li>
			<li class="nav-item">
				<a class="nav-link mypage_menu" href="">준비중</a>
			</li>
		</ul>
		<div class="tab-content">
		</div>
	</div>
	<jsp:include page="/module/footer.jsp"/>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js"
		integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"
		integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k"
		crossorigin="anonymous"></script>
</body>
</html>