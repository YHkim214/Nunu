
public class PrintMain02 {

	public static void main(String[] args) {
		
		//System.out.printf(���乮��,������)�� �̿��� ���. ������¿� ������ ������
		
		System.out.printf("%c\n", 'A'); //���� %c
		System.out.printf("%2c\n", 'B');//������ ����
		System.out.printf("%-2c%c\n", 'B', 'C');//��������
		
		System.out.println("============");
		
		System.out.printf("%d\n", 67); //���� %d
		System.out.printf("%,d��\n", 10000000);// 3�ڸ������� ��ǥǥ�� �Ź��ϳ�
		System.out.printf("%4d\n", 20);
		System.out.printf("%-4d%d\n", 20, 10);
		
		System.out.println("============");
		
		System.out.printf("%f\n", 35.356); //�Ǽ� %f
		System.out.printf("%.3f\n", 35.356);
		
		System.out.println("============");
		
		System.out.printf("%s\n", "����"); //���ڿ� %s
		
		System.out.println("============");
		
		System.out.printf("%b\n", true); //�Ҹ��� %b
		
		System.out.printf("%s�� %d�Դϴ�", "����", 98);
	}

}