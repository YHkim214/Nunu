import java.time.LocalDateTime;


public class PrintMain01 {

	public static void main(String[] args) {
		
		//라인의 끝에는 무조건 세미콜론(;)을 붙여야함, 안 붙일시 라인이 끝나지 않았다고 판단함.
		
		System.out.println("today is thursday");
		//줄바꿈 문자(\n) 자동삽입
		
		System.out.print("봄");
		System.out.print("여름\n");
		//출력 후 줄바꿈  없음
		
		/*System.out.print("가을");
		System.out.print("겨울"); 
		여러줄 주석 ctrl+shift+/ 해제는 ctrl+shift+\
		*/
		
		System.out.printf("today is n" + LocalDateTime.now());
		//출력 후 줄바꿈 없음. 여러가지 가능함
		
		//문자(한 문자만)
		System.out.println('z');
		System.out.println('가');
		
		//문자열(한 문자 이상)
		System.out.println("밥묵자");
		System.out.println("배고파");
		
		//정수 인타쟈 롱 숏 바이트
		System.out.println(99);
		
		//실수 더블 훌로트
		System.out.println(99.9);
		
		//Boolean은 큰따옴표를 빼고 써야함
		System.out.println(true);
		System.out.println(false);
		
	}

}