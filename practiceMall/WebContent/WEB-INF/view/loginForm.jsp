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
<link rel="stylesheet" href="/practiceMall/css/style.css"
	type="text/css">
<title>로그인</title>
</head>
<body>
	<jsp:include page="/module/header.jsp" />
	<div id="login_form_wrap">
		<form action="/practiceMall/member/login.do" method="post" id="login_form">
		<div class="form-group">
			<label for="member_id">아이디</label> 
			<input type="text" class="form-control" id="member_id" aria-describedby="idHelp" name="member_id" value="${param.member_id}"> 
			<small id="idHelp" class="form-text text-muted">아이디를 입력해 주세요</small>
			<c:if test="${errors.idNotFound}">
			<small class="form-text text-muted">아이디가 없습니다.</small>
			</c:if>
		</div>
		<div class="form-group">
			<label for="member_passwd">비밀번호</label> 
			<input type="password" class="form-control" id="member_passwd" aria-describedby="passwdHelp" name="member_passwd" value="${param.member_passwd}"> 
			<small id="passwdHelp" class="form-text text-muted">비밀번호를 입력해 주세요</small>
			<c:if test="${errors.passwdNotMatch}">
			<small class="form-text text-muted">비밀번호가 틀렸습니다.</small>
			</c:if>
		</div>
		<button type="submit" class="btn btn-primary">로그인</button>
		</form>
	</div>
	<jsp:include page="/module/footer.jsp" />
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
	<script src="/practiceMall/js/loginForm.js"></script>
</body>
</html>