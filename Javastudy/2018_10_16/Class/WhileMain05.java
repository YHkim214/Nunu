import java.util.Scanner;

public class WhileMain05 {

	public static void main(String[] args) {
		//while������ break Ȱ��
		Scanner scanner = new Scanner(System.in);
		
		int a = 0, total = 0;
		
		System.out.println("0������ �Է¹��� ������ �� ���ϱ�");
		
		while(true){
			
			System.out.print("������ �����Է�: ");
			a = scanner.nextInt();
			if(a == 0) break;
			total += a;
			
		}
		
		System.out.printf("������ ����: %d", total);
		scanner.close();
	}

}
