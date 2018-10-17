
public class Oop2_12 {

	public static void main(String[] args) {
		//instanceof 연산자 활용
		FireEngine fe = new FireEngine();
		
		if(fe instanceof FireEngine) {
			System.out.println("This is a FireEngine instance");
		}
		if(fe instanceof Car) {
			System.out.println("This is a Car instance");
		}
		if(fe instanceof Object) {
			System.out.println("This is a Object instance"); //FireEngine 클래스는 Car와 Object클래스를 상속받았기 때문에(FireEngine -> Car -> Object)
															//Car와 Object 클래스의 인스턴스를 가지고있는 셈이다
		}
	}

}
