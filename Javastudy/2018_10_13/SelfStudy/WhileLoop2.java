import java.util.*;

public class WhileLoop2 {
	public static void main(String[] args) {
		//while 루프를 이용해 특정 int의 각 자릿수의 합계를 구하는 예제
		System.out.printf("아무 숫자나 입력해 주세요: ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int sum = 0;
		
		while(num != 0) {
			sum += (num % 10);//매 반복마다 입력받은 정수를 10으로 나눈 나머지 값을 구해 자릿수를 얻는다.
			System.out.printf("sum = %d num = %d\n", sum, num);
			num /= 10;//소수점 이하는 자동으로 버려진다.
		}
		
		scanner.close();
		
		System.out.printf("입력하신 숫자의 각 자릿수의 합은 %d입니다.", sum);
	}
}
