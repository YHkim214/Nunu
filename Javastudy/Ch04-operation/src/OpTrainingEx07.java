import java.util.*;

public class OpTrainingEx07 {

	public static void main(String[] args) {
		
		int price = 3500;
		int quantity, payment, total, change, tax;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("ī���ī �� ��: ");
		quantity = scanner.nextInt();
		System.out.print("������ �׼�: ");
		payment = scanner.nextInt();
		
		tax = (price * quantity) * 10 / 100;
		total = (price * quantity) + tax;
		change = payment - total;
		
		System.out.println("[��³���] ");
		System.out.printf("������ ��: %d\n", payment);
		System.out.printf("ī�� ��ī �ܰ�: %d\n", price);
		System.out.printf("����: %d\n", quantity);
		System.out.printf("�ΰ���: %d\n", tax);
		System.out.printf("��ǰ �Ѿ�: %d\n", total);
		System.out.printf("�Ž����� : %d", change);
		
		scanner.close();
	}

}
