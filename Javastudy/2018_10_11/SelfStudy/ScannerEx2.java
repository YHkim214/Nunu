import java.util.*;

public class ScannerEx2 {

	public static void main(String[] args) {
		System.out.println("������ �ϳ� �Է��ϼ���: ");
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		int num = Integer.parseInt(tmp);
		
		if(num == 0) {
			System.out.println("�Է��Ͻż��ڴ� 0 �Դϴ�");
		}
		else {
			System.out.println("�Է��Ͻż��ڴ� 0�� �ƴմϴ�");
			System.out.printf("�Է��Ͻż��ڴ� %d�Դϴ�", num);
		}
		
		scanner.close();
	}

}
