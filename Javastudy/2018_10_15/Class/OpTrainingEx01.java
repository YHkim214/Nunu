import java.util.*;

public class OpTrainingEx01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("�����ϳ� �Է�: ");
		int num = scanner.nextInt();
		
		if(num < 0) num = -num;
		
		System.out.printf("���밪�� %d�̴�.", num);
		scanner.close();
	}
}
