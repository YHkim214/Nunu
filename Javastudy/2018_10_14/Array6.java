
public class Array6 {

	public static void main(String[] args) {
		//�ִ� �ּ� ���ϱ�
		int[] score = { 79, 88, 91, 33, 100, 55, 95};
		
		int max = score[0];
		int min = score[0];
		
		for(int i = 0; i < score.length; i++) {
			if(score[i] > max) {
				max = score[i];
			}else if(score[i] < min){
				min = score[i];
			}
		}
		System.out.printf("�ִ밪: %d\n", max);
		System.out.printf("�ּҰ�: %d", min);
	}

}
