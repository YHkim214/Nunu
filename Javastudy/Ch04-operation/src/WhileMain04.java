import java.util.*;

public class WhileMain04 {

	public static void main(String[] args) {
		//while���� �̿��� ������
		Scanner scanner = new Scanner(System.in);
		
		int a, total = 0;
		
		System.out.println("0������ �Է¹��� ������ �� ���ϱ�");
		System.out.print("������ ���������� �Է�: ");
		while((a = scanner.nextInt()) != 0) {
			System.out.print(">>");
			total += a;
		}
		System.out.printf("������ ����: %d", total);
		
		scanner.close();

	}

}
