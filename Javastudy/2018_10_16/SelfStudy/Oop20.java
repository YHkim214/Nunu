
public class Oop20 {

	public static void main(String[] args) {
		//�ν��Ͻ� �ʱ�ȭ���� �̿��� �ø��� ��ȣ�� �Է�
		
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		Product p4 = new Product();
		
		System.out.println("p1�� ��ǰ��ȣ: "+ p1.serialNo);
		System.out.println("p2�� ��ǰ��ȣ: "+ p2.serialNo);
		System.out.println("p3�� ��ǰ��ȣ: "+ p3.serialNo);
		System.out.println("p4�� ��ǰ��ȣ: "+ p4.serialNo);
		System.out.println("����� ��ǰ���� ���"+ Product.count+"�� �Դϴ�.");
	}

}

class Product{
	static int count = 0;
	int serialNo;
	
	{
		serialNo = count;//�ν��Ͻ��� ������ ������ �ø��� �ѹ��� ī��Ʈ�� ���Եǰ� ī��Ʈ�� 1 �����Ѵ�
		count++;
	}
}
