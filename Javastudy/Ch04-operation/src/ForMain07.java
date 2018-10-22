
public class ForMain07 {
	
	public static void main(String[] args) {
		//for문 작성시 주의사항
		
		/*int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}*/
		
		//System.out.println(i); //error! 지역변수 i를 for문 블록 스코프 밖에서 호출 할 수 없다.
		
		int sum = 0, i;
		for(i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.printf("%d부터 %d까지의 합: %d", 1, i - 1, sum);
	}
}
