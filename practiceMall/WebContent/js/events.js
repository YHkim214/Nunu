/**
 * 
 */
$(function(){
	//joinForm.jsp 스크립트
	$('#join_form').submit(function(){
		if($('#member_name').val() == ''){
			alert('이름을 입력해 주세요');
			return false;
		}
		if($('#member_id').val() == ''){
			alert('12자 이하의 영문, 한글 숫자로 이루어진 아이디를 입력해주세요.');
			return false
		}
		if($('#member_password').val() == ''){
			alert('비밀번호는 공백을 제외하고 최소 8자 이상이어야 합니다.');
			return false
		}
		if($('#comfirm_password').val() == ''){
			alert('비밀번호를 한 번 더 입력해 주세요');
			return false
		}
	});
});