/**
 * 
 */
$('#checkPasswd_form').submit(function(){
	if($('#member_passwd').val() == ''){
		alert('비밀번호를 입력해 주세요');
		return false;
	}
})