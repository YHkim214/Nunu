
public class ForMain07 {
	
	public static void main(String[] args) {
		//for�� �ۼ��� ���ǻ���
		
		/*int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}*/
		
		//System.out.println(i); //error! �������� i�� for�� ��� ������ �ۿ��� ȣ�� �� �� ����.
		
		int sum = 0, i;
		for(i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.printf("%d���� %d������ ��: %d", 1, i - 1, sum);
	}
}
