
public class Break {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		while(true) {
			if(sum > 100) break;//������ �����ϸ� ��⼭ �ݺ����� ���� ���´�.
			i++;
			sum += i;
		}
		
		System.out.printf("sum = %d", sum);

	}

}
