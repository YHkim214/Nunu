
public class InstanceMain01 {
	
	//�Ӽ�(�ʵ�)
	int a = 10;
	
	//����(�޼���)
	public void make() {
		System.out.println("�޼��� ����!");
	}
	
	public static void main(String[] args) {
		//��ü����
		InstanceMain01 im;
		//��ü����
		im = new InstanceMain01();
		
		//��ü�� �ʵ�ȣ��
		System.out.println(im.a);
		//��ü�� �޼��� ȣ��
		im.make();
	}
	
}
