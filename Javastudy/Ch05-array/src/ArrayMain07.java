
public class ArrayMain07 {

	public static void main(String[] args) {
		
		int[][] score = {
							{99, 99, 99},
							{90, 90, 90},
							{80, 80, 80},
							{95, 95, 95},
							{85, 85, 85}
						};
		System.out.println("번호 국어 영어 수학 총점 평균");
		System.out.println("====================");
		for(int i = 0; i < score.length; i++) {
			int sum = 0;
			System.out.print(" " + (i + 1) + " ");
			for(int j = 0; j < score[i].length; j++) {
				System.out.print(" " + score[i][j]);
				sum += score[i][j];
			}
			System.out.print("  " + sum);
			System.out.print(" " + sum / score[i].length + " \n");
		}
	}

}
