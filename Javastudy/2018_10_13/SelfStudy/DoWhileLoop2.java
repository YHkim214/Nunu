
public class DoWhileLoop2 {

	public static void main(String[] args) {
		//do-while ������ �̿��� ���� 3,6,9 ����
		for(int i = 1; i <= 100; i++) {
			System.out.printf("i = %d", i);
			
			int tmp = i;
			
			do {
				if(tmp % 10 % 3 == 0 && tmp % 10 != 0) {//tmp�� ù° �ڸ����� 3�� ������� Ȯ���ϴ� ����. 0�� ����
					System.out.printf(" ¦!");
				}
			} while((tmp /= 10) != 0);
			System.out.println();
		}
	}

}
