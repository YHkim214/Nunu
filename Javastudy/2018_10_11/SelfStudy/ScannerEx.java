import java.util.*;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("2�ڸ� ������ �ϳ� �Է����ּ���.>");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		
		System.out.printf("�ϰ� �Է��� ������ %d �Դϴ�.", num);
		
		scanner.close();
	}

}
