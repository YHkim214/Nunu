import java.util.*;

public class WhileLoop3 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//while���� �̿��� �Է¹��� int���� ���� ���ϴ� ����.
		System.out.println("�հ踦 ���� ���ڸ� �Է��ϼ���(�׸��η��� 0�� �Է�)");
		
		int num;
		int sum = 0;
		
		while(true) { //���ѷ���
			System.out.printf(">>");
			Scanner scanner = new Scanner(System.in);
			num = scanner.nextInt();
			if(num == 0) {
				break; //�Է¹��� ���� 0�̵Ǹ� �ݺ����� �������´�.
			}
			sum += num;
		}

		System.out.printf("�� ������ �հ�� %d�Դϴ�", sum);

	}

}
