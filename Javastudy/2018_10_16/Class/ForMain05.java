import java.util.*;

public class ForMain05 {

	public static void main(String[] args) {
		//99단 출력예제
		Scanner scanner = new Scanner(System.in);
		System.out.printf("단을 입력해주세요: ");
		int dan = scanner.nextInt();
		
		System.out.printf("%d단 \n=========\n", dan);
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);
		}
		
		scanner.close();

	}

}
