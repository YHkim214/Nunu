import java.util.*;

public class IfMain02 {

	public static void main(String[] args) {	
		//Ȧ¦����
		
		Scanner scanner = new Scanner(System.in);
		System.out.printf("���ڸ� �ϳ� �Է��غ��Ŷ�: ");
		int num = scanner.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("¦���Դϴ�.");
		}else {
			System.out.println("Ȧ���Դϴ�.");
		}
		
		scanner.close();
	}

}
