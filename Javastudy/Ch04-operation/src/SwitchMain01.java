import java.util.*;

public class SwitchMain01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.printf("���������� �Է�: ");
		int num = scanner.nextInt();
		
		switch(num) { //long�� ������ ������+����+���ڿ�����
			case 1:
				System.out.println("1 �Է�");
				break;//switch ���� ��������
			case 2:
				System.out.println("2 �Է�");
				break;
			case 3:
				System.out.println("3 �Է�");
				break;
			default:
				System.out.println("1,2,3�� �ƴ� ���� �Է�");
		
		}
		scanner.close();
	}

}
