
public class LabelBreak {

	public static void main(String[] args) {
		
		Loop1: for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				if(j == 5) {
					break Loop1;//전체 반복문을 빠져나온다.
					/*break;
					continue Loop1;
					continue;*/
				}
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
		}

	}

}
