
public class Oop3 {

	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.printf("t1�� channel���� %d�Դϴ�.\n", t1.channel);
		System.out.printf("t2�� channel���� %d�Դϴ�.\n", t2.channel);
		
		t2 = t1; //���� �������� t1�� t2�� ���� �ν��Ͻ��� ����Ų��.
		
		t1.channel = 7;
		System.out.printf("t1�� channel���� 7�� �����Ͽ����ϴ�.\n");
		
		System.out.printf("t1�� channel���� %d�Դϴ�.\n", t1.channel);//�׷��� ������ t1�� ���� ��ȭ��Ű�� t2�� ���� ��ȭ�Ѵ�.��
		System.out.printf("t2�� channel���� %d�Դϴ�.\n", t2.channel);

	}

}
