import java.util.Scanner;

public class WhileMain06 {

	public static void main(String[] args) {
		//�������� �ڵ�
		Scanner scanner = new Scanner(System.in);
		int balance = 0;
		
		while(true) {
			System.out.println("=============================");
			System.out.println("1.���� | 2.��� | 3.�ܰ�Ȯ�� | 4.����");
			System.out.println("=============================");
			System.out.print("���� >>");
			
			int menu = scanner.nextInt();
			if(menu == 1) {
				System.out.print("���ݾ��� �Է��ϼ���: ");
				int add = scanner.nextInt();
				balance += add;
			}else if(menu == 2) {
				System.out.print("��ݾ��� �Է��ϼ���: ");
				int draw = scanner.nextInt();
				while(draw > balance) {
					System.out.printf("�ܰ� �����մϴ�.(���� �ܰ�: %,d��)\n", balance);
					System.out.print("��ݾ��� �Է��ϼ���: ");
					draw = scanner.nextInt();
				}
				balance -= draw;
			}else if(menu == 3) {
				System.out.printf("���� �ܰ�: %,d��\n", balance);
			}else if(menu == 4) {
				System.out.println("���α׷��� �����մϴ�");
				break;
			}else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�");
				continue;
			}
			
		}
		
		scanner.close();
	}

}
