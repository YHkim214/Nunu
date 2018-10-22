import java.util.*;

public class WhileMain04 {

	public static void main(String[] args) {
		//while문을 이용한 누적합
		Scanner scanner = new Scanner(System.in);
		
		int a, total = 0;
		
		System.out.println("0전까지 입력받은 정수로 합 구하기");
		System.out.print("누적할 정수데이터 입력: ");
		while((a = scanner.nextInt()) != 0) {
			System.out.print(">>");
			total += a;
		}
		System.out.printf("정수의 총합: %d", total);
		
		scanner.close();

	}

}
