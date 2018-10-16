
public class BreakMain02 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				if(j == 3) break; //break문은 한단계 반복문만 빠져나갈수있다
				System.out.printf("%d, %d\n", i, j);
			}
		}

	}

}
