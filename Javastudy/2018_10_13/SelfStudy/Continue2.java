import java.util.*;

public class Continue2 {
	
	public static void main(String[] args) {
		//continue�� break label���� �̿��� ������ ���α׷��̴�.
		
		int menu = 0;
		int num = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		Outer: while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.print("���ϴ� �޴��� �����ϼ���.(����:0):");
			
			menu = scanner.nextInt();
			
			if(menu == 0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}else if(!(menu >= 1 && menu <= 3)) {
				System.out.println("��ȿ���� ���� �޴��Դϴ�. �ٽ� ������ �ּ���");
				continue; //�ݺ����� ó������ ���ư���.
			}
			
			for(;;) {
				System.out.printf("���ڸ� �Է��� �ּ���.(�������: 0, ��ü����: 99):");
				num = scanner.nextInt();
				
				if(num == 0) break; //for���� �������´�. break���� �Ѵܰ��� �ݺ����� �������� �� �ִ�.
				
				if(num == 99) {
					System.out.println("���α׷��� �����մϴ�.");
					break Outer; //��ü �ݺ����� ���� ���´�.
				}
				
				switch(menu) {
				case 1:
					System.out.println("result = " + num * num);
					break;
				case 2:
					System.out.println("result = " + Math.sqrt(num));
					break; //math Ŭ������ �̿��� ���
				case 3: System.out.println("result = " + Math.log(num));
					break;
				}
			}
		}
		
		scanner.close();
	}
}
