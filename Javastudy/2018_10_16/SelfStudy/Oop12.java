
public class Oop12 {

	static long factorial(int n) {
		//매개변수 유효성검사를 거친 팩토리얼 메소드
		if(n < 0 || n > 20) return -1;//n이 20을 넘어가면 -1을 리턴하기로 했다
		if(n <= 1) return 1;
		return n * factorial(n-1);
	}
	
	public static void main(String[] args) {
		int n = 21;
		long result = 0;
		
		for(int i = 1; i <= n; i++) {
			result = factorial(i);
			if(result == -1) { //-1을 받으면 아래 내용을 출력후 빠져나온다.
				System.out.println("유효하지 않은 값입니다");
				break;
			}
			System.out.printf("%2d! = %20d\n", i, result);
		}

	}

}
