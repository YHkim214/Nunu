
public class Oop19 {
	//�ʱ�ȭ�� �׽�Ʈ
	static int[] arr = new int[10];
	
	static { //����� �ʱ�ȭ�� ���� �迭 arr�� �����߰�, �ʱ�ȭ���� ���ؼ� �迭�� �����Ǽ��ڸ� ä����.
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
		}
	}

	
	public static void main(String[] args) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr["+i+"] : " + arr[i]);
		}
	}
}
