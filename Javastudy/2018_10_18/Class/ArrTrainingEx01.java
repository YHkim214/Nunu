
public class ArrTrainingEx01 {

	public static void main(String[] args) {
//		10,20,30,40,50�� �ʱⰪ���� ������ �迭 ���� ���� �ʱ�ȭ
//		�� �迭�� �ݺ����� �̿��� ���
//		�ε��� 3�� �����͸� 10���� ����
//		������ ����� ���� 200���� ����
//		�ݺ����� �̿��� ��� ������ ���� 0���� ����
//		Ȧ�� �ε����� 10, ¦�� �ε����� 20����

		int[] arr = new int[5];
		for(int i = 0; i < arr.length; i++) { //1
			arr[i] = (i + 1) * 10;
		}
		
		for(int i = 0; i < arr.length; i++) { //2
			System.out.println(arr[i]);
		}
		
		arr[3] = 100; //3
		
		arr[arr.length - 1] = 200; //4
		
		for(int i = 0; i < arr.length; i++) { //5
			arr[i] = 0;
		}
		
		for(int i = 0; i < arr.length; i++) { //6
			if(i % 2 == 0) {
				arr[i] = 20;
			}else {
				arr[i] = 10;
			}
		}
	}

}
