
public class TrainingEx03 {

	public static void main(String[] args) {
		/*
		 * [�ǽ�]
		 * �迭�� ��� �� ���� ū��, �ι�° ū�� ���ϱ�
		 * �Է°�: 10, 30, 50, 7, 88, 22
		 * ù���� ū��: 88
		 * �ι�° ū��: 50
		*/
		int[] array = {10, 30, 50, 7, 88, 59};
		int first = array[0];
		int second = array[0];
		
		//����üũ
		for (int i = 1; i < array.length; i++) {
			if(first < array[i]) {
				second = first;
				first = array[i];
			}
			if(second < array[i] && array[i] < first) {
				second = array[i];
			}
		}
		
		//���
		System.out.println("ù��° ū ��: " + first);
		System.out.println("ù��° ū ��: " + second);
		
		
	}

}
