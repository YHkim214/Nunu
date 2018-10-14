
public class Array5 {

	public static void main(String[] args) {
		//Æò±Õ±¸ÇÏ±â
		int sum = 0;
		double average = 0;
		
		int[] scores = {100, 88, 100, 100, 90};
		
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		
		average = (double)sum / (double)scores.length;
		
		System.out.printf("ÃÑÁ¡: %d\n", sum);
		System.out.printf("Æò±Õ: %.1f", average);
	}

}
