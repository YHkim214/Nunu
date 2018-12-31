<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body {
	background-color: #252A31;
	font-family: sans-serif;
	margin: 0;
}

#header_top_wrap {
	width: 1000px;
	margin: 0 auto;
}

#page_title {
	font-size: 36pt;
	color: white;
}

#button_wrap {
	margin-left: 500px;
}

#button_wrap button {
	margin: 5px;
	padding: 6px;
	/* 둥굴게하는 코드 */
	border-radius: 4px;
}

#menu_bar {
	background-color: #26303C;
	height: 60px;
	margin: 16px 0;
}

#menu_wrap {
	width: 1000px;
	margin: 0 auto;
}

#menu {
	list-style: none;
	margin: 0;
}

#menu li {
	height: 60px;
	width: 60px;
	text-align: center;
	color: white;
	display: inline-block;
	border-left: 1px solid white;
	border-right: 1px solid white;
}
</style>
</head>
<body>
<header>
<div id="header_top_wrap">
	<span id="page_title">연습용 쇼핑몰</span>
	<span id="button_wrap">
		<button id="login">로그인</button>
		<button id="join">회원가입</button>
	</span>
</div>
<div id="menu_bar">
	<div id="menu_wrap">
		<ul id="menu">
			<li><br>홈</li>
		</ul>
	</div>
</div>
</header>
</body>
</html>