
public class Oop8 {

	public static void main(String[] args) {
		// �⺻�� �Ű�����
		Data d = new Data();
		d.x = 10;
		
		System.out.println("main() : x = " + d.x);
		change(d.x);
		System.out.println("After change");
		System.out.println("main() : x = " + d.x);//�⺻�� �Ű������� ���� �о�ü� ������ ���� �����Ҽ��� ����.

	}

	static void change(int x) { //�Է¹��� x�� ���� �ٲٴ� �޼ҵ�
		x = 1000;
		System.out.println("change() : x = " + x);
	}
}

class Data { int x;} //int x�� �ɹ������� ������ Ŭ����