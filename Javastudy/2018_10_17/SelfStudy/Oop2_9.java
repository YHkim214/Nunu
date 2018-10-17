
public class Oop2_9 {
	//생성자 접근제어자를 이용한 코드
	public static void main(String[] args) {
//		Singleton s = new Singleton(); error! 이런식으로 인스턴스를 생성할수없다
		Singleton s = Singleton.getInstance(); //인스턴스를 생성하기 위해서는 메소드를 이용해야한다.
	}

}

final class Singleton{
	private static Singleton s = new Singleton();
	
	private Singleton() {} //생성자의 접근제어자가  private이기 때문에 클래스외부에서 인스턴스를 생성할수 없게되었다.
	
	public static Singleton getInstance() { 
		if(s == null) s = new Singleton(); 
		return s;
	}
}
