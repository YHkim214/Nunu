
public class Oop2 {

	public static void main(String[] args) {
		Tv tv1 = new Tv();
		Tv tv2 = new Tv();
		
		System.out.printf("tv1�� channel���� %d�Դϴ�.\n", tv1.channel);
		System.out.printf("tv2�� channel���� %d�Դϴ�.\n", tv2.channel);
		
		tv1.channel = 7;
		System.out.printf("tv1�� channel���� 7�� �����Ͽ����ϴ�\n");
		
		System.out.printf("tv1�� channel���� %d�Դϴ�.\n", tv1.channel);
		System.out.printf("tv2�� channel���� %d�Դϴ�.\n", tv2.channel);//tv1�� tv2�� ���� �ٸ� �ν��Ͻ��� ����Ű�� ������ tv1�� ���� ��ȭ���ѵ� tv2���� �ƹ��� ������ ����.

	}

}
