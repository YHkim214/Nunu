import java.util.*;

public class ForMain05 {

	public static void main(String[] args) {
		//99�� ��¿���
		Scanner scanner = new Scanner(System.in);
		System.out.printf("���� �Է����ּ���: ");
		int dan = scanner.nextInt();
		
		System.out.printf("%d�� \n=========\n", dan);
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);
		}
		
		scanner.close();

	}

}
