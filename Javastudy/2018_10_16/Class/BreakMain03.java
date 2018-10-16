
public class BreakMain03 {

	public static void main(String[] args) {
		//다중반복문에서 break를 이용해 한번에 빠져나가기
		exit_for: 
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				if(j == 3) break exit_for;
				System.out.printf("%d, %d\n", i, j);
			}
		}
	}

}
