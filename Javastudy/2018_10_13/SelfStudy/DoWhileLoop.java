import java.util.*;

public class DoWhileLoop {
	//���� �������� �ʴ´ٴ� �ݺ��� do-while
	//do-while�� �̿��� ���� ���� ���߱� ����
	public static void main(String[] args) {
		int guess = 0, answer = 0;
		
		Random rand = new Random();
		answer = rand.nextInt(100) + 1; //Random Ŭ������ �̿��� 1-100������ ���� ����
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.printf("1�� 100������ ������ �Է��غ�����.");
			guess = scanner.nextInt();
			
			if(guess > answer) {
				System.out.println("�ʹ� Ů�ϴ�.");
			}else if(guess < answer) {
				System.out.println("�ʹ� �۽��ϴ�.");
			}
		} while(guess != answer);
		
		scanner.close();
		
		System.out.println("�����Դϴ�!");

	}

}
