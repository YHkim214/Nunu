
public class Oop1 {

	public static void main(String[] args) {
		Tv tv = new Tv(); //Tv 클래스의 인스턴스 생성. new연산자로 생성된 Tv클래스 인스턴스의 메모리주소를 참조변수 tv에 대입한다.
		tv.channel = 7; //이제 tv를 통해서 인스턴스 변수와 메소드에 접근 할 수 있게 되었다.
		tv.channelDown();
		
		System.out.printf("현재 채널은 %d번 입니다", tv.channel);

	}

}

class Tv { //Tv 클래스생성
	String color; //Tv클래스의 맴버 변수들
	boolean power;
	int channel;
	
	void power() { power = !power; }//Tv클래스의 메소드
	void channelUp() { channel++; }
	void channelDown() { channel--; }
}