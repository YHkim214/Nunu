
public class Oop2_13 {

	public static void main(String[] args) {
		//�ڼ� Ŭ������ �θ� Ŭ������ ���� �̸��� �ɹ������� ����������, �� ���� ���������� Ÿ�Կ� ���� �޶�����.
		Parent2 p = new Child2();
		Child2 c = new Child2();
		
		System.out.println("p.x = " + p.x);
		p.method(); //�޼ҵ�� ���������� Ÿ�԰� ������� �ڼ� Ŭ������ �޼ҵ尡 ����ȴ�.
		System.out.println("c.x = " + c.x);
		c.method();

	}

}

class Parent2{
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class Child2 extends Parent2{
	int x = 200;
	
	void method() {
		System.out.println("Child Method");
	}
}

