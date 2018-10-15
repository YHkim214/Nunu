
public class NestedForloop {

	public static void main(String[] args) {
		//for루프 중 특정 조건만을 만족하는 요소를 출력할 수 있도록 조정 할 수 있다.
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				if(i == j) {
					System.out.printf("[%d, %d]", i, j);
				}else {
					System.out.printf("%6c", ' ');
				}
			}
			System.out.println();
		}

	}

}
