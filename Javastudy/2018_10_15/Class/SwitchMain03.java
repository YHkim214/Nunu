import java.util.*;

public class SwitchMain03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("���ø��Է�: ");
		String city = scanner.nextLine();
		
		switch(city) { //jdk 7.0�̻���� ���ڿ� ����
		case "����":
			System.out.println("�������� �����Դϴ�");
			break;
		case "�λ�":
			System.out.println("�������� �λ��Դϴ�");
			break;
		case "����":
			System.out.println("�������� �����Դϴ�");
			break;
		default:
			System.out.println("�������� ���� �λ� ���ְ� �ƴմϴ�");
		}
		
		scanner.close();
	}

}
