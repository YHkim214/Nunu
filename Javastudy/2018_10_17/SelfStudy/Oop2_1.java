
public class Oop2_1 {
	//클래스의 상속(inheritance)
	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.power = true;
		ctv.channel = 7;
		ctv.channelUp();
		System.out.println(ctv.channel);
		ctv.caption = true;
		ctv.displayCaption("캡션띠비");

	}

}	

class Tv{
	boolean power;
	int channel;
	
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
	
}

class CaptionTv extends Tv { //상속받으면서 Tv클래스의 맴버를 사용할수 있게되었다.
	boolean caption; //자동으로 생성자 CaptionTv()와 조상생성자 Super()를 추가한다
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
}
