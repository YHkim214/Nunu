import java.util.*;

public class WhileMain03 {

	public static void main(String[] args) {
		//while���� �̿��� 99��
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		int dan = scanner.nextInt();
		int i = 1;
		
		System.out.println("*" + dan + "��*");
		System.out.println("============");
		while(i <= 9) {
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);
			i++;
		}
		
		scanner.close();

	}

}
