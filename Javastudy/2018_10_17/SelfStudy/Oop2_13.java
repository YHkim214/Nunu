
public class Oop2_13 {

	public static void main(String[] args) {
		//자손 클래스와 부모 클래스에 같은 이름의 맴버변수를 선언했을때, 그 값은 참조변수의 타입에 따라 달라진다.
		Parent2 p = new Child2();
		Child2 c = new Child2();
		
		System.out.println("p.x = " + p.x);
		p.method(); //메소드는 참조변수의 타입과 관계없이 자손 클래스의 메소드가 실행된다.
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

