<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- 부트스트랩 적용을 위한 코드 -->
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
	crossorigin="anonymous">
<!-- 헤더, 푸터용 css파일 -->
<link rel="stylesheet" href="./css/style.css" type="text/css">
<style type="text/css">
.container {
	width: 1000px;
	margin: 0 auto;
	color: white;
}

#join_title {
	width: 100px;
	font-size: 15pt;
	border-top: 2px solid gray;
	text-align: center;
}

#join_form {
	width: 800px;
	margin: 50px auto;
}
</style>
<title>연습용 쇼핑몰</title>
</head>
<body>
	<!-- 페이지에 공통으로 들어가는 헤더 -->
	<jsp:include page="/module/header2.jsp" flush="false" />

	<!-- 여기에 코드를 작성한다. -->
	<div class="container">
		<!-- 부트스트랩 그리드를 위한 클래스 -->
		<div class="row">
			<div id="join_title">회원가입</div>
		</div>
		<div class="row" id="join_form">
			<!-- 회원가입 폼 -->
			<form action="/practiceMall/member/join.do" method="post">
				<div class="form-group">
					<div class="form-check form-check-inline">
						<input class="form-check-input" type="radio"
							name="member_type" value="1">
						<label class="form-check-label" for="inlineRadio1">일반회원</label>
					</div>
					<div class="form-check form-check-inline">
						<input class="form-check-input" type="radio"
							name="member_type" value="2">
						<label class="form-check-label" for="inlineRadio1">판매자회원</label>
					</div>
				</div>
			</form>
		</div>
	</div>
	<!-- 페이지에 공통으로 들어가는 푸터 -->
	<jsp:include page="/module/footer2.jsp" flush="false" />
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<!-- 헤더 푸터용 js파일 -->
	<script src="./js/test.js"></script>
	<!-- 부트스트랩용 자바스크립트 코드-->
	<!-- jquery, popper.js, bootstrap.js순서대로 배치한다. -->
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