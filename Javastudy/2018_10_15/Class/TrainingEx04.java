import java.util.*;

public class TrainingEx04 {

	public static void main(String[] args) {
		
		//a���� �븮���� �ѱݾ��� 15%�� �������ֱ���� ��ǰ�� ��ǰ�� �ܰ��� ������ �Է¹޾� �����ݾ����, �Ҽ��� ������.
		
		String product;
		int price, quantity, netPrice, discountedPrice;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("��ǰ���� �Է��� �ּ���: ");
		product = scanner.nextLine();
		System.out.printf("�ܰ��� �Է��� �ּ���: ");
		price = scanner.nextInt();
		System.out.printf("������ �Է��� �ּ���: ");
		quantity = scanner.nextInt();
		
		netPrice = price * quantity;
		discountedPrice = (int)(netPrice * 0.85);
		
		System.out.printf("%s %d���� ������: %,d��", product, quantity, discountedPrice);
		
		scanner.close();
	}

}
