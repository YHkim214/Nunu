
public class ArrayMain02 {

	public static void main(String[] args) {
		int sum = 0;
		float avg = 0.0f;
		int[] score = {100, 88, 88, 100, 90};
		
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		
		avg = (float)sum / score.length;
		
		System.out.printf("ÃÑÁ¡: %d, Æò±Õ: %.2f", sum, avg);
	}

}