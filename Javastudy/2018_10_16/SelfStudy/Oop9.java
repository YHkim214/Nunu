
public class Oop9 {

	public static void main(String[] args) {
			//������ �Ű�����
			Data d = new Data();
			d.x = 10;
			
			System.out.println("main() : x = " + d.x);
			change(d);
			System.out.println("After change");
			System.out.println("main() : x = " + d.x);//������ �Ű������� ���� ����� �ּҸ� �Ѱ��ִ� ���̱� ������, ���� �о���� �͵�, �����ϴ°͵� �����ϴ�.

		}

		static void change(Data d) { //������ �Ű������� ���ڷ� �޾� ����� ���� �ٲٴ� �޼ҵ�
			d.x = 1000;
			System.out.println("change() : x = " + d.x);
		}


}
