
public class NestedForloop {

	public static void main(String[] args) {
		//for���� �� Ư�� ���Ǹ��� �����ϴ� ��Ҹ� ����� �� �ֵ��� ���� �� �� �ִ�.
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				if(i == j) {
					System.out.printf("[%d, %d]", i, j);
				}else {
					System.out.printf("%6c", ' ');
				}
			}
			System.out.println();
		}

	}

}
