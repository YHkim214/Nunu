
public class Oop4 {

	public static void main(String[] args) {
		Tv[] tvArr = new Tv[3];
		
		for(int i = 0; i < tvArr.length; i++) { //�ݺ����� ������ Tv��ü�迭�� �ʱ�ȭ�Ѵ�.
			tvArr[i] = new Tv();
			tvArr[i].channel = i + 10;//��ü�迭�� ���ڰ�ü�� ä���� �����Ѵ�.
		}
		
		for(int i = 0; i < tvArr.length; i++) { //�ݺ����� ������ �� ���ڿ� channelUp �޼ҵ带 �����Ų��. 
			tvArr[i].channelUp();
			System.out.printf("tvArr[%d].channel = %d\n", i, tvArr[i].channel);
		}
	}

}
