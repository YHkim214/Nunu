import java.util.*;

public class TrainingEx02 {

	public static void main(String[] args) {
		//����x�� 30���� �����ٶ� �δ� ��ְ� �����?
		Scanner scanner = new Scanner(System.in);
		System.out.printf("���� ����?>");
		
		int pencils = scanner.nextInt(), students = 30, quantity = pencils / students, rest = pencils % students;
		
		System.out.printf("�л� �� ���� ������ ���� ��: %d��\n", quantity);
		System.out.printf("���� ���� ��: %d��", rest);
		
		scanner.close();
		
	}

}
