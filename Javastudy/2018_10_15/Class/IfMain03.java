import java.util.*;

public class IfMain03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.printf("�����ϳ��Է�: ");
		int num = scanner.nextInt();
		if(num > 0) {
			System.out.println("���");
		}else if (num == 0) {
			System.out.println("0");
		}else if(num < 0) {
			System.out.println("����");
		}
		
		scanner.close();
	}

}
