import java.util.Scanner;

public class OpTrainingEx04 {
	public static void main(String[] args) {
		//Ŀ�ǰ� 4,000�� �Դϴ�. ����Ŀ�� ������ �Է��ϰ� ���� �����ϼ���.
		//������ ������ �߻��� �Ž������� ���
		//���� ���ڶ� ������ "�ݾ��� ���ڶ��ϴ�"��� �˷����� �ٽ� �����ϰ�
		
		Scanner scanner = new Scanner(System.in);
		
		int coffee = 4000;
		int payment, quantity, balance, total;
		
		System.out.print("���ż��� �Է�: ");
		quantity = scanner.nextInt();
		
		while(true) {
			System.out.print("���� ���� ��: ");
			payment = scanner.nextInt();
			total = coffee * quantity;
			balance = payment - total;
			
			if(balance < 0) {
				System.out.printf("�ݾ��� %d�� ���ڶ��ϴ�\n", -balance);
				continue;
			}else {
				break;
			}
		}
		
		System.out.printf("�Ž��� ��: %,d��", balance);
		scanner.close();
	}
}
