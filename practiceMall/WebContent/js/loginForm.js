/**
 * 
 */
$('#login_form').submit(function(){
	if($('#member_id').val() == ''){
		alert('아이디를 입력해 주세요');
		return false;
	}
	if($('#member_passwd').val() == ''){
		alert('비밀번호를 입력해 주세요');
		return false;
	}
})