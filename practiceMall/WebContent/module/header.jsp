<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<header>
<div class="container" id="header_wrap">
	<div class="row" id="top_wrap">
		<div class="col-sm-6">
			<span class="h1">윤호 몰</span>
		</div>
		<div class="col-sm-6 text-right">
			<c:if test="${empty authUser}">
			<a class="btn btn-primary btn-sm" href="/practiceMall/member/login.do">로그인</a>
			<a class="btn btn-primary btn-sm" href="/practiceMall/member/join.do">회원가입</a>
			</c:if>
			<c:if test="${!empty authUser}">
				<c:if test="${userType == 1}">
					<span>${authUser }님 환영합니다!</span>
					<a class="btn btn-primary btn-sm" href="/practiceMall/mypage/mypageMain.do">마이페이지</a>
					<a class="btn btn-primary btn-sm" href="/practiceMall/member/logout.do">로그아웃</a>
					<a class="btn btn-primary btn-sm" href="#">장바구니</a>
				</c:if>
				<c:if test="${userType == 2}">
					<span>${authUser }님 환영합니다!</span>
					<a class="btn btn-primary btn-sm" href="/practiceMall/mypage/mypageMain.do">마이페이지</a>
					<a class="btn btn-primary btn-sm" href="/practiceMall/member/logout.do">로그아웃</a>
					<a class="btn btn-primary btn-sm" href="#">상품등록</a>
				</c:if>
			</c:if>
		</div>
	</div>
</div>
<div id="header_nav_wrap">
	<nav class="navbar navbar-expand-lg navbar-dark bg-#1A212B" id="header_nav">
		<div class="collapse navbar-collapse">
			<ul class="navbar-nav">
				<li class="nav-item active">
					<a class="nav-link" href="/practiceMall/index.jsp">홈</a>
				</li>
			</ul>
		</div>
	</nav>
</div>
</header>