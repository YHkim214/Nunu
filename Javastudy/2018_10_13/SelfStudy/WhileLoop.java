
public class WhileLoop {
	public static void main(String[] args) {
		int i = 11;
		
		System.out.println("카운트 다운을 시작합니다");
		while(i-- != 0) { //감소연산자를 통해 i의 값은 반복때마다 작아진다
			
			System.out.println(i);
			
			for(long j = 0; j < 2_000_000_000L; j++) {}
		}
		System.out.println("Game over");
	}
}
