
public class IfMain05 {

	public static void main(String[] args) {
		int a = 10;
		float b = 10.0f;
		
		if(a == b) { //a�� float���� �ڵ�����ȯ
			System.out.println("10�� 10.0f�� ����.");
		}
		
		char c = '0';//c�� int�� �ڵ�����ȯ
		int d = 0;
		
		if(c != d) {
			System.out.println("'0'�� 0�� �����ʴ�.");
		}
		
		char e = 'A';
		int f = 65;
		
		if(e == f) {
			System.out.println("'A'�� 65�� ���� ����.");
		}
	}

}
