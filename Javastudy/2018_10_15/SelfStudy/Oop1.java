
public class Oop1 {

	public static void main(String[] args) {
		Tv tv = new Tv(); //Tv Ŭ������ �ν��Ͻ� ����. new�����ڷ� ������ TvŬ���� �ν��Ͻ��� �޸��ּҸ� �������� tv�� �����Ѵ�.
		tv.channel = 7; //���� tv�� ���ؼ� �ν��Ͻ� ������ �޼ҵ忡 ���� �� �� �ְ� �Ǿ���.
		tv.channelDown();
		
		System.out.printf("���� ä���� %d�� �Դϴ�", tv.channel);

	}

}

class Tv { //Tv Ŭ��������
	String color; //TvŬ������ �ɹ� ������
	boolean power;
	int channel;
	
	void power() { power = !power; }//TvŬ������ �޼ҵ�
	void channelUp() { channel++; }
	void channelDown() { channel--; }
}