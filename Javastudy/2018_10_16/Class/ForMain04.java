
public class ForMain04 {
	public static void main(String[] args) {
		//for�� ����Ȱ�� 4
		int sum = 0, total =  0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		
		System.out.println("1���� 100������ ��: " + sum);
		System.out.println("==============");
		for(int i = 1; i <= 100; i++) {//¦�� ������
			if(i % 2 == 0) {
				total += i;
			}
		}
		System.out.println("1���� 100���� ¦���� ��: " + total);
	}
}
