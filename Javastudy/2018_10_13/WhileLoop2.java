import java.util.*;

public class WhileLoop2 {
	public static void main(String[] args) {
		//while ������ �̿��� Ư�� int�� �� �ڸ����� �հ踦 ���ϴ� ����
		System.out.printf("�ƹ� ���ڳ� �Է��� �ּ���: ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int sum = 0;
		
		while(num != 0) {
			sum += (num % 10);//�� �ݺ����� �Է¹��� ������ 10���� ���� ������ ���� ���� �ڸ����� ��´�.
			System.out.printf("sum = %d num = %d\n", sum, num);
			num /= 10;//�Ҽ��� ���ϴ� �ڵ����� ��������.
		}
		
		scanner.close();
		
		System.out.printf("�Է��Ͻ� ������ �� �ڸ����� ���� %d�Դϴ�.", sum);
	}
}
