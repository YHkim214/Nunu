
public class Oop21 {
	//�����ڿ� Ŭ���������� �̿��� �ø��� �ѹ� �ٿ��ֱ�
	public static void main(String[] args) {
		Document d1 = new Document();
		Document d2 = new Document("�ڹ�.txt");
		Document d3 = new Document();
		Document d4 = new Document();

	}

}

class Document{
	String name;
	static int count = 0;;
	
	Document(){
		this("�������" + ++count);
	}
	
	Document(String name){
		this.name = name;
		System.out.println("���� " + this.name + "�� �����Ǿ����ϴ�.");
	}
}