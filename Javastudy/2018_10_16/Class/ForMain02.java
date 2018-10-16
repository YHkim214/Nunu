
public class ForMain02 {
	public static void main(String[] args) {
		//for문 기초활용2
		for(int i = 5; i >= 1; i--) {
			System.out.print("\t" + i);
		}
		
		System.out.println();
		
		for(int i = 0; i <= 10; i += 2) {
			System.out.print("\t" + i);
		}
		
		System.out.println();
		
		for(int i = 0; i <= 10; i++) { //짝수일때만 출력
			if(i % 2 == 0) {
				System.out.print("\t" + i);
			}
		}
	}
}
