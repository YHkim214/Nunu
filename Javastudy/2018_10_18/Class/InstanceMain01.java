
public class InstanceMain01 {
	
	//속성(필드)
	int a = 10;
	
	//동작(메서드)
	public void make() {
		System.out.println("메서드 실행!");
	}
	
	public static void main(String[] args) {
		//객체선언
		InstanceMain01 im;
		//객체생성
		im = new InstanceMain01();
		
		//객체의 필드호출
		System.out.println(im.a);
		//객체의 메서드 호출
		im.make();
	}
	
}
