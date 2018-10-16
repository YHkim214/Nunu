
public class Oop13 {
	//x^1���� x^n������ ���� ���ϴ� �޼ҵ�
	static long power(int x, int n) {
		//x^n���� ���ϴ� �޼ҵ��̴�
		if(n == 1) return x;
		return x * power(x, n - 1);
	}
	
	public static void main(String[] args) {
		int x = 2;
		int n = 5;
		long result = 0;
		
		for(int i = 1; i <= n; i++) {
			result += power(x, i);
		}
		
		System.out.println(result);
		
	}

}
