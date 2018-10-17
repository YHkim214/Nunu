
public class Oop2_5 {
	//super
	public static void main(String[] args) {
		Child c = new Child();
		c.method();
	}

}

class Parent{
	int x = 10;
}

class Child extends Parent{
	int x = 20;
	
	void method() {
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x); //this는 현재 클래스
		System.out.println("super.x = " + super.x); //super는 조상 클래스
	}
}