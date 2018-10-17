
public class Oop2_9 {
	//������ ���������ڸ� �̿��� �ڵ�
	public static void main(String[] args) {
//		Singleton s = new Singleton(); error! �̷������� �ν��Ͻ��� �����Ҽ�����
		Singleton s = Singleton.getInstance(); //�ν��Ͻ��� �����ϱ� ���ؼ��� �޼ҵ带 �̿��ؾ��Ѵ�.
	}

}

final class Singleton{
	private static Singleton s = new Singleton();
	
	private Singleton() {} //�������� ���������ڰ�  private�̱� ������ Ŭ�����ܺο��� �ν��Ͻ��� �����Ҽ� ���ԵǾ���.
	
	public static Singleton getInstance() { 
		if(s == null) s = new Singleton(); 
		return s;
	}
}
