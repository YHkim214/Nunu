import java.time.LocalDateTime;


public class PrintMain01 {

	public static void main(String[] args) {
		
		//������ ������ ������ �����ݷ�(;)�� �ٿ�����, �� ���Ͻ� ������ ������ �ʾҴٰ� �Ǵ���.
		
		System.out.println("today is thursday");
		//�ٹٲ� ����(\n) �ڵ�����
		
		System.out.print("��");
		System.out.print("����\n");
		//��� �� �ٹٲ�  ����
		
		/*System.out.print("����");
		System.out.print("�ܿ�"); 
		������ �ּ� ctrl+shift+/ ������ ctrl+shift+\
		*/
		
		System.out.printf("today is n" + LocalDateTime.now());
		//��� �� �ٹٲ� ����. �������� ������
		
		//����(�� ���ڸ�)
		System.out.println('z');
		System.out.println('��');
		
		//���ڿ�(�� ���� �̻�)
		System.out.println("�乬��");
		System.out.println("�����");
		
		//���� ��Ÿ�� �� �� ����Ʈ
		System.out.println(99);
		
		//�Ǽ� ���� �Ƿ�Ʈ
		System.out.println(99.9);
		
		//Boolean�� ū����ǥ�� ���� �����
		System.out.println(true);
		System.out.println(false);
		
	}

}