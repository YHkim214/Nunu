import java.util.Scanner;

public class OpTrainingEx02 {

	public static void main(String[] args) {
		//�Է¹������� if���� �̿��� �ִ� �ּҰ����ϱ�
		
		Scanner scanner = new Scanner(System.in);
		System.out.printf("ù��° ����: ");
		int num1 = scanner.nextInt();
		System.out.printf("�ι�° ����: ");
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
