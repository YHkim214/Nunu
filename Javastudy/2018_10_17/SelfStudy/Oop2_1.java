
public class Oop2_1 {
	//Ŭ������ ���(inheritance)
	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.power = true;
		ctv.channel = 7;
		ctv.channelUp();
		System.out.println(ctv.channel);
		ctv.caption = true;
		ctv.displayCaption("ĸ�Ƕ��");

	}

}	

class Tv{
	boolean power;
	int channel;
	
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
	
}

class CaptionTv extends Tv { //��ӹ����鼭 TvŬ������ �ɹ��� ����Ҽ� �ְԵǾ���.
	boolean caption; //�ڵ����� ������ CaptionTv()�� ��������� Super()�� �߰��Ѵ�
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
}
