
public class WhileLoop {
	public static void main(String[] args) {
		int i = 11;
		
		System.out.println("ī��Ʈ �ٿ��� �����մϴ�");
		while(i-- != 0) { //���ҿ����ڸ� ���� i�� ���� �ݺ������� �۾�����
			
			System.out.println(i);
			
			for(long j = 0; j < 2_000_000_000L; j++) {}
		}
		System.out.println("Game over");
	}
}