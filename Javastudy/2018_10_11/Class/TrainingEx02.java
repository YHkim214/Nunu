
public class TrainingEx02 {

	public static double add(int a, int b, int c) {
		return a + b + c;
	}
	
	public static double average(int a, int b, int c) {
		return add(a, b, c)/3;
	}
	
	public static void main(String[] args) {
		
		//ö������ǥ ����ϱ�
		
		System.out.println("����ǥ");
		System.out.println("===========");
		System.out.println("�̸�: ö��");
		System.out.println("����: " + 89);
		System.out.println("����: " + 70);
		System.out.println("����: " + 95);
		System.out.println("����: " + add(89,70,95));
		System.out.printf("���: %.2f\n", average(89,70,95));
		System.out.println("�Ѱ����� : " + true);
		
		
	}

}
