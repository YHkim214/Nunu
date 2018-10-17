
public class ArrayMain03 {

	public static void main(String[] args) {
		
		int[] score = {79, 88, 91, 33, 100, 55, 95};
		
		int max = score[0], min = score[0];
		
		for(int i = 1; i < score.length; i++) {
			if(score[i] > max) { max = score[i]; }
			if(score[i] < min) { min = score[i]; }
		}
		
		System.out.print(max);
		System.out.print(min);
	}

}
