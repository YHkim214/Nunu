
public class DoWhileMain01 {

	public static void main(String[] args) {
		int su = 0;
		String str = "Hello Java!";
		
		while(su++ < 5){//�� �� �� ó��
			System.out.println(str);
		}
		
		System.out.println("================");
		
		su = 0;//�� ó�� �� ��
		do {
			System.out.println(str);
		} while(su++ < 5);
	}

}
