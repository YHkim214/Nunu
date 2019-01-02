<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	margin-top:50px;
}

#join_form_wrapper {
	width: 800px;
	margin: 50px auto;
}

#join_form {
	width: 100%;
}
</style>
<title>회원가입</title>
</head>
<body>
	<jsp:include page="/module/header.jsp" flush="true" />
	<div class="container">
		<div class="row">
			<div id="join_title">회원가입</div>
		</div>
		<div class="row" id="join_form_wrapper">
			<form action="/practiceMall/member/join.do" method="post"
				id="join_form">
				<!-- 라디오버튼 -->
				<fieldset class="form-group">
					<div class="row">
						<legend class="col-form-label col-sm-2 pt-0">회원유형</legend>
						<div class="col-sm-10">
							<div class="form-check form-check-inline">
								<input class="form-check-input" type="radio" name="member_type"
									id="member_type1" value="1" checked> <label
									class="form-check-label" for="gridRadios1"> 일반 회원 </label>
							</div>
							<div class="form-check form-check-inline">
								<input class="form-check-input" type="radio" name="member_type"
									id="member_type2" value="2"> <label
									class="form-check-label" for="gridRadios1"> 판매자 회원 </label>
							</div>
						</div>
					</div>
				</fieldset>
				<!-- 이름 -->
				<div class="form-group row">
					<label for="member_name" class="col-sm-2 col-form-label">이름</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="member_name">
					</div>
				</div>
				<!-- 아이디 -->
				<div class="form-group row">
					<label for="member_id" class="col-sm-2 col-form-label">아이디</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="member_id">
					</div>
				</div>
				<!-- 비밀번호 -->
				<div class="form-group row">
					<label for="member_password" class="col-sm-2 col-form-label">비밀번호</label>
					<div class="col-sm-10">
						<input type="password" class="form-control" id="member_password">
					</div>
				</div>
				<!-- 비밀번호 확인-->
				<div class="form-group row">
					<label for="confirm_password" class="col-sm-2 col-form-label">비밀번호
						확인</label>
					<div class="col-sm-10">
						<input type="password" class="form-control" id="confirm_password">
					</div>
				</div>
				<!-- 회원가입 버튼 -->
				<div class="form-group row">
					<div class="col-sm-10">
						<button type="submit" class="btn btn-primary" id="join_btn">회원가입</button>
					</div>
				</div>
			</form>
		</div>
	</div>
	<jsp:include page="/module/footer.jsp" flush="true" />
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="/practiceMall/js/test.js"></script>
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