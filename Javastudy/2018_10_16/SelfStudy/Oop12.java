
public class Oop12 {

	static long factorial(int n) {
		//�Ű����� ��ȿ���˻縦 ��ģ ���丮�� �޼ҵ�
		if(n < 0 || n > 20) return -1;//n�� 20�� �Ѿ�� -1�� �����ϱ�� �ߴ�
		if(n <= 1) return 1;
		return n * factorial(n-1);
	}
	
	public static void main(String[] args) {
		int n = 21;
		long result = 0;
		
		for(int i = 1; i <= n; i++) {
			result = factorial(i);
			if(result == -1) { //-1�� ������ �Ʒ� ������ ����� �������´�.
				System.out.println("��ȿ���� ���� ���Դϴ�");
				break;
			}
			System.out.printf("%2d! = %20d\n", i, result);
		}

	}

}
