
public class ForMain02 {
	public static void main(String[] args) {
		//for�� ����Ȱ��2
		for(int i = 5; i >= 1; i--) {
			System.out.print("\t" + i);
		}
		
		System.out.println();
		
		for(int i = 0; i <= 10; i += 2) {
			System.out.print("\t" + i);
		}
		
		System.out.println();
		
		for(int i = 0; i <= 10; i++) { //¦���϶��� ���
			if(i % 2 == 0) {
				System.out.print("\t" + i);
			}
		}
	}
}
