
public class Oop11 {

	public static void main(String[] args) {
		//���ȣ���� ���� ���丮�� ���ϱ�
		int result = factorial(4);
		
		System.out.println(result);

	}
	
	static int factorial(int n) { //���丮�� �޼ҵ� �ȿ��� �ٽ� ���丮�� �޼ҵ带 ȣ���Ѵ�. �̰� ���ȣ���̶�� �Ѵ�.
		if(n == 1) return 1;
		return n * factorial(n-1);
	}

}
