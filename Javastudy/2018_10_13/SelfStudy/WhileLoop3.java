import java.util.*;

public class WhileLoop3 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//while문을 이용해 입력받은 int들의 합을 구하는 예제.
		System.out.println("합계를 구할 숫자를 입력하세요(그만두려면 0을 입력)");
		
		int num;
		int sum = 0;
		
		while(true) { //무한루프
			System.out.printf(">>");
			Scanner scanner = new Scanner(System.in);
			num = scanner.nextInt();
			if(num == 0) {
				break; //입력받은 수가 0이되면 반복문을 빠져나온다.
			}
			sum += num;
		}

		System.out.printf("각 숫자의 합계는 %d입니다", sum);

	}

}
