import java.util.Scanner;

public class OpTrainingEx02 {

	public static void main(String[] args) {
		//입력받은값을 if문을 이용해 최대 최소값구하기
		
		Scanner scanner = new Scanner(System.in);
		System.out.printf("첫번째 정수: ");
		int num1 = scanner.nextInt();
		System.out.printf("두번째 정수: ");
		int num2 = scanner.nextInt();
		int max = 0, min = 0;
		if(num1 > num2) {
			max = num1;
			min = num2;
		}else if(num2 > num1) {
			max = num2;
			min = num1;
		}else if(num1 == num2) {
			max = min = num1;
		}
		
		System.out.printf("max = %d, min = %d", max, min);
		
		scanner.close();
	}
}
