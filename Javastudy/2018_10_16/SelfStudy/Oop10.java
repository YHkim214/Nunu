
public class Oop10 {

	public static void main(String[] args) {
		//������ ��ȯŸ��
		Data d = new Data();
		d.x = 10;
		
		Data d2 = copy(d);
		System.out.println("d.x = " + d.x);
		System.out.println("d2.x = " + d2.x);
	}
	
	static Data copy(Data d) { //��ü�� �����Ͽ� ��ȯ�ϴ� �޼ҵ�
		Data tmp = new Data();
		tmp.x = d.x;
		return tmp; //�Է¹��� ���������� ���� �����Ͽ� ���ο� ��ü�� ����� ��ȯ�Ѵ�. ����Ÿ���� Data.
	}

}
