
public class ForMain06 {

	public static void main(String[] args) {
		//99�� ��¿���2
		for(int i = 2; i <= 9; i++) { //2�� for��
			System.out.println("*" + i + "��*");
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\t", i, j, i * j);
			}
			System.out.println();
		}
	}

}
